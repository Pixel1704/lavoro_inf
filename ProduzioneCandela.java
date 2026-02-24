public abstract class ProduzioneCandela {
   		
   protected String tipoCera;
   protected double pesoCera;        // grammi di cera utilizzati
   protected double tempoProduzione; // tempo in minuti

   public ProduzioneCandela(String tipoCera, double pesoCera, double tempoProduzione) {
       this.tipoCera = tipoCera;
       this.pesoCera = pesoCera;
       this.tempoProduzione = tempoProduzione;
   }
   // Metodo astratto: ogni tipo di candela dovrà calcolare l'efficienza in modo diverso.
   public abstract double calcolaEfficienza();
   // Metodo concreto condiviso da tutte le classi figlie

   public void descrizioneProduzione() {
       System.out.println("Tipo cera: " + tipoCera);
       System.out.println("Peso cera (g): " + pesoCera);
       System.out.println("Tempo produzione (min): " + tempoProduzione);
   }
}
