// 110 제네릭(Generic)

package ex_generic

fun <T> toFunction(value: T): () -> T = { value } // 제네릭을 사용하면 인수를 전달하듯이 함수에 타입을 전달할 수 있다.

fun main(args: Array<String>)
{
    val func: () -> Int = toFunction<Int>(1107) // <T>는 타입 매개변수라고 부른다.
    println(func())
}