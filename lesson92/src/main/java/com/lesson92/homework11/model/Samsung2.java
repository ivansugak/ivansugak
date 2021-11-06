package com.lesson92.homework11.model;

import com.lesson92.homework11.interfacies.IHand2;
import com.lesson92.homework11.interfacies.IHead;
import com.lesson92.homework11.interfacies.ILeg;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Samsung2 extends Robot implements IHand2, ILeg, IHead {

    private int price;

    public Samsung2() {
    }

    public Samsung2(int price) {
        this.price = price;
    }

    @Override
    public IHand2 installHands() {
        return new Samsung2(100);
    }

    @Override
    public int getPriceHand() {
        return price;
    }

    @Override
    public IHead installHead() {
        return new Samsung2(200);
    }

    @Override
    public int getPriceHead() {
        return price;
    }

    @Override
    public ILeg installLegs() {
        return new Samsung2(300);
    }

    @Override
    public int getPriceLegs() {
        return price;
    }
}
