package com.swisscom.customerclient.config;

import com.acme.customermasterdata.api.CustomerMasterDataClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerClientConfiguration {

    private final String url;
    private final String user;
    private final String password;

    public CustomerClientConfiguration(
            @Value("${customerclient.url}") String url,
            @Value("${customerclient.user}") String user,
            @Value("${customerclient.password}") String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Bean
    public CustomerMasterDataClient cmdc() {
        return new CustomerMasterDataClient(url, user, password);
    }
}
