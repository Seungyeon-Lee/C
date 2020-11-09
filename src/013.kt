// 013 타입 별명(Type Alias)

typealias Number = Int // C++에서의 typedef와 동일하다. 타입 이름이 너무 길 경우 사용하면 좋다.

fun main(args: Array<String>): Unit
{
    val a: Number = 10
    println(a)
}