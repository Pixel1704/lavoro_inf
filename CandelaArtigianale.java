public class CandelaArtigianale extends ProduzioneCandela {

    protected int numeroStampi;

    public CandelaArtigianale(String tipoCera, double pesoCera, double tempoProduzione, int numeroStampi) {
        super(tipoCera, pesoCera, tempoProduzione);
        this.numeroStampi = numeroStampi;
    }

    public double calcolaEfficienza() {
        return pesoCera / tempoProduzione;
    }

    public void descrizioneProduzione() {
       super.descrizioneProduzione();
       System.out.println("Numero stampi: " + numeroStampi);
   }
}