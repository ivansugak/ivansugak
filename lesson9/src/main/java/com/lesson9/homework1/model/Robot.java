package com.lesson9.homework1.model;

import com.lesson9.homework1.interfacies.IHand;
import com.lesson9.homework1.interfacies.IHead;
import com.lesson9.homework1.interfacies.ILeg;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Setter
@Getter
public class Robot {
    private IHead iHead;
    private IHand iHand;
    private ILeg iLeg;
    private List <Robot> mas;


    public void action(){
        System.out.println("Robot is going!");
    }

    public Robot(IHead iHead, IHand iHand, ILeg iLeg) {
        this.iHead = iHead;
        this.iHand = iHand;
        this.iLeg = iLeg;
    }
}
