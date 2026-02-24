public class CandelaArtigianale extends ProduzioneCandela {

    int numeroStampi;

    public CandelaArtigianale(String tipoCera, double pesoCera, double tempoProduzione, int numeroStampi) {
        super(tipoCera, pesoCera, tempoProduzione);
        this.numeroStampi = numeroStampi;
    }

    @Override
    public double calcolaEfficienza() {
        return pesoCera / tempoProduzione;
    }

    @Override
    public void descrizioneProduzione() {
       super.descrizioneProduzione();
       System.out.println("Numero stampi: " + numeroStampi);
   }
}