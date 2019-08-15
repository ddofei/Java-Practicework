public class SumOfMultiplesOf3And5 {
    public static void main(String[] args) {
        addMultiplesOf3And5();


    }

    public static void addMultiplesOf3And5(){
        int count=0;
        int sum=0;
        for (int i=1; i<=1000; i++){
            if ((i%5==0) && (i%3==0)){
                System.out.println("found number " + i);
                sum+=i;
                count++;
                if (count==5){
                    break;
                }
            }

        }
        System.out.println("the sum is " +  sum);

    }

    //public static void addMultiplesOf3And5{
       // for (int i=1; i<=1000; i++){
           // int count =0;
            //if ((i%5==0) && (i%3==0)){
                //System.out.println(i);
                //count++;
                //if (count==5){
                  //  break;
              //  }



            //}

       // }
   // }
}
