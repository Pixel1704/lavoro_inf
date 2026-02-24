public class CandelaIndustriale extends ProduzioneCandela {
    
    protected int livelloAutomazione; 
    
    public CandelaIndustriale(String tipoCera, double pesoCera, double tempoProduzione, int livelloAutomazione) {
        super(tipoCera, pesoCera, tempoProduzione);
        this.livelloAutomazione = livelloAutomazione;
    }
    
    public double calcolaEfficienza() {
        return (pesoCera / tempoProduzione) * livelloAutomazione;
    }

    public void descrizioneProduzione() {
       super.descrizioneProduzione();
       System.out.println("Livello automazione: " + livelloAutomazione);
    }
}
