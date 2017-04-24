package com.treasure.v2.dao.impl;

import com.treasure.v2.dao.TbkGroupDAO;
import com.treasure.v2.model.TbkGroup;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TbkGroupDAOImpl extends TreasureSqlMapClientDaoSupport implements TbkGroupDAO {

    public TbkGroupDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Integer id) {
        TbkGroup _key = new TbkGroup();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tbk_group.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TbkGroup record) {
        getSqlMapClientTemplate().insert("tbk_group.insert", record);
    }

    public void insertSelective(TbkGroup record) {
        getSqlMapClientTemplate().insert("tbk_group.insertSelective", record);
    }

    public TbkGroup selectByPrimaryKey(Integer id) {
        TbkGroup _key = new TbkGroup();
        _key.setId(id);
        TbkGroup record = (TbkGroup) getSqlMapClientTemplate().queryForObject("tbk_group.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TbkGroup record) {
        int rows = getSqlMapClientTemplate().update("tbk_group.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(TbkGroup record) {
        int rows = getSqlMapClientTemplate().update("tbk_group.updateByPrimaryKey", record);
        return rows;
    }

    @Override
    public List<TbkGroup> selectAllGroup() {
        return getSqlMapClientTemplate().queryForList("tbk_group.selectAllGroup");
    }
}