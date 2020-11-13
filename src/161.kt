// 161 let 확장 함수: 코드 중복 줄이기

package ex_let_extension_function

fun main(args: Array<String>)
{
    val a = 10
    val b = 5

    (a * b - 2 * a).let { result: Int -> // let은 block 매개변수로 (T) -> R 타입의 함수를 받는다.
        if (result > 0)
            println(result) // run과 let은 표기법만 다를 뿐, 사실 똑같은 역할을 수행한다.
    }
}