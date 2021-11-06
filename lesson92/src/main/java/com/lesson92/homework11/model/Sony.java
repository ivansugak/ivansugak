package com.lesson92.homework11.model;

import com.lesson92.homework11.interfacies.IHand2;
import com.lesson92.homework11.interfacies.IHead;
import com.lesson92.homework11.interfacies.ILeg;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Sony extends Robot implements IHand2, ILeg, IHead {

    private int price;

    public int getPrice() {
        return price;
    }

    public Sony() {
    }

    public Sony(int price) {
        this.price = price;
    }

    @Override
    public IHand2 installHands() {
        return new Sony(400);
    }

    @Override
    public int getPriceHand() {
        return price;
    }

    @Override
    public IHead installHead() {
        return new Sony(500);
    }

    @Override
    public int getPriceHead() {
        return price;
    }

    @Override
    public ILeg installLegs() {
        return new Sony(600);
    }

    @Override
    public int getPriceLegs() {
        return price;
    }
}
