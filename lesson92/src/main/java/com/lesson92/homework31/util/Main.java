package com.lesson92.homework31.util;

import com.lesson92.homework31.interfacies.IStart;
import com.lesson92.homework31.model.Cosmodrome;
import com.lesson92.homework31.model.Shuttle;

public class Main {
    public static void main(String[] args) {
        IStart shuttle = new Shuttle();
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.launch(shuttle);
    }
}
