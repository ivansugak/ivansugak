package com.lesson92.homework11.model;

import com.lesson92.homework11.interfacies.IHand2;
import com.lesson92.homework11.interfacies.IHead;
import com.lesson92.homework11.interfacies.ILeg;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Toshiba extends Robot implements IHand2, ILeg, IHead {

    private int price;

    public Toshiba() {
    }

    public Toshiba(int price) {
        this.price = price;
    }

    @Override
    public IHand2 installHands() {
        return new Toshiba(700);
    }

    @Override
    public int getPriceHand() {
        return price;
    }

    @Override
    public IHead installHead() {
        return new Toshiba(4000);
    }

    @Override
    public int getPriceHead() {
        return price;
    }

    @Override
    public ILeg installLegs() {
        return new Toshiba(2000);
    }

    @Override
    public int getPriceLegs() {
        return price;
    }

}
