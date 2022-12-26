package sources;

public final class FrameworkConstants
{
    private FrameworkConstants()
    {}
    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"//Drivers//chromedriver";
    private static final String CONFIGPATH = System.getProperty("user.dir")+"//Config//config.properties";
    public static String getChromePathDriver() {
        return CHROMEDRIVERPATH;
    }
    public static String getConfigpath() {
        return CONFIGPATH;
    }

}
