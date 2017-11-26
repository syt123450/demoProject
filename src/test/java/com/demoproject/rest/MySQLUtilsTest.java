package com.demoproject.rest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ss on 2017/11/25.
 */
public class MySQLUtilsTest {

    @Test
    public void test() {
        System.out.println(MySQLUtils.getData("hello"));
    }
}