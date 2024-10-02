public class Task {
    public void startThread(int index){
        Thread hilo = new Thread(){
            @Override
            public void run(){
                System.out.println("Este es el hilo: " + index);

                getListPrimes();
            }
        };
        hilo.start();
    }

    public void getListPrimes(){
        int numberPrimes = Utils.getRandomIntNumber(1,100);
    }
}
