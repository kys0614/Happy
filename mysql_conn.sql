#데이터 베이스 보기
show databases;

#데이터 베이스 만들기
create database jdbc;

#데이터 베이스 보기
show databases;

#데이터 베이스 사용하기
use jdbc;

#테이블 만들기
#student_info 데이블 / 기본키 : std_id(varchar(100))
create table jdbc.student_info(
	std_id VARCHAR(100) NOT NULL,  #아이디
    std_name VARCHAR(100) NOT NULL,  #이름
    std_age INT NOT NULL,  #나이
    std_grade INT NOT NULL,  #학년
    std_gender VARCHAR(50) NOT NULL,  #성별
    std_phone VARCHAR(100) DEFAULT '',  #번호
    PRIMARY KEY(std_id)
);

#테이블 보기
show tables;

#테이블 내용 입력
insert into jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
values ('202301','홍길동',18,2,'남자','010-2989-5454');
insert into jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
values ('202302','홍이동',19,2,'여자','010-2525-5454');
insert into jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
values ('202303','홍삼동',20,2,'남자','010-3636-5454');
insert into jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
values ('202304','홍사동',17,2,'여자','010-6868-5454');
insert into jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
values ('202305','홍오동',21,2,'남자','010-5959-5454');
insert into jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
values ('202306','홍육동',22,2,'여자','010-4242-5454');
insert into jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
values ('202307','홍칠동',23,2,'남자','010-4848-5454');
insert into jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
values ('202308','홍팔동',16,2,'남자','010-3232-5454');
insert into jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
values ('202309','홍구동',24,2,'여자','010-9898-5454');
insert into jdbc.student_info(std_id, std_name, std_age, std_grade, std_gender, std_phone)
values ('202310','홍십동',25,2,'여자','010-6565-5454');

#테이블 보기(전체)
select * from jdbc.student_info;

#테이블 보기(부분) = where 조간문을 작성한다.
select * from jdbc.student_info where std_gender='남자';
select * from jdbc.student_info where std_gender='여자';

#테이블 수정
update jdbc.student_info SET std_gender='남자', std_age='22' where std_id='202302';

#데이터 삭제
delete from jdbc.student_info where std_id='202302';

#데이터 베이스 baseball
create database baseball;
#데이터 베이스 확인
show databases;
#데이터 베이스 선태하기
use baseball;

#랭킹 테이블 만들기
create table baseball.rank(
	name VARCHAR(30) NOT NULL,
    time INT NOT NULL
);

#랭킹 테이블 보기
select * from baseball.rank order by time desc;
select * from baseball.rank order by time desc;

#랭킹 insert : 입력하기
insert into baseball.rank (name,time) values ('SBS', 5);
insert into baseball.rank (name,time) values ('MBC', 3);
insert into baseball.rank (name,time) values ('KBS', 10);










