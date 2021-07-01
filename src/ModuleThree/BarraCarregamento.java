package ModuleThree;

public class BarraCarregamento {

    public static void main(String[] args) {

        GeradorPDF iniciarGerarPDF = new GeradorPDF();
        BarraDeCarregamento10 iniciarBarraDeCarregamento = new BarraDeCarregamento10(iniciarGerarPDF);

        iniciarGerarPDF.start();
        iniciarBarraDeCarregamento.start();

    }

}

class GeradorPDF extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Iniciar Geração PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}

class BarraDeCarregamento10 extends Thread {

    private Thread iniciarGerarPDF;

    public BarraDeCarregamento10(Thread iniciarGerarPDF) {
        this.iniciarGerarPDF = iniciarGerarPDF;
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(500);
                if (!iniciarGerarPDF.isAlive()) {
                    break;
                }

                System.out.println("Loading...");

            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

