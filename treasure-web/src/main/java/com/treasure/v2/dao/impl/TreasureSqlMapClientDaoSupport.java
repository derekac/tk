package com.treasure.v2.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

import javax.annotation.PostConstruct;

/**
 * @author kevin
 */
public class TreasureSqlMapClientDaoSupport extends BaseSqlMapClientDaoSupport {

  @Autowired
  @Qualifier("expressSqlMapClientTemplate")
  private SqlMapClientTemplate sqlMapClientTemplate = new SqlMapClientTemplate();

  @PostConstruct
  public void init() {
    setSqlMapClientTemplate(sqlMapClientTemplate);
  }
}
