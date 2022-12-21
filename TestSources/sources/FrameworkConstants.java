package sources;

public final class FrameworkConstants
{
    private FrameworkConstants()
    {}
    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"//Drivers//chromedriver";
    public static String getChromePathDriver() {
        return CHROMEDRIVERPATH;
    }

}
