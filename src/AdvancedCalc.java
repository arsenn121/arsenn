
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
