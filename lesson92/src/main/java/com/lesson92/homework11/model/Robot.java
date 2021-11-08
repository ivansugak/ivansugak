package com.lesson92.homework11.model;

import com.lesson92.homework11.interfacies.IHand2;
import com.lesson92.homework11.interfacies.IHead;
import com.lesson92.homework11.interfacies.ILeg;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Robot {
    private IHead iHead;
    private IHand2 iHand;
    private ILeg iLeg;

    private int price;

    public Robot() {
    }

    public Robot(IHead iHead, IHand2 iHand, ILeg iLeg) {
        this.iHead = iHead;
        this.iHand = iHand;
        this.iLeg = iLeg;
    }

    public void action() {
        System.out.println("Robot is going!");
    }

    public int getPriceAll() {
        return iHead.getPriceHead() + iLeg.getPriceLegs() + iHand.getPriceHand();
    }
}

