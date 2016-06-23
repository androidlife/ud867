package com.example.android.clickcounter;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by laaptu on 6/23/16.
 */
@RunWith(AndroidJUnit4.class)
public class ClickActivityTest {

    @Rule
    public ActivityTestRule<ClickActivity> activityTestRule = new ActivityTestRule<ClickActivity>(ClickActivity.class);


    @Test
    public void clickCounterTest(){

        ViewInteraction viewInteraction = Espresso.onView(ViewMatchers.withId(R.id.click_button));
        for(int i=0;i<10;++i){
            viewInteraction.perform(ViewActions.click());
        }
        Espresso.onView(ViewMatchers.withId(R.id.click_count_text_view)).check(ViewAssertions.matches(ViewMatchers.withText("10")));

    }

}
