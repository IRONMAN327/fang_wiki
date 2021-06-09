package com.ironman.wiki.serivce;

import com.ironman.wiki.domain.Test;
import com.ironman.wiki.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.selectByExample(null);
    }
}
