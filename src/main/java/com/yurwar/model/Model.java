package com.yurwar.model;

import com.yurwar.view.View;

public class Model {
    private final int[] arr;
    private final View view;

    public Model(View view) {
        this.view = view;
        arr = new int[]{0, 1, 2, 3, 4};
    }

    public void task1() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - i - 1; j >= 0; j--) {
                view.printElement(arr[i]);
            }
            view.printLine();
        }
    }

    public void task2() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j < arr.length - i; j++) {
                view.printElement(arr[j]);
            }
            view.printLine();
        }
    }

    public void task3() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                view.printElement(arr[i + j]);
            }
            view.printLine();
        }
    }
}
