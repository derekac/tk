package com.treasure.v2.dao.impl;

import com.ibatis.sqlmap.client.SqlMapExecutor;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.SqlMapClientCallback;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by derek on 16/4/7.
 */
public class BaseSqlMapClientDaoSupport extends SqlMapClientDaoSupport {
    public BaseSqlMapClientDaoSupport() {
    }

    public int batchInsert(final String statementName, final List<?> entities) throws DataAccessException {
        return ((Integer)this.getSqlMapClientTemplate().execute(new SqlMapClientCallback() {
            public Object doInSqlMapClient(SqlMapExecutor executor) throws SQLException {
                executor.startBatch();
                Iterator i$ = entities.iterator();

                while(i$.hasNext()) {
                    Object item = i$.next();
                    executor.insert(statementName, item);
                }

                return Integer.valueOf(executor.executeBatch());
            }
        })).intValue();
    }

    public int batchDelete(final String statementName, final List<?> entities) throws DataAccessException {
        return ((Integer)this.getSqlMapClientTemplate().execute(new SqlMapClientCallback() {
            public Object doInSqlMapClient(SqlMapExecutor executor) throws SQLException {
                executor.startBatch();
                Iterator i$ = entities.iterator();

                while(i$.hasNext()) {
                    Object item = i$.next();
                    executor.delete(statementName, item);
                }

                return Integer.valueOf(executor.executeBatch());
            }
        })).intValue();
    }

    public int batchUpdate(final String statementName, final List<?> entities) throws DataAccessException {
        return ((Integer)this.getSqlMapClientTemplate().execute(new SqlMapClientCallback() {
            public Object doInSqlMapClient(SqlMapExecutor executor) throws SQLException {
                executor.startBatch();
                Iterator i$ = entities.iterator();

                while(i$.hasNext()) {
                    Object item = i$.next();
                    executor.update(statementName, item);
                }

                return Integer.valueOf(executor.executeBatch());
            }
        })).intValue();
    }
}