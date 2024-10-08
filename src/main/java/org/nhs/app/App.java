public class App{

/*    public static void main(String args[]){
        for(int number = 1; number <= 5; number++){
            for(int counter = 1; counter <= 4; counter++){
                System.out.print(number);
            }
        System.out.println();
        }
    }
*/

    public static void main(String args[]){
        one();
        System.out.println();
        two();
        System.out.println();
        three();
    }
        
      
    
    public static void one(){
        for(int number = 1; number <= 5; number++){
            for(int counter = 1; counter <= number; counter++){
                System.out.print(number);
            }
        System.out.println();
        }
    } 



    public static void two(){
        for(int number = 1; number <= 5; number++){
            for(int dot = 5; dot > number; dot--){
                System.out.print(".");
            }
            for(int num = 1; num <= number; num++){
                System.out.print(number);
            }
            System.out.println();
        }
    }



    public static void three(){
        for(int number = 1; number <= 5; number++){
                for(int counter = 1; counter < 5 - number + 1; counter++){
                    System.out.print(".");
                }

                System.out.print(number);

                for(int counter = 5 - number + 2; counter <= 5; counter++){
                    System.out.print(".");
                }

                System.out.println();
        }
    }


}