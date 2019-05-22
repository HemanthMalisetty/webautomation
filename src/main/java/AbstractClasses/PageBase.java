package AbstractClasses;

import Helpers.DriverHelper;
import Helpers.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PageBase
{
	private DriverHelper dh = new DriverHelper();
	protected String url = null, title = null;
	private final Logger logger = LoggerFactory.getLogger(getClass());


	public PageBase()
	{
		if (!Session.getEnv().toLowerCase().equals("localhost"))
			url = "https://"+ Session.getEnv().toLowerCase()+ "-client.frontlineinsurance.com/policies";
		else
			url = "http://localhost/amp-portal-non-minified/app/html/index.html#/home";
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
