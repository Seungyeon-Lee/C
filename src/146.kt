// Sequence 인터페이스 살펴보기

package ex_sequence_interface

fun main(args: Array<String>)
{
    val seq: Sequence<Int> = sequenceOf(1, 2, 3) // Sequence는 크기가 정해져 있지 않다. 데이터가 게으르게 계산되기 때문에 전체 크기를 한번에 파악할 수 없기 때문이다.
    // 따라서 size나 length 프로퍼티는 포함되지 않는다.

    for(i in seq)
        print("$i ")
}