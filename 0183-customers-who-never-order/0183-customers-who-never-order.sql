select name as customers 
from customers 
where id not in(select customerId from orders)

-- select name as customers 
-- from customers as cu
-- left join orders as or
-- on cu.id = or.customerId
-- where cu.name is Null