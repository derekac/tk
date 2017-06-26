package com.treasure.v2.dao.impl;

import com.treasure.v2.dao.TxrTbShopInfoDAO;
import com.treasure.v2.model.TxrTbShopInfo;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class TxrTbShopInfoDAOImpl extends TreasureSqlMapClientDaoSupport implements TxrTbShopInfoDAO {

    public TxrTbShopInfoDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Long id) {
        TxrTbShopInfo _key = new TxrTbShopInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("txr_tb_shop_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(TxrTbShopInfo record) {
        getSqlMapClientTemplate().insert("txr_tb_shop_info.insert", record);
    }

    public void insertSelective(TxrTbShopInfo record) {
        getSqlMapClientTemplate().insert("txr_tb_shop_info.insertSelective", record);
    }

    public TxrTbShopInfo selectByPrimaryKey(Long id) {
        TxrTbShopInfo _key = new TxrTbShopInfo();
        _key.setId(id);
        TxrTbShopInfo record = (TxrTbShopInfo) getSqlMapClientTemplate().queryForObject("txr_tb_shop_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByPrimaryKeySelective(TxrTbShopInfo record) {
        int rows = getSqlMapClientTemplate().update("txr_tb_shop_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKeyWithBLOBs(TxrTbShopInfo record) {
        int rows = getSqlMapClientTemplate().update("txr_tb_shop_info.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    public int updateByPrimaryKeyWithoutBLOBs(TxrTbShopInfo record) {
        int rows = getSqlMapClientTemplate().update("txr_tb_shop_info.updateByPrimaryKey", record);
        return rows;
    }

    @Override
    public TxrTbShopInfo selectByShopId(Long shopID) {
        TxrTbShopInfo _key = new TxrTbShopInfo();
        _key.setShopId(shopID);
        TxrTbShopInfo record = (TxrTbShopInfo) getSqlMapClientTemplate().queryForObject("txr_tb_shop_info.selectByShopId", _key);
        return record;
    }

    @Override
    public TxrTbShopInfo selectByShopName(String shopName) {
        TxrTbShopInfo _key = new TxrTbShopInfo();
        _key.setShopName(shopName);
        TxrTbShopInfo record = (TxrTbShopInfo) getSqlMapClientTemplate().queryForObject("txr_tb_shop_info.selectByShopName", _key);
        return record;
    }
}