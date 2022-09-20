package org.robot;

public class Program {
    public static void main(String[] args) {

        // Robot1 demo
        Robot1 robot1 = new Robot1(1, "name_1");
        robot1.level = 10500;
        System.out.printf("Имя робота: %s; Уроверь робота: %d\n", robot1.name, robot1.level);

        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();
        robot1.work();
        robot1.work();

        robot1.sayBye();
        robot1.stopOS();
        robot1.stopBIOS();

        // Robot2 demo
        Robot2 robot2 = new Robot2(2, "name_2");

        System.out.printf("Имя робота: %s; Уроверь робота: %d\n", robot2.getName(), robot2.getLevel());
        robot2.powerOn();
        robot2.work();
        robot2.powerOff();

        // Robot 3 demo
        Robot3 robot3 = new Robot3("name_3");
        System.out.println("---------------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();

    }
}
