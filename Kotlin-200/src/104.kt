// 104 익명 함수(Anonymous Function)

package ex_anonymous_function
fun main(args: Array<String>)
{
    // 익명 함수 사용. 함수의 이름이 없다는 점만 빼면 일반 함수와 형태가 거의 동일하다.
    val instantFunc: (Int) -> Unit = fun(number: Int): Unit
    {
        println("Hello $number") // 람다식보다 복잡하지만 return으로 반환 값을 직접 지정해줄 수 있다.
    }
    instantFunc(33)
    instantFunc.invoke(33)
}