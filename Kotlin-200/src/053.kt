// 053 프로퍼티와 멤버 함수의 매개변수 이름이 중복될 때

class AAA
{
    var num = 15

    fun memberFunc(num: Int)
    {
        println(num)
        println(this.num) // 보통 this 없이 적어도 상관없지만, 이름이 동일한 매개변수가 존재하기 때문에 프로퍼티에 접근하려면 this를 반드시 써야 한다.
    }
}

fun main(args: Array<String>)
{
    val a = AAA()
    a.memberFunc(53)
}