package lesson2.cucumber.runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void prepareData() {
        System.out.println("Перед тестом");
        //подготовить данные
    }

    @After
    public void clearData() {
        System.out.println("После теста");
        //очистить данные
    }
}

