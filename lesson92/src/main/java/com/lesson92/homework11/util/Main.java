package com.lesson92.homework11.util;

import com.lesson92.homework11.model.Robot;
import com.lesson92.homework11.model.Samsung2;
import com.lesson92.homework11.model.Sony;
import com.lesson92.homework11.model.Toshiba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Robot> robotList = new ArrayList<>();

        Samsung2 samsung = new Samsung2();
        Sony sony = new Sony();
        Toshiba toshiba = new Toshiba();
        Robot robot1 = new Robot(sony.installHead(), samsung.installHands(), toshiba.installLegs());
        Robot robot2 = new Robot(toshiba.installHead(), sony.installHands(), samsung.installLegs());
        Robot robot3 = new Robot(samsung.installHead(), toshiba.installHands(), sony.installLegs());
        robot1.action();
        robot2.action();
        robot3.action();

        robotList.add(robot1);
        robotList.add(robot2);
        robotList.add(robot3);

        Comparator<Robot> compareByRobot = new Comparator<Robot>() {

            public int compare(Robot o1, Robot o2) {

                return o1.getPriceAll() - o2.getPriceAll();
            }
        };

        robotList.sort(compareByRobot);

        System.out.println("Cамый дорогой робот - " + robotList.get(2) + ", его стоимость равна " +
                robotList.get(2).getPriceAll());
    }
}
