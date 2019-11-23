package com.jfinal;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.controller.UserController;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;

public class Start extends JFinalConfig {

    /**
     * 注意：用于启动的 main 方法可以在任意 java 类中创建
     *
     * 开发项目时，建议新建一个 App.java 或者 Start.java 这样的专用 启动入口类放置用于启动的 main 方法
     */

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 80, "/", 5);
    }

    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    public void configRoute(Routes me) {
        me.add("/hello", UserController.class);
    }

    public void configEngine(Engine me) {

    }

    public void configPlugin(Plugins me) {

    }

    public void configInterceptor(Interceptors me) {

    }

    public void configHandler(Handlers me) {

    }
}