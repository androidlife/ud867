package com.example.android.clickcounter;

import android.test.AndroidTestCase;

/**
 * Created by laaptu on 6/23/16.
 */
public class ClickCounterTest extends AndroidTestCase {

    public void clickCounterVerify(){
        ClickCounter clickCounter = new ClickCounter();
        for(int i=0;i<10;++i)
            clickCounter.increment();
        assertEquals(10,clickCounter.getCount());
    }
}
