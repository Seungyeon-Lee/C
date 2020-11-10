// 061 호출 연산자(Invoke Operator) ()

package ex_package

class Product(val id: Int, val name: String)
{
    operator fun invoke(value: Int) // () 연산자를 오버로딩하는 멤버 함수
    {
        println(value)
        println("id: $id\nname: $name")
    }
}

fun main(args: Array<String>)
{
    val product = Product(762443, "코틀린 200제")
    product(108) // product.invoke(108)과 동일
}