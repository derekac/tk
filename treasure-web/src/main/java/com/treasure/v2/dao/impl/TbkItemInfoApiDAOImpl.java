package com.treasure.v2.dao.impl;

import com.treasure.v2.dao.TbkItemInfoApiDAO;
import com.treasure.v2.model.TbkItemInfoApi;
import org.springframework.stereotype.Component;

@Component
public class TbkItemInfoApiDAOImpl extends TreasureSqlMapClientDaoSupport implements TbkItemInfoApiDAO {

    public TbkItemInfoApiDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Long numId) {
        TbkItemInfoApi _key = new TbkItemInfoApi();
        _key.setNumId(numId);
        int rows = getSqlMapClientTemplate().delete("tbk_item_info_api.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TbkItemInfoApi record) {
        getSqlMapClientTemplate().insert("tbk_item_info_api.insert", record);
    }

    public void insertSelective(TbkItemInfoApi record) {
        getSqlMapClientTemplate().insert("tbk_item_info_api.insertSelective", record);
    }

    public TbkItemInfoApi selectByPrimaryKey(Long numId) {
        TbkItemInfoApi _key = new TbkItemInfoApi();
        _key.setNumId(numId);
        TbkItemInfoApi record = (TbkItemInfoApi) getSqlMapClientTemplate().queryForObject("tbk_item_info_api.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TbkItemInfoApi record) {
        int rows = getSqlMapClientTemplate().update("tbk_item_info_api.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(TbkItemInfoApi record) {
        int rows = getSqlMapClientTemplate().update("tbk_item_info_api.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }
}