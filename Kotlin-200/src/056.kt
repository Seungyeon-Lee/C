// 056 생성자와 프로퍼티 한번에 쓰기

package ex_secondary_constructor

class Car(val name: String, val speed: Int = 0) // 매개변수 앞에 val이나 var 키워드를 붙이면 동일한 이름의 프로퍼티가 같이 선언된다.

fun main(args: Array<String>)
{
    val car = Car("My Car")
    println(car.name)
    println(car.speed)
}