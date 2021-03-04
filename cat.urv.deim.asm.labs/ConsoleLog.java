
import java.util.Date;

public class ConsoleLog {
    protected static String fecha;


    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public ConsoleLog(){
        
    }

    public static void e(String tag, String message){

        fecha= fechaActual();
        System.out.println(ANSI_RED + fecha + " (E) " + tag + " - " + message + ANSI_RESET);
    }
    public static void w(String tag, String message){
        fecha= fechaActual();
        System.out.println(ANSI_YELLOW + fecha + " (W) " + tag + " - " + message + ANSI_RESET);
    }
    public static void d(String tag, String message){
        fecha= fechaActual();
        System.out.println(ANSI_BLUE + fecha + " (D) " + tag + " - " + message + ANSI_RESET);
    }
    public static void i(String tag, String message){
        fecha= fechaActual();
        System.out.println(ANSI_BLACK + fecha + " (I) " + tag + " - " + message + ANSI_RESET);
    }
    public static void v(String tag, String message){
        fecha= fechaActual();
        System.out.println(ANSI_BLACK + fecha + " (V) " + tag + " - " + message + ANSI_RESET);
    }

    public static String fechaActual(){
        java.util.Date aux = new Date();
        return aux.toString();
    }
}
