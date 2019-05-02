package project.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileRead {
    public ConfigFileRead() {
    }

    /**
     * Returns the value of 'browser' key
     */
    public String readPropertyFile() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream("src/test/resources/config/config.properties");
            properties.load(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return properties.getProperty("browser");
    }
}
