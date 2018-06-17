package utilities;

import com.github.javafaker.Faker;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class ConfigRead {
    private static Properties defaultProps = new Properties();
    static {
        try {
            String currentDir = System.getProperty("user.dir");
            String filepath=currentDir+"/src/test/java/Config/config.properties";
            FileInputStream in = new FileInputStream(filepath);
            defaultProps.load(in);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        return defaultProps.getProperty(key);
    }
    /**
     * Sleeps current driver for specific time
     * @param milliSeconds
     */
    public static void sleep(int milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        }
        catch (InterruptedException ie){}
    }

    /**
     * generates random first name
     * @return random first name
     */
    public static String getFirstName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    /**
     * generates random last name
     * @return random last name
     */
    public static String getLasttName(){
        Faker faker = new Faker();
        return faker.name().lastName();
    }

    /**
     * gets today date
     * @return today date
     */
    public static String getTodayDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return formatter.format(date);
    }



}
