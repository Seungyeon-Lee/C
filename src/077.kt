// 077 Not-null 단정 연산자(Not-null Assertion Operator) !!

// 멤버 함수 예제의 Building 클래스 재활용
import ex_member_function.Building

fun main(args: Array<String>)
{
    var obj: Building? = Building()
    obj!!.name = "서울시청" // obj는 Building? 타입 obj!!는 Building 타입이다.
    println(obj!!.name)

    obj = null
    obj!!.print() // KotlinNullPointerException 예외가 발생한다.
}