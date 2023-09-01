select Customer_id , count(v.Visit_id) as Count_no_trans
from Visits v left join Transactions t
on v.Visit_id = t.Visit_id
where Transaction_id is Null
group by Customer_id
