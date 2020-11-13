// 163 apply 함수: 객체 생성 및 초기화 코드를 표현식 하나로 압축하기

package ex_apply_extension_function

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
            Person().apply { // 인스턴스 생성 뒤 곧바로 apply 확장 함수를 호출하여 this를 통해 리시버를 그대로 반환한다.
                this.name = "Alan"
                this.money = 70
            }
    )
}