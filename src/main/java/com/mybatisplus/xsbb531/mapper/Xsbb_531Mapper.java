package com.mybatisplus.xsbb531.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisplus.xsbb531.entity.Xsbb_531;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WYJ
 * @since 2020-12-02
 */
public interface Xsbb_531Mapper extends BaseMapper<Xsbb_531> {

    /**
     * 查询531报表中的所有生产厂家
     */
    List<String> selectAllsccj();

    /**
     * 获得最终的结果
     */
    List<Map<Object,Object>> querySfslAndJshj(@Param("xszz") String xszz);

    /**
     * 查询条数
     */
    int counts(@Param("xszz") String xszz);

}
