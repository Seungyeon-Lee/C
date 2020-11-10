// 089 동반자 객체(Companion Object)

package ex_companion_object

class Person private constructor()
{
    // 코틀린에는 static 키워드가 존재하지 않으므로, 동반자 객체를 사용한다.
    companion object // 클래스 안에 포함되는 이름 없는 객체. 어떤 클래스의 모든 인스턴스가 공유하는 객체를 만들고 싶을 때 사용한다.
    {
        fun create(): Person
        {
            countCreated += 1
            return Person()
        }

        var countCreated = 0
            private set
    }
}

fun main(args: Array<String>)
{
    val a = Person.create()
    val b = Person.create()
    println(Person.countCreated) // 2
}