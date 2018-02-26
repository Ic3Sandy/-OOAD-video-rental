class Main{
    public static void main(String[] args){

        Store liew = new Store();
        Video[] l = liew.getvdo();
        System.out.print(l[1].getInfo()+"\n");
        
        Customer customer = new Customer();
        Person[] c = customer.getPerson();
        System.out.print(c[1].getInfo()+"\n");
        
        for(int day = 1; day <= 35; day++){
            System.out.printf("[Store main] Day %d\n" , (day));
            
        }

    }
}