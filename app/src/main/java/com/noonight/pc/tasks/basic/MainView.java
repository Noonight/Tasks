package com.noonight.pc.tasks.basic;


import com.noonight.pc.tasks.basic.LoadingView;

public interface MainView extends LoadingView {

    static void fun() {
        System.out.println("some");
    }

    default void fun2() {
        System.out.println("222");
    }

    void showToast(String message);

}
