package com.icanstudioz.taxicustomer;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation home_fragment, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
/**
 * VICTOR SILVA - 18265
 *
 * CA4 - DORSET COLLEGE
 *
 * ANDROID APPLICATION
 *
 */

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under home_fragment.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("icanstudioz.com.taxiapp", appContext.getPackageName());
    }
}
