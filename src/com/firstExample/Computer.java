package com.firstExample;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String cpu;
    private String ram;
    private String hdd;
    private int resource;
    private boolean isWork = false;
    private boolean isLive = true;
    private String[] components ={ "процессор","оперативная память", "жесткий диск"};

    public Computer(){
        this.cpu = "intel core i7";
        this.ram = "AMD 4GB DDR4 SODIMM PC4-19200 [R744G2400S1S-UO]";
        this.hdd = "WD Purple 4TB [WD40PURZ]";
        this.resource = 2;

    }

    public Computer(String cpu){
        this.cpu = cpu;
        this.ram = "AMD 4GB DDR4 SODIMM PC4-19200 [R744G2400S1S-UO]";
        this.hdd = "WD Purple 4TB [WD40PURZ]";
        this.resource = 2;

    }

    public Computer(String cpu, String ram){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = "WD Purple 4TB [WD40PURZ]";
        this.resource = 2;

    }

    public Computer(String cpu, String ram, String hdd){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = 2;

    }

    public Computer(String cpu, String ram, String hdd, int resource){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;

        if (resource < 0){resource *= -1;}
        this.resource = resource;

    }

    public boolean isLive() {
        return isLive;
    }

    public void presentation(){
        System.out.println("Вы имеете возможность обладать компьютером состоящим из:");
        System.out.println("процессора :"+ cpu);
        System.out.println("оперативной памяти :" + ram);
        System.out.println(" жестким диском :" + hdd);
        System.out.printf(" и ограниченным ресурсом включения %d раз(а)", resource);
        System.out.println();
        System.out.println("********************************************************");
    }

    public void turningOn() throws InterruptedException {
        if (isWork | !isLive){return;}

        System.out.println("*************Начинается процесс включения*********************");
        if (resource == 0){
            printMessage("в связи с завершением ресурса сгорает");
            isLive = false;
            return;
        }


        String message =(generateСrash())? request():"включается без проблем";

        Thread.sleep(3000);
        printMessage(message);
        isWork = !isWork;
    }

    public void turningOf() throws InterruptedException {
        if (!isWork | !isLive){return;}

        System.out.println("*************Начинается процесс выключения***********************");
        String message =(generateСrash())? request():"выключается без проблем";

        Thread.sleep(3000);
        printMessage(message);
        resource--;
        isWork = !isWork;

    }

    private boolean generateСrash(){
        Random random = new Random();
        return random.nextBoolean();
    }

    private String request(){
        Random random = new Random();
        int number = random.nextInt(2);
        System.out.println("Во время процесса произошла ошибка");
        System.out.println("Введите число 0 или 1 (доверься своему сердцу)");

        Scanner scanner = new Scanner(System.in);
        int date ;
        try {
            date = scanner.nextInt();
            if ( number != date){
                isLive = !isLive;
                return "сгорает";
            }
        } catch (Exception e){}
        return "отрабатывает";
    }

    private void printMessage(String message) throws InterruptedException {
        for (String component : components){
            System.out.println(component + " " + message);
            Thread.sleep(2000);
        }
    }

}
