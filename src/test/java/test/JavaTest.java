package test;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaTest {


    @Test
    public void regEx(){
        String regEx = "[A-Za-z0-9_-]+";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher("42001258136053009814-0002");
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        System.out.println(rs);
    }
}
