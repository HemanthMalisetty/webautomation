package AbstractClasses;

import Helpers.DriverHelper;
import Helpers.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PageBase
{
	private DriverHelper dh = new DriverHelper();
	protected String url = null;
	public final Logger logger = LoggerFactory.getLogger(getClass());


	public PageBase()
	{
		if (!Session.getEnv().toLowerCase().equals("localhost"))
			url = "https://services-"+ Session.getEnv().toLowerCase();
		else
			url = "http://localhost:4200/";
	}

	protected void getUrl()
	{
		log("Attempting to navigate to '" + url + "'");
		dh.getURL(url);
	}

	public void waitForUrl()
	{
		dh.waitForUrlToBe(url);
	}

	public void log(String message) {
		logger.info(message);
		System.out.println(message);

	}
}
