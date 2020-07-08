package com.data2.salmon.core.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author leewow
 */
public class PropertiesUtil {

    public static void loader(Properties properties, InputStream in) {
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}