// 030 함수(Function)

fun main(args: Array<String>): Unit
{
    println(myFunction())
    println(myFunction() + 10)
}

fun myFunction(): Int
{
    val a = 3
    val b = 6
    println("a: " + a + ", b: " + b)
    return a + b
}

// fun function(): Double = 3.0 + 7과 동일하다.
// 타입이 추론 가능한 리턴 값의 경우엔 반환 타입을 생략할 수 있다.
fun function(): Double
{
    return 3.0 + 7
}