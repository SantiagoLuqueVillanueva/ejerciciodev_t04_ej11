public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("""
            A continuación deberá introducir una hora del día. Primero
            introducirá la hora y luego los minutos.
        """);

        int hora = Integer.parseInt(System.console().readLine("hora: "));
        int min = Integer.parseInt(System.console().readLine("minuto: "));

        int solhoraenpunto = (24 - hora) * 3600;
        int solhoramin = (23 - hora) * 3600;
        int solmin = (60 - min) * 60;
        int sol = solhoramin + solmin;

        if ((hora >= 0) && (hora <= 24) && (min == 0)) {
            System.out.printf("Desde las %d:%d0 hasta la media noche falta %d segundos", hora, min, solhoraenpunto);
        } else if ((hora >= 0) && (hora <= 24) && (min != 0)) {
            System.out.printf("Desde las %d:%d hasta la media noche falta %d segundos", hora, min, sol);
        }        
    }
}
