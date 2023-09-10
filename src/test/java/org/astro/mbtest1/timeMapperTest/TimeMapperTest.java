package org.astro.mbtest1.timeMapperTest;

import org.astro.mbtest1.mappers.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TimeMapperTest {

    @Autowired
    private Mapper mapper;



    @Test
    public void timeMapperTest(){
        log.info(mapper.time());
    }
    
}
