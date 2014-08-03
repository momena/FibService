package com.example.fibgen.businesslogic;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FibonacciNumberGeneratorImplNegativeTests.class,
		FibonacciNumberGeneratorImplPositiveTests.class })
public class FibonacciNumberGenTestSuite {

}
