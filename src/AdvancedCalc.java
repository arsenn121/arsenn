
class AdvancedCalc extends Calculator {

    public AdvancedCalc(){}

    
    public  double sin() {
        return Math.sin(num1);
    }


}
   public static void enterData() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double num1,num2;
        System.out.println("Выберите режим: 1 или 2");
        int userOption = sc.nextInt();
        AdvancedCalc cal2 = new AdvancedCalc();
        Calculator cal1 = new Calculator();
        switch (userOption) {
            case 1:
                System.out.println("\n---------------------------------------");
                System.out.print("Выберите операцию: \n1. \"+\" \n2. \"/\" \n3. \"-\" \n4. \"*\" \n");
                System.out.println("---------------------------------------");
                int userOption2 = sc.nextInt();
                while (true) {
                    System.out.println("введите первое число");
                    num1 = sc.nextDouble();
                    System.out.println("введите второе число");
                    num2 = sc.nextDouble();
                    cal1.setNum1(num1);
                    cal1.setNum2(num2);
                    if (userOption2!=2) {
                        break;
                    }
