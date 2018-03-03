class Customer{
    private Person[] person;

    public Customer(){
        person = new Person[10];
        person[0] = new Person("F", "Breezy");
        person[1] = new Person("J", "Breezy");
        person[2] = new Person("Ice", "Breezy");
        person[3] = new Person("Boss", "Breezy");
        person[4] = new Person("PT", "Hoarder");
        person[5] = new Person("YP", "Hoarder");
        person[6] = new Person("Top", "Hoarder");
        person[7] = new Person("ChoMind", "Regular");
        person[8] = new Person("B", "Regular");
        person[9] = new Person("Sprite", "Regular");
    }

    public Person[] getPerson(){
        return person;
    }
    
    public Person[] getAbleRent(Store liew){
        Person[] temp = new Person[10];
        int count_able_rent = 0;
        
        for(int i = 0; i < 10; i++){
            if(getVdoRent(person[i], liew)){
                temp[i] = person[i];
                count_able_rent++;
            }
        }

        Person[] able_rent = new Person[count_able_rent];
        for(int i = 0, j = 0; i < 10; i++){
            if(temp[i] != null){
                able_rent[j++] = temp[i];
            }
        }

        return able_rent;
    }

    public boolean getVdoRent(Person person, Store liew){
        if(person.getType().equals("Hoarder") && liew.countListVdo() > 2) 
            return true;
        else if(person.getNumVdoRent() < 3) 
            return true;
        else 
            return false;   
    }

    public Person[] getAbleRentDay(Person[] list_customer, int ran_customer){
        list_customer[ran_customer] = null;
        Person[] temp = new Person[list_customer.length - 1];
            for(int i = 0, j = 0;i < list_customer.length;i++){
                if(list_customer[i] != null){
                    temp[j++] = list_customer[i];
                }
            }
        return temp;    

    }
}
