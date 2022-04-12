package behaviorPatterns.chainOfResponsibilityPattern;

/**
 * @author 刘乐乐
 * @description
 * @date 2022-04-12 17:10:28
 */
public class ResponsibilityTest {
    public static void main(String[] args) {
        AbstractLogger chainLogger = getChainLogger();
        chainLogger.logMessage(AbstractLogger.INFO, "this is message");
    }

    private static AbstractLogger getChainLogger() {
        AbstractLogger infoLogger = new INFOLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new DEBUGLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ERRORLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);
        return errorLogger;
    }

}
