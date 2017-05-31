package com.treasure.v2.dao.impl;


import com.treasure.v2.dao.TxrTbItemInfoDAO;
import com.treasure.v2.model.TxrTbItemInfo;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class TxrTbItemInfoDAOImpl extends TreasureSqlMapClientDaoSupport implements TxrTbItemInfoDAO {

    public TxrTbItemInfoDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Integer id) {
        TxrTbItemInfo _key = new TxrTbItemInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("txr_tb_item_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TxrTbItemInfo record) {
        getSqlMapClientTemplate().insert("txr_tb_item_info.insert", record);
    }

    public void insertSelective(TxrTbItemInfo record) {
        getSqlMapClientTemplate().insert("txr_tb_item_info.insertSelective", record);
    }

    public TxrTbItemInfo selectByPrimaryKey(Integer id) {
        TxrTbItemInfo _key = new TxrTbItemInfo();
        _key.setId(id);
        TxrTbItemInfo record = (TxrTbItemInfo) getSqlMapClientTemplate().queryForObject("txr_tb_item_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TxrTbItemInfo record) {
        int rows = getSqlMapClientTemplate().update("txr_tb_item_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKeyWithBLOBs(TxrTbItemInfo record) {
        int rows = getSqlMapClientTemplate().update("txr_tb_item_info.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    public int updateByPrimaryKeyWithoutBLOBs(TxrTbItemInfo record) {
        int rows = getSqlMapClientTemplate().update("txr_tb_item_info.updateByPrimaryKey", record);
        return rows;
    }

    @Override
    public TxrTbItemInfo selectByItemId(Long itemId) {
        TxrTbItemInfo _key = new TxrTbItemInfo();
        _key.setItemId(itemId);
        TxrTbItemInfo record = (TxrTbItemInfo) getSqlMapClientTemplate().queryForObject("txr_tb_item_info.selectByItemId", _key);
        return record;
    }
}