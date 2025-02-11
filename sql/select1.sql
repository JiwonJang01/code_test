-- select 문 연습
-- 평균 일일 대여 요금 구하기
-- AVG:평균, ROUND:반올림
SELECT ROUND(AVG(DAILY_FEE)) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE ='SUV'

-- ORDER BY에서 DESC는 내림차순.
-- JOIN을 이용하여 테이블을 공통의 하나의 요소로 묶을 수 있음
SELECT FIRST_HALF.FLAVOR
FROM FIRST_HALF
INNER JOIN ICECREAM_INFO ON FIRST_HALF.FLAVOR=ICECREAM_INFO.FLAVOR
WHERE TOTAL_ORDER>3000 AND INGREDIENT_TYPE='fruit_based'
ORDER BY TOTAL_ORDER DESC;

-- DATE_FORMAT으로 연월일을 구분하는데 %Y-%m-%d 로 하면 숫자-숫자-숫자, %Y-%M-%D로 하면 숫자-영어-영어
SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD,'%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD IN ('CS','GS')
ORDER BY HIRE_YMD DESC, DR_NAME

SELECT RI.REST_ID, RI.REST_NAME, RI.FOOD_TYPE, RI.FAVORITES, RI.ADDRESS, ROUND(AVG(RR.REVIEW_SCORE),2) AS SCORE
FROM REST_INFO RI JOIN REST_REVIEW RR ON RI.REST_ID = RR.REST_ID
WHERE RI.ADDRESS LIKE '서울%'
GROUP BY RI.REST_ID, RI.REST_NAME, RI.FOOD_TYPE, RI.FAVORITES, RI.ADDRESS
ORDER BY SCORE DESC, RI.FAVORITES DESC;
