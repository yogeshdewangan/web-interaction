package utilities;
import java.io.*;
import java.util.Properties;

public class PropertyLoader {
    private static final String PROPERTY_FILE ="C:\\Projects\\web-interaction\\src\\main\\java\\resources\\application.properties";

    private PropertyLoader(){}

    public static String loadProperties(String propertyName){
        Properties properties = new Properties();
        try {
            FileReader reader=new FileReader(PROPERTY_FILE);
            properties.load(reader);

        }
        catch (IOException e){
            e.printStackTrace();
        }

        String value="";
        if (propertyName!=null){
            value = properties.getProperty(propertyName);
        }
        return value;
    }


}
