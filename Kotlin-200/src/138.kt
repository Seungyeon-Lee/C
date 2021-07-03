// 138 Listlterator 인터페이스 살펴보기

package ex_list_iterator_interface

private fun moveToNext(iter: ListIterator<Int>)
{
    print("${iter.hasPrevious()}, ") // 이전 원소가 존재하는지 여부를 반환한다.
    print("${iter.hasNext()}, ")  // 다음 원소가 존재하는지 여부를 반환한다.
    print("${iter.previousIndex()}, ") // 이전 원소의 인덱스를 반환한다.
    print("${iter.nextIndex()}, ") // 다음 원소의 인덱스를 반환한다.
    println("${iter.next()}") // 커서를 한 칸 옮긴다.
}

fun main(args: Array<String>)
{
    val iter: ListIterator<Int> = listOf(10, 20, 30).listIterator()

    moveToNext(iter)
    moveToNext(iter)
    moveToNext(iter)
}