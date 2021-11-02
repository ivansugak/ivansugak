package com.lesson9.homework1.model;

import com.lesson9.homework1.interfacies.IHand;
import com.lesson9.homework1.interfacies.IHead;
import com.lesson9.homework1.interfacies.ILeg;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Samsung implements IHand, ILeg, IHead {

    int price;

    public Samsung() {
    }

    public Samsung(int price) {
        this.price = price;
    }

    @Override
    public IHand installHands() {
        return new Samsung(100);
    }

    @Override
    public int getPriceHand() {
        return getPrice();
    }


    @Override
    public IHead installHead() {
        return new Samsung(200);
    }

    @Override
    public ILeg installLegs() {
        return new Samsung(300);
    }
}
