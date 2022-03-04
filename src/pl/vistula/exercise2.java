package pl.vistula;

public class exercise2 {
    public static void main(String[] args) {

        float earthWeight;
        float marsWeight;
        double marsWeightInDouble;
        int marsWeightInInt;

        earthWeight = 94;
        marsWeight = (earthWeight * 0.38F);
        System.out.println(earthWeight + "Kg on Earth is" + marsWeight + "Kg on Mars");

        
        marsWeightInDouble = marsWeight;
        System.out.println("Kilograms on Mars after converting to double"+marsWeightInDouble);

        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n", marsWeightInDouble);

        marsWeightInInt = (int)marsWeightInDouble;
        System.out.println("Kilograms on Mars when casted to integer" + marsWeightInInt);

        marsWeightInInt = (int)marsWeightInDouble;
        System.out.println("Kilograms on Mars when casted to integer " + marsWeightInInt);

        char c = (char)marsWeightInInt;
        System.out.println("The ASCII Table equivalent of marsWeightInInt is: " + c);

        int exampleOfMathOnChar = c * c;
        System.out.println("An example of mathematical operation on the char type:" + exampleOfMathOnChar);


    }
}
