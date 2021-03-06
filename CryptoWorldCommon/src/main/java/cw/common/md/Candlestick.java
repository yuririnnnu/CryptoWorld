package cw.common.md;

import cw.common.db.mysql.CandlestickInterval;
import net.openhft.chronicle.bytes.Byteable;
import net.openhft.chronicle.bytes.BytesStore;
import net.openhft.chronicle.values.NotNull;
import net.openhft.chronicle.values.Values;

public interface Candlestick extends Byteable {
    static Candlestick getNativeObject() {
        Candlestick candlestick = Values.newNativeReference(Candlestick.class);
        BytesStore store = BytesStore.nativeStoreWithFixedCapacity(candlestick.maxSize());
        candlestick.bytesStore(store, 0, candlestick.maxSize());
        return candlestick;
    }

    CandlestickInterval getCandlestickInterval();

    void setCandlestickInterval(@NotNull CandlestickInterval candlestickInterval);

    long getOpenTime();

    void setOpenTime(long openTime);

    long getCloseTime();

    void setCloseTime(long closeTime);

    double getOpenPrice();

    void setOpenPrice(double openPrice);

    double getClosePrice();

    void setClosePrice(double closePrice);
}
