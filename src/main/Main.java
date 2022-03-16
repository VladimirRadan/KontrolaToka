package main;


public class Main {

    public static void main(String[] args) {


        String carMake = "Ford";
        int doors = 4;

       if (carMake.equals("Ford")){
           switch (doors){
               case 1: {
                   System.out.println("Vrata 1");
               }break;
               case 2:{
                   System.out.println("Vrata 2");
               }
               case 4:{
                   System.out.println("Vrata 4");
               }
           }
       }else {
           System.out.println("Automobil nije Ford");
       }







//        int x = 523134;
//        int y = 325423;
//
//        if (x%y==0){
//            System.out.println("Nema ostatka");
//        }else if (x%y>1000){
//            System.out.println("Ostatak veci od 1000");
//        }else {
//            System.out.println("Ostatak manji od 1000");
//        }





//        String s = "5";
//        String s2 = "6";
//        int a = Integer.parseInt(s);
//        int b = Integer.parseInt(s2);
//        System.out.println(a + b);

       // Scanner scanner = new Scanner(System.in);


//        System.out.println("Unesite prvi broj: ");
//        double operand1 = Double.parseDouble(scanner.nextLine());
//
//        System.out.println("Unesite drugi broj: ");
//        int operand2 = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Unesite operator: ");
//        String operator = scanner.next();


//        switch (operator){
//            case "*":{
//                System.out.println("Rezultat je: " + (operand1*operand2));
//            }break;
//            case "/":{
//                if (operand2 != 0){
//                    System.out.println("Rezultat je: " + (operand1/operand2));
//                }else {
//                    System.out.println("Deljenje sa nulom nije dozvoljeno!");
//                }
//            }break;
//            case "+":{
//                System.out.println("Rezultat je: " + (operand1+operand2));
//            }break;
//            case "-":{
//                System.out.println("Rezultat je: " + (operand1-operand2));
//            }break;
//            default:{
//                System.out.println("Greska");
//            }
//        }



//        if(operator.equals("*")) {
//            System.out.println("Rezultat je: " + (operand1*operand2));
//        }else if (operator.equals("/")){
//            if (operand2 != 0){
//                System.out.println("Rezultat je: " + (operand1/operand2));
//            }else {
//                System.out.println("Deljenje sa nulom nije dozvoljeno!");
//            }
//        }else if (operator.equals("+")){
//            System.out.println("Rezultat je: " + (operand1+operand2));
//        }else if (operator.equals("-")){
//            System.out.println("Rezultat je: " + (operand1-operand2));
//        }else {
//            System.out.println("Greska");
//        }





    }







}
