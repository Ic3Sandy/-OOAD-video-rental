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
}