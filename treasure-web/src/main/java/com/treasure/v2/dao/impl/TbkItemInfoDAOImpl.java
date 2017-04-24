package com.treasure.v2.dao.impl;

import com.treasure.v2.dao.TbkItemInfoDAO;
import com.treasure.v2.model.TbkItemInfo;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class TbkItemInfoDAOImpl extends TreasureSqlMapClientDaoSupport implements TbkItemInfoDAO {

    public TbkItemInfoDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Long numId) {
        TbkItemInfo _key = new TbkItemInfo();
        _key.setNumId(numId);
        int rows = getSqlMapClientTemplate().delete("tbk_item_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TbkItemInfo record) {
        getSqlMapClientTemplate().insert("tbk_item_info.insert", record);
    }

    public void insertSelective(TbkItemInfo record) {
        getSqlMapClientTemplate().insert("tbk_item_info.insertSelective", record);
    }

    public TbkItemInfo selectByPrimaryKey(Long numId) {
        TbkItemInfo _key = new TbkItemInfo();
        _key.setNumId(numId);
        TbkItemInfo record = (TbkItemInfo) getSqlMapClientTemplate().queryForObject("tbk_item_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TbkItemInfo record) {
        int rows = getSqlMapClientTemplate().update("tbk_item_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKeyWithBLOBs(TbkItemInfo record) {
        int rows = getSqlMapClientTemplate().update("tbk_item_info.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    public int updateByPrimaryKeyWithoutBLOBs(TbkItemInfo record) {
        int rows = getSqlMapClientTemplate().update("tbk_item_info.updateByPrimaryKey", record);
        return rows;
    }
}