package com.tang.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class test1 {
       @Test
        public void testHello() {
        	HelloWorld hello = new HelloWorld();
        	String result = hello.sayHello("zs");
         	assertEquals("zshello",result);
        }
}
