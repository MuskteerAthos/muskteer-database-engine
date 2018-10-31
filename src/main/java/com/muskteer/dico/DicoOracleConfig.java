package com.muskteer.dico;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "spring.dico.database.oracle")
public class DicoOracleConfig implements DicoConfig {
    private String url;
    private String username;
    private String password;

    @Override
    public DataSource builder() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return null;
    }

}