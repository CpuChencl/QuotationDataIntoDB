package com.lion.db.bean;
import java.util.Date;
public class FuturesQuotation{
	private Long id;
	private String currencyNo;
	private Date dateTimeStamp;
	private Double preClosingPrice;
	private Double preSettlePrice;
	private Double prePositionQty;
	private Double openingPrice;
	private Double lastPrice;
	private Double highPrice;
	private Double lowPrice;
	private Double hisHighPrice;
	private Double hisLowPrice;
	private Double limitUpPrice;
	private Double limitDownPrice;
	private Double totalQty;
	private Double totalTurnover;
	private Double positionQty;
	private Double averagePrice;
	private Double closingPrice;
	private Double settlePrice;
	private Double lastQty;
	private Double bidPrice1;
	private Double bidPrice2;
	private Double bidPrice3;
	private Double bidPrice4;
	private Double bidPrice5;
	private Double bidQty1;
	private Double bidQty2;
	private Double bidQty3;
	private Double bidQty4;
	private Double bidQty5;
	private Double askPrice1;
	private Double askPrice2;
	private Double askPrice3;
	private Double askPrice4;
	private Double askPrice5;
	private Double askQty1;
	private Double askQty2;
	private Double askQty3;
	private Double askQty4;
	private Double askQty5;
	private Double impliedBidPrice;
	private Double impliedBidQty;
	private Double impliedAskPrice;
	private Double impliedAskQty;
	private Double preDelta;
	private Double currDelta;
	private Double insideQty;
	private Double outsideQty;
	private Double turnoverRate;
	private Double fiveDayAvgQty;
	private Double priceEarningsRatio;
	private Double totalValue;
	private Double negotiableValue;
	private Double positionTrend;
	private Double changeSpeed;
	private Double changeRate;
	private Double changeValue;
	private Double swing;
	private Double totalBidQty;
	private Double totalAskQty;
	private String contractNo1;
	private String contractStrikePrice1;
	private String contractNo2;
	private String contractStrikePrice2;
	private String contractExchangeNo;
	private Integer contractCommodityType;
	private String contractCommodityNo;
	private String underlyContractNo1;
	private String underlyContractStrikePrice1;
	private String underlyContractNo2;
	private String underlyContractStrikePrice2;
	private String underlyContractExchangeNo;
	private Integer underlyContractCommodityType;
	private String underlyContractCommodityNo;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCurrencyNo() {
		return currencyNo;
	}
	public void setCurrencyNo(String currencyNo) {
		this.currencyNo = currencyNo;
	}
	public Date getDateTimeStamp() {
		return dateTimeStamp;
	}
	public void setDateTimeStamp(Date dateTimeStamp) {
		this.dateTimeStamp = dateTimeStamp;
	}
	public Double getPreClosingPrice() {
		return preClosingPrice;
	}
	public void setPreClosingPrice(Double preClosingPrice) {
		this.preClosingPrice = preClosingPrice;
	}
	public Double getPreSettlePrice() {
		return preSettlePrice;
	}
	public void setPreSettlePrice(Double preSettlePrice) {
		this.preSettlePrice = preSettlePrice;
	}
	public Double getPrePositionQty() {
		return prePositionQty;
	}
	public void setPrePositionQty(Double prePositionQty) {
		this.prePositionQty = prePositionQty;
	}
	public Double getOpeningPrice() {
		return openingPrice;
	}
	public void setOpeningPrice(Double openingPrice) {
		this.openingPrice = openingPrice;
	}
	public Double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(Double lastPrice) {
		this.lastPrice = lastPrice;
	}
	public Double getHighPrice() {
		return highPrice;
	}
	public void setHighPrice(Double highPrice) {
		this.highPrice = highPrice;
	}
	public Double getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(Double lowPrice) {
		this.lowPrice = lowPrice;
	}
	public Double getHisHighPrice() {
		return hisHighPrice;
	}
	public void setHisHighPrice(Double hisHighPrice) {
		this.hisHighPrice = hisHighPrice;
	}
	public Double getHisLowPrice() {
		return hisLowPrice;
	}
	public void setHisLowPrice(Double hisLowPrice) {
		this.hisLowPrice = hisLowPrice;
	}
	public Double getLimitUpPrice() {
		return limitUpPrice;
	}
	public void setLimitUpPrice(Double limitUpPrice) {
		this.limitUpPrice = limitUpPrice;
	}
	public Double getLimitDownPrice() {
		return limitDownPrice;
	}
	public void setLimitDownPrice(Double limitDownPrice) {
		this.limitDownPrice = limitDownPrice;
	}
	public Double getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(Double totalQty) {
		this.totalQty = totalQty;
	}
	public Double getTotalTurnover() {
		return totalTurnover;
	}
	public void setTotalTurnover(Double totalTurnover) {
		this.totalTurnover = totalTurnover;
	}
	public Double getPositionQty() {
		return positionQty;
	}
	public void setPositionQty(Double positionQty) {
		this.positionQty = positionQty;
	}
	public Double getAveragePrice() {
		return averagePrice;
	}
	public void setAveragePrice(Double averagePrice) {
		this.averagePrice = averagePrice;
	}
	public Double getClosingPrice() {
		return closingPrice;
	}
	public void setClosingPrice(Double closingPrice) {
		this.closingPrice = closingPrice;
	}
	public Double getSettlePrice() {
		return settlePrice;
	}
	public void setSettlePrice(Double settlePrice) {
		this.settlePrice = settlePrice;
	}
	public Double getLastQty() {
		return lastQty;
	}
	public void setLastQty(Double lastQty) {
		this.lastQty = lastQty;
	}
	public Double getBidPrice1() {
		return bidPrice1;
	}
	public void setBidPrice1(Double bidPrice1) {
		this.bidPrice1 = bidPrice1;
	}
	public Double getBidPrice2() {
		return bidPrice2;
	}
	public void setBidPrice2(Double bidPrice2) {
		this.bidPrice2 = bidPrice2;
	}
	public Double getBidPrice3() {
		return bidPrice3;
	}
	public void setBidPrice3(Double bidPrice3) {
		this.bidPrice3 = bidPrice3;
	}
	public Double getBidPrice4() {
		return bidPrice4;
	}
	public void setBidPrice4(Double bidPrice4) {
		this.bidPrice4 = bidPrice4;
	}
	public Double getBidPrice5() {
		return bidPrice5;
	}
	public void setBidPrice5(Double bidPrice5) {
		this.bidPrice5 = bidPrice5;
	}
	public Double getBidQty1() {
		return bidQty1;
	}
	public void setBidQty1(Double bidQty1) {
		this.bidQty1 = bidQty1;
	}
	public Double getBidQty2() {
		return bidQty2;
	}
	public void setBidQty2(Double bidQty2) {
		this.bidQty2 = bidQty2;
	}
	public Double getBidQty3() {
		return bidQty3;
	}
	public void setBidQty3(Double bidQty3) {
		this.bidQty3 = bidQty3;
	}
	public Double getBidQty4() {
		return bidQty4;
	}
	public void setBidQty4(Double bidQty4) {
		this.bidQty4 = bidQty4;
	}
	public Double getBidQty5() {
		return bidQty5;
	}
	public void setBidQty5(Double bidQty5) {
		this.bidQty5 = bidQty5;
	}
	public Double getAskPrice1() {
		return askPrice1;
	}
	public void setAskPrice1(Double askPrice1) {
		this.askPrice1 = askPrice1;
	}
	public Double getAskPrice2() {
		return askPrice2;
	}
	public void setAskPrice2(Double askPrice2) {
		this.askPrice2 = askPrice2;
	}
	public Double getAskPrice3() {
		return askPrice3;
	}
	public void setAskPrice3(Double askPrice3) {
		this.askPrice3 = askPrice3;
	}
	public Double getAskPrice4() {
		return askPrice4;
	}
	public void setAskPrice4(Double askPrice4) {
		this.askPrice4 = askPrice4;
	}
	public Double getAskPrice5() {
		return askPrice5;
	}
	public void setAskPrice5(Double askPrice5) {
		this.askPrice5 = askPrice5;
	}
	public Double getAskQty1() {
		return askQty1;
	}
	public void setAskQty1(Double askQty1) {
		this.askQty1 = askQty1;
	}
	public Double getAskQty2() {
		return askQty2;
	}
	public void setAskQty2(Double askQty2) {
		this.askQty2 = askQty2;
	}
	public Double getAskQty3() {
		return askQty3;
	}
	public void setAskQty3(Double askQty3) {
		this.askQty3 = askQty3;
	}
	public Double getAskQty4() {
		return askQty4;
	}
	public void setAskQty4(Double askQty4) {
		this.askQty4 = askQty4;
	}
	public Double getAskQty5() {
		return askQty5;
	}
	public void setAskQty5(Double askQty5) {
		this.askQty5 = askQty5;
	}
	public Double getImpliedBidPrice() {
		return impliedBidPrice;
	}
	public void setImpliedBidPrice(Double impliedBidPrice) {
		this.impliedBidPrice = impliedBidPrice;
	}
	public Double getImpliedBidQty() {
		return impliedBidQty;
	}
	public void setImpliedBidQty(Double impliedBidQty) {
		this.impliedBidQty = impliedBidQty;
	}
	public Double getImpliedAskPrice() {
		return impliedAskPrice;
	}
	public void setImpliedAskPrice(Double impliedAskPrice) {
		this.impliedAskPrice = impliedAskPrice;
	}
	public Double getImpliedAskQty() {
		return impliedAskQty;
	}
	public void setImpliedAskQty(Double impliedAskQty) {
		this.impliedAskQty = impliedAskQty;
	}
	public Double getPreDelta() {
		return preDelta;
	}
	public void setPreDelta(Double preDelta) {
		this.preDelta = preDelta;
	}
	public Double getCurrDelta() {
		return currDelta;
	}
	public void setCurrDelta(Double currDelta) {
		this.currDelta = currDelta;
	}
	public Double getInsideQty() {
		return insideQty;
	}
	public void setInsideQty(Double insideQty) {
		this.insideQty = insideQty;
	}
	public Double getOutsideQty() {
		return outsideQty;
	}
	public void setOutsideQty(Double outsideQty) {
		this.outsideQty = outsideQty;
	}
	public Double getTurnoverRate() {
		return turnoverRate;
	}
	public void setTurnoverRate(Double turnoverRate) {
		this.turnoverRate = turnoverRate;
	}
	public Double getFiveDayAvgQty() {
		return fiveDayAvgQty;
	}
	public void setFiveDayAvgQty(Double fiveDayAvgQty) {
		this.fiveDayAvgQty = fiveDayAvgQty;
	}
	public Double getPriceEarningsRatio() {
		return priceEarningsRatio;
	}
	public void setPriceEarningsRatio(Double priceEarningsRatio) {
		this.priceEarningsRatio = priceEarningsRatio;
	}
	public Double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	public Double getNegotiableValue() {
		return negotiableValue;
	}
	public void setNegotiableValue(Double negotiableValue) {
		this.negotiableValue = negotiableValue;
	}
	public Double getPositionTrend() {
		return positionTrend;
	}
	public void setPositionTrend(Double positionTrend) {
		this.positionTrend = positionTrend;
	}
	public Double getChangeSpeed() {
		return changeSpeed;
	}
	public void setChangeSpeed(Double changeSpeed) {
		this.changeSpeed = changeSpeed;
	}
	public Double getChangeRate() {
		return changeRate;
	}
	public void setChangeRate(Double changeRate) {
		this.changeRate = changeRate;
	}
	public Double getChangeValue() {
		return changeValue;
	}
	public void setChangeValue(Double changeValue) {
		this.changeValue = changeValue;
	}
	public Double getSwing() {
		return swing;
	}
	public void setSwing(Double swing) {
		this.swing = swing;
	}
	public Double getTotalBidQty() {
		return totalBidQty;
	}
	public void setTotalBidQty(Double totalBidQty) {
		this.totalBidQty = totalBidQty;
	}
	public Double getTotalAskQty() {
		return totalAskQty;
	}
	public void setTotalAskQty(Double totalAskQty) {
		this.totalAskQty = totalAskQty;
	}
	public String getContractNo1() {
		return contractNo1;
	}
	public void setContractNo1(String contractNo1) {
		this.contractNo1 = contractNo1;
	}
	public String getContractStrikePrice1() {
		return contractStrikePrice1;
	}
	public void setContractStrikePrice1(String contractStrikePrice1) {
		this.contractStrikePrice1 = contractStrikePrice1;
	}
	public String getContractNo2() {
		return contractNo2;
	}
	public void setContractNo2(String contractNo2) {
		this.contractNo2 = contractNo2;
	}
	public String getContractStrikePrice2() {
		return contractStrikePrice2;
	}
	public void setContractStrikePrice2(String contractStrikePrice2) {
		this.contractStrikePrice2 = contractStrikePrice2;
	}
	public String getContractExchangeNo() {
		return contractExchangeNo;
	}
	public void setContractExchangeNo(String contractExchangeNo) {
		this.contractExchangeNo = contractExchangeNo;
	}
	public Integer getContractCommodityType() {
		return contractCommodityType;
	}
	public void setContractCommodityType(Integer contractCommodityType) {
		this.contractCommodityType = contractCommodityType;
	}
	public String getContractCommodityNo() {
		return contractCommodityNo;
	}
	public void setContractCommodityNo(String contractCommodityNo) {
		this.contractCommodityNo = contractCommodityNo;
	}
	public String getUnderlyContractNo1() {
		return underlyContractNo1;
	}
	public void setUnderlyContractNo1(String underlyContractNo1) {
		this.underlyContractNo1 = underlyContractNo1;
	}
	public String getUnderlyContractStrikePrice1() {
		return underlyContractStrikePrice1;
	}
	public void setUnderlyContractStrikePrice1(String underlyContractStrikePrice1) {
		this.underlyContractStrikePrice1 = underlyContractStrikePrice1;
	}
	public String getUnderlyContractNo2() {
		return underlyContractNo2;
	}
	public void setUnderlyContractNo2(String underlyContractNo2) {
		this.underlyContractNo2 = underlyContractNo2;
	}
	public String getUnderlyContractStrikePrice2() {
		return underlyContractStrikePrice2;
	}
	public void setUnderlyContractStrikePrice2(String underlyContractStrikePrice2) {
		this.underlyContractStrikePrice2 = underlyContractStrikePrice2;
	}
	public String getUnderlyContractExchangeNo() {
		return underlyContractExchangeNo;
	}
	public void setUnderlyContractExchangeNo(String underlyContractExchangeNo) {
		this.underlyContractExchangeNo = underlyContractExchangeNo;
	}
	public Integer getUnderlyContractCommodityType() {
		return underlyContractCommodityType;
	}
	public void setUnderlyContractCommodityType(Integer underlyContractCommodityType) {
		this.underlyContractCommodityType = underlyContractCommodityType;
	}
	public String getUnderlyContractCommodityNo() {
		return underlyContractCommodityNo;
	}
	public void setUnderlyContractCommodityNo(String underlyContractCommodityNo) {
		this.underlyContractCommodityNo = underlyContractCommodityNo;
	}

	
}