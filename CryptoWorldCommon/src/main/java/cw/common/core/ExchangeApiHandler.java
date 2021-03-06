package cw.common.core;

import cw.common.db.mysql.*;
import cw.common.event.IEvent;

import java.util.function.Consumer;

public abstract class ExchangeApiHandler {
    protected Consumer<IEvent> enqueueCallback;

    public boolean validate(StrategyConfig strategyConfig) {
        return (Exchange.values()[strategyConfig.getExchange()] == getExchange());
    }

    public void setEnqueueCallback(Consumer<IEvent> enqueueCallback) {
        this.enqueueCallback = enqueueCallback;
    }

    public abstract Exchange getExchange();

    public abstract void add(ApiKey apiKey);

    public abstract void submitLimitFok(ITraderStrategy strategy, int userId, long orderId, String orderSize, String orderPrice, double orderPriceDouble, OrderSide orderSide);

    public abstract Object getHistoricalCandlestickBars(TradingPair tradingPair, CandlestickInterval interval);
}
