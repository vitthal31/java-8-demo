/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.java8datetimeapidemo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author vitthalde
 */
public class DateTest {

    public LocalDate getCurrentDateOnly() {
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    public LocalDate getDateOnParticulrDayOnParticulrYear(int Year, Month whichMonth, int day) {
        return LocalDate.of(Year, whichMonth, day);
    }

    public LocalTime getCurrentTimeOnly() {
        LocalTime localTime = LocalTime.now();
        return localTime;
    }
}
