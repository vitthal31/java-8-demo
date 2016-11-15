/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.java8datetimeapidemo;

/**
 *
 * @author vitthalde
 */
public class AppTest {
    public static void main(String args[]){
       DateTest dateTest= new DateTest();
       System.out.println("local date only "+dateTest.getCurrentDateOnly());
    }
}
