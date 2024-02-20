class Team implements Runnable{
    CakeCounter cakeCounter;

    Team(CakeCounter cakeCounter){
        this.cakeCounter = cakeCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i<1000; i++){
            cakeCounter.increment();
        }
    }
}
