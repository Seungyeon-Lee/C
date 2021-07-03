// 020 흐름 제어 - 조건문 if-else

fun main(args: Array<String>): Unit
{
    val a = 10
    val b = 5

    if(a < b) // if부터 else까지는 하나의 문장으로 인식한다. 조건이 true일땐 if를 false일 때는 else를 실행한다.
        println("if")
    else
        println("else")

    if(a > b)
        println("a가 크다.")
    else
        println("b는 a 이상이다.")
}