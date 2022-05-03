// Jamie Terrell's class for FinalProject
// Outputs ASCII Art when implementing begin()

public class Terrell implements FinalProject
{
    public Terrell()
    {

    }

    public void begin()
    {
        System.out.println();
	System.out.println("    _.-\"\"\"\"-._");
	System.out.println("  .':::::::::::.");
	System.out.println(" /::::::::::::::\\");
	System.out.println("|:::(o)::::(o):::|");
	System.out.println("|::::::::::::::::|");
	System.out.println("|:::\\::::::::/:::|");
	System.out.println(" \\:::`.____.':::/");
	System.out.println("  `.::::::::::.'");	
	System.out.println("    ``-....-''");
        System.out.println();
        try
        {
            java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
        }
        catch(InterruptedException e)
        {}
    }
}