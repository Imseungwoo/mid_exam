package kr.ac.jejunu;

import org.springframwork.context.annotation.Bean;
import org.springframwork.context.annotation.Configuration;

public class DaoFactory{
    @Bean
    public ProductDao getProductDao() {
        return new ProductDao(getConnectionMaker());
    }

    @Bean
    public ConnectionMaker getConnectionMaker() {
        return new JejuConnectionMaker();
    }
}