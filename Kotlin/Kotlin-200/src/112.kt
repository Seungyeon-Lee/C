// 112 구체화된(Reified) 타입 매개변수

package ex_reified_type_parameter

inline fun <reified T> check() // reified를 붙이려면 반드시 inline으로 선언해야한다.
{
    val number = 0
    if (number is T) // 타입 매개변수는 is 연산자의 피연산자로 사용할 수 없다.
        println("T는 Int 타입입니다.") // 타입 매개변수 앞에 reified를 붙여주면 해당 타입 매개변수를 in 연산자에 사용할 수 있다.
}

fun main(args: Array<String>)
{
    check<Int>() // T는 Int 타입입니다.
}