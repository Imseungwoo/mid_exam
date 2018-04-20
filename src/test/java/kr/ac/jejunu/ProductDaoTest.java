package kr.ac.jejunu;

import org.junit.Test;

import java.sql.SQLException;
import org.junit.Before;

public class ProductDaoTest {
    private ProductDao productDao;
    private DaoFactory daoFactory;
//    private HallaProductDao hallaProductDao;

    public void setup() {
        productDao = daoFactory.getProductDao();
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

//    @Test
//    public void hallaGet() throws SQLException, ClassNotFoundException {
//        Long id = 1L;
//        Product product = hallaProductDao.hallaGet(id);
//        assertThat(product.getId(), is(1));
//        assertThat(product.getTitle(), is("제주감귤"));
//        assertThat(product.getPrice(), is(15000));
//    }

//    @Test
//    public void hallaAdd() throws  SQLException, ClassNotFoundException {
//        Product product = new Product();
//        product.setTitle("한라봉");
//        product.setPrice(30000);
//        Long id = hallaProductDao.insert(product);
//
//        Product insertedProduct = hallaUserDao.get(id);
//        assertThat(insertedProduct.getId(), is(id));
//        assertThat(insertedProduct.getTitle(), is(product.getTitle()));
//        assertThat(insertedProduct.getPrice(), is(product.getPrice));
//    }
}
