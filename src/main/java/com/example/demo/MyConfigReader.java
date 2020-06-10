package com.example.demo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "db")
class DataBaseProperties {

    private String host;
    private int port;
    private String username;
    private String userpass;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    @RequestMapping("/getConnectionParam")
    public String showConnectionParam() {
        return "host " + host
                + " port " + port
                + " username " + username
                + " userpass " + userpass;
    }
}