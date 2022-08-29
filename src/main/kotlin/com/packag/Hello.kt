package com.packag

import java.net.URL

class Hello {
    fun readBinary(name: String?): URL {
        return javaClass.getResource(name)
    }
}
