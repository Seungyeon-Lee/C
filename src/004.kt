// 004 리터럴의 타입

fun main(args: Array<String>): Unit
{
    val variable = 10 + 12 - 5 // 리터럴에 타입이 있기 때문에 표현식의 결과 값에도 타입이 생긴다 (현재 식에서는 Int형을 반환)
    // 타입을 추론 가능한 경우 변수 타입을 생략할 수 있다
    println(variable)
}