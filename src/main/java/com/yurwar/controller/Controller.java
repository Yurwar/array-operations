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
}
