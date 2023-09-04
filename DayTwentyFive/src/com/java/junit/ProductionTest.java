package com.java.junit;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import com.java.junit.testsuits.ClassATest;
import com.java.junit.testsuits.ClassBTest;

@Suite
@SelectClasses({ClassATest.class,ClassBTest.class})
@SelectPackages("com.java.junit.testsuits")
//@IncludeTags("production")
@IncludeTags({"production","development"})
public class ProductionTest {

}
