// 085 접근 지정자 오버라이딩

package ex_access_modifier_overriding

open class AAA(protected open val number: Int)
{
    // priavte인 프로퍼티와 멤버 함수는 서브클래스에서 접근이 불가능하므로 오버라이딩이 불가능하다.
    // 또한, private인 프로퍼티와 멤버 함수에는 open 키워드 사용이 불가능하다.
    protected open fun hello()
    {
        println("hello")
    }
}

class BBB(number: Int): AAA(number)
{
    public override val number: Int
        get() = super.number

    public override fun hello() = super.hello()
}

fun main(args: Array<String>)
{
    val b = BBB(26)
    val a: AAA = b

    // println(a.number) protected
    // a.hello protected

    println(b.number)
    b.hello()
}