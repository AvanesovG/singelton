package singelton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = " This is log File.\n\n";



    public static synchronized ProgramLogger getProgramLogger(){
        if (programLogger==null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
    private ProgramLogger(){

    }
    public void addLoggerInfo(String loggerInfo){
        logFile+=loggerInfo+"\n";
    }
    public void showLoggerFile(){
        System.out.println(logFile);
    }

}
