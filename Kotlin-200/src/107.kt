// 107 고차 함수(Higher-order Function)

package ex_higher_order_function

fun decorate(task: () -> Unit) // 작업을 시작하기 전과 끝낸 후에 수행할 동작이다.
{
    println("=== 작업 시작 ===")
    task() // 매개변수가 가리키는 함수를 호출하고 있다.
    println("=== 작업 끝 ===")
}

fun main(args: Array<String>)
{
    decorate ({ // decorate 함수에 함수 리터럴을 인수로 전달하고 있다.
        val a = 10
        val b = 5
        println("$a + $b = ${a + b}") // 어떤 함수를 호출하기 전/후에 수행해야 할 고정적인 작업이 있다면 고차 함수를 활용하다.
    })
    decorate ({
        println("some")
        println("tasks") // 마지막 매개변수 타입이 함수 타입이라면 함수 호출 시 소괄호를 생략할 수 있다.
    })
}