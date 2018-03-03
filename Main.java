import java.util.Random;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Random rand = new Random();
        Store liew = new Store();
        Customer customer = new Customer();
        
        for(int rent_day = 1; rent_day <= 35; rent_day++){   
            System.out.printf("[Day %d] Begin\n", rent_day);

            if(rent_day != 1){
                liew.checkReturn();
            }

            Person[] list_customer = customer.getAbleRent(liew);

            while(list_customer.length > 0 && liew.countListVdo() > 0){
                
                if(liew.countListVdo() < 3 && list_customer.length > 1){
                    int n = 0;
                    for(int i = 0;i < list_customer.length;i++){
                            if(list_customer[i].getType() == "Hoarder"){ 
                            list_customer[i] = null;
                            n++;
                        }    
                    }
                    if(n == list_customer.length) break;
                    Person[] temp;

                    System.out.println(n);

                    if(n != 0) temp = new Person[list_customer.length - n];
                    else temp = new Person[list_customer.length];    

                    for(int i = 0, j = 0;i < list_customer.length;i++){
                        if(list_customer[i] != null)
                            temp[j++] = list_customer[i];
                    }    
                    list_customer = temp;
                }
                if(liew.countListVdo() < 3 && list_customer[0].getType() == "Hoarder")
                    break;

                System.out.println("------------------");
                System.out.println(liew.countListVdo()+"  Count_list_vdo");
    
                // list_customer = customer.getAbleRent(liew);
                System.out.println("[list_customer.length] :"+list_customer.length);
                int ran_customer = rand.nextInt(list_customer.length);

                // System.out.println(list_customer[ran_customer].getNumVdoRent());

                System.out.println("[ran_customer] :"+ran_customer); 

                liew.rent(list_customer[ran_customer], rent_day);

                // list_customer = customer.getAbleRent(liew);

                list_customer[ran_customer] = null;

                System.out.println(list_customer[ran_customer]);

                Person[] temp = new Person[list_customer.length - 1];

                for(int i = 0, j = 0;i < list_customer.length;i++){
                    if(list_customer[i] != null){
                        temp[j++] = list_customer[i];
                    }
                }

                list_customer = temp;

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
            System.out.println("###########################");
        }
        
    }
}