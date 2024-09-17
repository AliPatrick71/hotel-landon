package edu.wgu.d387_sample_code;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageService {

    // Method to fetch message based on locale
    public String getMessage(String key, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        return bundle.getString(key);
    }
}