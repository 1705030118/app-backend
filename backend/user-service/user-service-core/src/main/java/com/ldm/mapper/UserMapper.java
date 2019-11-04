package com.ldm.mapper;
import com.ldm.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from test_user where user_id=#{userId}")
    UserDTO selectUser(int userId);
}
