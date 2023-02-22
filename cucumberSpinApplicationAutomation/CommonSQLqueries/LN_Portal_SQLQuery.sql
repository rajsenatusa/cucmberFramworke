SELECT
 ClaimNumber
,UpdateUser
,ReportedBy
,Reportedto
,LossDt
,LossTm
,ReportedDt
,ReportedTm
,StatusCd
,TypeCd
FROM aiig_dw_prod.claim
Where 	
-- reportedTo			=			'ServicePortal'
		StatusCd 		not like 	'Completed'
and		StatusCd 		not like 	'Deleted'
and		TypeCd			like		'LossNotice'
and 	Reportedto		is NOT null			-- This line removes the LN's that cannot be converted because lack of info
and		ReportedDt		> '2022-09-25'
Order by reporteddt desc, Reportedtm desc;