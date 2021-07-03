// 160 run 확장 함수: 코드 중복 줄이기

package ex_run_extension_function

fun main(args: Array<String>)
{
    val a = 10
    val b = 5

    (a * b - 2 * a).run {  // run 확장 함수를 호출하면 this.block()을 호출하여 run의 리시버를 block이 가리키는 함수에 전달한다.
        if (this > 0)
            println(this) // run 확장 함수를 사용하여 중복되는 표현식을 this로 묶을 수 있다.
    }
}