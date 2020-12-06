package com.mybatisplus.xsbb531.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.mybatisplus.xsbb531.entity.YF_531;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WYJ
 * @since 2020-12-04
 */
public interface YF_531Mapper extends BaseMapper<YF_531> {

    @DS("oracle")
    public List<String> findAll();

}
