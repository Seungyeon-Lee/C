// 069 클래스를 상속하는 객체

package ex_object_extends_class

open class Person(val name: String, val age: Int)
{
    open fun print()
    {
        println("이름: $name")
        println("나이: $age")
    }
}

fun main(args: Array<String>)
{
    // 클래스 없이 객체를 만들 때 쓰는 object 표현식으로 상속이 가능하다.
    // 객체를 만들면서 어떤 클래스를 상속하려면 object: 슈퍼클래스 이름(생성자 인수)를 사용한다.
    val custom: Person = object: Person("Alan", 23)
    {
        override fun print()
        {
            println("It's a object")
        }
    }
    custom.print()
}