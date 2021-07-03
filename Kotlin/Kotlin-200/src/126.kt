// 126 위임된 프로퍼티(Delegated property)

package ex_delegated_property

import kotlin.reflect.KProperty

class Sample
{
    // Sample 클래스의 number 프로퍼티의 Getter는 OnlyPositive의 getValue로 대체되고, Setter는 OnlyPositive의 setValue로 대체된다.
    var number: Int by OnlyPositive() // by 객체를 적으면 해당 객체가 프로퍼티의 Getter/Setter를 대리하게 된다.
}

class OnlyPositive
{
    private var realValue: Int = 0

    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int
    {
        return realValue
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) // 대리할 프로퍼티의 타입 T
    {
        realValue = if(value > 0) value else 0
    }
}

fun main(args: Array<String>)
{
    val sample = Sample()

    sample.number = -50 // OnlyPositive의 setValue가 호출된다. (0이 저장된다)
    println(sample.number)

    sample.number = 100
    println(sample.number)
}