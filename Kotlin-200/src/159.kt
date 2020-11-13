// 159 toList 확장 함수: List 타입으로 변환하기

package ex_to_list

fun main(args: Array<String>)
{
    // NOTE: Pair의 타입 인수가 모두 같아야 한다.
    val list: List<Int> = Pair(10, 20).toList() // toList는 어떤 타입을 List 타입으로 전환하는 확장 함수이다.

    // NOTE: Triple의 타입 인수가 모두 같아야 한다.
    val list2: List<Double> = Triple(3.1, 6.25, 6.15).toList()
}