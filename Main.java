import java.util.Random;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Random rand = new Random();
        Store liew = new Store();
        Customer customer = new Customer();
        
        for(int rent_day = 1; rent_day <= 15; rent_day++){   
            System.out.printf("[Day %d] Begin\n", rent_day);

            if(rent_day != 1){
                liew.checkReturn();
            }

            Person[] list_customer = customer.getAbleRent(liew, rent_day);

            while(list_customer.length > 0 && liew.countListVdo() > 0){

                System.out.println("[list_customer.length] :"+list_customer.length);
                int ran_customer = rand.nextInt(list_customer.length);

                System.out.println("[ran_customer] :"+ran_customer); 

                liew.rent(list_customer[ran_customer], rent_day);

                
                list_customer = customer.getAbleRent(liew, rent_day);

                for(int i =0;i < list_customer.length;i++){
                    System.out.println(list_customer[i].getInfo());
                } 
            }
            System.out.printf("[Day %d] Income: %d $\n", rent_day, liew.getIncome());
            System.out.printf("[Day %d] End\n", rent_day);
            try {
                Thread.sleep(1000);
             } catch (Exception e) {
                System.out.println(e);
             }
            System.out.println("#################################################################");
        }
        
    }
}