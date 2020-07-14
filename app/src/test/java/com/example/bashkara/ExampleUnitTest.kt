package com.example.bashkara

import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {
    @Test
    fun unitTest() {

        /**
         * Prueba de codigo de redondeo de numeros
         * @author Joaquin Parrilla
         * (13-07-2020 | 21:57)
         */
        try{
            var res1: Double = (4.421 + 32.6) / 2.0
            println("RES1 antes de efecto $res1")
            res1 = Math.round(res1 * 100.0).toDouble()
            res1 = res1 / 100;

            println("RES1 despues de efecto $res1")
        }catch (e: Exception){
            println(e.toString())
        }
    }
}