import javax.swing.UnsupportedLookAndFeelException;

public class Driver {

    public static void main (String [] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{

        try 
		{
            CodeProfiler.getInstance();
			CodeProfiler.setEnabled(true);

            for(int i = 0; i < 100; i++)
			{
                CodeProfiler.getInstance().start("Timer 1", "start of timer, i: " + i); 
                CodeProfiler.getInstance().start("Timer 2", "Start Iteration: " + i);
                Thread.sleep(100);
                CodeProfiler.getInstance().stop("Timer 1", "start of timer, i: " + i);
                CodeProfiler.getInstance().stop("Timer 2", "Stop Iteration: " + i);
               
            }
            
            CodeProfiler.getInstance().generateReport();

        }
		catch(CodeProfilerException ex1)
        {
            ex1.printStackTrace();
        }
        catch(InterruptedException ex2)
        {
            ex2.printStackTrace();
        }

    }

}