package techproed.utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class ConfigReader {



    //This class reads the configuration.properties file
    //Create Properties instance
    private static Properties properties;  //we need properties object to read configuration.properties file

    static {
        //path of the configuration file
        String path = "configuration.properties";

        try {
            //Opening configuration.properties file using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(path);

            properties = new Properties();
            properties.load(fileInputStream);       //load it, get file ready
            //close the file
            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //This method will get the key from configuration.properties file,
    //And return the value as String
    //We create this method to read the file
    public static String getProperty(String key){           //if key=url,  return value= "techproeducation.com
        String value=properties.getProperty(key);
        return value;
    }

//    ConfigReader.getProperty("browser") -->chrome

    //TEST IF LOGIC WORKS
// public static void main(String[] args) {
// System.out.println(properties.getProperty("qa_environment"));
// }


}