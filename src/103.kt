// 103 함수 리터럴(Function Literal)과 람다식(Lambda Expression)

package ex_lambda_expression

fun main(args: Array<String>)
{
    val instantFunc: (Int) -> Unit // 함수 타입은 참조 타입이므로 객체와 마찬가지로 스택 영역이 아닌 함수의 위치를 가리키는 형태로 저장된다.
    instantFunc = { number: Int -> // { 매개변수 -> 반환 값 }은 람다식 형태에 해당한다.
        println("Hello $number") // 함수 리터럴에는 return을 적지 않는다. 함수 리터럴의 반환 값은 함수 내용의 맨 마지막 표현식이 된다.
    }

    instantFunc(33)
    instantFunc.invoke(30) // 함수 타입의 변수는 invoke로도 호출이 가능하다. 변수가 Nullable일 때는 invoke를 통해서 호출하는 편이 Null 처리를 하기에 좋다.
}