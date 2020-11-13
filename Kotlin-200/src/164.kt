// 164 also 함수: 객체 생성 및 초기화 코드를 표현식 하나로 압축하기

package ex_also_extension_function

class Person
{
    var name: String = ""
    var age: Int = 0
    var money: Int = 0

    override fun toString() = "$name $age $money"
}

fun main(args: Array<String>)
{
    println(
            Person().also { person: Person -> // apply와 동일하다.
                person.name = "Alan"
                person.money = 70
            }
    )
}