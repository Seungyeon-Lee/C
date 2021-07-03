// 005 산술 연산자(Arithmetic Operator) + - * / %

fun main(args: Array<String>): Unit
{
    // 산술 연산자 : 가감승제를 수행하는 연산자
    // 코틀린은 수학과 마찬가지로 사칙연산의 법칙을 따른다 (연산자 우선순위 동일)
    // 양쪽 피 연산자가 Int 타입이면 Int 타입의 결과를 반환한다
    // %의 경우 나눗셈의 일종으로 취급되어 +, - 연산자보다 우선순위가 높다
    // 양쪽 피 연산자 타입이 다른 경우, 소수점이 손실되지 않는 방향으로 타입을 따라간다
    // val num: Double = 15 - 4 * 3 으로 선언할 경우 오류가 나타난다. Double값이 아닌 Int 타입의 값을 저장하려 했기 때문이다.
    // 코틀린은 자바보다 타입 체크에 엄격하다. 이 경우에 .toDouble() 함수를 붙여서 변환한다.
    // Int와 Double 타이븐 서로 상속관계가 아니기 때문에 캐스팅으로 형변환이 불가능하다. 따라서 메소드를 사용하여 형변환을 하게 된다.

    val num: Int = 15 - 4 * 3
    val num2: Int = 65 % 7
    val num3: Double = 7.5 / 5 + 22.25
    val num4: Double = num / num2 + 0.7

    println(num)
    println(num2)
    println(num3)
    println(num4)
}