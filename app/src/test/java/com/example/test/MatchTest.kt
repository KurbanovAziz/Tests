package com.example.test

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MatchTest {

    private var match: Match? = null

    @Before
    fun install() {
        match = Match()
    }

    @Test
    fun simpleAddTest(){
        assertEquals("5",match?.add("3","2"))
    }
    @Test
    fun doubleAddTest(){
        assertEquals("4.0",match?.add("2","2.5"))
    }
    @Test
    fun symbolAddTest(){
        assertEquals("Нельзя писать символы",match?.add("$","2"))
    }

    @Test
    fun simpleDivide(){
        assertEquals("1",match?.divide("6","2"))
    }
    @Test
    fun divideOnZero(){
        assertEquals("Делить на ноль нельзя",match?.divide("6","0"))
    }

    @After
    fun detach() {
        match = null

    }


}