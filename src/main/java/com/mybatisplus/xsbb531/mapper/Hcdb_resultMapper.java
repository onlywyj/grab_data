package com.mybatisplus.xsbb531.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisplus.xsbb531.entity.Hcdb_result;

import java.util.ArrayList;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WYJ
 * @since 2020-12-03
 */
public interface Hcdb_resultMapper extends BaseMapper<Hcdb_result> {

    /**
     * 增加
     */
    boolean addResult(Hcdb_result hcdb_result);

    /**
     * 更新
     */

    boolean updateResult(Hcdb_result hcdb_result);

    /**
     * 查询全部
     */

    ArrayList<Hcdb_result> selectAll();
}
