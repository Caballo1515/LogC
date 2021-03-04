import java.util.Date;

public class Log extends ConsoleLog {

    public Log(){

    }

    public void error(String tag, String message){
        fecha= fechaActual();
        System.out.println(ANSI_RED +  fecha + " (E) " + tag + " - " + message + ANSI_RESET);
    }

    public void warning(String tag, String message){
        fecha= fechaActual();
        System.out.println(ANSI_YELLOW + fecha + " (W) " + tag + " - " + message + ANSI_RESET);
    }

    public void debug(String tag, String message){
        fecha= fechaActual();
        System.out.println(ANSI_BLUE + fecha + " (D) " + tag + " - " + message + ANSI_RESET);
    }

    public void info(String tag, String message){
        fecha= fechaActual();
        System.out.println(ANSI_BLACK + fecha + " (I) " + tag + " - " + message + ANSI_RESET);
    }

    public void verbose(String tag, String message){
        fecha= fechaActual();
        System.out.println(ANSI_BLACK + fecha + " (V) " + tag + " - " + message + ANSI_RESET);
    }

}
