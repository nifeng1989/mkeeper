package net.fengni.mkeeper.server.service;

import net.fengni.jdbc.query.Condition;
import net.fengni.jdbc.query.Limit;
import net.fengni.jdbc.query.Page;
import net.fengni.mkeeper.server.dao.CategoryDao;
import net.fengni.mkeeper.server.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fengni on 2016/5/9.
 */
@Service
public class CategoryService {
    @Autowired
    CategoryDao categoryDao;
    public Category get(int categoryId){
        return categoryDao.get(categoryId);
    }

    public int update(Category category){
        return categoryDao.update(category);
    }

    public int insert(Category category){
        return categoryDao.insert(category);
    }

    public void fillPage(Page<Category> page){
       categoryDao.fillPage(null,page);
    }

    public int delete(int id){
        return categoryDao.delete(id);
    }
}
