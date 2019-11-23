package com.jfinal.controller;

import com.jfinal.core.Controller;

public class UserController extends Controller {

    public void index() {
        renderText("Hello JFinal!");
    }

}