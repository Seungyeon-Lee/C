// 098 다이아몬드 문제(The Diamond Problem)

package ex_the_diamond_problem

interface Parent { fun follow(): Unit }

interface Mother : Parent
{
    override fun follow() = println("follow his mother")
}

interface Father : Parent
{
    override fun follow() = println("follow his father")
}

class Child : Mother, Father{
    override fun follow()
    {
        println("A child decided to ")
        super<Mother>.follow() // 슈퍼클래스 중 어느 부모를 따를 것인지 super 멤버 함수를 지정해서 호출할 수 있다.
    }
}

fun main(args: Array<String>)
{
    Child().follow()
}
