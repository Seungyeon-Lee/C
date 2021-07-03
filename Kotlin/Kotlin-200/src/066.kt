// 066 오버라이딩(Overriding)

package ex_overrding

open class AAA // 오버라이딩을 허용하려면 open 키워드를 맨 앞에 붙여주어야 한다.
{
    open fun func() = println("AAA")
    open fun hello() = Unit
}

open class BBB : AAA()
{
    override fun func() {
        super.func() // AAA 출
        println("BBB")
    }

    //final을 붙여 더 이상 hello를 오버라이딩할 수 없게 만든다.
    final override fun hello() = super.hello()
}

open class CCC : BBB()
{
    // 오버라이딩이 불가능하다.
    // override fun hello() { }
}

fun main(args: Array<String>)
{
    AAA().func() // AAA
    BBB().func() // AAA BBB
}