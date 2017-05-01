package com.treasure.v2.dao.impl;

import com.treasure.v2.dao.TbkWeixinUserDAO;
import com.treasure.v2.model.TbkWeixinUser;
import org.springframework.stereotype.Component;

@Component
public class TbkWeixinUserDAOImpl extends TreasureSqlMapClientDaoSupport implements TbkWeixinUserDAO {

    public TbkWeixinUserDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(String nickName) {
        TbkWeixinUser _key = new TbkWeixinUser();
        _key.setNickName(nickName);
        int rows = getSqlMapClientTemplate().delete("tbk_weixin_user.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TbkWeixinUser record) {
        getSqlMapClientTemplate().insert("tbk_weixin_user.insert", record);
    }

    public void insertSelective(TbkWeixinUser record) {
        getSqlMapClientTemplate().insert("tbk_weixin_user.insertSelective", record);
    }

    public TbkWeixinUser selectByPrimaryKey(String nickName) {
        TbkWeixinUser _key = new TbkWeixinUser();
        _key.setNickName(nickName);
        TbkWeixinUser record = (TbkWeixinUser) getSqlMapClientTemplate().queryForObject("tbk_weixin_user.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TbkWeixinUser record) {
        int rows = getSqlMapClientTemplate().update("tbk_weixin_user.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(TbkWeixinUser record) {
        int rows = getSqlMapClientTemplate().update("tbk_weixin_user.updateByPrimaryKey", record);
        return rows;
    }
}