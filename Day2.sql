/*USER			
U_ID(PK)	VARCHAR2(100)			
U_PW		VARCHAR2(100)			
U_NAME		VARCHAR2(300)
U_ADDRESS	VARCHAR2(300)
U_EMAIL		VARCHAR2(300)		
U_BIRTH 		DATE

ORDER			
O_NUM		NUMBER		
O_DATE		DATE
U_ID(FK)	VARCHAR2(100)
P_NUM		NUMBER
		


PRODUCT	
P_NUM(PK)	NUMBER	
P_NAME		VARCHAR2(100)
P_PRICE		NUMBER
P_COUNT		NUMBER
*/

CREATE TABLE "USER"(
	U_ID VARCHAR2(100) PRIMARY KEY,
	U_PW VARCHAR2(100),
	U_NAME VARCHAR2(300),
	U_ADDRESS VARCHAR2(300),
	U_EMAIL VARCHAR2(300),
	U_BIRTH	DATE,
	
);

CREATE TABLE PRODUCT(
	P_NUM NUMBER PRIMARY KEY,
	P_NAME VARCHAR2(100),
	P_PRICE NUMBER,
	P_COUNT NUMBER
);
-- 코드를 수정한다고 다시 적용이 안됨
-- 테이블을 날리고 다시 만들던지(안에있는 데이터가 날아감)
-- 테이블 생성 후 제약조건 추가
CREATE  TABLE "ORDER"(
	O_NUM NUMBER PRIMARY KEY,
	O_DATE DATE,
	U_ID VARCHAR2(100),
	P_NUM NUMBER,
	CONSTRAINT USER_FK FOREIGN KEY(U_ID) REFERENCES "USER"(U_ID),
	CONSTRAINT PRODUCT_FK FOREIGN KEY(P_NUM) REFERENCES PRODUCT(P_NUM)
);

/*FLOWER		
F_NAME(PK) VARCHAR2(100)	
F_COLOR	VARCHAR2(100)	
F_PRICE NUMBER
		

POT
P_NUMBER NUMBER
P_COLOR VARCHAR2(100)
P_SHAPE VARCHAR2(100)
F_PRICE NUMBER
*/

CREATE TABLE FLOWER (
F_NAME VARCHAR2(100),
F_COLOR VARCHAR2(100),
F_PRICE NUMBER PRIMARY KEY
);

CREATE TABLE POT (
P_NUMBER NUMBER,
P_COLOR VARCHAR2(100),
P_SHAPE VARCHAR2(100),
F_PRICE NUMBER,
CONSTRAINT FLOWER_FK FOREIGN KEY(F_PRICE) REFERENCES FLOWER(F_PRICE)
);

/*CD
C_TITLE(PK)
C_PRICE
C_GENRE
C_TRACKLIST
C_A_NAME(FK)

ARTIST
A_NAME(PK)
A_NATIONALITY
A_DEBUTDATE

TRACK
T_TITLE
T_RUNNINGTIME
T_C_TITLE(FK)*/
CREATE TABLE ARTIST(
A_NAME VARCHAR2(100) PRIMARY KEY,
A_NATIONALITY VARCHAR2(200),
A_DEBUTDATE DATE
);

CREATE TABLE CD (
C_TITLE VARCHAR2(100) PRIMARY KEY,
C_PRICE NUMBER,
C_GENRE VARCHAR2(200),
C_TRACKLIST VARCHAR2(300),
C_A_NAME VARCHAR2(100),
CONSTRAINT CD_FK FOREIGN KEY(C_A_NAME) REFERENCES ARTIST(A_NAME)
);

CREATE TABLE TRACK(
T_TITLE VARCHAR2(100) PRIMARY KEY,
T_RUNNINGTIME NUMBER,
T_C_TITLE VARCHAR2(100),
CONSTRAINT TRACK_FK FOREIGN KEY(T_C_TITLE) REFERENCES CD(C_TITLE)
);

CREATE TABLE TEAM(
T_NUMBER NUMBER(2) PRIMARY KEY,
T_NAME VARCHAR2(100) 
);

CREATE TABLE WORKER(
T_NUMBER NUMBER(2),
W_NUMBER NUMBER PRIMARY KEY,
W_NAME VARCHAR2(200) ,
W_POSITION VARCHAR(300),
CONSTRAINTS TEAM_FK FOREIGN KEY(T_NUMBER) REFERENCES TEAM(T_NUMBER)
);

CREATE TABLE FAMILY (
W_NUMBER NUMBER,
F_NAME VARCHAR2(200),
F_AGE NUMBER,
CONSTRAINTS WORKER_FK FOREIGN KEY(W_NUMBER) REFERENCES WORKER(W_NUMBER)
);

