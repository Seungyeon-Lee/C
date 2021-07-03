// 100 내부 클래스(Inner Class)

package ex_inner_class

class Outer(private val value: Int)
{
    fun print()
    {
        println(this.value)
    }

    // 내부 클래스 선언 시에는 inner 키워드를 앞에 붙인다.
    inner class Inner(private val innerValue: Int)
    {
        fun print() // this@Outer는 자신이 속해있는 바깥 클래스의 인스턴스를 가리키는 참조 변수이다.
        {
            this@Outer.print() // 내부 클래스는 this@Outer 키워드를 이용하여 자신이 속한 바깥 클래스의 인스턴스에 접근할 수 있다.
            println(this.innerValue + this@Outer.value)
        }
    }
}

fun main(args: Array<String>)
{
    val instance: Outer = Outer(610)
    val innerInstance: Outer.Inner = instance.Inner(40) // 내부 클래스의 인스턴스를 생성하려면 참조 변수.생성자()를 사용해야 한다. (클래스 이름.생성자() X)
    innerInstance.print()
}