package com.kayak.newast.group.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 集团客户资产信息表
 * </p>
 *
 * @author 刘乐乐
 * @since 2022-05-05
 */
@TableName("GROUP_ASSET")
public class GroupAsset implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    /**
     * 资产类型 1:债券 2其他
     */
    @TableField("ASSET_TYPE")
    private String assetType;

    /**
     * 资产代码
     */
    @TableField("FTOOL_CODE")
    private String ftoolCode;

    /**
     * 资产名称
     */
    @TableField("FTOOL_NAME")
    private String ftoolName;

    /**
     * 系统内债券id
     */
    @TableField("BOND_ID")
    private String bondId;

    /**
     * 资产到期日
     */
    @TableField("END_DATE")
    private String endDate;

    /**
     * 发行人/发行主体
     */
    @TableField("PUBLISHER")
    private String publisher;

    /**
     * 风险状态(是否为风险贷款) 1是 0否
     */
    @TableField("RISK_STATE")
    private String riskState;

    /**
     * 风险处置进展
     */
    @TableField("RISK_DEAL_STATUS")
    private String riskDealStatus;

    /**
     * 表内业务: 1贷款、2债券(成本法)、3非标(持仓份额)
     */
    @TableField("ON_BALANCE_SHEET_BIZ")
    private String onBalanceSheetBiz;

    /**
     * 表内业务子分类余额
     */
    @TableField("SHEET_SUB_AMOUNT")
    private BigDecimal sheetSubAmount;

    /**
     * 表内业务余额
     */
    @TableField("SHEET_AMOUNT")
    private BigDecimal sheetAmount;

    /**
     * 表外业务余额
     */
    @TableField("OFF_BALANCE_SHEET_BIZ_AMOUNT")
    private BigDecimal offBalanceSheetBizAmount;

    /**
     * 当期新发放或收回情况: 1新发放信贷业务 2收回信贷业务 3新投资债券 4债券到期 5新发放信贷类业务 6收回类信贷业务
     */
    @TableField("CURRENT_SITUATION")
    private String currentSituation;

    /**
     * 当期新发放或收回情况金额
     */
    @TableField("CURRENT_SITUATION_AMOUNT")
    private BigDecimal currentSituationAmount;

    /**
     * 资产质量分类:  1不良资产 2关注类资产 3正常类资产
     */
    @TableField("ASSET_QUALITY")
    private String assetQuality;

    /**
     * 资产质量分类金额
     */
    @TableField("ASSET_QUALITY_AMOUNT")
    private BigDecimal assetQualityAmount;

    /**
     * 逾期情况: 1逾期60天以上资产 2逾期90天以上资产
     */
    @TableField("OVERDUE_SITUATION")
    private String overdueSituation;

    /**
     * 逾期情况金额
     */
    @TableField("OVERDUE_SITUATION_AMOUNT")
    private BigDecimal overdueSituationAmount;

    /**
     * 风险缓释措施分类: 1保证担保 2抵押担保 3质押担保 4信用类
     */
    @TableField("RISK_MITIGATION")
    private String riskMitigation;

    /**
     * 风险缓释措施分类金额
     */
    @TableField("RISK_MITIGATION_AMOUNT")
    private BigDecimal riskMitigationAmount;

    /**
     * 大额风险暴露情况:风险暴露总和
     */
    @TableField("LARGE_EXPOSURE_TOTAL")
    private String largeExposureTotal;

    /**
     * 大额风险暴露情况:占一级资本净额比例
     */
    @TableField("LARGE_EXPOSURE_RATE")
    private String largeExposureRate;

    @TableField("INPUTUSER")
    private String inputuser;

    @TableField("CRT_DATE")
    private String crtDate;

    @TableField("CRT_TIME")
    private String crtTime;


    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getFtoolCode() {
        return ftoolCode;
    }

    public void setFtoolCode(String ftoolCode) {
        this.ftoolCode = ftoolCode;
    }

    public String getFtoolName() {
        return ftoolName;
    }

    public void setFtoolName(String ftoolName) {
        this.ftoolName = ftoolName;
    }

    public String getBondId() {
        return bondId;
    }

    public void setBondId(String bondId) {
        this.bondId = bondId;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getRiskState() {
        return riskState;
    }

    public void setRiskState(String riskState) {
        this.riskState = riskState;
    }

    public String getRiskDealStatus() {
        return riskDealStatus;
    }

    public void setRiskDealStatus(String riskDealStatus) {
        this.riskDealStatus = riskDealStatus;
    }

    public String getOnBalanceSheetBiz() {
        return onBalanceSheetBiz;
    }

    public void setOnBalanceSheetBiz(String onBalanceSheetBiz) {
        this.onBalanceSheetBiz = onBalanceSheetBiz;
    }

    public BigDecimal getSheetSubAmount() {
        return sheetSubAmount;
    }

    public void setSheetSubAmount(BigDecimal sheetSubAmount) {
        this.sheetSubAmount = sheetSubAmount;
    }

    public BigDecimal getSheetAmount() {
        return sheetAmount;
    }

    public void setSheetAmount(BigDecimal sheetAmount) {
        this.sheetAmount = sheetAmount;
    }

    public BigDecimal getOffBalanceSheetBizAmount() {
        return offBalanceSheetBizAmount;
    }

    public void setOffBalanceSheetBizAmount(BigDecimal offBalanceSheetBizAmount) {
        this.offBalanceSheetBizAmount = offBalanceSheetBizAmount;
    }

    public String getCurrentSituation() {
        return currentSituation;
    }

    public void setCurrentSituation(String currentSituation) {
        this.currentSituation = currentSituation;
    }

    public BigDecimal getCurrentSituationAmount() {
        return currentSituationAmount;
    }

    public void setCurrentSituationAmount(BigDecimal currentSituationAmount) {
        this.currentSituationAmount = currentSituationAmount;
    }

    public String getAssetQuality() {
        return assetQuality;
    }

    public void setAssetQuality(String assetQuality) {
        this.assetQuality = assetQuality;
    }

    public BigDecimal getAssetQualityAmount() {
        return assetQualityAmount;
    }

    public void setAssetQualityAmount(BigDecimal assetQualityAmount) {
        this.assetQualityAmount = assetQualityAmount;
    }

    public String getOverdueSituation() {
        return overdueSituation;
    }

    public void setOverdueSituation(String overdueSituation) {
        this.overdueSituation = overdueSituation;
    }

    public BigDecimal getOverdueSituationAmount() {
        return overdueSituationAmount;
    }

    public void setOverdueSituationAmount(BigDecimal overdueSituationAmount) {
        this.overdueSituationAmount = overdueSituationAmount;
    }

    public String getRiskMitigation() {
        return riskMitigation;
    }

    public void setRiskMitigation(String riskMitigation) {
        this.riskMitigation = riskMitigation;
    }

    public BigDecimal getRiskMitigationAmount() {
        return riskMitigationAmount;
    }

    public void setRiskMitigationAmount(BigDecimal riskMitigationAmount) {
        this.riskMitigationAmount = riskMitigationAmount;
    }

    public String getLargeExposureTotal() {
        return largeExposureTotal;
    }

    public void setLargeExposureTotal(String largeExposureTotal) {
        this.largeExposureTotal = largeExposureTotal;
    }

    public String getLargeExposureRate() {
        return largeExposureRate;
    }

    public void setLargeExposureRate(String largeExposureRate) {
        this.largeExposureRate = largeExposureRate;
    }

    public String getInputuser() {
        return inputuser;
    }

    public void setInputuser(String inputuser) {
        this.inputuser = inputuser;
    }

    public String getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(String crtDate) {
        this.crtDate = crtDate;
    }

    public String getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(String crtTime) {
        this.crtTime = crtTime;
    }

    @Override
    public String toString() {
        return "GroupAsset{" +
        "id=" + id +
        ", assetType=" + assetType +
        ", ftoolCode=" + ftoolCode +
        ", ftoolName=" + ftoolName +
        ", bondId=" + bondId +
        ", endDate=" + endDate +
        ", publisher=" + publisher +
        ", riskState=" + riskState +
        ", riskDealStatus=" + riskDealStatus +
        ", onBalanceSheetBiz=" + onBalanceSheetBiz +
        ", sheetSubAmount=" + sheetSubAmount +
        ", sheetAmount=" + sheetAmount +
        ", offBalanceSheetBizAmount=" + offBalanceSheetBizAmount +
        ", currentSituation=" + currentSituation +
        ", currentSituationAmount=" + currentSituationAmount +
        ", assetQuality=" + assetQuality +
        ", assetQualityAmount=" + assetQualityAmount +
        ", overdueSituation=" + overdueSituation +
        ", overdueSituationAmount=" + overdueSituationAmount +
        ", riskMitigation=" + riskMitigation +
        ", riskMitigationAmount=" + riskMitigationAmount +
        ", largeExposureTotal=" + largeExposureTotal +
        ", largeExposureRate=" + largeExposureRate +
        ", inputuser=" + inputuser +
        ", crtDate=" + crtDate +
        ", crtTime=" + crtTime +
        "}";
    }
}
