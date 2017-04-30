package com.treasure.v2.dao.impl;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.treasure.v2.dao.TbkPrefectItemDAO;
import com.treasure.v2.model.TbkPrefectItem;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TbkPrefectItemDAOImpl extends TreasureSqlMapClientDaoSupport implements TbkPrefectItemDAO {


    public TbkPrefectItemDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Integer id) {
        TbkPrefectItem _key = new TbkPrefectItem();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tbk_prefect_item.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TbkPrefectItem record) {
        getSqlMapClientTemplate().insert("tbk_prefect_item.insert", record);
    }

    public void insertSelective(TbkPrefectItem record) {
        getSqlMapClientTemplate().insert("tbk_prefect_item.insertSelective", record);
    }

    public TbkPrefectItem selectByPrimaryKey(Integer id) {
        TbkPrefectItem _key = new TbkPrefectItem();
        _key.setId(id);
        TbkPrefectItem record = (TbkPrefectItem) getSqlMapClientTemplate().queryForObject("tbk_prefect_item.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TbkPrefectItem record) {
        int rows = getSqlMapClientTemplate().update("tbk_prefect_item.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(TbkPrefectItem record) {
        int rows = getSqlMapClientTemplate().update("tbk_prefect_item.updateByPrimaryKey", record);
        return rows;
    }

    @Override
    public List<TbkPrefectItem> selectItemsByParams(Map<String, String> params) {
        return getSqlMapClientTemplate().queryForList("tbk_prefect_item.selectItemsByParams", params);
    }

    @Override
    public int getItemByParamsTotal(Map<String, String> params) {
        return (Integer) getSqlMapClientTemplate().queryForObject("tbk_prefect_item.getItemByParamsTotal", params);
    }

    @Override
    public List<TbkPrefectItem> selectByItemsPage(int pageNo, int pageSize) {
        Map map = new HashMap();
        map.put("limit", pageNo * pageSize);
        map.put("skip", pageSize);
        return getSqlMapClientTemplate().queryForList("tbk_prefect_item.selectByItemsPage", map);
    }

    @Override
    public TbkPrefectItem selectByItemId(Long ItemId) {
        TbkPrefectItem _key = new TbkPrefectItem();
        _key.setItemId(ItemId);
        TbkPrefectItem record = (TbkPrefectItem) getSqlMapClientTemplate().queryForObject("tbk_prefect_item.selectByItemId", _key);
        return record;
    }
}