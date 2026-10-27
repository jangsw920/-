import static java.lang.IO.println;

public class Homework5 {
    public void main(String[] args){
        PersonalComputer pc = new PersonalComputer();
        pc.turnOn();
    }
}

class PersonalComputer {
    public void turnOn(){
        Computer computer = new Computer();
        Monitor monitor = new Monitor();

        computer.turnOn();
        monitor.turnOn();
        computer.printInfo();
        monitor.printInfo();
    }
}

class Computer {

    private String CPU = "Core i7";
    private String Memory = "32GB";
    private String HDD = "2TB";
    private String Color = "White";
    private String Power = "500W";

    public void turnOn(){
        System.out.println("Turning on the computer.");
    }

    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println("\tCPU: " + CPU);
        System.out.println("\tMemory: " + Memory);
        System.out.println("\tHDD: " + HDD);
        System.out.println("\tColor: " + Color);
        System.out.println("\tPower: " + Power);
    }
}

class Monitor {

    private String Size = "24 inch";
    private String Color = "Black";
    private String Power = "45W";

    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }

    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println("\tSize: " + Size);
        System.out.println("\tColor: " + Color);
        System.out.println("\tPower: " + Power);
    }
}
