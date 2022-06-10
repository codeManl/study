package com.kayak.newast.group.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 刘乐乐
 * @since 2022-05-18
 */
@TableName("GROUP_IMPORT")
public class GroupImport implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.ASSIGN_ID)
    private BigDecimal id;

    @TableField("IMPORT_DATE")
    private String importDate;

    @TableField("SETTLE_DATE")
    private String settleDate;

    @TableField("LINE")
    private BigDecimal line;

    @TableField("ACCOUNT_NAME")
    private String accountName;

    @TableField("DIRECTION")
    private String direction;

    @TableField("CHANGE_AMOUNT")
    private BigDecimal changeAmount;

    @TableField("ASSET_TYPE")
    private String assetType;

    @TableField("MARKET_CODE")
    private String marketCode;

    @TableField("FTOOL_CODE")
    private String ftoolCode;

    @TableField("FTOOL_NAME")
    private String ftoolName;

    @TableField("RISK_STATE")
    private String riskState;

    @TableField("RISK_DEAL_STATUS")
    private String riskDealStatus;

    @TableField("IS_ON_BALANCE_SHEET")
    private String isOnBalanceSheet;

    @TableField("ON_BALANCE_SHEET_TYPE")
    private String onBalanceSheetType;

    @TableField("ASSET_QUALITY")
    private String assetQuality;

    @TableField("END_DATE")
    private String endDate;

    @TableField("RISK_MITIGATION")
    private String riskMitigation;

    @TableField("UN_ASSET_TYPE")
    private String unAssetType;

    @TableField("UN_CHANGE_POSITION")
    private BigDecimal unChangePosition;

    @TableField("UN_FACE_VALUE")
    private BigDecimal unFaceValue;

    @TableField("UN_ACCRUEDINCOMECHG")
    private BigDecimal unAccruedincomechg;

    @TableField("UN_EQUITY_CLASS")
    private String unEquityClass;

    @TableField("UN_VALUATION_AMOUNT")
    private BigDecimal unValuationAmount;

    @TableField("IS_RELATED")
    private String isRelated;

    @TableField("RELATED_FULL_NAME")
    private String relatedFullName;


    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getImportDate() {
        return importDate;
    }

    public void setImportDate(String importDate) {
        this.importDate = importDate;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public BigDecimal getLine() {
        return line;
    }

    public void setLine(BigDecimal line) {
        this.line = line;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public BigDecimal getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(BigDecimal changeAmount) {
        this.changeAmount = changeAmount;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
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

    public String getIsOnBalanceSheet() {
        return isOnBalanceSheet;
    }

    public void setIsOnBalanceSheet(String isOnBalanceSheet) {
        this.isOnBalanceSheet = isOnBalanceSheet;
    }

    public String getOnBalanceSheetType() {
        return onBalanceSheetType;
    }

    public void setOnBalanceSheetType(String onBalanceSheetType) {
        this.onBalanceSheetType = onBalanceSheetType;
    }

    public String getAssetQuality() {
        return assetQuality;
    }

    public void setAssetQuality(String assetQuality) {
        this.assetQuality = assetQuality;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRiskMitigation() {
        return riskMitigation;
    }

    public void setRiskMitigation(String riskMitigation) {
        this.riskMitigation = riskMitigation;
    }

    public String getUnAssetType() {
        return unAssetType;
    }

    public void setUnAssetType(String unAssetType) {
        this.unAssetType = unAssetType;
    }

    public BigDecimal getUnChangePosition() {
        return unChangePosition;
    }

    public void setUnChangePosition(BigDecimal unChangePosition) {
        this.unChangePosition = unChangePosition;
    }

    public BigDecimal getUnFaceValue() {
        return unFaceValue;
    }

    public void setUnFaceValue(BigDecimal unFaceValue) {
        this.unFaceValue = unFaceValue;
    }

    public BigDecimal getUnAccruedincomechg() {
        return unAccruedincomechg;
    }

    public void setUnAccruedincomechg(BigDecimal unAccruedincomechg) {
        this.unAccruedincomechg = unAccruedincomechg;
    }

    public String getUnEquityClass() {
        return unEquityClass;
    }

    public void setUnEquityClass(String unEquityClass) {
        this.unEquityClass = unEquityClass;
    }

    public BigDecimal getUnValuationAmount() {
        return unValuationAmount;
    }

    public void setUnValuationAmount(BigDecimal unValuationAmount) {
        this.unValuationAmount = unValuationAmount;
    }

    public String getIsRelated() {
        return isRelated;
    }

    public void setIsRelated(String isRelated) {
        this.isRelated = isRelated;
    }

    public String getRelatedFullName() {
        return relatedFullName;
    }

    public void setRelatedFullName(String relatedFullName) {
        this.relatedFullName = relatedFullName;
    }

    @Override
    public String toString() {
        return "GroupImport{" +
        "id=" + id +
        ", importDate=" + importDate +
        ", settleDate=" + settleDate +
        ", line=" + line +
        ", accountName=" + accountName +
        ", direction=" + direction +
        ", changeAmount=" + changeAmount +
        ", assetType=" + assetType +
        ", marketCode=" + marketCode +
        ", ftoolCode=" + ftoolCode +
        ", ftoolName=" + ftoolName +
        ", riskState=" + riskState +
        ", riskDealStatus=" + riskDealStatus +
        ", isOnBalanceSheet=" + isOnBalanceSheet +
        ", onBalanceSheetType=" + onBalanceSheetType +
        ", assetQuality=" + assetQuality +
        ", endDate=" + endDate +
        ", riskMitigation=" + riskMitigation +
        ", unAssetType=" + unAssetType +
        ", unChangePosition=" + unChangePosition +
        ", unFaceValue=" + unFaceValue +
        ", unAccruedincomechg=" + unAccruedincomechg +
        ", unEquityClass=" + unEquityClass +
        ", unValuationAmount=" + unValuationAmount +
        ", isRelated=" + isRelated +
        ", relatedFullName=" + relatedFullName +
        "}";
    }
}
