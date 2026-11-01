package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/batteryinfo/ChargeTypeProvider;", "", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/batteryinfo/ChargeTypeChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lmj/r;", "registerChargeTypeListener", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/batteryinfo/ChargeType;", "getChargeType", "()Lio/appmetrica/analytics/coreapi/internal/servicecomponents/batteryinfo/ChargeType;", "chargeType", "", "getBatteryLevel", "()Ljava/lang/Integer;", C3426d4.j.Y, "core-api_release"}, k = 1, mv = {1, 6, 0})
public interface ChargeTypeProvider {
    Integer getBatteryLevel();

    ChargeType getChargeType();

    void registerChargeTypeListener(ChargeTypeChangeListener chargeTypeChangeListener);
}
