package AtmTran.PrimeBank;

import AtmTran.Bank.TimeWait;

import java.util.Scanner;

public class PinAttempts {
    int input=0;
    int setCounter = 2;
    int correctPin = 2021;

    int counter = 0;
    int  result = 0;

    public PinAttempts() {
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getSetCounter() {
        return setCounter;
    }

    public void setSetCounter(int setCounter) {
        this.setCounter = setCounter;
    }

    public int getCorrectPin() {
        return correctPin;
    }

    public void setCorrectPin(int correctPin) {
        this.correctPin = correctPin;
    }

    public PinAttempts(int setCounter) {
        this.setCounter = setCounter;
    }

    public boolean pinAttempts() {

        Scanner scanner = new Scanner(System.in);
        TimeWait timeWait = new TimeWait();
        System.out.println("\t \t Please Enter your Four digits Pin : ");


//        int[] pins = new int[3];

// asking pin loop is not working.
        input = scanner.nextInt();

        if (input != correctPin) {
            for (int i = 0; i < setCounter; i++) {
            System.out.println("you enter wrong pin!! Try again: ");
            input = scanner.nextInt();
            result += input;
            counter++;

        }        System.out.println("Sorry, you use max limit of pin input");
            System.out.println("holding time begain.....");

                timeWait.time();

            return true;

        }
        return false;
    }
}

// System.out.println("holding time Active!! for your security");


//            System.out.println(" your input pin is not correct. ");



