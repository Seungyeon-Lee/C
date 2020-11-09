// 048 힙 영역의 존재 이유

class Product
{
    var name = ""
    var price = 0
}

fun main(args: Array<String>)
{
    val product: Product
    product = createProduct() // apple 참조 변수는 함수 종료 이후 스택에서 지워지지만, 해당 참조 변수가 가리키고 있던 객체 힙에서 지워지지 않는다.
    printProductInfo(product) // 힙 영역이 존재함으로 인해서 하나의 객체를 여러 참조 변수에서 공유하는 형태로 사용할 수 있게 된다.
    processProduct(product)  // 같은 객체를 가리키고 있으므로 해당 객체의 값이 변경되면 다른 참조 변수가 가리키던 값도 변경된다.
    printProductInfo(product) // 즉, 힙을 사용함으로써 메모리 공간을 훨씬 절약할 수 있게 된다.
}

fun createProduct(): Product
{
    val apple = Product()
    apple.name = "Apple"
    apple.price = 1000

    return apple
}

fun processProduct(product: Product)
{
    product.price += 500
}

fun printProductInfo(product: Product)
{
    println("이름: ${product.name}")
    println("가격: ${product.price}")
}