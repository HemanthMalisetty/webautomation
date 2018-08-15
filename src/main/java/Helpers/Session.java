package Helpers;

import com.perfecto.reportium.client.ReportiumClient;

import java.time.LocalDateTime;

/**
 * Created by Jordan on 5/5/17.
 */
public class Session
{
	private static String env = null,grid = null, browser = null;
	private static ThreadLocal<ReportiumClient> reportiumClients = new ThreadLocal<>();
	private static LocalDateTime startTime;
	private static Boolean local, isDesktop;
	private static String excelHeader;

	public Session(String env, Boolean local, Boolean isDesktop)
	{
		setEnv(env);
		Session.local = local;
		startTime = LocalDateTime.now();
		Session.isDesktop = isDesktop;
	}
	public static void setExcelHeader(String header)
	{
		excelHeader = header;
	}
	public static String getExcelHeader() { return excelHeader; }

	public void setGrid(String grid){this.grid = grid;}

	public static String getGrid(){ return grid;}

	public void setBrowser(String browser){this.browser = browser;}

	public static String getBrowser(){ return browser;}

	private void setEnv(String env)
	{
		this.env = env;
	}

	public static String getEnv()
	{
		return env;
	}

	public void setReportiumClient(ReportiumClient reportiumClient)
	{
		reportiumClients.set(reportiumClient);
	}

	public static ReportiumClient getReportiumClient()
	{
		return reportiumClients.get();
	}

	public static LocalDateTime getStartTime()
	{
		return startTime;
	}

	// TODO Move to utilities class

	public static String getPrettyStartTime()
	{
		return getStartTime().getMonthValue()+"_"+getStartTime().getDayOfMonth()+"_"+getStartTime().getHour()+"_"+getStartTime().getMinute();
	}
	public static String getPrettyTime()
	{
		LocalDateTime ldt = LocalDateTime.now();
		return ldt.getMonthValue()+"_"+ ldt.getDayOfMonth()+"_"+ ldt.getHour()+"_"+ ldt.getMinute()
				+ "_"  + ldt.getSecond() + "_" + ldt.getNano() ;
	}


	public static Boolean isLocal()
	{
		return local;
	}

	public static Boolean isDesktop()
	{
		return isDesktop;
	}

	public static Boolean isMobile()
	{
		return !isDesktop();
	}
}
