package com.sdajava.crud.controller;

import org.junit.Test;

import static com.sdajava.crud.controller.Menu.receiveInputBySwitch;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuTest {

    @Test
    public void shouldReturnFalseOnZero(){
        boolean result0 = receiveInputBySwitch(0);
        assertThat("User wybrał O - koniec programu", result0, is(false));
    }

}