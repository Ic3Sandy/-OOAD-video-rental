import java.util.Random;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Random rand = new Random();
        Store liew = new Store();
        Customer customer = new Customer();
        
        for(int rent_day = 1; rent_day <= 35; rent_day++){   
            System.out.printf("[Main] Day %d Begin\n", rent_day);

            if(rent_day != 1){
                liew.checkReturn();
            }

            Person[] list_customer = customer.getAbleRent(liew, rent_day);

            while(list_customer.length > 0 && liew.countListVdo() > 0){
                int ran_customer = rand.nextInt(list_customer.length);
                liew.rent(list_customer[ran_customer], rent_day);
                list_customer = customer.getAbleRent(liew, rent_day);
            }
            System.out.printf("[Main] Day %d Income: %d $\n", rent_day, liew.getIncome());
            System.out.printf("[Main] Day %d End\n", rent_day);
            System.out.println("####################################################################");

             try {
               Thread.sleep(1000);
             } catch (Exception e) {
                System.out.println(e);
             }
        }
        System.out.println();
        liew.checkReturn();
        liew.printListVdo();
        System.out.println("Total Income : "+liew.getIncome());
        System.out.println();
        liew.printLogFile();
    }
}