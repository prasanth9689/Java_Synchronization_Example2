class CakeCounter{
    int cakeCount= 0;

    public synchronized void increment(){
        cakeCount++;
    }
}