// 096 추상 클래스(Abstract Class)

package ex_abstract_class

// 단순히 학생, 교수, 직원 클래스를 하나의 타입으로 묶어주는 클래스
abstract class Person // 추상 클래스 선언을 하기 위해서 abstract 키워드를 앞에 붙인다. (open 키워드를 자체적으로 포함하고 있다)
{
    // 추상 클래스는 일부 멤버의 내용이 비어있는 불완전한 클래스이므로 객체를 생성할 수 없다.
    abstract fun getSalary(): Int // abstract 키워드를 붙여서 멤버 함수를 추상 멤버 함수로 만들 수 있다.
}

// 학생 클래스. tuition는 한 학기 등록금
class Student(private val tuition: Int) : Person() // 추상 클래스를 상속하는 일반 클래스는 반드시 모든 추상 멤버 함수를 오버라이딩해야 한다.
{
    // 학생은 등록금을 납부하므로 salary를 음수 처리
    override fun getSalary() = -tuition // 추상 클래스를 상속하는 서브클래스에도 abstract를 붙이면 반드시 오버라이딩하지 않아도 된다. (하지만 이 클래스를 다시 일반 클래스로 상속 시엔 반드시 오버라이딩 해야한다)
}

// 교수 클래스. classCount는 진행하는 수업의 수
class Professor(private val classCount: Int) : Person()
{
    override fun getSalary() = classCount * 200
}

// 학교 직원 클래스. initial은 초봉(반기), years는 경력(년)
class Employee(private val initial: Int, private val years: Int) : Person()
{
    override fun getSalary() = initial * (1.0 + years / 10.0).toInt()
}

// 구성원으로부터 학교의 재정을 구한다.
fun getFinance(vararg persons: Person): Int
{
    var i = 0
    var finance = 0

    while (i < persons.size)
    {
        finance -= persons[i].getSalary()
        i += 1
    }
    return finance
}

fun main(args: Array<String>)
{
    val finance = getFinance(Student(330), Student(330), Professor(1), Professor(2), Employee(1300, 2)) // 상속 관계에 의해 Person 타입으로 묶여있으므로 여러 타입의 객체를 매개변수로 받을 수 있다.
    print("학교 재정: $finance 만원")
}