package com.ichwan.crudspring.util

import java.io.ByteArrayOutputStream
import java.util.zip.Deflater
import java.util.zip.Inflater

object ImageUtil {

    fun compressImage(data: ByteArray): ByteArray {
        val deflater = Deflater()
        deflater.setLevel(Deflater.BEST_COMPRESSION)
        deflater.setInput(data)
        deflater.finish()

        val outputStream = ByteArrayOutputStream(data.size)
        val temp = ByteArray(4*1024)
        while (!deflater.finished()){
            val size = deflater.deflate(temp)
            outputStream.write(temp, 0, size)
        }

        try {
            outputStream.close()
        } catch (e: Exception) {

        }
        return outputStream.toByteArray()
    }

    fun decompressImage(data: ByteArray): ByteArray {
        val inflater = Inflater()
        inflater.setInput(data)

        val outputStream = ByteArrayOutputStream(data.size)
        val temp = ByteArray(4*1024)
        try {
            while (!inflater.finished()){
                val count = inflater.inflate(temp)
                outputStream.write(temp, 0, count)
            }
            outputStream.close()
        } catch (e: Exception){
        }

        return outputStream.toByteArray()
    }
}