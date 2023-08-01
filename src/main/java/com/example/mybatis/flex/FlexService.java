package com.example.mybatis.flex;

import com.example.mybatis.flex.mapper.FlexMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional()
public class FlexService {

    @Autowired
    FlexMapper flexMapper;

    public List<FlexAccount> getAccount() {
        return flexMapper.selectAll();
    }

    public int batchInsertAccount(List<FlexAccount> list) {
        return flexMapper.insertBatch(list);
    }

}
