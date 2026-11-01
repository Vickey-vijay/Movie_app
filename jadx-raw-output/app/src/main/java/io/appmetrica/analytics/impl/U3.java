package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bm f55960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f55961b;

    public final T3 a(HashMap map) {
        AdvertisingIdsHolder advertisingIdsHolderA;
        C4226gm c4226gmE = this.f55960a.e();
        U u10 = this.f55961b;
        synchronized (u10) {
            advertisingIdsHolderA = u10.a(new Yd());
        }
        return new T3(T3.a(c4226gmE.f56834d), T3.a(c4226gmE.f56831a), T3.a(c4226gmE.f56832b), T3.a(c4226gmE.f56840j), T3.a(c4226gmE.f56839i), T3.a(AbstractC4241hb.a(Gm.a(c4226gmE.f56841k))), T3.a(AbstractC4241hb.a(map)), new IdentifiersResult(advertisingIdsHolderA.getGoogle().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getGoogle().mAdTrackingInfo.advId, advertisingIdsHolderA.getGoogle().mStatus, advertisingIdsHolderA.getGoogle().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getHuawei().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getHuawei().mAdTrackingInfo.advId, advertisingIdsHolderA.getHuawei().mStatus, advertisingIdsHolderA.getHuawei().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getYandex().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getYandex().mAdTrackingInfo.advId, advertisingIdsHolderA.getYandex().mStatus, advertisingIdsHolderA.getYandex().mErrorExplanation), T3.a(AbstractC4241hb.a(c4226gmE.f56838h)), Jn.a(), c4226gmE.f56845o + ((long) c4226gmE.f56856z.f55151a), T3.a(c4226gmE.f56844n.f57246f), new Bundle());
    }

    public U3(Bm bm2, U u10) {
        this.f55960a = bm2;
        this.f55961b = u10;
    }
}
