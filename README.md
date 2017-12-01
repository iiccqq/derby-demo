"# derby-demo" 

下载页
http://db.apache.org/derby/releases/release-10.13.1.1.cgi


ij.bat

 connect 'jdbc:derby:E:/test/db/demo_db'
 
 create table test(id int generated always as identity,user_name varchar(10));
 
 insert into test (user_name)values('abc');
 
  select * from test;
  
  exit;
  
  内嵌只能有一个终端连接
  
  http://127.0.0.1:8080/insert
  
  http://127.0.0.1:8080/query