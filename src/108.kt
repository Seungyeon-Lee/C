// 108 클로저(Closure)

package ex_closure

fun returnFunc(num: Int): () -> Unit = { println(num) }
fun main(args: Array<String>)
{
    val f: () -> Unit = returnFunc(30) // 지역 변수는 항상 자신이 소속될 블록이 끝나면 소멸하지만, 클로저를 사용하여 지역 변수가 소멸하지 않는 것처럼 보이도록 할 수 있다.
    f() // 함수 리터럴이 자신이 만들어질 때의 상황을 함께 저장하는 함수를 클로저라고 부른다.
}