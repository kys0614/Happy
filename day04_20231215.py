"""
반복문 : 조건을 수행하는 반복적인 명령어
while - 횟수를 사용하지 않는 반복문

문제1:
#count 변수가 6미만이라면 조건이 참인 동안 계속 반복하는 프로그램을 만들자
count = 1
while count < 6:
    print(count)
    count += 1 #count = count + 1


문제2 : 파이썬 재밌어요 ==> 10번 출력하자
count = 1
while count <= 10:
    print("파이썬 재밌어요")
    count += 1


#문제 : 조건식이  없는 반복문을 while문으로 만들어보자.
조건을 생각해서 만들고 break 문을 걸어보자.
count = 1
while True :
    print("끝이 안나요")
    #반복이 끝날 수 있는 이유를 만들자 (조건 --> break)
    count += 1
    if count > 3:
        break


문제 : 두 개의 정수를 입력받아서 두 정수의 값의 합을 출력하는 코드를 만들기
1. while문 조건식이 True이다.
2. 두 개의 정수가 모두 0일 경우는 반복문을 멈춘다.
3. 두 개의 정수가 모두 0이 아닌 경우는 두 정수의 합계를 더한 값을 출력한다.

while True :
    num1 = int(input("첫번째 정수 입력>>"))
    num2 = int(input("두번째 정수 입력>>"))
    if num1==0 and num2==0 :
        break
    else:
        print("두 정수의 합 : {}".format(num1+num2))

print("프로그램이 종료되었습니다.")


#랜덤 : 프로그래머가 생각하는 숫자가 아니라 컴퓨터가 스스로 randit(랜덤 수학 공식을 활용한 함수)
import : 라이브러리 (사전) 지원한다.

문제 : 랜덤수 UP&Down 프로그램 만들기
1. 1부터 50사이의 random 수를 맞추면 정답입니다.
2. 랜덤의 수보다 작을 경우 "랜덤보다 작은 수입니다."
3. 랜덤의 수보다 클 경우는 "랜덤보다 큰 수입니다."
4. 랜덤의 수와 입력한 수가 같을 경우는 "정답입니다."

import random
coin = random.randint(1,50)
while True :
    num = int(input("숫자를 입력하세요:>>"))
    if coin == num :
        print("정답입니다.")
    elif coin > num :
        print("{}보다 랜덤의 수가 큰 수 입니다.".format(num))
    else:
        print("{}보다 랜덤의 수가 작은 수 입니다.".format(num))


문제 111쪽
section06-01 : 정수를 입력받아서 횟수만큼 Hello를 출력하는 프로그램을 구현하자.
조건-------> 0이하의 값이 입력되면 잘못된 입력입니다. 오류메세지 출력하자.

정수를 입력하세요>>>5
1번째 Hello
2번째 Hello
3번째 Hello
4번째 Hello
5번째 Hello

조건-->
정수를 입력하세요>>-2
잘못된 입력입니다.
count = int(input("정수를 입력하세요:>>"))
num = 0
if count <= 0 :
    print("잘못된 입력입니다.")
else:
    while num < count:
        print("Hello")
        num += 1


section06-03 : 커피 1잔을 300원에 판매하는 커피자판기가 있습니다.
이 커피자판기에는 돈을 넣으면 자판기에서 뽑을 수 있는 커피가 몇잔이며 잔돈은 얼마인지 풀력하는 프로그램을 완성하세요.
자판기에 얼마를 넣을까요?>>1400

커피1잔, 잔돈 1100원
커피2잔, 잔돈 800원
커피3잔, 잔돈 500원
커피4잔, 잔돈 200원

#입력을 한번 받고 while문이 입력된 조건에 따라서 반복하면서 잔돈을 알려주면 된다.
money = input("자판기에 얼마를 넣을까요?")
while 조건식 :
money = int(input("자판기에 얼마를 넣을까요?>>"))
coffee = 0
while money >= 300 :
    coffee += 1
    money -= 300
    print("커피{0}잔, 잔돈 {1}원".format(coffee,money))


@ 반복문 for 사용하기
hi = '안녕하세요'
for s in hi :
    print(s)


문제1 : 튜플에 체리, 딸기, 수박을 넣고 for문으로 튜플에 값들을 차례대로 출력하자.
tuple_fruit = ("체리", "딸기", "수박")
for fruit in tuple_fruit :
    print(fruit)


문제2 : 5명에 대한 정보처리기사 자격증 시험 점수가 리스트에 담겨져 있다.
이 때 각 점수가 합격점수인지 불합격 점수인지 판별해서 출력하자.
score_list = [90, 45, 70, 60, 55]
1번 학생은 합격입니다.
2번 학생은 불합격입니다.
3번 학생은 합격입니다.
4번 학생은 합격입니다.
5번 학생은 불합격입니다.
추가 : 몇번째 학생이 합격인지 불합격인지를 수정해보세요.

score_list = [90, 45, 70, 60, 55]
num = 0
num += 1
for score in score_list :
    if score >= 60 :
        print("{}번 학생은 합격입니다.".format(num))
    else :
        print("{}번 학생은 불합격 입니다."format(num))


@ for문 ; range함수(시작, 끝-1, 증감) :
1. 증감을 생략할 수도 있다.
2. 끝 조건을 주면 시작은 0이고 끝을 -1 안해도 된다.
for i in range(100,1,-3) :
    print(i)


문제1 : 3 4 5 6 7 8 9를 range함수로 출력하자
for i in range(3,10) :
    print(i)


문제2 : 0 1 2 3 4 5 6 7 8 9를 range 함수로 출력하자
for j in range(10) :
    print(j)


@ 리스트를 이용한 for문 -> [[1,2],[3,4],[5,6]]
for j in list[i] :
    print(j)

list = [[1,2],[3,4],[5,6]]
for i,j in list :
    print(i,j)

for i in list :
    print(i)


문제 : 1~100사이의 숫자 -> 반복문 for문을 사용한다. (range함수)
range : range(종료값) / range(시작,종료) / range(시작,종료,증감)
3의 배수인 값 --> 조건이 된다.
배수들의 합 --> 3의 배수들을 합할 공간변수를 따로 만들고 합을 더해준다.
마지막에 3의 배수의 합할 숫자를 출력해준다.

1) range(종료값)
sum = 0
for i in range(101) :
    if i % 3 == 0 :
        sum += i

2) range(시작,종료)
sum = 0
for i in range(1,101) :
    if i % 3 == 0:
        sum += i
print(sum)

3) range(시작,종료,증감)
sum = 0
for i in range(3,101,3) :
    sum += i
print(sum)


문제 : for문을 이용하여 구구단 2단을 출력하자.
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18

for i in range(1,10) :
    print("2 * {0} = {1}".format(i,i*2))


[학점 관리 시스템]
=====================================================
1. [1]시험점수입력 [2]성적확인 [3]종료 ---> 3
2. 1번 입력했다면-------->
이름입력 : >>김자바
자바 점수 입력:>>90
web점수 입력:>>100
3. [1]시험점수입력 [2]성적확인 [3]종료 ---> 2
이름 : 김자바 / 자바점수 : 90 /웹점수 : 100 / 등급 : (if문)
자바 웹 평균 등급 --> A=90점이상/B=80점이상/C=70점이상/D=60점이상/F=낙제
출력 : (김자바/90/100/A)
4. [1]시험점수입력 [2]성적확인 [3]종료 --->3
시스템 종료되었습니다.
"""
print('='*50)
studentScore = []
while True :
    choice = int(input("[1]시험점수입력 [2]성적확인 [3]종료>>"))

    if choice == 1: #시험점수입력
        name = input('이름 입력:>>')
        javaScore = int(input('자바 점수 입력:>>'))
        webScore = int(input('웹 점수 입력:>>'))
        studentScore.append([name,javaScore,webScore])
        print(studentScore)
        print('=' * 50)

    elif choice == 2: #성적확인
        print("2")
        print('이름 \tJava \tWeb \tGrade')
        print('-'*30) #밑줄긋기
        grade = ''

        for p in studentScore:
            #p[1] 자바 점수 / p[2] web 점수 == 평균을 구하자
            score_avg = (p[1]+p[2])/2 #총 평균계산

            if score_avg >= 90:
                grade = 'A'
            elif score_avg >= 80:
                grade = 'B'
            elif score_avg >= 70:
                grade = 'C'
            elif score_avg >= 60:
                grade = 'D'
            else:
                grade = 'F'

            print('{0} \t{1} \t{2} \t{3}'.format(p[0],p[1],p[2],grade))

    else : #종료
        print("시스템 종료되었습니다.")
        break