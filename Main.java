import java.util.Random;
class Main{
    public static void main(String[] args){
        Random rand = new Random();
        Store liew = new Store();
        Customer customer = new Customer();
        
            while(true){
                list_custom = customer.getAbleRent(liew);
                amount_vdo = liew.countListVdo();
                ran_customer = rand.nextInt(list_custom.length) + 1;
                ran_vdo = liew.getVdo(rand.nextInt(amount_vdo) + 1);

                if (!liew.rent(list_custom[ran_customer], ran_vdo))       
                    break;            
            }
        }

    }