package ModuleThree;

import java.util.Set;

public class ThreadExemplo {

    public static void main(String[] args) {
        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento3 barraDeCarregamento3 = new BarraDeCarregamento3();
        barraDeCarregamento2.start();
        barraDeCarregamento3.start();

        Thread thread = new Thread(new BarraDeCarregamento4());
        Thread thread2 = new Thread(new BarraDeCarregamento5());

        thread.start();
        thread2.start();

        System.out.println("Nome de thread: " + thread.getName());
        System.out.println("Nome de thread: " + thread2.getName());

    }
}

class Gerar implements Runnable {
    @Override
    public void run(){
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable {
    @Override
    public void run(){
        System.out.println("Loading...");
    }
}

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run(){
        super.run();

        try {
            Thread.sleep(10000); //para a thread em 5000 milissegundos
            System.out.println("Rodando a Thread Carregamento 2->  " + this.getName());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


class BarraDeCarregamento3 extends Thread{
    @Override
    public void run(){
        super.run();

        try {
            Thread.sleep(15000); //para a thread em 5000 milissegundos
            System.out.println("Rodando a Thread Carregamento 3->  " + this.getName());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}




class BarraDeCarregamento4 implements Runnable{
    @Override
    public void run(){


        try {
            Thread.sleep(10000); //para a thread em 5000 milissegundos
            System.out.println("Rodando a Thread Carregamento 4");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


class BarraDeCarregamento5 implements Runnable{
    @Override
    public void run(){


        try {
            Thread.sleep(15000); //para a thread em 5000 milissegundos
            System.out.println("Rodando a Thread Carregamento 5");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}