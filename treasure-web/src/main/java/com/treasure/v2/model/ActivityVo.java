package com.treasure.v2.model;

import org.joda.time.DateTime;

import java.util.Date;
import java.util.List;

public class ActivityVo extends Activity {
    private Item item;

    private List<ActivityDetail> activityDetails;
    private Date endTime = DateTime.now().plusDays(2).toDate();

    private Double rate;

    public Double getRate() {
        Double r = getPeople() * 1.0 / (item.getPrice() / 100) * 100;
        return Double.parseDouble(String.format("%.0f", r));
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public List<ActivityDetail> getActivityDetails() {
        return activityDetails;
    }

    public void setActivityDetails(List<ActivityDetail> activityDetails) {
        this.activityDetails = activityDetails;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Double r =1 * 1.0 / (6000 / 100) * 100;
        System.out.println(Double.parseDouble(String.format("%.0f", r)));
    }
}