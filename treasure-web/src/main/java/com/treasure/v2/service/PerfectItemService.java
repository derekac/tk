package com.treasure.v2.service;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.treasure.v2.dao.TbkPrefectItemDAO;
import com.treasure.v2.model.TbkPrefectItem;
import com.treasure.v2.vo.PerfectItem;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by derek on 4/22/17.
 */
@Component
public class PerfectItemService {

    private Logger logger = LoggerFactory.getLogger(PerfectItemService.class);


    public static Map<String, String> order_params;

    static {
        order_params = Maps.newHashMap();
        order_params.put("price", "price");
        order_params.put("volume", "volume");
        order_params.put("couponsRemain", "couponsRemain");
    }

    @Autowired
    private TbkPrefectItemDAO tbkPrefectItemDAO;


    public List<PerfectItem> getItem(ItemGetParam param) {
        List<PerfectItem> perfectItems = Lists.newArrayList();
        try {
            List<TbkPrefectItem> items = tbkPrefectItemDAO.selectItemsNotExpireByParams(getParams(param));
            if (CollectionUtils.isNotEmpty(items)) {
                for (TbkPrefectItem item : items) {
                    perfectItems.add(item.formatPerfectItem());
                }
            }
        } catch (Throwable e) {
            logger.error("", e);
        }
        return perfectItems;
    }

    public Map<String, String> getParams(ItemGetParam param) {
        Map params = Maps.newHashMap();
        params.put("query", param.getQuery());
        params.put("gid", param.getGid());
        if (StringUtils.isNotEmpty(param.getSort())) {
            List<String> sorts = Lists.newArrayList(Splitter.on("_").splitToList(param.getSort()));
            if (sorts.size() > 1) {
                String direction = sorts.get(sorts.size() - 1);
                if (("desc".equals(direction) || "asc".equals(direction)) && order_params.containsKey(sorts.get(0))) {
                    params.put("sortColumn", order_params.get(sorts.get(0)));
                    params.put("direction", direction);
                }
            }
        }
        if (param.getPlatform() != null) {
            if (param.getPlatform() == 1) {
                params.put("platform", "淘宝");
            } else if (param.getPlatform() == 2) {
                params.put("platform", "天猫");
            }
        }
        if (param.getPageNo() == null) {
            param.setPageNo(0);
        }
        if (param.getPageSize() == null) {
            param.setPageSize(20);
        }
        params.put("limit", param.getPageNo() * param.getPageSize());
        params.put("skip", param.getPageSize());
        return params;
    }

    public Integer getItemCount(ItemGetParam param) {
        try {
            Integer total = tbkPrefectItemDAO.getItemNotExpireByParamsTotal(getParams(param));
            return total;
        } catch (Throwable e) {
            logger.error("", e);
        }
        return 0;
    }

    public static class ItemGetParam {
        private String  query;
        private Long    gid;
        private String  sort;
        /**
         * 0.所有
         * 1.taobao
         * 2.tmall
         */
        private Integer platform;
        private Boolean isOverseas;
        private Integer startPrice;
        private Integer endPrice;
        private Integer pageNo;
        private Integer pageSize;

        public Integer getPlatform() {
            return platform;
        }

        public void setPlatform(Integer platform) {
            this.platform = platform;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public Long getGid() {
            return gid;
        }

        public void setGid(Long gid) {
            this.gid = gid;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }


        public Boolean getOverseas() {
            return isOverseas;
        }

        public void setOverseas(Boolean overseas) {
            isOverseas = overseas;
        }

        public Integer getStartPrice() {
            return startPrice;
        }

        public void setStartPrice(Integer startPrice) {
            this.startPrice = startPrice;
        }

        public Integer getEndPrice() {
            return endPrice;
        }

        public void setEndPrice(Integer endPrice) {
            this.endPrice = endPrice;
        }

        public Integer getPageNo() {
            return pageNo;
        }

        public void setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }
    }

}
