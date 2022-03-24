package constants;

public class PathResources {

    private static String PATH_DRIVER = "./src/test/resources/driver/chromedriver";
    private static String TYPE_DRIVER = "webdriver.chrome.driver";
    private static String URL = "https://www.alten.es/";
    private static String COOKIE = "//*[@id=\"tarteaucitronPersonalize2\"]";
    private static String JOB_PAGE_BUTTON_PATH = "/html/body/div[5]/div[2]/div/a";
    private static String PATH_TITTLE_REGISTRATION_PAGE = "#site-content > div.alten2018_header > div.content > h1";
    private static String PATH_NEWS_PAGE = "#menu-item-6128 > a";
    private static String PATH_TITTLE_NEWS_PAGE = "#site-content > div.alten2018_header > div.content > h1";

    public PathResources(String PATH_DRIVER, String TYPE_DRIVER, String URL, String COOKIE, String JOB_PAGE_BUTTON_PATH, String PATH_TITTLE_REGISTRATION_PAGE,
                            String PATH_NEWS_PAGE, String PATH_TITTLE_NEWS_PAGE) {

        this.PATH_DRIVER = PATH_DRIVER;
        this.TYPE_DRIVER = TYPE_DRIVER;
        this.URL = URL;
        this.COOKIE = COOKIE;
        this.JOB_PAGE_BUTTON_PATH = JOB_PAGE_BUTTON_PATH;
        this.PATH_TITTLE_REGISTRATION_PAGE = PATH_TITTLE_REGISTRATION_PAGE;
        this.PATH_NEWS_PAGE = PATH_NEWS_PAGE;
        this.PATH_TITTLE_NEWS_PAGE = PATH_TITTLE_NEWS_PAGE;
    }

    public static String getPATH_TITTLE_NEWS_PAGE() {
        return PATH_TITTLE_NEWS_PAGE;
    }

    public static String getPATH_DRIVER() {
        return PATH_DRIVER;
    }

    public static String getTYPE_DRIVER() {
        return TYPE_DRIVER;
    }

    public static String getURL() {
        return URL;
    }

    public static String getCOOKIE() {
        return COOKIE;
    }

    public static String getJOB_PAGE_BUTTON_PATH() {
        return JOB_PAGE_BUTTON_PATH;
    }

    public static String getPATH_TITTLE_REGISTRATION_PAGE() {
        return PATH_TITTLE_REGISTRATION_PAGE;
    }

    public static String getPATH_NEWS_PAGE() {
        return PATH_NEWS_PAGE;
    }
}
