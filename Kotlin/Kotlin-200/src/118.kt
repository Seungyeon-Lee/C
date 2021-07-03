// 118 반복자(Iterator)

package ex_iterator

fun main(args: Array<String>)
{
    val range: IntRange = 1 .. 3
    val iter: Iterator<Int> = range.iterator() // Iterator 내부의 변수를 커서(Cursor)라고 부른다.

    println(iter.hasNext()) // 다음 원소가 있으면 true 없으면 false
    println(iter.next()) // 커서를 다음 원소 1로 이동하고, 1을 반환한다. 1이 출력된다.

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext())
    println(iter.next())

    println(iter.hasNext()) // hasNext가 false를 반환했는데도 next를 호출하면 NoSuchElementException 예외가 발생한다.
}