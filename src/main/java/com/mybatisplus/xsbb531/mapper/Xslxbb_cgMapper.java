package com.mybatisplus.xsbb531.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisplus.xsbb531.entity.Xslxbb_cg;
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
public interface Xslxbb_cgMapper extends BaseMapper<Xslxbb_cg> {

    /**
     * 查询所有结果，返回 销售流向报表对象
     */
    List<Xslxbb_cg> queryBykhOrwlOrsccj(@Param("xsgs") String xsgs,@Param("ddkh") List<String> ddkh, @Param("tymc") List<String> tymc, @Param("sccj") List<String> sccj);

    /**
     *  查询数量和折扣后含税金额，返回 相加后的结果
     */
    List<Map<Object,Object>> querySlAndZkhsje(@Param("xsgs") String xsgs, @Param("ddkh") List<String> ddkh, @Param("tymc") List<String> tymc, @Param("sccj") List<String> sccj);

    /**
     * 查询条数
     */

    int counts(@Param("xsgs") String xsgs, @Param("ddkh") List<String> ddkh, @Param("tymc") List<String> tymc, @Param("sccj") List<String> sccj);

}
