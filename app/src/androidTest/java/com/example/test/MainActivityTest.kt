package com.example.test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.util.regex.Pattern.matches

@RunWith(JUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    var rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun addSimple(){
        onView(withId(R.id.firstEd)).perform(typeText("4"))
        onView(withId(R.id.firstEd)).perform(closeSoftKeyboard())
        onView(withId(R.id.secondEd)).perform(typeText("5"))
        onView(withId(R.id.secondEd)).perform(closeSoftKeyboard())
        onView(withId(R.id.okBtn)).perform(click())
        onView(withId(R.id.resultTv)).check(matches(withText("9")))
    }

    @Test
    fun divide(){
        onView(withId(R.id.firstEd)).perform(typeText("6"))
        onView(withId(R.id.firstEd)).perform(closeSoftKeyboard())
        onView(withId(R.id.secondEd)).perform(typeText("2"))
        onView(withId(R.id.secondEd)).perform(closeSoftKeyboard())
        onView(withId(R.id.btn_divide)).perform(click())
        onView(withId(R.id.resultTv)).check(matches(withText("3")))
    }

}