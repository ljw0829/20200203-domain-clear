package com.domain.mapper;

import com.domain.Member.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public
interface RoleMapper {
    Role getRoleInfo(@Param("role") String role);
}

