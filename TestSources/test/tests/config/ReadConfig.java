package config;

import sources.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.ConnectIOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;


public final class ReadConfig {
    private ReadConfig()
    {}

    private static Properties prop = new Properties();
    private static final Map<String,String> CONFIGMAP = new HashMap<>();

    static {
        Properties prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(FrameworkConstants.getConfigpath());
            prop.load(fis);

//            for (Map.Entry<Object,Object> entry : prop.entrySet())
//            {
//                CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()));
//            }
            prop.entrySet().forEach(entry->CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue())));
        } catch (FileNotFoundException e) {
            System.out.println("Config file not found. Check name and path");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Check config file format. key/value must not be null");
            e.printStackTrace();
        } catch (Exception e)
        {
            System.out.println("Check config file format. key/value must not be null");
        }
    }

    public static String getKey(String key) throws Exception {


        String value = prop.getProperty(key);
        if (value == null)
        {
            throw new Exception("Property name " + key + " is not found. Check config file in Configs folder.");
        }
        return value;
    }

    public static String get(String key) throws Exception {
        if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))) {
            throw new Exception("Key or value is null. Check config file");
        }
        else{
            return CONFIGMAP.get(key);
        }

    }

}
