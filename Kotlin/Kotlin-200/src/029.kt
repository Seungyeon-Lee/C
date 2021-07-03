// 029 레이블(Label)

fun main(args: Array<String>): Unit
{
    var x = 0
    var y = 0

    outer@ while (x <= 20)
    {
        y = 0
        while(y <= 20)
        {
            if(x + y == 15 && x - y == 5)
                break@outer // break@레이블 이름을 실행하면 레이블에 해당하는 반복문을 빠져나온다
            y += 1
        }
        x += 1
    }

    println("x: $x, y: $y")
}