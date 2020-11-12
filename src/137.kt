// 137 List 인터페이스 살펴보기

package ex_list_interface

fun main(args: Array<String>)
{
    val list: List<Double> = listOf(20.18, 1.14, 9.15, 1.14)

    println(list[0])
    println(list.indexOf(1.14)) // 1.14와 일치하는 첫 원소의 인덱스가 출력된다.
    println(list.indexOf(9.31)) // 9.31에 해당하는 원소는 존재하지 않으므로 -1이 출력된다.
    println(list.lastIndexOf(1.14)) // 1.14와 일치하는 마지막 원소의 인덱스가 출력된다.
    println(list.subList(0, 3)) // 0 ~ 2번 인덱스에 해당하는 원소를 뽑아 새 List로 만들어서 출력한다.
}