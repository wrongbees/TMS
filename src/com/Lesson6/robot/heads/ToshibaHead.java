package com.Lesson6.robot.heads;

public class ToshibaHead implements IHead {
    private int prise;

    public ToshibaHead(int prise) {
        this.prise = prise;
    }

    public ToshibaHead(){}

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return prise;
    }
}
