package com.treasure.v2.dao.impl;

import com.treasure.v2.dao.TbkJdUserDAO;
import com.treasure.v2.model.TbkJdUser;
import org.springframework.stereotype.Repository;

@Repository
public class TbkJdUserDAOImpl extends TreasureSqlMapClientDaoSupport implements TbkJdUserDAO {

    public TbkJdUserDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Long uid) {
        TbkJdUser _key = new TbkJdUser();
        _key.setUid(uid);
        int rows = getSqlMapClientTemplate().delete("tbk_jd_user.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TbkJdUser record) {
        getSqlMapClientTemplate().insert("tbk_jd_user.insert", record);
    }

    public void insertSelective(TbkJdUser record) {
        getSqlMapClientTemplate().insert("tbk_jd_user.insertSelective", record);
    }

    public TbkJdUser selectByPrimaryKey(Long uid) {
        TbkJdUser _key = new TbkJdUser();
        _key.setUid(uid);
        TbkJdUser record = (TbkJdUser) getSqlMapClientTemplate().queryForObject("tbk_jd_user.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TbkJdUser record) {
        int rows = getSqlMapClientTemplate().update("tbk_jd_user.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(TbkJdUser record) {
        int rows = getSqlMapClientTemplate().update("tbk_jd_user.updateByPrimaryKey", record);
        return rows;
    }
}