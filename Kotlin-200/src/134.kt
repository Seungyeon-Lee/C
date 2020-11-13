// 134 Progression과 관련된 함수

package ex_progression_practice

fun IntProgression.print()
{
    print("first: ${this.first}, ")
    print("last: ${this.last}, ")
    println("step: ${this.step}")

    for (i in this)
        print("$i ")
    println('\n')
}

fun main(args: Array<String>)
{
    val prog: IntProgression = 7 downTo 3
    prog.print()

    val prog2: IntProgression = (3 .. 7).reversed() // 원래의 Progression을 뒤집는 역할을 한다.
    println(prog == prog2)
    prog2.print()

    val prog3: IntProgression = (1 .. 10) step 3 // step 프로퍼티 값만 바꿔주는 역할을 한다. step 값은 항상 양수여야 한다. (0이나 음수를 전달하면 IllegalArgumentException 예외를 발생시킨다)
    prog3.print() // step 확장 함수에 양수를 전달해도 Progression 자체가 역순으로 진행되고 있으면 step 프로퍼티는 자연스럽게 음수가 된다.

    val prog4: IntProgression = 10 downTo 2 step 3 // 역순으로 진행하는 Progression을 반환하는 infix 확장 함수이다.
    prog4.print() // 2까지 도달할 수 없으므로 가장 가까운 값인 4가 last 프로퍼티가 된다.

    val prog5: IntProgression = 2 until 5
    prog5.print()
}