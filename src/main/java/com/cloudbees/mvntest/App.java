package com.cloudbees.mvntest;

import com.cloudbees.mvntest.core.Logger;
import com.cloudbees.mvntest.util.Math;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger.log("Hello World!");
	Logger.log("1 x 1 = " + Math.multiply(1,1));
    }
}
