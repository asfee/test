import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogMain {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        DOMConfigurator.configure("src/log4j_taskA.xml");
        DOMConfigurator.configure("src/log4j_taskB.xml");

        final Logger loggerZ = Logger.getLogger(LogMain.class);

        final Logger loggerA = Logger.getLogger("TaskA");
        final Logger loggerB = Logger.getLogger("TaskB");

        Task taskA = new TaskA();
        taskA.setLogger(loggerA);

        Task taskB = new TaskB();
        taskB.setLogger(loggerB);

        for (int i = 0; i < 5; i++) {
            loggerZ.info("main.");

            Thread t1 = new Thread(taskA);
            Thread t2 = new Thread(taskB);

            t1.start();
            t2.start();

            Thread.sleep(500);
        }
    }

}
