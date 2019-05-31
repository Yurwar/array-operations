package com.yurwar;

import com.yurwar.controller.Controller;
import com.yurwar.model.Model;
import com.yurwar.view.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(view);
        Controller controller = new Controller(model, view);

        controller.processTasks();

    }
}
