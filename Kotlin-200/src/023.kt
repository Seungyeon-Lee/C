// 023 흐름 제어 - 조건문 when

fun main(args: Array<String>): Unit
{
    val score = 64

    // if와 마찬가지로 블록 내부의 문장이 하나일 때 중괄호를 생략할 수 있다.
    when (score / 10)
    {
        6 -> println('D')
        7 -> println('C')
        8 -> println('B')
        9, 10 -> println('A')
        else -> println('F')
    }

    println("test")
}