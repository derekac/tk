package com.treasure.v2.dao.impl;

import com.treasure.v2.dao.TxrTbItemRateDAO;
import com.treasure.v2.model.TxrTbItemRate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class TxrTbItemRateDAOImpl extends TreasureSqlMapClientDaoSupport implements TxrTbItemRateDAO {

    public TxrTbItemRateDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Integer id) {
        TxrTbItemRate _key = new TxrTbItemRate();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("txr_tb_item_rate.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TxrTbItemRate record) {
        getSqlMapClientTemplate().insert("txr_tb_item_rate.insert", record);
    }

    public void insertSelective(TxrTbItemRate record) {
        getSqlMapClientTemplate().insert("txr_tb_item_rate.insertSelective", record);
    }

    public TxrTbItemRate selectByPrimaryKey(Integer id) {
        TxrTbItemRate _key = new TxrTbItemRate();
        _key.setId(id);
        TxrTbItemRate record = (TxrTbItemRate) getSqlMapClientTemplate().queryForObject("txr_tb_item_rate.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TxrTbItemRate record) {
        int rows = getSqlMapClientTemplate().update("txr_tb_item_rate.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKeyWithBLOBs(TxrTbItemRate record) {
        int rows = getSqlMapClientTemplate().update("txr_tb_item_rate.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    public int updateByPrimaryKeyWithoutBLOBs(TxrTbItemRate record) {
        int rows = getSqlMapClientTemplate().update("txr_tb_item_rate.updateByPrimaryKey", record);
        return rows;
    }

    @Override
    public TxrTbItemRate selectByItemId(Long ItemId) {
        TxrTbItemRate _key = new TxrTbItemRate();
        _key.setItemId(ItemId);
        TxrTbItemRate record = (TxrTbItemRate) getSqlMapClientTemplate().queryForObject("txr_tb_item_rate.selectByItemId", _key);
        return record;
    }
}