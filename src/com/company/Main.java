package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	Parallelogram <Integer> par = new Parallelogram<>();
        System.out.println("Вычислите площадь Параллелограмма");
        System.out.println("Дано: Сторона а = 6, Высота = 11");
        System.out.println("Формула: P = a * h" );
        System.out.println("Решение: P = 6 * 11" );
        System.out.println("Ответ: P = " + par.solution(6, 11));
    }
}
