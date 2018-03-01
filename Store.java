import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

class Store{
    private Video[] vdo;
    private int count_list_vdo = 20;
    private int income = 0;
    Random rand = new Random();
    ArrayList<Logfile> log = new ArrayList<Logfile>();
    
    public Store(){
        vdo = new Video[20];
        vdo[0] = new Video("Black Panther", "New Release", 5, true);
        vdo[1] = new Video("The Shape of Water", "New Release", 5, true);
        vdo[2] = new Video("Monster Hunt 2", "New Release", 5, true);
        vdo[3] = new Video("Maze Runner 3", "New Release", 5, true);
        vdo[4] = new Video("Citizen Kane", "Drama", 4, true);
        vdo[5] = new Video("All about Eve", "Drama", 4, true);
        vdo[6] = new Video("Metropolis", "Drama", 4, true);
        vdo[7] = new Video("Moonlight", "Drama", 4, true);
        vdo[8] = new Video("Step Brothers", "Comedy", 3, true);
        vdo[9] = new Video("White Chicks", "Comedy", 3, true);
        vdo[10] = new Video("The Hot Chick", "Comedy", 3, true);
        vdo[11] = new Video("The Hangover", "Comedy", 3, true);
        vdo[12] = new Video("The Greatest Showman", "Romance", 2, true);
        vdo[13] = new Video("When We First Met", "Romance", 2, true);
        vdo[14] = new Video("Phantom Thread", "Romance", 2, true);
        vdo[15] = new Video("Call Me by Your Name", "Romance", 2, true);
        vdo[16] = new Video("Get Out", "Horror", 1, true);
        vdo[17] = new Video("Psycho", "Horror", 1, true);
        vdo[18] = new Video("Repulsion", "Horror", 1, true);
        vdo[19] = new Video("It Follows", "Horror", 1, true);
    }
    public Video[] getAllVdo(){ return vdo; }
    public int countListVdo(){ return count_list_vdo;}
    public int getIncome(){ return income; }

    public int getVdo(){
        int[] list_vdo = new int[count_list_vdo];
        for(int i = 0, j = 0; i < vdo.length; i++){
            if(vdo[i].getStatus()){
                list_vdo[j++] = i;
            }
        }
        int x = rand.nextInt(list_vdo.length);
        System.out.println("[rand.nextInt(list_vdo.length)] :"+x);
        return list_vdo[x];
    }

    public void rent(Person person, int rent_day){
        int day = 0;
        int rent_vdo = 0;

        if ((person.getType()).equals("Breezy")){
            rent_vdo = rand.nextInt(2) + 1;
            day = rand.nextInt(2) + 1;
        }    
        else if ((person.getType()).equals("Hoarder")){
            rent_vdo = 3;
            day = 7;
        }    
        else if ((person.getType()).equals("Regular")){
            if (countListVdo() > 3)
                rent_vdo = rand.nextInt(3) + 1;
            else rent_vdo = rand.nextInt(countListVdo()) + 1;
            day = rand.nextInt(3) + 3;
        }    

        for (int i = 0; i < rent_vdo; i++){
            int ran_vdo = getVdo();
            
            person.setNumVdoRent(person.getNumVdoRent() + 1);
            vdo[ran_vdo].setStatus(false);
            income += vdo[ran_vdo].getPrice() * day;
            count_list_vdo -= 1;

            Logfile logging = new Logfile(rent_day, person, vdo[ran_vdo], day);
            logging.getInfo();
            log.add(logging);

        }
    }
    
    public void checkReturn(int rent_day){

        for(int i = 0; i < log.size(); i++){
            Logfile log_check = log.get(i);

            if(log_check.getDay() == rent_day){
                Person person = log_check.getCustomer();
                Video vdo = log_check.getVdo();
                int day = log_check.getDay();
                
                if(day == 1){
                    vdo.setStatus(true);
                    person.setNumVdoRent(person.getNumVdoRent() - 1);
                    count_list_vdo += 1;
                }

                Logfile logging = new Logfile(rent_day, person, vdo, day - 1);
                logging.getInfo();
                log.add(logging);
            }
        }
    }

}