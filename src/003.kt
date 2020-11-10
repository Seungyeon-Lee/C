// 003 변수(Variable)

fun main(args: Array<String>): Unit
{
    // 코틀린에서는 주로 낙타 표기법을 사용한다.
    // Int와 같은 기본 타입들도 모두 클래스(원시 타입이 없다)이다. (자바의 래퍼 클래스가 코틀란에서는 기본 타입이 되었다고 생각하면 된다)

    var total: Int = 0 // 선언과 동시에 초기화
    total = 0 // var과 달리 val(=final)을 사용하면 값 저장 이후 수정이 불가하다.

    val a: Int = 10 + 53 - 7
    println(a)

    val b: Int = 43 + 75 + a
    println(b)

    total = a + b
    println(total)

    // 변수는 반드시 사용하기 전에 초기화 해야한다.
}