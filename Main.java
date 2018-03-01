import java.util.Random;
class Main{
    public static void main(String[] args){
        Random rand = new Random();
        Store liew = new Store();
        Customer customer = new Customer();
        
        for(int day = 1;day <= 35;day++){
        

            while(!((customer.getAbleRent(liew)).length == 0 && liew.countListVdo() == 0)){
                list_customer = customer.getAbleRent(liew));
                ran_customer = rand.nextInt(list_customer.length) + 1; 

                liew.rent(list_custom[ran_customer]);
            }

        }
        //print log
    }
}
