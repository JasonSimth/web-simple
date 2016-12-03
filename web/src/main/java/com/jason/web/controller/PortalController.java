package com.jason.web.controller;

import com.jason.web.biz.ActiveBiz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 门户 跳转
 */
@Controller
@RequestMapping("/portal")
public class PortalController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("#{cfgProp['env']}")
    public String env;

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpSession session;

    @Autowired
    ServletContext servletContext;

    @Autowired
    ActiveBiz activeBiz;

    @RequestMapping
    public String portal() {
        return "index";
    }


    @RequestMapping("/a")
    public String a() {
        logger.trace("trace 1");
        logger.debug("debug 2");
        logger.info("info 3");
        logger.warn("warn 4");
        logger.error("error 5");
        return "index";
    }

    @RequestMapping("哈哈")
    public String b(String param) {
        return "index";
    }

    @RequestMapping("/index")
    public String index(String name) {
        try {
            return activeBiz.getActive(name);
        } catch (Exception e) {
            e.printStackTrace();
            return "404";
        }
    }

}
