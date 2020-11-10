// 088 객체 선언(Object Declaration)

package ex_object_declaration

object Person // object 키워드를 사용하여 싱글톤 패턴 코드를 작성하지 않고 싱글톤 객체를 만들 수 있다. 선언된 객체에는 open 키워드를 붙일 수 없다.
{
    var name: String = ""
    var age: Int = 0
    fun print()
    {
        println(name)
        println(age)
    }
}

fun main(args: Array<String>)
{
    // 식별자 Person으로 객체에 바로 접근 가능
    Person.name = "Singleton"
    Person.age = 45
    Person.print()
}