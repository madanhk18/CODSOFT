import java.util.Scanner;

public class task1 {
    static int count=0;

    public static int generation(){
        int randomgeneratot=(int) (Math.random()*101);
        return randomgeneratot;
    }
    public static void main(String[] args) {
        task1 t=new task1();
        int geeratednumb=t.generation();

        String decicion;
        System.out.println("The random number is generated ");
        Scanner sc=new Scanner(System.in);


        System.out.println(geeratednumb);
        boolean theirdecision=true;

        while (theirdecision){
            System.out.println("Enter your guess");
            int guess=sc.nextInt();
            count++;
            if (guess>geeratednumb) {

                System.out.println("Number you guessed is more than that is generated");


            }else if (guess<geeratednumb) {
                System.out.println("Number you guessed is less than that is generated");


            }else if(guess==geeratednumb){

                System.out.println("Congrats you got it correct!!" +"and you're score is "+count);
                System.out.println();
                System.out.println("Do you want to play again");
                String dession =sc.next();
                if(dession.equalsIgnoreCase("Yes")){
                    count=0;
                    geeratednumb=generation();
                    continue;
                }else {
                    System.out.println("Thank you...!");
                    return;
                }
            }
        }


    }
}
