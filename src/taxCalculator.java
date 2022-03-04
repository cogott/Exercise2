import java.math.BigDecimal;

public class taxCalculator {
    public static void main(String[] args) {
        double netPrice = 9.99;
        System.out.println("Price without VAT is:" + netPrice);

        double grossPrice = netPrice * 1.23;
        System.out.println("Price with VAT is:" + grossPrice);

        double grossCost = grossPrice * 10000;
        System.out.println("Cost with VAT is:" + grossCost);

        double netCost = grossCost/1.23;
        System.out.println("Cost without VAT is" + netCost);

        //USING THE BIG DECIMALS CLASS
        System.out.println("CALCULATION USING BIG DECIMAL");


        BigDecimal bdNetPrice= new BigDecimal("9.99");
        System.out.println("Price without VAT is " + bdNetPrice);

        BigDecimal bdGrossPrice = bdNetPrice.multiply(new BigDecimal("1.23"));
        System.out.println("Price with VAT is:" + bdGrossPrice);

        bdGrossPrice = bdGrossPrice.setScale(2,BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Price with VAT rounded is: "+ bdGrossPrice);

        BigDecimal bdGrossCost = bdGrossPrice.multiply(new BigDecimal(10000));
        System.out.println("Cost with VAT is " + bdGrossCost);

        BigDecimal bdNetCost = bdGrossCost.divide( new BigDecimal("1.23"),BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Cost without VAT is " + bdNetCost);




    }
}
