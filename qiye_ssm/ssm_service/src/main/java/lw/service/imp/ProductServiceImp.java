package lw.service.imp;

import lw.service.ProductService;
import lw.dao.ProductDao;
import lw.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void save(Product product)  {
        productDao.save(product);
    }

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
