-- 10번 및 30번 부서에 속하는 모든 사원 중 급여가 1500을 넘는 사원의
-- 사원번호, 이름 및 급여를 조회하세요

SELECT DEPARTMENT_ID ,EMPLOYEE_ID, FIRST_NAME, SALARY FROM EMPLOYEES
WHERE DEPARTMENT_ID IN(10,30) AND SALARY > 1500;

-- (MANAGER_ID) 관리자가 없는 모든 사원의 이름 및 직종을 출력하세요

SELECT MANAGER_ID, FIRST_NAME, JOB_ID FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;

-- 직업이 IT_PROG 또는 SA_MAN이면서 급여가 1000,3000,5000이 아닌 사원들의
-- 이름, 직종 및 급여를 조회하세요

SELECT FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES
WHERE JOB_ID IN('IT_PROG','SA_MAN') AND SALARY NOT IN (1000,3000,5000);


----------------------------------------------------------------------

CREATE TABLE TBL_STUDENT(
	ID NUMBER,
	NAME VARCHAR2(100),
	MAJOR VARCHAR2(100),
	GENDER CHAR(1) DEFAULT 'W' NOT NULL CONSTRAINT BAN_CHAR CHECK(GENDER = 'M' OR GENDER ='W'),
	BIRTH DATE CONSTRAINT BAN_DATE CHECK(BIRTH >= TO_DATE('1980-01-01','YYYY-MM-DD')),
	CONSTRAINT STD_PK PRIMARY KEY(ID)
);

-- TBL_STUDENT
-- 학번, 이름, 전공, 성별, 생일

-- BAN_CHAR 체크 제약조건 위배
--INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,GENDER,BIRTH)
--VALUES (0, '홍길동', '컴퓨터공학과', 'A', '1980-01-02');

INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,GENDER,BIRTH)
VALUES (0, '홍길동', '컴퓨터공학과', 'M', '1980-01-02');

INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,GENDER,BIRTH)
VALUES (1, '박디비', '컴퓨터공학과', 'W', '1990-02-06');

SELECT *FROM TBL_STUDENT;

--DEFAULT 값 사용해보기
INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,BIRTH)
VALUES (2, '홍길동','컴퓨터공학과','1994-08-26');

-- INSERT 할 때, 컬럼명을 생략하면 DEFAULT 값을 넣을 수 없다.
INSERT INTO TBL_STUDENT 
VALUES (3, '이자바','컴퓨터공학과','M','1994-08-26');

-- FLOWER테이블에 데이터 넣기
-- 꽃이름
-- 꽃색깔
-- 가격
-- 장미꽃, 빨간색, 3000
INSERT INTO FLOWER (F_NAME,F_COLOR,F_PRICE)
VALUES ('장미꽃', '빨간색',3000);
INSERT INTO FLOWER VALUES('해바라기','노란색',2000);
INSERT INTO FLOWER VALUES('튤립','흰색',4000);

SELECT *FROM FLOWER;

-- POT테이블에 데이터 추가하기
-- 화분번호, 화분색깔, 화분모양, 꽃이름

INSERT INTO POT VALUES(202408260001,'검은색','사각형','장미꽃');

SELECT * FROM POT;

CREATE TABLE FLOWER2(
	F_NAME2 VARCHAR2(200) PRIMARY KEY,
	F_COLOR2 VARCHAR2(100),
	F_PRICE2 NUMBER
);

--다른 테이블에 있는 데이터를 조회해서 추가하는것이 가능하다.
INSERT INTO FLOWER2(F_NAME2, F_COLOR2, F_PRICE2)
SELECT F_NAME, F_COLOR, F_PRICE
FROM FLOWER
WHERE F_PRICE >= 3000;

SELECT *FROM FLOWER2;

-- 여러 테이블에 한번에 데이터를 추가하는 것도 가능
INSERT ALL
	INTO FLOWER VALUES('할미꽃', '보라색', 5000)
	INTO FLOWER2 VALUES('백합', '흰색', 7000)
SELECT *FROM DUAL;
-- DUAL -> 오라클에서 제공하는 '가상의 테이블'
SELECT *FROM FLOWER f ;
SELECT *FROM FLOWER2 f ;

--삭제
SELECT *FROM POT;

DELETE FROM FLOWER
WHERE F_NAME = '장미꽃';

-- PK와 FK로 연결된 테이블에서 외래키로 참조되고 있는 데이터는
-- 부모테이블에서 삭제가 불가능하다

-- STUDENT 테이블에서 이름이 홍길동인 사람 삭제하기
DELETE FROM TBL_STUDENT
WHERE NAME = '홍길동';

SELECT * FROM TBL_STUDENT;

-- 학생테이블에서 학번 1번인 학생의 이름을 홍길동으로, 성별을 남자로 수정하기
UPDATE TBL_STUDENT SET 
NAME = '홍길동',
GENDER = 'M'
WHERE ID = 1;

-- 사원 테이블에서 급여를 많이 받는 순서대로 사번, 이름, 급여, 입사일순으로 출력하되,
-- 급여가 같은 경우 입사일이 빠른 순으로 정렬
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, HIRE_DATE FROM EMPLOYEES 
ORDER BY SALARY DESC , HIRE_DATE;
-- 컬럼의 순서를 알고 있다면 번호로 정렬할 수 있다.
-- ORDER BY '8' DESC, '6' ASC;

SELECT * FROM EMPLOYEES;

