import java.util.Random;
class Main{
    public static void main(String[] args){

        Random rand = new Random();

        Store liew = new Store();
        Video[] l = liew.getVdo();
        System.out.print(l[1].getInfo()+"\n");
        
        Customer customer = new Customer();
        Person[] c = customer.getPerson();
        System.out.print(c[1].getInfo()+"\n");
        
            /*
            while(true)
                list_customer = customer.getคนที่สามารถเช่าได้
                list_vdo = liew.countListVdo();
                ran_customer = rand.nextInt(list_custom.length) + 1;
                ran_vdo = rand.nextInt(list_vdo) + 1;
                liew.getVdo(ran_vdo);
                if (!liew.rent(list_custom[ran_customer], list_vdo[ran_vdo]);)       
                    break;
            */
            
        }

    }
}