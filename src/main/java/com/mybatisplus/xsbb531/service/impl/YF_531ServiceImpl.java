package com.mybatisplus.xsbb531.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.mybatisplus.xsbb531.entity.YF_531;
import com.mybatisplus.xsbb531.mapper.YF_531Mapper;
import com.mybatisplus.xsbb531.service.IYF_531Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WYJ
 * @since 2020-12-04
 */
@Service
@DS("oracle")
public class YF_531ServiceImpl extends ServiceImpl<YF_531Mapper, YF_531> implements IYF_531Service {

    @Autowired
    private YF_531Mapper yf_531Mapper;

    @DS("oracle")
    @Override
    public List<String> findAll() {
        return yf_531Mapper.findAll();
    }
}
