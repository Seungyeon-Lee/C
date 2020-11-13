// 185 파일 입출력

import java.io.* // 코틀린의 파일 입출력은 근본적으로 자바 표준 라이브러리에 의존하기 때문에 JVM에 의존성이 생긴다.

fun main(args: Array<String>)
{
    val file = File("./hello.txt") // 파일의 정보를 토대로 인스턴스를 만든다.

    if(!file.exists()) // 처음 실행 시 파일이 존재하지 않아서 false 반환
        file.createNewFile()

    val outputStream: OutputStream = file.outputStream()
    outputStream.write(35)

    val osw: OutputStreamWriter = outputStream.writer()
    osw.write("파일 입출력") // 파일 입출력이 텍스트 형태로 출력된다.
    osw.close()

    val inputStream: InputStream = file.inputStream()
    println(inputStream.read()) // 바이너리 형태로 데이터를 출력하는 멤버만 갖고있다.

    val isr: InputStreamReader = inputStream.reader()
    println(isr.readText()) // 파일에 남아있는 데이터를 모두 텍스트 형태로 읽어들인 뒤 반환한다.
    isr.close() // 출력과 마찬가지로 작업이 끝나면 close를 통해 파일을 닫아준다.
}