package singelton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLoggerInfo("first logger");
        ProgramLogger.getProgramLogger().addLoggerInfo("second logger");
        ProgramLogger.getProgramLogger().addLoggerInfo("third logger");
        ProgramLogger.getProgramLogger().showLoggerFile();


    }
}
