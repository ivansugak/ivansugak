package com.lesson9.homework1.util;

import com.lesson9.homework1.model.Robot;
import com.lesson9.homework1.model.Samsung;
import com.lesson9.homework1.model.Sony;
import com.lesson9.homework1.model.Toshiba;


public class Main {
    public static void main(String[] args) {

        Samsung samsung = new Samsung();
        Sony sony = new Sony();
        Toshiba toshiba = new Toshiba();
        Robot robot1 = new Robot(sony.installHead(), samsung.installHands(), toshiba.installLegs());
        Robot robot2 = new Robot(toshiba.installHead(), sony.installHands(), samsung.installLegs());
        Robot robot3 = new Robot(samsung.installHead(), toshiba.installHands(), sony.installLegs());
        robot1.action();
        robot2.action();
        robot3.action();



//        List <Robot> robots = get


    }
}
