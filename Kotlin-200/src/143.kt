// 143 MutableListIterator 인터페이스 살펴보기

package ex_mutable_list_iterator_interface

fun main(args: Array<String>)
{
    val list = mutableListOf(1, 2, 3)
    val iter: MutableListIterator<Int> = list.listIterator()

    println(list)

    iter.next()
    iter.next()
    iter.add(7) // 커서가 가리키는 위치에 element를 추가한다.

    println(list)

    iter.next()
    iter.set(10) // 커서가 가리키는 위치의 원소를 element로 교체한다.
    println(list)
}