-- 사원테이블에서 부서번호가 빠른순, 부서번호가 같다면 직종이 빠른순,
-- 직종도 같다면 급여를 많이 받는 순으로 정렬하여 사번, 이름, 부서번호, 직종, 급여순으로 출력

SELECT EMPLOYEE_ID, FIRST_NAME, DEPARTMENT_ID, JOB_ID, SALARY FROM EMPLOYEES
ORDER BY DEPARTMENT_ID, JOB_ID, SALARY DESC;

-- 입사일이 빠른순으로 급여가 15000이상인 사원들의 사번, 이름 급여, 입사일을 조회
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, HIRE_DATE FROM EMPLOYEES
WHERE SALARY >= 15000 ORDER BY HIRE_DATE;

-- 문자와 관련된 함수

-- ASCII ()
-- 지정된 문자의 ASCII 값을 반환한다.
SELECT ASCII('A') FROM DUAL;

-- CHR()
-- 지정된 숫자의 ASCII 문자를 반환한다.
SELECT CHR(65) FROM DUAL;

-- RPAD(데이터, 고정길이, 문자)
-- 데이터를 왼쪽으로 몰아서 정렬 후 생긴 빈 공백에 특정 문자를 채워 반환
SELECT RPAD(DEPARTMENT_NAME,10,'*')FROM DEPARTMENTS; 

-- LPAD(데이터, 고정길이, 문자)
-- 데이터를 오른쪽으로 몰아서 정렬 후 생긴 빈 공백에 특정 문자를 채워 반환
SELECT LPAD(DEPARTMENT_NAME,10,'*')FROM DEPARTMENTS; 

-- TRIM()
-- 문자열의 공백 문자들을 삭제한다.
SELECT TRIM('       TRIM       ') FROM DUAL;
-- RTRIM()
-- LTRIM()

-- INSTR()
-- 특정문자의 위치르 반환
SELECT INSTR('HELLOW','O') FROM DUAL;

-- INSTR(데이터, 찾을 문자, 검색 위치, 몇번째 나오는지)
SELECT INSTR('HELLOW','L',1,2) FROM DUAL;

-- 찾는 문자열이 없으면 0을 반환한다.
SELECT INSTR('HELLOW','Z') FROM DUAL;

-- INITCAP()
-- 첫 문자를 대문자로 변환하는 함수
SELECT INITCAP('good morning') FROM DUAL;
SELECT INITCAP('good/morning') FROM DUAL;

-- LENGTH()
-- 주어진 문자열의 길이를 반환
SELECT LENGTH ('JHON') FROM DUAL;

-- CONCAT()
-- 주어진 두 문자열을 연결
SELECT CONCAT('HELLO ','WORLD') FROM DUAL;

-- SUBSTR()
-- 문자열의 시작 위치부터 길이만큼 자른 후 반환
-- 길이는 생략 가능하며, 생략 시 문자열의 끝까지 반환한다.
SELECT SUBSTR('Hello Oracle', 2), substr('Hello Oracle',7,5)
FROM DUAL;

-- REPLACE(데이터, 원래글자, 바꿀글자)
SELECT REPLACE('GOOD MORNING', 'MORNING','EVENING') FROM DUAL;

-- UPPER()
-- 주어진 문자열을 전부 대문자로 바꾼다.
SELECT UPPER('good morning') FROM dual;
SELECT LOWER('GOOD MORNING') FROM DUAL;

-- 부서번호가 50번인 사원들의 이름을 출력하되 이름이 'el'을 모두 '**' 로 대체하여 출력하세요
SELECT REPLACE (FIRST_NAME,'el','**') FROM EMPLOYEES 
WHERE DEPARTMENT_ID = 50;

-- 이름이 6글자 이상인 사원의 사번과 이름, 급여를 출력
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY FROM EMPLOYEES
WHERE FIRST_NAME LIKE '______%';

-- ' H E L L O '의 공백을 모두 제거하여 출력하세요
SELECT REPLACE(' H E L L O ', ' ','') FROM DUAL;

-- 아래 칼럼을 가지는 PRODUCT2 테이블을 생성하는 DDL을 작성하시오
--제약조건의 이름은 자동으로 부여되도록 별도로 지정하지 마시오
--(단, 제약조건의 이름을 지정하더라도 감점하지 않는다.)
--<<칼럼 정보>>
-- 1) NO : 제품번호, 숫자, 기본키
-- 2) NAME : 제품명, 문자열 최대 100바이트, 필수
-- 3) PRICE : 제품가격, 숫자
-- 4) P_DATE : 생산일자, 날짜

CREATE TABLE PRODUCT2(
"NO" NUMBER PRIMARY KEY,
NAME VARCHAR2(100) NOT NULL,
PRICE NUMBER,
P_DATE DATE
);

INSERT INTO PRODUCT2 VALUES(1000,'컴퓨터',100,'21/04/15');
INSERT INTO PRODUCT2 VALUES(1002,'냉장고',200,'21/03/29');
INSERT INTO PRODUCT2 VALUES(1003,'에어컨',300,'20/12/15');
INSERT INTO PRODUCT2 VALUES(1004,'오디오',20,'20/12/15');
INSERT INTO PRODUCT2 VALUES(1001,'세탁기',60,SYSDATE);

-- NO가 1000인 데이터의 PRICE를 20 증가시키세요
UPDATE PRODUCT2 SET
PRICE = 120
WHERE "NO" = 1000;



-- NAME이 '세탁기'인 데이터를 모두 삭제하세요
DELETE FROM PRODUCT2
WHERE NAME = '세탁기';

SELECT * FROM PRODUCT2;
