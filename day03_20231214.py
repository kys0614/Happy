"""
@input 함수 : 키보드를 입력받을 때부터 시작하는 함수를 기억한다.
name = input('이름을 입력하세요>>')
age = input('나이를 입력하세요>>')

@print 함수 : 출력받을 수 있는 함수
print("입력된 이름은{0} 나이는 {1}".format(name,age))


문제1 : 50000원짜리 물건을 할부로 구입한 뒤 매달내는 돈을 계산해서 보여줄 프로그램을 만들어보자
price = 50000
print("물건의 가격 : {0}".format(price))
n = int(input("할부 개월 입력>>"))
print("매달 내는 돈은 {0}원입니다.".format(price/n))


문제2 : 사용자로부터 1에서 12사이에 월을 입력받아 해당월이 며칠까지 있는지 출력하는 프로그램을 만들어보자
days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
month = int(input("1~12사이의 월을 입력하세요>>"))
day = days[month-1]
print("{0}월은 {1}일까지 있습니다.".format(month, day))


문제3 : 영어사전을 구현하고자 한다. 딕셔너리를 하나 생성하고 예시와 같이 동작하자.
(딕셔너리 : {'name':'sbs':'age':20})
english_dict = {'flower':'꽃','fly':'날다','floor':'바닥'}
word = input("영어 단어를 입력하세요>>")
print("{0} : {1}".format(word,english_dict[word]))


a = 7
b = 2
print("{0} + {1} = {2}".format(a,b,a+b))
print("{0} - {1} = {2}".format(a,b,a-b))
print("{0} * {1} = {2}".format(a,b,a*b))
print("{0} ** {1} = {2}".format(a,b,a**b))
print("{0} / {1} = {2}".format(a,b,a/b))
print("{0} // {1} = {2}".format(a,b,a//b))
print("{0} % {1} = {2}".format(a,b,a%b))


@복합대입연산자
piggy_bank = 0
money = 10000
piggy_bank += money
print("저금통에 용돈{}을 넣었습니다.".format(money))
print("지금 저금통에 {}원이 있습니다.".format(money))


@논리 연산자
a = 10
b = 0
print("{0}>0 and {1}>0 : {2}".format(a,b,a>0 and b>0))
print("{0}>0 or {1}>0 : {2}".format(a,b,a>0 or b>0))
print('not{0} : {1}'.format(a,not a))
print('not{0} : {1}'.format(a,not b))


@비트연산자
a = 0000 1010
b = 0100 0110


@조건연산자 : 삼항연산자
(a==b)?true:false
a = 10
b = 20
result = (a-b)if(a>=b)else(b-a)
print("{0}과 {1}의 차이는 {2} 입니다.".format(a,b,result))


문제4-3 : 네자리 정수로 구성된 사원번호를 기준으로 근무시간을 결정하고자 한다.
사원번호의 끝자리 숫자가 5이상이면 오전 아니면 오후를 출력하자.
4자리 사원번호를 입력하세요>>1255
근무시간은 오전입니다.

emp_no = int(input("4자리 사원번호를 입력하세요>>"))
emp_last_no = emp_no%10
#print(emp_last_no)
is_am = emp_last_no >= 5
#print(is_am)
print("근무 시간은 {}입니다.".format('오전'if is_am else'오후'))


문제 4-5 : 국어 영어 수학 점수를 각각 입력받아 평균을 구하고
평균이 80점 이상이면 합격 아니면 불합격을 출력한다.
국어 점수를 입력하세요>>
영어 점수를 입력하세요>>
수학 점수를 입력하세요>>
평균은 83.0이고 결과는 합격/불합격(삼항연산자) 입니다.

kor = int(input("국어 점수를 입력하세요>>"))
eng = int(input("영어 점수를 입력하세요>>"))
mat = int(input("수학 점수를 입력하세요>>"))
avg = (kor+eng+mat)/3  #평균을 구하는 연산을 처리 (산술연산자)
result = '합격' if avg >=80 else '불합격'
print("평균은 {0}이고 결과는 {1}입니다.".format(avg,result))


@if else 문 : input을 이용한 if문을 만들자
몇살입니까?>>20
성인
몇살입니까?>>19
미성년자
1. 현재 나이를 물어보는 입력값을 만든다.
2. 입력값에 따라서 조건을 만든다(성인(age>=20)-미성년자)
age = int(input("몇살입니까?>>"))
if age >= 20:
    print("성인")
else:
    print("미성년자")


@if elif else 문 : input을 이용한 if-elif문을 만들자
몇살입니까?>>5
미취학
몇살입니까?>>10
초등학생
몇살입니까?>>15
중학생
몇살입니까?>>18
고등학생
몇살입니까?>>21
성인
age = int(input("몇살입니까?>>"))
if age <= 7:
    print("미취학")
elif age <= 13:
    print("초등학생")
elif age <= 16:
    print("중학생")
elif age <= 19:
    print("고등학생")
else:
    print("성인")


@if문 논리연산자 (and / or)
조건문으로 관리자를 구별하는 프로그램을 만들어보자.
사이트의 관리자 = amdin이고 레벨 1이다.
아이디를 입력하세요:>>jiwon
회원의 레벨을 입력하세요:>>1
일반 회원입니다.
아이디를 입력하세요:>>admin
비밀번호를 입력하세요>>1234
회원의 레벨을 입력하세요:>>1
관리자입니다.
1. 비밀번호를 만든다. (passwd=1234)
2. 비밀번호를 입력한다.
3. 조건문에 비밀번호를 추가해서 비밀번호가 맞다면 관리자이다.
pwd = '1234'
id = input("아이디를 입력하세요>>")
pw = input("비밀번호를 입력하세요>>")
level = int(input("회원의 레벨을 입력하세요:>>"))
if id=='admin' and level==1 and pwd==pw:
    print("관리자입니다.")
else:
    print("회원입니다.")


문제 : 조건문으로 계절을 판단하는 프로그램을 만들어보자
월을 입력하세요:>>7
1. 입력하는 월이 3과 같거나 크면서 5와 같거나 작으면 봄이다.
2. 입력하는 월이 6과 같거나 크면서 8과 같거나 작으면 여름이다.
3. 입력하는 월이 9보다 같거나 크면서 11보다 같거나 작으면 가을이다.
4. 입력하는 월이 12보다 같거나 크면서 2보다 같거나 작으면 겨울이다.
월을 입력하세요:>>7
7월은 여름입니다.
월을 입력하세요:>>12
12월은 겨울입니다.
month = int(input("월을 입력하세요:>>"))
if month>=3 and month<=5:
    print("{0}월은 봄이다.".format(month))
if month>=6 and month<=8:
    print("{0}월은 여름이다.".format(month))
if month>=9 and month<=11:
    print("{0}월은 가을이다.".format(month))
if month>=12 and month<=2:
    print("{0}월은 겨울이다.".format(month))

문제 : 조건문으로 좌석 종류를 구별하기
좌석의 종류를 입력하세요(1:일반식, 2:특실):>>1
일반실입니다.
좌석의 종류를 입력하세요(1:일반식, 2:특실):>>2
특실입니다.
sit = int(input("좌석의 종류를 입력하세요(1:일반식, 2:특실):>>"))
if sit ==1:
    print("일반실입니다.")
else:
    print("특실입니다.")

문제99쪽 3번 문제 :
임의의 정수를 3개를 입력받아서 그 중에서 가장 큰 수를 출력하는 프로그램을 만들어보자
정수1 입력:>>3
정수2 입력:>>1
정수3 입력:>>2
가장 큰 수는 3입니다.
"""
num1 = int(input("정수1 입력:>>"))
num2 = int(input("정수2 입력:>>"))
num3 = int(input("정수3 입력:>>"))

if num1 >= num2 and num1 >= num3 :
    print("가장 큰 수는 {}입니다.".format(num1))
elif num2 >= num1 and num2 >= num3 :
    print("가장 큰 수는 {}입니다.".format(num2))
else:
    print("가장 큰 수는 {}입니다.".format(num3))