// 102 객체 분해하기

package ex_destructuring_object

data class Employee(val name: String, val age: Int, val salery: Int)

fun main(args: Array<String>)
{
    val (name, _, salary) = Employee("John", 30, 3300) // 사용되지 않는 변수의 이름은 _를 사용하여 무시할 수 있다.
    println(name) // 어떤 객체에서 필요한 부분만 변수로 추출할 때 이 문법을 사용하면 좋다.
    println(salary)
}