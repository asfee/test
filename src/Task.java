import org.apache.log4j.Logger;


public class Task implements Runnable {

    protected Logger logger;

//    private static final Logger logger = Logger.getLogger(LogMain.class);

    public void setLogger(final Logger logger) {
        this.logger = logger;
    }
    

    public void run() {
        logger.info("base class. " + this.getClass().getSimpleName());
    }
}
