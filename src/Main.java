import twitter4j.api.;
public class Main 
{
	public static void main(String[] pArguments)
	{
		Twitter twitter = TwitterFactory.getSingleton();
		Status status = twitter.updateStatus(latestStatus);
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	}
}
