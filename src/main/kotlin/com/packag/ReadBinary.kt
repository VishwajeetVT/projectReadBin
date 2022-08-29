package com.packag

import java.io.File
import java.io.IOException
import java.io.RandomAccessFile
import java.net.URI
import java.net.URISyntaxException

object ReadBinary {
    @Throws(URISyntaxException::class, IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello")
        val url = "firware/bank1.bin"
        val hello = Hello()
        val url1 = hello.readBinary(url)
        println(url1)
        // 		RandomAccessFile file = new RandomAccessFile(url1.toString(), "r")
        val bytesRead = readFromFile(url1.toURI(), 0, 16)

        println(bytesRead)
    }

    @Throws(IOException::class)
    private fun readFromFile(filePath: URI, position: Int, size: Int): String? {
        val file = RandomAccessFile(File(filePath), "r")
        file.seek(position.toLong())
        val bytes = ByteArray(size)
        println(file)
        val readBytes = file.readLine()
        val readBytes1 = file.readLine()
        file.close()
        return "$readBytes $readBytes1"
    }
}
