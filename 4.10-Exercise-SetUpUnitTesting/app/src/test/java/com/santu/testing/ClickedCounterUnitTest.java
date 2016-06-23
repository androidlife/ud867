package com.santu.testing;

import com.example.android.clickcounter.ClickCounter;

import org.junit.Test;

/**
 * Created by laaptu on 6/23/16.
 */
public class ClickedCounterUnitTest {

    @Test
    public void clickCounterVerify(){
        ClickCounter clickCounter = new ClickCounter();
        for(int i=0;i<10;++i)
            clickCounter.increment();
        assert 10 == clickCounter.getCount();
    }
}
