package com.homework.service;

import com.homework.model.Gastank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GastankServiceImpl implements GastankService {

    Gastank gastank;

    public GastankServiceImpl(Gastank gastank) {
        this.gastank = gastank;
    }

    @Override
    public boolean checkGastank() {
        return gastank.getFuelCapacity() > 0;
    }
}
