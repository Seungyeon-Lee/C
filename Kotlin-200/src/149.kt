// 149 컬렉션 정렬하기

package ex_collection_sorted

fun main(args: Array<String>)
{
    val list = listOf(43, 76, 28, 19, 22, 68)

    println(list.sorted()) // sorted 계열의 확장 함수를 이용하면 컬렉션 내의 원소를 정렬할 수 있다.
    println(list.sortedDescending()) // 내림차순으로 정렬된 List<T>를 반환한다.
}