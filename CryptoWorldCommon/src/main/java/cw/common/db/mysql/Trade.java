package cw.common.db.mysql;

import cwp.db.IDbEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trades")
public class Trade implements IDbEntity {
    @Id
    @Column(name = "trade_id")
    private long id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "order_id")
    private long orderId;

    @Column(name = "strategy_id")
    private byte strategy;

    @Column(name = "trading_pair_id")
    private byte tradingPair;

    @Column(name = "trade_side_id")
    private byte tradeSide;

    @Column(name = "trade_type_id")
    private byte tradeType;

    @Column(name = "trade_time_in_force_id")
    private byte tradeTimeInForce;

    @Column(name = "trade_size")
    private double tradeSize;

    @Column(name = "trade_price")
    private double tradePrice;

    @Column(name = "trade_notional")
    private double tradeNotional;

    @Column(name = "execution_time")
    private Date executionTime;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public byte getStrategy() {
        return this.strategy;
    }

    public void setStrategy(byte strategy) {
        this.strategy = strategy;
    }

    public byte getTradingPair() {
        return this.tradingPair;
    }

    public void setTradingPair(byte tradingPair) {
        this.tradingPair = tradingPair;
    }

    public byte getTradeSide() {
        return this.tradeSide;
    }

    public void setTradeSide(byte tradeSide) {
        this.tradeSide = tradeSide;
    }

    public byte getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(byte tradeType) {
        this.tradeType = tradeType;
    }

    public double getTradeSize() {
        return this.tradeSize;
    }

    public void setTradeSize(double tradeSize) {
        this.tradeSize = tradeSize;
    }

    public double getTradePrice() {
        return this.tradePrice;
    }

    public void setTradePrice(double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Date getExecutionTime() {
        return this.executionTime;
    }

    public void setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
    }

    public long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public byte getTradeTimeInForce() {
        return this.tradeTimeInForce;
    }

    public void setTradeTimeInForce(byte tradeTimeInForce) {
        this.tradeTimeInForce = tradeTimeInForce;
    }

    public double getTradeNotional() {
        return this.tradeNotional;
    }

    public void setTradeNotional(double tradeNotional) {
        this.tradeNotional = tradeNotional;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderId=" + orderId +
                ", strategy=" + strategy +
                ", tradingPair=" + tradingPair +
                ", tradeSide=" + tradeSide +
                ", tradeType=" + tradeType +
                ", tradeTimeInForce=" + tradeTimeInForce +
                ", tradeSize=" + tradeSize +
                ", tradePrice=" + tradePrice +
                ", tradeNotional=" + tradeNotional +
                ", executionTime=" + executionTime +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
