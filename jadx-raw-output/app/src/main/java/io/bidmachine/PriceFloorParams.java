package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.models.IPriceFloorParams;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class PriceFloorParams implements IPriceFloorParams<PriceFloorParams> {
    private final Map<String, Double> priceFloorsMap = new HashMap();

    @NonNull
    public Map<String, Double> getPriceFloors() {
        return this.priceFloorsMap;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.IPriceFloorParams
    public PriceFloorParams addPriceFloor(double d10) {
        addPriceFloor(UUID.randomUUID().toString(), d10);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.IPriceFloorParams
    public PriceFloorParams addPriceFloor(@NonNull String str, double d10) {
        this.priceFloorsMap.put(str, Double.valueOf(d10));
        return this;
    }
}
