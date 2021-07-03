// 145 MutableMap 인터페이스 살펴보기

package ex_mutable_map_interface

fun main(args: Array<String>)
{
    val map: MutableMap<String, String> = mutableMapOf()
    println(map)

    println(map.put("Hi", "こんにちは")) // 키와 값 한 쌍을 추가하고 null을 반환한다.
    println(map)

    println(map.put("Hi", "你好")) // 만약 key와 동일한 키가 이미 존재하면 해당 키의 기존 value를 새로운 value로 교체하고 이전 value를 반환한다.
    println(map)

    map["Hi"] = "안녕"
    println(map)

    map.putAll(mapOf("How is it going?" to "잘 지내?", "Bye!" to "잘 가!")) // 다른 Map에 존재하는 키와 값 쌍들을 map에 추가하고 있다.
    println(map)

    println(map.remove("Hi")) // Hi와 일치하는 키의 쌍을 삭제하고 있다. 삭제된 값을 반환한다.
    println(map)

    println(map.remove("Bye!", "잘")) // 키가 Bye!이고 값이 잘인 쌍을 삭제하고 있다. 존재하지 않으므로 false가 출력된다.
    println(map)

    println(map.remove("Bye!", "잘 가!")) // 키가 Bye!이고 값이 잘 가!인 쌍을 삭제하고 있다. 해당 쌍이 존재하므로 true가 출력된다.
    println(map)

    map.clear()
    println(map)
}