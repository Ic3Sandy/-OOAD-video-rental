import java.util.Random;

class Store{
    private Video[] vdo;
    private int[] n;
    private int count_list_vdo;
    Random rand = new Random();
    
    public Store(){
        vdo = new Video[20];
        vdo[0] = new Video("Black Panther", "New Release", 5);
        vdo[1] = new Video("The Shape of Water", "New Release", 5);
        vdo[2] = new Video("Monster Hunt 2", "New Release", 5);
        vdo[3] = new Video("Maze Runner 3", "New Release", 5);
        vdo[4] = new Video("Citizen Kane", "Drama", 4);
        vdo[5] = new Video("All about Eve", "Drama", 4);
        vdo[6] = new Video("Metropolis", "Drama", 4);
        vdo[7] = new Video("Moonlight", "Drama", 4);
        vdo[8] = new Video("Step Brothers", "Comedy", 3);
        vdo[9] = new Video("White Chicks", "Comedy", 3);
        vdo[10] = new Video("The Hot Chick", "Comedy", 3);
        vdo[11] = new Video("The Hangover", "Comedy", 3);
        vdo[12] = new Video("The Greatest Showman", "Romance", 2);
        vdo[13] = new Video("When We First Met", "Romance", 2);
        vdo[14] = new Video("Phantom Thread", "Romance", 2);
        vdo[15] = new Video("Call Me by Your Name", "Romance", 2);
        vdo[16] = new Video("Get Out", "Horror", 1);
        vdo[17] = new Video("Psycho", "Horror", 1);
        vdo[18] = new Video("Repulsion", "Horror", 1);
        vdo[19] = new Video("It Follows", "Horror", 1);
        
        n = new int[20];
        for(int i = 0;i < vdo.length;i++){
            n[i] = 1;
        }

        count_list_vdo = 20;
    }

    public Video[] getAllVdo(){
        return vdo;
    }
    public int countListVdo(){
        return count_list_vdo;
    }

    public int getVdo(int x){
        int a[] = new int[vdo.length];
        int y = 0;
        boolean k = true;

        for (int i = 0;i < vdo.length;i++){
            if (n[i] != 0){
                a[i] = ++y;
                k = true;
            }
            else {
                a[i] = y;
                k = false;
            }
        }
        
        for (int i = 0;i < vdo.length;i++) {
            if ((a[i] == x) && (k == true)) return i;
        }
        return y;
    }

    public void rent(Person person){
        Random rand = new Random();
        int day = 0;
        int rent_vdo = 0;

        if ((person.getType()).equals("Breezy")){
            rent_vdo = rand.nextInt(2) + 1;
            day = rand.nextInt(2) + 1;
        }    
        if ((person.getType()).equals("Hoarder")){
            rent_vdo = 3;
            day = 7;
        }    
        if ((person.getType()).equals("Regular")){
            if (countListVdo() > 3)
                rent_vdo = rand.nextInt(3) + 1;
            else rent_vdo = rand.nextInt(countListVdo()) + 1;
            day = rand.nextInt(5) + 3;
        }    

        for (int i = 0;i < rent_vdo;i++){
            int amount_vdo = countListVdo();
            int ran_vdo = getVdo(rand.nextInt(amount_vdo) + 1);

            person.setNumVdoRent(1);
            n[ran_vdo] = 0;

        }
        //คิดเงิน
    }

}