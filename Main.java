import java.util.Random;
class Main{
    public static void main(String[] args){

        Random rand = new Random();

        Store liew = new Store();
        Video[] l = liew.getvdo();
        System.out.print(l[1].getInfo()+"\n");
        
        Customer customer = new Customer();
        Person[] c = customer.getPerson();
        System.out.print(c[1].getInfo()+"\n");
        
        for(int day = 1; day <= 35; day++){
            System.out.printf("[Store main] Day %d\n" , (day));
            /*

            while(true)
                list_custom = customer.getคนที่สามารถเช่าได้
                list_vdo = liew.getหนังที่มีให้ยืม
                ran_customer = rand.nextInt(list_custom.length) + 1;
                ran_vdo = rand.nextInt(list_vdo.length) + 1;
                
                if (!liew.rent(list_custom[ran_customer], list_vdo[ran_vdo]);)       
                    break;
            */
            
        }

    }
}