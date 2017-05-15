package com.treasure.v2.dao.impl;

import com.treasure.v2.dao.TbkItemDetailDAO;
import com.treasure.v2.model.TbkItemDetail;
import org.springframework.stereotype.Component;

@Component
public class TbkItemDetailDAOImpl extends TreasureSqlMapClientDaoSupport implements TbkItemDetailDAO {

    public TbkItemDetailDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Long itemId) {
        TbkItemDetail _key = new TbkItemDetail();
        _key.setItemId(itemId);
        int rows = getSqlMapClientTemplate().delete("tbk_item_detail.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TbkItemDetail record) {
        getSqlMapClientTemplate().insert("tbk_item_detail.insert", record);
    }

    public void insertSelective(TbkItemDetail record) {
        getSqlMapClientTemplate().insert("tbk_item_detail.insertSelective", record);
    }

    public TbkItemDetail selectByPrimaryKey(Long itemId) {
        TbkItemDetail _key = new TbkItemDetail();
        _key.setItemId(itemId);
        TbkItemDetail record = (TbkItemDetail) getSqlMapClientTemplate().queryForObject("tbk_item_detail.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TbkItemDetail record) {
        int rows = getSqlMapClientTemplate().update("tbk_item_detail.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKeyWithBLOBs(TbkItemDetail record) {
        int rows = getSqlMapClientTemplate().update("tbk_item_detail.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    public int updateByPrimaryKeyWithoutBLOBs(TbkItemDetail record) {
        int rows = getSqlMapClientTemplate().update("tbk_item_detail.updateByPrimaryKey", record);
        return rows;
    }
}