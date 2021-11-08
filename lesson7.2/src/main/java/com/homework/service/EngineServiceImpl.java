package com.homework.service;

import com.homework.model.Engine;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EngineServiceImpl implements EngineService {

    private Engine engine;

    public EngineServiceImpl(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Engine work");
    }

    @Override
    public void stop() {
        System.out.println("Engine is stop");
    }
}
