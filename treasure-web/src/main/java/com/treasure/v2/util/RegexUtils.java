package com.treasure.v2.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by derek on 16/9/23.
 */
public class RegexUtils {
    public static String regexString(String str,String regex){
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            return matcher.group(1);
        }
        return null;
    }
}
