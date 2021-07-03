// 162 with 함수: 코드 중복 줄이기

package ex_with_extension_function

fun main(args: Array<String>)
{
    val a = 3
    val b = 7
    with(a * b - b * b) { // with 함수의 인수는 함수 리터럴의 this로 전달된다.
        println(this) // run, let, with은 표기법만 다들 뿐 완전히 똑같은 역할을 한다.
        println(-this)
    }
}