// 070 Any 클래스

package ex_any_class

// 어떤 클래스가 아무 클래스도 상속하지 않으면 자동으로 Any라는 클래스를 상속한다.
// 다른 클래스를 상속한다고 해도, 그 클래스 또한 Any 클래스를 자동으로 상속하므로 간접적으로 Any 클래스를 상속하게 된다.
// 즉 모든 코틀린 클래스는 Any 클래스를 상속한다는 것이 보장된다.

class Building(var name: String =  "", // 건물명
        var date: String = "", // 건축일자
        var area: Int = 0) // 면적 (m²) 생성자와 프로퍼티를 한번에 작성
{
    override fun toString() = // Any 클래스의 toString을 오버라이딩
            "이름: ${this.name}\n" +
            "건축일자: ${this.date}\n" +
            "면적: ${this.area}m²"
}

fun main(args: Array<String>)
{
    val building = Building("코틀린", area = 100)
    printObject(building)
}

fun printObject(any: Any)
{
    println(any.toString()) // println은 인수가 내부적으로 String이 아니면 알아서 toString()을 호출한다. 따라서 println(any)와 동일하다.
}