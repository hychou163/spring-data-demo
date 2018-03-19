# spring-data-demo

1. statement
2. jdbcTemplete
3. jpa


| 关键字 | 方法命名 | sql  where字句 |
| ---   | :---   | :----: |
| And | findByNameAndPwd | where name= ? and pwd =? |
|Or	| findByNameOrSex	| where name= ? or sex=? |
|Is,Equals|	findById,findByIdEquals	|where id= ?|
|Between|	findByIdBetween	|where id between ? and ?
|LessThan|	findByIdLessThan|	where id < ?
|LessThanEquals|	findByIdLessThanEquals	|where id <= ?
|GreaterThan|	findByIdGreaterThan	|where id > ?
|GreaterThanEquals|	findByIdGreaterThanEquals|	where id > = ?
|After|	findByIdAfter	|where id > ?
|Before|	findByIdBefore	|where id < ?
|IsNull|	findByNameIsNull	|where name is null
|isNotNull,NotNull|	findByNameNotNull|	where name is not null
|Like|	findByNameLike	|where name like ?
|NotLike|	findByNameNotLike	|where name not like ?
|StartingWith | findByNameStartingWith	|where name like '?%'
|EndingWith	|findByNameEndingWith	|where name like '%?'
|Containing|	findByNameContaining	|where name like '%?%'
|OrderBy	|findByIdOrderByXDesc	|where id=? order by x desc
|Not	|findByNameNot|	where name <> ?
|In	|findByIdIn(Collection<?> c)|	where id in (?)
|NotIn|	findByIdNotIn(Collection<?> c)	|where id not  in (?)
|True	| findByAaaTue | where aaa = true
|False |	findByAaaFalse	| where aaa = false
|IgnoreCase |	findByNameIgnoreCase	| where UPPER(name)=UPPER(?)