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
        println("Turning on the computer.");
    }

    public void printInfo(){
        println("The spec of the computer");
        println("\tCPU: " + CPU);
        println("\tMemory: " + Memory);
        println("\tHDD: " + HDD);
        println("\tColor: " + Color);
        println("\tPower: " + Power);
    }
}

class Monitor {

    private String Size = "24 inch";
    private String Color = "Black";
    private String Power = "45W";

    public void turnOn(){
        println("Turning on the monitor.");
    }

    public void printInfo(){
        println("The spec of the monitor");
        println("\tSize: " + Size);
        println("\tColor: " + Color);
        println("\tPower: " + Power);
    }
}