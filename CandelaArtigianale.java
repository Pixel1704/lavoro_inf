public class CandelaArtigianale {

    String tipoCera;
    double pesoCera, tempoProduzione;
    int numeroStampi;

    public CandelaArtigianale(String tipoCera, double pesoCera, double tempoProduzione, int numeroStampi) {
        this.tipoCera = tipoCera;
        this.pesoCera = pesoCera;
        this.tempoProduzione = tempoProduzione;
        this.numeroStampi = numeroStampi;
    }

    public void descrizioneProduzione() {
       System.out.println("Tipo cera: " + tipoCera);
       System.out.println("Peso cera (g): " + pesoCera);
       System.out.println("Tempo produzione (min): " + tempoProduzione);
       System.out.println("Numero stampi: " + numeroStampi);
   }
}