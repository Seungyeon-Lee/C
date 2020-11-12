// 115 특정 타입을 상속·구현하는 타입만 인수로 받기

package ex_generic_specific_type

interface ValueContainer
{
    fun getValue(): Int
}

class AAA : ValueContainer
{
    override fun getValue(): Int = 1102
}

class BBB : ValueContainer
{
    override fun getValue(): Int = 127
}

fun <T : ValueContainer> T.printValue() // 특정 타입을 구현하는 타입만 인수로 받으려면 상속처럼 타입 매개변수 : 타입 이름을 적어준다. (여러 개를 적어서 지정해줄 수 있다)
{
    println(this.getValue())
}

fun main(args: Array<String>)
{
    AAA().printValue() // T 타입은 ValueContainer를 구현하는 타입이어야 한다. 즉, AAA와 BBB는 확장 함수를 사용가능하다.
    BBB().printValue()
}