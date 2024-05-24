# 通用语法
1. sql语句可以单行或多行书写，以分号结尾。
2. 不区分大小写。
3. 注释：
    * 单行注释 --空格或者#
    * 多行注释 /* 注释 */
## DDL 操作数据库
1. ```show databases```显示数据库
2. ```create database db1```创建数据库
3. ```drop database db1```删除数据库
4. ```drop database if exist db1```如果存在则删除
5. ```use db1```使用数据库
6. ```select database()```查看当前使用的数据库
7. ```show tables```查看表
8. ```desc db```查看某张表结构
9. ```
   create table 表名 (
     字段名 数据类型,
     字段名 数据类型,
     字段名 数据类型
   )
   ```
   创建表
10. 数据类型：
    * ```char(10)```定长，性能好，浪费空间
    * ```varchar(10)```动态长度，节省空间
11. ```drop table 表名```删除表
12. ```alter table 表名 rename to 表名```修改表名
13. ```alter table 表名 add 列名 数据类型```新增列
14. ```alter table 表名 modify 列名 数据类型```修改列数据类型
15. ```alter table 表名 change 列名 新列名 数据类型```修改列名和数据类型
16. ```alter table 表名 drop 列名```删除列
## DML 操作数据
1. ``` insert into 表名(列名1,列名2) values(值1,值2) ```给指定列添加数据
2. ``` insert into 表名(列名1,列名2) values(值1,值2),(值1,值2) ```给指定列添加多行数据
3. ```select * from 表名```查看表具体数据
4. ```update 表名 set 列名1=值1,列名2=值2,...[where 条件]```修改数据
5. ```delete from 表名 [where 条件]```删除数据
## DQL 查询数据
```
select
字段列表
from
表名列表
where
条件列表
group by
分组字段
having
分组后条件
order by
排序字段
limit
分页限定
```
1. ```select 列名1,列名2 from 表名```按列查询
2. ```select DISTINCT 列名2 from 表名```去除重复数据
3. ```select 列名1 as 别名,列名2 as 别名 from 表名```给列起别名
4. ```select * from 表名 where age > 20```条件查询
5. ```select * from 表名 where age > 20 and age <= 30```多条件查询
6. ```select * from 表名 where age BETWEEN 20 AND 30```多条件查询
7. ```select * from 表名 where date BETWEEN '1995' AND '1998'```日期条件查询
8. ```select * from 表名 where age = 20```=条件查询
9. ```select * from 表名 where age = 20 or age = 18 or age = 22```或条件查询
10. ```select * from 表名 where age in (18, 20, 22)```或条件查询
11. ```select * from 表名 where score is null```null条件查询
12. ```select * from 表名 where score is not null```not null条件查询
13. 通配符_代表单个任意字符，%代表任意个数字符
14. ```select * from 表名 where name like '马%'```模糊查询
15. ```select * from 表名 where name like '_马%'```第二个字模糊查询
16. ```select * from 表名 where name like '%马%'```包含字模糊查询
17. ASC升序排序，DESC降序排序，如果有多个排序条件，前面条件一样时才会按下个条件排序。
18. ```select * from 表名 order by age asc```升序排序，默认就是升序
19. ```select * from 表名 order by age desc```降序排序
20. ```select * from 表名 order by math desc, english asc```多条件排序
21. ```select 聚合函数(列名) from 表名```聚合函数，null值不参加聚合函数运算
22. ```select count(列名) from 表名```统计数量
23. ```select max(math) from 表名```最大值
24. ```select min(math) from 表名```最小值
25. ```select sum(math) from 表名```总和
26. ```select avg(math) from 表名```平均数
27. ```select sex, avg(math) from 表名 group by sex```分组查询
28. ```select sex, avg(math), count(*) from 表名 group by sex```分组查询
29. ```select sex, avg(math), count(*) from 表名 where math > 70 group by sex```分组查询
30. ```select sex, avg(math), count(*) from 表名 where math > 70 group by sex having count(*) > 2```分组查询
31. where在分组之前执行，不能对聚合函数进行判断，having在分组之后进行过滤，可以对聚合函数进行判断。执行顺序where > 聚合函数 > having。
32. ```select 字段列表 from 表名 limit 起始索引, 查询条目数```分页查询
33. ```select 字段列表 from 表名 limit 3, 3```从第二页开始查，每页3条数据
34. ```select 字段列表 from 表名 limit 3, 3```从第二页开始查
## 约束
```
create table emp (
    id int PRIMARY KEY auto_increment, --主键且自增长
    ename varchar(10) NOT NULL UNIQUE, --非空唯一
    joindate DATE NOT NULL,
    salary DOUBLE(7, 2) NOT NULL,
    bonus DOUBLE(7, 2) DEFULT 0 --默认值
    CONSTRAINT 外键名 FOREIGN key(列名) REFERENCE dept(列名)
)
```
1. ```alter table 表名 add CONSTRAINT 外键名 FOREIGN key(列名) REFERENCE dept(列名)```添加外键
2. ```alter table 表名 drop FOREIGN key 外键名```删除外键
3. 一对一、一对多、多对多的关系通过外键建立。
## 多表查询
1. ```select * from 表1, 表2 where 表1.列名 = 表2.列名```隐式内连接
2. ```select * from 表1 innner join 表2 on 表1.列名 = 表2.列名```显式内连接
3. ```select * from 表1 left join 表2 on 表1.列名 = 表2.列名```左外连接
4. ```select * from 表1 right join 表2 on 表1.列名 = 表2.列名```右外连接
5. ```select * from 表1 where 列名 = 子查询```子查询-单行单列
6. ```select * from 表1 where 列名 in(子查询)```子查询-多行单列
7. ```select * from (子查询)表名, 表2 where 条件```子查询-多行多列
## 事务
1. ```BEGIN```开启事务
2. ```ROLLBACK```回滚事务
3. ```COMMIT```提交事务