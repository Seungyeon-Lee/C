// 119 흐름 제어 - 반복문 for

package ex_for

fun main(args: Array<String>)
{
    for(i: Int in 1 .. 10) // in 표현식에서의 표현식은 operator fun iterator(): Interator<자유 타입>의 연산자 멤버 함수를 갖고 있는 객체만을 지정할 수 있다.
        print("$i ")
    println()

    // in 연산자는 일반적인 in 연산자(contains 연산자 멤버 함수가 있어야만 지원)와는 달리, iterator 연산자 멤버 함수만 있으면 지원된다.
    for(i: Int in 1 .. 10) // for문 속 변수 타입과 Iterator의 타입 인수가 같아야 한다. (변수 이름 뒤의 타입은 생략할 수 있다)
    {
        if(i > 5)
            break

        print("$i ")
    }
}