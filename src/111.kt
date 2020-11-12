// 111 여러 타입을 인수로 받기

package ex_generic_several_types

fun <T, R> T.map(mapper: (T)->R): R // 타입 매개변수 T와 R을 선언하여, 두 개의 타입을 인수로 받을 수 있게 했다.
{
    return mapper(this) // T 타입을 R 타입으로 변환하는 함수 mapper
}

fun main(args: Array<String>)
{
    val square: Int =
            11.map { // 확장함수의 리시버에도 타입 매개변수를 적용할 수 있다.
                it * it // it * it이 Int 타입이므로 T와 R에 각각 Int 타입이 들어간다.
            }
    println(square) // 121
}