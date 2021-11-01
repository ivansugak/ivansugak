package com.lesson9.homework1.model;

import com.lesson9.homework1.interfacies.IHand;
import com.lesson9.homework1.interfacies.IHead;
import com.lesson9.homework1.interfacies.ILeg;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Sony implements IHand, ILeg, IHead {

    int price;

    public Sony() {
    }

    public Sony(int price) {
        this.price = price;
    }

    @Override
    public IHand installHands() {
        return new Sony(400);
    }

    @Override
    public IHead installHead() {
        return new Sony(500);
    }

    @Override
    public ILeg installLegs() {
        return new Sony(600);
    }
}
