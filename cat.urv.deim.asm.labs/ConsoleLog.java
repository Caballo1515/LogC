public class ConsoleLog {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public ConsoleLog(){
        
    }

    public static void e(String tag, String message){
        System.out.println(ANSI_RED + tag + " - " + message + ANSI_RESET);
    }
    public static void w(String tag, String message){
        System.out.println(ANSI_YELLOW + tag + " - " + message + ANSI_RESET);
    }
    public static void d(String tag, String message){
        System.out.println(ANSI_BLUE + tag + " - " + message + ANSI_RESET);
    }
    public static void i(String tag, String message){
        System.out.println(ANSI_BLACK + tag + " - " + message + ANSI_RESET);
    }
    public static void v(String tag, String message){
        System.out.println(ANSI_BLACK + tag + " - " + message + ANSI_RESET);
    }
}
