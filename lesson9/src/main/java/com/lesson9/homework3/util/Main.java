package com.lesson9.homework3.util;

import com.lesson9.homework3.interfacies.IStart;
import com.lesson9.homework3.model.Cosmodrome;
import com.lesson9.homework3.model.Shuttle;

public class Main {
    public static void main(String[] args) {
        IStart shuttle = new Shuttle();
//        shuttle.checkSystem(true);
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.launch(shuttle);
    }
}
