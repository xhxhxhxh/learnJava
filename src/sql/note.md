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