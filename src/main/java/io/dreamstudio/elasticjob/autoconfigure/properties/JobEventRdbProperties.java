package io.dreamstudio.elasticjob.autoconfigure.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description
 * @Author ouyangxiangjun
 * @Date 2020/9/26 6:45 下午
 **/

@ConfigurationProperties(prefix = "elasticjob.rdb")
public class JobEventRdbProperties {

    private boolean isEnable;

    private String url;

    private String driverClassName;

    private String username;

    private String password;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
