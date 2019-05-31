package com.yurwar.controller;

import com.yurwar.model.Model;
import com.yurwar.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processTasks() {
        view.printMessage("First task");
        model.task1();

        view.printMessage("Second task");
        model.task2();

        view.printMessage("Third task");
        model.task3();
    }
}
