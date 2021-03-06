package suda.sudamodweather.dao.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "ALARMS".
 */
public class Alarms implements java.io.Serializable {

    private String alarmContent;
    private String alarmId;
    private String alarmLevelNo;
    private String alarmLevelNoDesc;
    private String alarmType;
    private String alarmTypeDesc;
    private String publishTime;
    private String areaid;
    private String areaName;

    public Alarms() {
    }

    public Alarms(String alarmContent, String alarmId, String alarmLevelNo, String alarmLevelNoDesc, String alarmType, String alarmTypeDesc, String publishTime, String areaid, String areaName) {
        this.alarmContent = alarmContent;
        this.alarmId = alarmId;
        this.alarmLevelNo = alarmLevelNo;
        this.alarmLevelNoDesc = alarmLevelNoDesc;
        this.alarmType = alarmType;
        this.alarmTypeDesc = alarmTypeDesc;
        this.publishTime = publishTime;
        this.areaid = areaid;
        this.areaName = areaName;
    }

    public String getAlarmContent() {
        return alarmContent;
    }

    public void setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent;
    }

    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public String getAlarmLevelNo() {
        return alarmLevelNo;
    }

    public void setAlarmLevelNo(String alarmLevelNo) {
        this.alarmLevelNo = alarmLevelNo;
    }

    public String getAlarmLevelNoDesc() {
        return alarmLevelNoDesc;
    }

    public void setAlarmLevelNoDesc(String alarmLevelNoDesc) {
        this.alarmLevelNoDesc = alarmLevelNoDesc;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public String getAlarmTypeDesc() {
        return alarmTypeDesc;
    }

    public void setAlarmTypeDesc(String alarmTypeDesc) {
        this.alarmTypeDesc = alarmTypeDesc;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

}
