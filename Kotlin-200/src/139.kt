// 139 Map 인터페이스 살펴보기

package ex_map_interface

fun main(args: Array<String>)
{
    val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    println(map.size) // map에 들어있는 키와 값 쌍의 개수 2가 출력된다.
    println(map.keys) // map에 들어있는 키가 출력된다. [Apple, Banana]
    println(map.values) // map에 들어있는 값이 출력된다. [사과, 바나나]
    println(map.entries) // map에 들어있는 키와 값의 쌍이 출력된다. [Apple=사과, Banana=바나나]
    println(map.isEmpty())
    println(map.containsKey("Cocoa"))
    println(map.containsValue("바나나"))
    println(map["Apple"]) // Apple 키에 해당하는 값이 출력된다.
    println(map.getOrDefault("Cocoa", "코코아")) // Cocoa 키에 해당하는 값이 없으므로 코코아가 대신 출력된다.
}