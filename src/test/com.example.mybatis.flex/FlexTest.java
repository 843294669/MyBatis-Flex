package com.example.mybatis.flex;

import com.mybatisflex.core.row.Db;
import com.mybatisflex.core.row.Row;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class FlexTest {

    @Autowired
    FlexService flexService;

    @Test
    public void testGetAccount() {
        System.out.println(flexService.getAccount());
    }

    @Test
    public void testInsertAccount() {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            FlexAccount account = new FlexAccount();
            account.setUserName("name" + i);
            account.setAge(i);
            account.setBirthday(new Date());
            list.add(account);
        }
        flexService.batchInsertAccount(list);
    }

    @Test
    public void testDbRow() {
        Row row = new Row();
        row.set("user_name", "db row");
        Db.insert("tb_account", row);
    }
}
