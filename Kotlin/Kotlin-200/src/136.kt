// 136 Collection 인터페이스 살펴보기

package ex_collection_interface

fun main(args: Array<String>)
{
    val list: Collection<Int> = listOf(18, 1, 1, 4)

    println(list.size)
    println(list.isEmpty())
    println(18 in list)

    for(i: Int in list) // iterator는 컬렉션을 for 문의 in 연산자에 사용할 수 있도록 해준다.
        print("$i ")
}