CREATE TABLE HISTORY (
W_NUMBER NUMBER,
H_PERIOD DATE,
CONSTRAINTS WORKER_FK FOREIGN KEY(W_NUMBER) REFERENCES WORKER(W_NUMBER)
);

SELECT EMPLOYEE_ID,FIRST_NAME FROM EMPLOYEES;

-- 컬럼 조회
SELECT * FROM COLS WHERE TABLE_NAME = 'EMPLOYEES';

-- 사원테이블에서 모든 정보를 조회하세요
SELECT * FROM EMPLOYEES;

-- DEPARTMENT(부서) 테이블의 모든 정보를 조회하세요
SELECT * FROM DEPARTMENTS;

-- 사원테이블에서 이름, 직종, 급여를 조회해보세요
SELECT FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES;

-- 컬럼에 실제로 없는 정보도 출력할 수 있다.
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, COMMISSION_PCT, SALARY*COMMISSION_PCT
FROM EMPLOYEES;

-- 사원테이블에서 급여가 10000이상인 사원들의 정보를 사번, 이름, 급여 순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY FROM EMPLOYEES WHERE SALARY >=10000; 

-- 사원테이블에서 이름이 Michael인 사원의 사번, 이름을 조회
-- 문자열 데이터는 ''에 넣어서 표현
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES WHERE FIRST_NAME = 'Michael';

-- 사원테이블에서 직종이 IT_PROG인 사원들의 정보를 사번, 이름, 직종, 급여 순으로 조회
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES WHERE JOB_ID = 'IT_PROG';

-- 사원테이블에서 급여가 10000이상 13000이하인 사원의 정보를 이름, 급여 순으로 조회하세요
SELECT FIRST_NAME, SALARY FROM EMPLOYEES WHERE SALARY >= 10000 AND SALARY <= 13000;

-- 사원테이블에서 (HIRE_DATE)입사일이 05년9월21일 이후에 입사한 사원의 정보를 사번, 이름, 입사일 순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE FROM EMPLOYEES WHERE HIRE_DATE >= '2005-09-21';

-- 사원테이블에서 2006년도에 입사한 사원들의 정보를 사번, 이름, 직종, 입사일 순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, HIRE_DATE FROM EMPLOYEES 
WHERE HIRE_DATE >= '2006-01-01' AND HIRE_DATE <= '2006-12-31';

-- 사원테이블에서 직종이 'SA_MAN'이거나 'IT_PROG'인 사원들의 모든 정보를 출력하세요
SELECT * FROM EMPLOYEES WHERE JOB_ID = 'SA_MAN' OR JOB_ID = 'IT_PROG';

-- 사원테이블에서 급여가 2200, 3200, 5000, 6000을 받는 사원들의 정보를
-- 사번, 이름, 직종, 급여 순의 조회
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES WHERE SALARY = 2200 OR SALARY =3200 OR SALARY = 5000 OR SALARY = 6000;

SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, HIRE_DATE FROM EMPLOYEES 
WHERE HIRE_DATE BETWEEN '2006-01-01' AND '2006-12-31';

-- 직종이 'SA_MAN', 'IT_PROG'가 아닌 모든 사원의 정보를 출력
SELECT * FROM EMPLOYEES WHERE JOB_ID NOT IN ('SA_MAN', 'IT_PROG');

-- 사원테이블에서 사원들의 이름 중 M으로 시작하는 사원들의 정보를 사번, 이름, 직종 순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID FROM EMPLOYEES WHERE FIRST_NAME LIKE 'M%';

-- 사원테이블에서 이름에 a가 포함되어 있는 사원의 정보를 이름, 직종 순으로 출력
SELECT FIRST_NAME, JOB_ID FROM EMPLOYEES WHERE FIRST_NAME LIKE '%a%';

-- 이름의 첫 글자가 M 이면서 총 7글자의 이름을 가진 사원 정보를 사번,이름순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES WHERE FIRST_NAME LIKE 'M______';

-- 사원테이블에서 이름의 세번째 글자에 a가 들어가는 사원들의 정보를 사번, 이름순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES WHERE FIRST_NAME LIKE '__a%';

-- 이름에 소문자 o가 들어가면서 a로 끝나는 사원들의 정보를 이름, 급여순으로 조회
SELECT FIRST_NAME, SALARY FROM EMPLOYEES WHERE FIRST_NAME LIKE '%o%a';

-- 이름이 H로 시작하면서 6글자 이상인 사원들의 정보를 사번, 이름순으로 조회
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES WHERE FIRST_NAME LIKE 'H_____%';

-- 사원테이블에서 이름에 s가 들어있지 않은 사원들만 사번, 이름으로 검색하세요
SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES WHERE FIRST_NAME NOT LIKE '%s%';

-- 언더바 자체를 조회하고 싶으면 이스케이프문자 '%\_%'; 를 써야한다.











