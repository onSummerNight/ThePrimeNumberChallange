public class ChallangeSum {
    public static void main(String[] args) {
        int sumResult = 0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Number " + i + " Can Be Devided By 3 And 5");
                sumResult = sumResult + i;
                counter++;
                if (counter == 5){
                    System.out.println("Found 5 Number , Exit");
                    System.out.println("The Sum Result Is " + sumResult);
                    break;
                }
            }
        }
    }
}
