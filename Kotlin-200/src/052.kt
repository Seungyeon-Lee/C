// 052 멤버 함수(Member Function)

package ex_member_function

class Building // 프로퍼티 + 멤버 함수 = 멤버(Member)
{
    // 프로퍼티
    var name = "" // 건물명
    var date = "" // 건축일자
    var area = 0 // 면적 (m²)

    // 멤버 함수 : 객체는 동작(Behavior)을 갖는데, 멤버 함수가 바로 객체의 동작 역할을 한다.
    fun print()
    {
        // this는 생략이 가능하다.
        println("이름: " + this.name)
        println("건축일자: " + this.date)
        println("면적: ${this.area} m²")
    }
}

fun main(args: Array<String>)
{
    // 코틀린의 모든 타입은 클래스이다.
    // 기본 타입은 클래스의 형태를 하고 있어도, 사용자 정의 클래스와는 엄연히 다르다.
    
    val building = Building()
    building.name = "A 오피스텔"
    building.date = "2017-12-13"
    building.area = 120 * 8

    building.print()
}