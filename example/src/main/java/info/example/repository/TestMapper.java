package info.example.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

	public String getDual() throws Exception;
}
