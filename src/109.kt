// 109 리시버가 붙은 함수 리터럴

package ex_function_literal_with_receiver

fun main(args: Array<String>)
{
    // Int 리시버를 [left, right] 범위 이내로 가공하여 반환하는 확장 함수
    val makeSure: Int.(left: Int, right: Int) -> Int // 리시버 타입이 Int, 매개변수 타입이 (Int, Int), 반환 타입이 Int

    makeSure = { left: Int, right: Int -> // 람다식으로 함수 리터럴 작성
        if (this < left) left
        else if(this > right) right
        else this
    }

    println(15.makeSure(20, 40)) // 리시버.변수(인수)의 형태로 호출
    println(18.makeSure(0, 50))
    println(25.makeSure(0, 19))
}