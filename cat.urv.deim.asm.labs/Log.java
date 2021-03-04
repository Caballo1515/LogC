public class Log extends ConsoleLog {

    public Log(){

    }

    public void error(String tag, String message){
        System.out.println(ANSI_RED + tag + " - " + message + ANSI_RESET);
    }

    public void warning(String tag, String message){
        System.out.println(ANSI_YELLOW + tag + " - " + message + ANSI_RESET);
    }

    public void debug(String tag, String message){
        System.out.println(ANSI_BLUE + tag + " - " + message + ANSI_RESET);
    }

    public void info(String tag, String message){
        System.out.println(ANSI_BLACK + tag + " - " + message + ANSI_RESET);
    }

    public void verbose(String tag, String message){
        System.out.println(ANSI_BLACK + tag + " - " + message + ANSI_RESET);
    }

}
