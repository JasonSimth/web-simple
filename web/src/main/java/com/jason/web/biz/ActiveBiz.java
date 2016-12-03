package com.jason.web.biz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * JasonSimth simple-biz 一个简单的biz
 */
@Component
public class ActiveBiz {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("#{cfgProp['env']}")
    private String env;

    public String getActive(String param) {
        if (param != null && env.equals(param)) {
            logger.info("param" + param);
        } else {
            logger.info("param is null");
        }

        /*//案例1
        long now = System.currentTimeMillis();
        String s = String.format("%tR", now);   //输出当前时间的小时和分钟
        // 格式化输出结果"09:22"

        //案例2
        Date d = new Date(now);
        s = String.format("%tD", d);   //输出当前时间的month/day/year
        // 格式化输出结果"11/05/15"*/

        /*String str = null;
            str = String.format("Hi,%s", "王力");
            logger.info(str);
            str = String.format("Hi,%s:%s.%s", "王南", "王力", "王张");
            System.out.printf(str);
            System.out.printf("字母a的大写是：%c %n", 'A');
            System.out.printf("3>7的结果是：%b %n", 3 > 7);
            System.out.printf("100的一半是：%d %n", 100 / 2);
            System.out.printf("100的16进制数是：%x %n", 100);
            System.out.printf("100的8进制数是：%o %n", 100);
            System.out.printf("50元的书打8.5折扣是：%f 元%n", 50 * 0.85);
            System.out.printf("上面价格的16进制数是：%a %n", 50 * 0.85);
            System.out.printf("上面价格的指数表示：%e %n", 50 * 0.85);
            System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50 * 0.85);
            System.out.printf("上面的折扣是%d%% %n", 85);
            System.out.printf("字母A的散列码是：%h %n", 'A');*/

        return "index";
    }
}
