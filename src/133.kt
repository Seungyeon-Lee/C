// 133 Iterable 인터페이스: 클래스가 반복자를 지원하도록 하기

package ex_iterable_interface

fun main(args: Array<String>)
{
    val prog: IntProgression = 3 .. 7
    println(prog.first)
    println(prog.last)
    println(prog.step) // Iterator<T>의 next를 호출할 때, 몇 칸씩 건너뛸 것인지를 나타내는 프로퍼티이다. (기본값은 1)

    for(i in prog)
        print("$i ")
}