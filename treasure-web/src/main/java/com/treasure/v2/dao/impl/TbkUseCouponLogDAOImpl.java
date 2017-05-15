package com.treasure.v2.dao.impl;

import com.treasure.v2.dao.TbkUseCouponLogDAO;
import com.treasure.v2.model.TbkUseCouponLog;
import org.springframework.stereotype.Component;

@Component
public class TbkUseCouponLogDAOImpl extends TreasureSqlMapClientDaoSupport implements TbkUseCouponLogDAO {

    public TbkUseCouponLogDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Integer id) {
        TbkUseCouponLog _key = new TbkUseCouponLog();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tbk_use_coupon_log.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TbkUseCouponLog record) {
        getSqlMapClientTemplate().insert("tbk_use_coupon_log.insert", record);
    }

    public void insertSelective(TbkUseCouponLog record) {
        getSqlMapClientTemplate().insert("tbk_use_coupon_log.insertSelective", record);
    }

    public TbkUseCouponLog selectByPrimaryKey(Integer id) {
        TbkUseCouponLog _key = new TbkUseCouponLog();
        _key.setId(id);
        TbkUseCouponLog record = (TbkUseCouponLog) getSqlMapClientTemplate().queryForObject("tbk_use_coupon_log.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TbkUseCouponLog record) {
        int rows = getSqlMapClientTemplate().update("tbk_use_coupon_log.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(TbkUseCouponLog record) {
        int rows = getSqlMapClientTemplate().update("tbk_use_coupon_log.updateByPrimaryKey", record);
        return rows;
    }
}