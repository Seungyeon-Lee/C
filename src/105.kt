// 105 it 식별자

package ex_it_identifier

fun main(args: Array<String>)
{
    val instantFunc: (Int) -> Unit = { // 람다식의 매개변수가 하나일 때는 매개변수 선언을 생략할 수 있다.
        println("Hello $it") // 매개변수를 생략한 경우 it 식별자가 만들어지게 되고, 이 식별자는 하나의 매개변수를 대체하게 된다.
    }

    instantFunc(33)
}