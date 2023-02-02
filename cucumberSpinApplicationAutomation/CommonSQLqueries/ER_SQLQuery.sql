SELECT DISTINCT ClaimNumber, CQWindBoardTarping, CQWindTreeBlocking, CQWaterStanding, CQhomehabitable	
FROM (
	Select C.ClaimNumber, C.CQWindBoardTarping, C.CQWindTreeBlocking, C.CQWaterStanding, C.CQhomehabitable, p.IndexName
	FROM 	claim as C
			join xactanalysisreqcriteria as	XRC on c.SystemId = XRC.SystemId
			join provider as P on XRC.DataSet = p.SystemId
	Where	Typecd							 	!=		'LossNotice'
		and		Typecd						 	!=		'Transaction'
		and		ReportedDt					  	>		'2022-09-25'
        and     LossDt                        	>     	'2022-09-25'
		and		XRC.CMMContainer			  	=	    'Claim'
		and		C.ProductlineCd				 	!=		'Renters'
		and		C.statuscd 					 	<>		'Closed'
        and		C.SubLossCauseCd			   	!=		'Pipes'
		and		(CQhomehabitable				=		'No'
				OR CQWindBoardTarping			=		'Yes'
				OR CQWindTreeBlocking			=		'Yes'
				OR CQWaterStanding				=		'Yes'
				)
		and c.LossCauseCd != "Flood"
		and C.ClaimNumber not in
			(Select C1.ClaimNumber
			FROM 	claim as C1
					join xactanalysisreqcriteria as	XRC1 on c1.SystemId = XRC1.SystemId
					join provider as P1 on XRC1.DataSet = p1.SystemId
			Where	
						Typecd						!=				'LossNotice'
				and		Typecd						!=				'Transaction'
				and		ReportedDt					> 				'2022-09-25'
				and		XRC1.CMMContainer			=				'Claim'
				and 	p1.indexname 				= 				"PREFERREDREPAIRNETWORKLLC"
                or
                		Typecd						!=				'LossNotice'
				and		Typecd						!=				'Transaction'
				and		ReportedDt					> 				'2022-09-25'
				and		XRC1.CMMContainer			=				'Claim'
				and 	p1.indexname 				= 				"HANCOCKCLAIMSCONSULTANTSINVESTORSLLC") -- prior vendor PREFERREDREPAIRNETWORKLLC
	) AS Clm;