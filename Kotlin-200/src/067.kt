// 067 프로퍼티를 오버라이딩하기

package ex_overriding_property

open class AAA(open val num: Int = 0)
{
    open var number = 10
        get()
        {
            println("AAA number Getter 호출됨")
            return field
        }
        set(value)
        {
            println("AAA number Setter 호출됨")
            field = value
        }
}

class BBB : AAA()
{
    // 슈퍼클래스에서 val로 선언한 프로퍼티를 var로 오버라이딩 할 수 있다.
    override var num: Int = 0
        get() = super.num
        set // 디폴트 Setter

    override var number: Int
        get()
        {
            println("BBB number Getter 호출됨")
            return super.number // AAA의 number Getter가 호출된다.
        }
        set(value)
        {
            println("BBB number Setter 호출됨")
            super.number = value // AAA의 number Setter가 호출된다.
        }
}

fun main(args: Array<String>)
{
    val test = BBB()
    test.number = 5
    test.number
}
