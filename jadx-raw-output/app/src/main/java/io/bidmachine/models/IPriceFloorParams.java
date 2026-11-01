package io.bidmachine.models;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IPriceFloorParams<SelfType> {
    SelfType addPriceFloor(double d10);

    SelfType addPriceFloor(@NonNull String str, double d10);
}
