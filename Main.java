public class Main {
   public static void main(String[] args) {
       ProduzioneCandela candela1 = new CandelaArtigianale("Cera d'api", 500, 60, 3);   // parametro specifico della classe
       ProduzioneCandela candela2 = new CandelaIndustriale("Paraffina", 2000, 40, 5);   // parametro specifico della classe
   		// entrambe le variabili sono di tipo ProduzioneCandela, ma contengono oggetti di classi diverse.
       ProduzioneCandela[] produzioni = {candela1, candela2};
       for (ProduzioneCandela p : produzioni) //ciclo foreach B)
       	{
           System.out.println(" PRODUZIONE");
           p.descrizioneProduzione();
           System.out.println("Efficienza: " + p.calcolaEfficienza());
           System.out.println();
       }
   }
}