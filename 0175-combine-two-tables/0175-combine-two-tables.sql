# Write your MySQL query statement below
select firstName , lastName , city , state 
from person as pr
left join address as ad
on pr.personId = ad.personId