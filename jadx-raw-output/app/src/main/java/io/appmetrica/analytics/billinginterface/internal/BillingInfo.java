package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;

/* JADX INFO: loaded from: classes7.dex */
public class BillingInfo {

    @NonNull
    public final String productId;
    public final long purchaseTime;

    @NonNull
    public final String purchaseToken;
    public long sendTime;

    @NonNull
    public final ProductType type;

    @NonNull
    public String toString() {
        return "BillingInfo{type=" + this.type + "productId='" + this.productId + "'purchaseToken='" + this.purchaseToken + "'purchaseTime=" + this.purchaseTime + "sendTime=" + this.sendTime + h.f44172e;
    }

    public BillingInfo(@NonNull ProductType productType, @NonNull String str, @NonNull String str2, long j10, long j11) {
        this.type = productType;
        this.productId = str;
        this.purchaseToken = str2;
        this.purchaseTime = j10;
        this.sendTime = j11;
    }
}
