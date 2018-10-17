package info.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import info.example.repository.TestMapper;

@Service
@Transactional
public class TestService {

	@Autowired
	TestMapper testMapper;
	
    /* select dual */
    public String getDual() throws Exception{
        return testMapper.getDual();
    }
}
