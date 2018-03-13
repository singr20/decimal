import java.util.*;

public class decimal
{

    public decimal()
    {
        System.out.println("Enter decimal");
        Scanner sc = new Scanner(System.in);
        double decimal = sc.nextDouble();
        String decimalString = "" + decimal;
        String part1 = decimalString.substring(0,decimalString.indexOf("."));
        String part2 = decimalString.substring(decimalString.indexOf("."));
        double part1double = 1.0;
        double part2double = Double.parseDouble(part2);
        while(part2double%1 != 0){
            part1double = part1double * 10;
            part2double = part2double * 10;
        }
        //System.out.println((int)part2double + "/" + (int)part1double);
        int check = (int)part1double - 1;
        while(check > 1){
            if((part2double/check)%1 == 0 && (part1double/check)%1 == 0){
                part1double = part1double/check;
                part2double = part2double/check;
            }
            check--;
        }
        if(part1.equals("0")){
            System.out.println((int)part2double + "/" + (int)part1double);
        }
        else{
            System.out.println(part1 + " " + (int)part2double + "/" + (int)part1double);
        }
          
    }

}
