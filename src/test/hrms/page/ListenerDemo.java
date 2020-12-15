package com.hrms.page;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemo {
@Test
public void test1() {
System.out.println("Test1");
AssertJUnit.assertTrue(true);
}
@Test
public void test2() {
System.out.println("Test2");
AssertJUnit.assertTrue(false);
}
}
