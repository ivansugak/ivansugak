package com.lesson9.homework1.model;

import com.lesson9.homework1.interfacies.IHand;
import com.lesson9.homework1.interfacies.IHead;
import com.lesson9.homework1.interfacies.ILeg;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Toshiba implements IHand, ILeg, IHead {

    int price;

    public Toshiba() {
    }

    public Toshiba(int price) {
        this.price = price;
    }

    @Override
    public IHand installHands() {
        return new Toshiba(700);
    }

    @Override
    public IHead installHead() {
        return new Toshiba(800);
    }

    @Override
    public ILeg installLegs() {
        return new Toshiba(900);
    }

}
