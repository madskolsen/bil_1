package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean horn;
        boolean elbil;
        String svdæk;
        Bremse dinBremse = new Bremse(0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opret din bil. Lad os starte med din biltype: ");
        String bilmærke = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("stelnummer: ");
        int stelnummer = scanner.nextInt();
        System.out.println("Antal døre: ");
        int antalDøre = scanner.nextInt();
        System.out.println("top hastighed: ");
        int hastighed = scanner.nextInt();
        System.out.println("Nu skal vi få konstrueret resten af bilen.");
        System.out.println("Lad os starte med dit Rat. Har det et horn?: ");
        scanner.nextLine();
        if (scanner.nextLine().equalsIgnoreCase("ja")){
            horn = true;
        } else {
            horn = false;
        }
        Rat ditRat = new Rat(horn);
        System.out.println("Nu skal vi have en motor. Hvor mange hestekræfter har motoren: ");
        int hestekræfter = scanner.nextInt();
        System.out.println("Hvor mange liter er motoren: ");
        int liter = scanner.nextInt();
        System.out.println("Er det en elbil: ");
        scanner.nextLine();
        if (scanner.nextLine().equalsIgnoreCase("ja")){
            elbil = true;
        } else {
            elbil = false;
        }
        Motor dinMotor = new Motor(hestekræfter,liter,elbil);
        System.out.println("Nu til hjulene. Hvor mange hjul har din bil: ");
        int hjul = scanner.nextInt();
        System.out.println("Er det sommer eller vinterdæk? (svar s eller v): ");
        scanner.nextLine();
        if (scanner.nextLine().equalsIgnoreCase("s")){
            svdæk = "Sommerdæk";
        }else {
            svdæk = "Vinterdæk";
        }
        System.out.println("Hvor mange tommer er dine dæk: ");
        int tommer = scanner.nextInt();
        Hjul ditHjul = new Hjul(hjul,svdæk,tommer);
        Bil dinBil = new Bil(bilmærke,model,stelnummer,antalDøre,hastighed,ditRat,dinMotor,dinBremse,ditHjul);

        System.out.println("Din bil er nu færdig. Vil du tænde den (Ja eller nej): ");
        scanner.nextLine();
        if (scanner.nextLine().equalsIgnoreCase("ja")){
            dinBil.tændMotor();
        } else {
            System.out.println("Moteren er fortsat slukket.");
            }
        while (dinBil.motorStatus){
            System.out.println("Afventer input.");
            System.out.println("1. Accelerer.");
            System.out.println("2. Brems.");
            System.out.println("3. Drej til højre.");
            System.out.println("4. Drej til venstre.");
            System.out.println("5. Fuldt stop.");
            System.out.println("6. Kør ligeud.");
            System.out.println("7. Afslut program.");
            System.out.println("Indtast nummer på ønsket handling: ");
            String svar = scanner.nextLine();
            if (svar.equalsIgnoreCase("1")){
                dinBil.forøgHastighed();
            } else if (svar.equalsIgnoreCase("2")){
                dinBil.bremsBil();
            } else if (svar.equalsIgnoreCase("3")){
                System.out.println("Hvor mange grader til højre vil du dreje?(0-75): ");
                int gradersdrej = scanner.nextInt();
                dinBil.turnRight(gradersdrej);
            } else if (svar.equalsIgnoreCase("4")){
                System.out.println("Hvor mange grader til venstre vil du dreje?(0-75): ");
                int gradersdrej = scanner.nextInt();
                dinBil.turnLeft(gradersdrej);
            } else if (svar.equalsIgnoreCase("5")){
                dinBil.fullStop();
            } else if (svar.equalsIgnoreCase("6")){
                dinBil.straightDrive();
            } else if (svar.equalsIgnoreCase("7")){
                dinBil.motorStatus = false;
            }
        }
        }

    }
