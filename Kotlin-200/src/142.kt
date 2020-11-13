// 142 MutableList 인터페이스 살펴보기

package ex_mutable_list_interface

fun main(args: Array<String>)
{
    val list: MutableList<Char> = mutableListOf('c', 'a', 'z')
    println(list)

    list.add(1, '%') // add는 index위치에 element를 추가하는 멤버 함수이다.
    println(list)

    list.addAll(0, listOf('L', 'P')) // addAll은 index위치에 elements 컬렉션에 있는 모든 원소를 추가하는 멤버 함수이다. List에 변경이 일어났으면 true를 반환한다.
    println(list)

    println(list.set(2, '/')) // set은 []연산자를 오버로딩하는 멤버 함수이다. 반환값은 이전에 index 위치에 있던 원소이다. (list[2] = '/' 형태로 호출 시에는 반환값을 얻을 수 없다)
    println(list)

    println(list.removeAt(4)) // removeAt은 index번째 원소를 삭제하는 멤버 함수이다. 반환값은 삭제된 원소이다.
    println(list)
}