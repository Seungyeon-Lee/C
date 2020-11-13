// 032 Unit 타입

fun main(args: Array<String>): Unit
{
    celsiusToFah(27)
    // Unit은 자바의 void에 대응되는 개념이다.
    // void는 반환 값이 없음을 의미하는 타입이지만, Unit은 class 키워드로 정의된 일반 타입이기 때문에 조금 다르다.
    // Unit 객체는 싱글톤 인스턴스이므로 매번 객체를 생성하지는 않는다.
}

// 반환 값이 필요 없을 때 함수의 반환 타입으로 Unit을 사용한다.
// Unit을 반환 타입으로 사용하는 경우 return 을 사용하지 않아도 된다.
// return을 사용해도 되지만, 이 때에는 return 뒤에 표현식을 적지 말고 단독으로 사용해야 한다.

// fun celsiusToFah(celsius: Int) = println(celsius * 1.8 + 32)와 동일하다.
fun celsiusToFah(celsius: Int): Unit
{
    println(celsius * 1.8 + 32)
}