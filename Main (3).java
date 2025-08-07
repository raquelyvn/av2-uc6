class Serie {
    String titulo;
    int temporadas;
    
    public Serie(String titulo, int temporadas) {
        this.titulo = titulo;
        this.temporadas = temporadas;
    }
}

public class Main {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        
        series[0] = new Serie("vis a vis", 4);
        series[1] = new Serie("friends", 10);
        series[2] = new Serie("stranger things", 4);
        series[3] = new Serie("dark", 3);
        series[4] = new Serie("lucifer", 6);
        
        int totalTemporadas = 0;
        int contador = 0;
        
        System.out.println("Séries com mais de 3 temporadas:");
        for (int i = 0; i < series.length; i++) {
            if (series[i].temporadas > 3) {
                System.out.println("- " + series[i].temporadas + " temporadas)");
            }
            totalTemporadas += series[i].temporadas;
            contador++;
            
        }
        
        double media = (double) totalTemporadas / contador;
        System.out.println("\n---");
        System.out.println("Média de temporadas de todas as séries: " + String.format("%.2f", media));
    }
}