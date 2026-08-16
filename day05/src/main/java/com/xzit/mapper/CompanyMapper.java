package com.xzit.mapper;

import com.xzit.model.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyMapper {
    void insertList(@Param("list") List<Company> list);

    List<Company> selectByCity(@Param("addr") String addr);

    Double selectAvgSalByProvince(String province);

    int updateByCity(Company company);

    int deleteByIds(@Param("ids") List<Integer> ids);
}
