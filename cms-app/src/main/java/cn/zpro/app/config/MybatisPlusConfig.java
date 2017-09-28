package cn.zpro.app.config;

import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MybatisPlusConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    private MybatisSqlSessionFactoryBean sqlSessionFactory(){
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("");
        return sqlSessionFactoryBean;
    }
}
