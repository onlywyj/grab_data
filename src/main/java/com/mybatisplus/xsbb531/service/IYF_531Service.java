package com.mybatisplus.xsbb531.service;

import com.mybatisplus.xsbb531.entity.YF_531;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WYJ
 * @since 2020-12-04
 */
public interface IYF_531Service extends IService<YF_531> {

    public List<String> findAll();

}
