package com.treasure.v2.dao.impl;

import com.treasure.v2.dao.TbkCategoryGroupDAO;
import com.treasure.v2.model.TbkCategoryGroup;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TbkCategoryGroupDAOImpl extends TreasureSqlMapClientDaoSupport implements TbkCategoryGroupDAO {

    public TbkCategoryGroupDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Integer id) {
        TbkCategoryGroup _key = new TbkCategoryGroup();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tbk_category_group.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TbkCategoryGroup record) {
        getSqlMapClientTemplate().insert("tbk_category_group.insert", record);
    }

    public void insertSelective(TbkCategoryGroup record) {
        getSqlMapClientTemplate().insert("tbk_category_group.insertSelective", record);
    }

    public TbkCategoryGroup selectByPrimaryKey(Integer id) {
        TbkCategoryGroup _key = new TbkCategoryGroup();
        _key.setId(id);
        TbkCategoryGroup record = (TbkCategoryGroup) getSqlMapClientTemplate().queryForObject("tbk_category_group.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TbkCategoryGroup record) {
        int rows = getSqlMapClientTemplate().update("tbk_category_group.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(TbkCategoryGroup record) {
        int rows = getSqlMapClientTemplate().update("tbk_category_group.updateByPrimaryKey", record);
        return rows;
    }

    @Override
    public List<TbkCategoryGroup> selectAllCategoryGroup() {
        return getSqlMapClientTemplate().queryForList("tbk_category_group.selectAllCategoryGroup");
    }

    @Override
    public List<TbkCategoryGroup> selectParams(TbkCategoryGroup params) {
        return (List<TbkCategoryGroup>) getSqlMapClientTemplate().queryForList("tbk_category_group.selectParams", params);
    }

    @Override
    public List<TbkCategoryGroup> selectRankingByWeight() {
        return (List<TbkCategoryGroup>) getSqlMapClientTemplate().queryForList("tbk_category_group.selectRankingByWeight");
    }
}