package com.udacity.gradle.builditbigger;

import com.udacity.gradle.builditbigger.util.EndpointsAsyncTask;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by vaibhav on 24/7/16.
 */
@RunWith(JUnit4.class)
public class EndpointsAsyncTaskTest extends TestCase {
    String joke;
    EndpointsAsyncTask endpointsAsyncTask;


    @Before
    public void setUp() throws Exception {
        joke = null;
        endpointsAsyncTask = new EndpointsAsyncTask();

    }

    @Test
    public void AsyncTaskTest() throws Exception {

        joke = endpointsAsyncTask.execute().get();
        System.out.println(joke);
        Assert.assertNotNull(joke);
    }

}