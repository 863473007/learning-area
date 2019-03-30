package com.hef.spittr.service.imple;

import com.hef.spittr.dao.JNDIDao;
import com.hef.spittr.service.SpittlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class SpittlerServiceImpl implements SpittlerService {

    @Autowired
    private JNDIDao jndiDao;
    @Override
    public void getConnection() {
        try {
            Connection connection = jndiDao.getConnection();
            System.out.println(connection);
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
