package kr.ac.jejunu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.sql.SQLException;
import org.junit.Before;

public class ProductDaoTest {
    private ProductDao productDao;
    private DaoFactory daoFactory;

    public void setup() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContest(DaoFactory.class);
        productDao = applicationContext.getBean("productDao",ProductDao.class)
    }

    @Test
    public void get() throws SQLException, ClassNotFoundException {
        ProductDao productDao = new ProductDao();
        Long id = 1L;
        String title = "제주감귤";
        Integer price = 15000;

        Product product = productDao.get(id);
        assertEquals(id, product.getId());
        assertEquals(title, product.getTitle());
        assertEquals(price, product.getPrice());
    }
}
