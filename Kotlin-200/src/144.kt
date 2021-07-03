// 144 MutableSet 인터페이스 살펴보기

package ex_mutable_set_interface

fun main(args: Array<String>)
{
    val set: MutableSet<Int> = mutableSetOf(1, 5, 7)
    println(set)

    println(set.add(5)) // set에 이미 5가 존재하므로 추가되지 않는다. false가 출력된다.
    println(set)

    println(set.addAll(listOf(3, 7))) // set에 7은 이미 존재하므로 3만 set에 추가된다. 추가된 원소가 존재하므로 true가 출력된다.
    println(set)
}