// 101 데이터 클래스(Data Class)

package ex_data_class

// copy와 똑같은 멤버 함수를 데이터 클래스에서 선언하면 충돌 오류가 발생한다.
// equals, hashCode, toString 멤버 함수는 선언해도 괜찮으며, 직접 선언한 멤버 함수로 오버라이딩된다.
// abstract, open, sealed, inner 키워드를 사용할 수 없다.
data class Employee(val name: String, val age: Int, val salary: Int) // 생성자 매개변수에 반드시 var이나 val을 같이 써야 한다. (프로퍼티에 대응하지 않는 생성자 매개변수를 가질 수 없다)

fun main(args: Array<String>)
{
    val first = Employee("John", 30, 3000)
    val second = Employee("Page", 24, 5300)
    val third = first.copy()

    println(first.toString()) // 데이터 클래스는 equals, hashCode, toString 멤버 함수가 자동으로 오버라이딩 된다
    println(third.toString())
    println(first == second) // false (equals 함수는 각 프로퍼티의 값이 하나라도 다르면 false를 반환한다)
    println(first == third) // true (equals 함수는 각 프로퍼티의 값이 모두 같으면 true를 반환한다)
}