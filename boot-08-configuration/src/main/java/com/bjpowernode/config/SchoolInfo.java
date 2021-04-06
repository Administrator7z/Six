package com.bjpowernode.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ConfigurationProperties: 获取配置文件中的数据，封装给java对象的属性
 *     prefix: 表示配置文件中的哪部分数据
 *             前缀的值.属性名称 == 配置文件的key
 */
@Component
@ConfigurationProperties(prefix = "school")
public class SchoolInfo {
    private String name;
    private String site;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SchoolInfo{" +
                "name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
