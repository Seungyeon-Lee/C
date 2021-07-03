// 090 inline 함수

package ex_inline_function

inline fun hello() // 실행 흐름을 점프하지 않고 함수의 몸체로 대신한다.
{
    println("Hello")
    println("Kotlin")
}

fun main(args: Array<String>)
{
    hello() // inline 함수는 재귀호출이 불가능하다. (코드가 무한대로 늘어날 수 있기 때문에)
    hello() // 일반적으로 인라인 함수는 프로그램의 성능을 개선시켜줄 수 있지만, 함수의 문장을 재활용하지 않기 때문에 프로그램의 크기가 늘어난다.
    hello() // 문장이 적고 빈번히 호출되는 경우 inline을 사용하면 좋다.
}