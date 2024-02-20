public class Main {

    public static void main(String[] args) {
        CakeCounter counter = new CakeCounter();

        Thread team1 = new Thread(new Team(counter));
        Thread team2 = new Thread(new Team(counter));

        team1.start();
        team2.start();

        try{
            team1.join();
            team2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.cakeCount);
    }
}