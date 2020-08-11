package com.company;

public class Parallelogram <P extends Number> implements Data{
    @Override
    public int solution(Number a, Number h) {
        return a.intValue()*h.intValue();
    }
}
