// 148 컬렉션 중 원하는 원소 걸러내기

package ex_collection_filter

fun main(args: Array<String>)
{
    val to50 = 1 .. 50

    println(to50.filter { it % 4 == 0 }) // filter 계열의 확장 함수를 이용하면 컬렉션 중 원하는 원소만 걸러낼 수 있다.
    println(to50.filterNot { it % 4 == 0 }) // filter와 정 반대이다.
    println(to50.filterNotNull()) // null이 아닌 원소만 걸러내는 확장 함수이다.
    println(to50.filterIndexed { index, element -> element > 20 }) // predicate 함수에 index 매개변수를 추가한 버전이다.
    println(to50.filterIsInstance<Long>()) // 지정한 타입에 맞는 원소만 걸러내는 확장 함수이다.
}