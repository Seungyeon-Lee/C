// 135 코틀린의 컬렉션(Collection)

package ex_kotlin_collection

fun main(args: Array<String>)
{
    val list: Collection<Int> = listOf(10, 20, 10) // 주어진 인수로 List<T> 타입의 객체를 생성하는 함수이다.
    val set: Collection<Int> = setOf(1, 2, 3, 2, 3) // Set은 원소의 중복을 허용하지 않는다.
    val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    println(list)
    println(set)
    println(map)
}