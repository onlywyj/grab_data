package com.mybatisplus.xsbb531.mapper;

import com.mybatisplus.xsbb531.entity.Wl_531;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WYJ
 * @since 2020-12-02
 */
public interface Wl_531Mapper extends BaseMapper<Wl_531> {

    /**
     * 查询所有物料
     */

    List<String> selectAllwlname();

}
