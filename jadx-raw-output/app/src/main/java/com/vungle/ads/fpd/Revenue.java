package com.vungle.ads.fpd;

import al.d;
import bl.f0;
import bl.o1;
import bl.y1;
import ck.i;
import ck.p;
import com.vungle.ads.internal.util.RangeUtil;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: Revenue.kt */
/* JADX INFO: loaded from: classes11.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u00020\u0001:\u0002CBB\u0007¢\u0006\u0004\b<\u00107BK\b\u0017\u0012\u0006\u0010>\u001a\u00020=\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\b<\u0010AJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0018H\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0007J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\tH\u0007J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\tH\u0007J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\tH\u0007J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\tH\u0007J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\tH\u0007J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\tH\u0007J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\tH\u0007J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\tH\u0007J\u0010\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\tH\u0007J\u0010\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\tH\u0007J\u0010\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u00020\tH\u0007R\u001e\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\f\u00105\u0012\u0004\b6\u00107R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000e\u00105\u0012\u0004\b8\u00107R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0010\u00105\u0012\u0004\b9\u00107R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0019\u0010:\u0012\u0004\b;\u00107¨\u0006D"}, d2 = {"Lcom/vungle/ads/fpd/Revenue;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "totalEarningsUsd", "setTotalEarningsUsd", "iaaRevenueUSD", "setIAARevenueUSD", "iapRevenueUSD", "setIAPRevenueUSD", "totalRevenueUSD", "setTotalRevenueUSD", "earningsByPlacement", "setEarningsByPlacement", "", "", "topNAdomain", "setTopNAdomain", "", "isUserAPurchaser", "setIsUserAPurchaser", "isUserASubscriber", "setIsUserASubscriber", "last7DaysMedianSpendUsd", "setLast7DaysMedianSpendUsd", "last7DaysTotalSpendUsd", "setLast7DaysTotalSpendUsd", "last30DaysTotalSpendUsd", "setLast30DaysTotalSpendUsd", "last7DaysMeanSpendUsd", "setLast7DaysMeanSpendUsd", "last30DaysMedianSpendUsd", "setLast30DaysMedianSpendUsd", "last30DaysMeanSpendUsd", "setLast30DaysMeanSpendUsd", "last7DaysUserPltvUsd", "setLast7DaysUserPltvUsd", "last7DaysUserLtvUsd", "setLast7DaysUserLtvUsd", "last30DaysUserPltvUsd", "setLast30DaysUserPltvUsd", "last30DaysUserLtvUsd", "setLast30DaysUserLtvUsd", "last7DaysPlacementFillRate", "setLast7DaysPlacementFillRate", "last30DaysPlacementFillRate", "setLast30DaysPlacementFillRate", "Ljava/lang/Float;", "getIaaRevenueUSD$annotations", "()V", "getIapRevenueUSD$annotations", "getTotalRevenueUSD$annotations", "Ljava/lang/Boolean;", "isUserAPurchaser$annotations", "<init>", "", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class Revenue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Float iaaRevenueUSD;
    private Float iapRevenueUSD;
    private Boolean isUserAPurchaser;
    private Float totalRevenueUSD;

    /* JADX INFO: compiled from: Revenue.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/fpd/Revenue$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/fpd/Revenue;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<Revenue> serializer() {
            return Revenue$$serializer.INSTANCE;
        }
    }

    public Revenue() {
    }

    private static /* synthetic */ void getIaaRevenueUSD$annotations() {
    }

    private static /* synthetic */ void getIapRevenueUSD$annotations() {
    }

    private static /* synthetic */ void getTotalRevenueUSD$annotations() {
    }

    private static /* synthetic */ void isUserAPurchaser$annotations() {
    }

    public final Revenue setEarningsByPlacement(float earningsByPlacement) {
        return this;
    }

    public final Revenue setIsUserASubscriber(boolean isUserASubscriber) {
        return this;
    }

    public final Revenue setLast30DaysMeanSpendUsd(float last30DaysMeanSpendUsd) {
        return this;
    }

    public final Revenue setLast30DaysMedianSpendUsd(float last30DaysMedianSpendUsd) {
        return this;
    }

    public final Revenue setLast30DaysPlacementFillRate(float last30DaysPlacementFillRate) {
        return this;
    }

    public final Revenue setLast30DaysTotalSpendUsd(float last30DaysTotalSpendUsd) {
        return this;
    }

    public final Revenue setLast30DaysUserLtvUsd(float last30DaysUserLtvUsd) {
        return this;
    }

    public final Revenue setLast30DaysUserPltvUsd(float last30DaysUserPltvUsd) {
        return this;
    }

    public final Revenue setLast7DaysMeanSpendUsd(float last7DaysMeanSpendUsd) {
        return this;
    }

    public final Revenue setLast7DaysMedianSpendUsd(float last7DaysMedianSpendUsd) {
        return this;
    }

    public final Revenue setLast7DaysPlacementFillRate(float last7DaysPlacementFillRate) {
        return this;
    }

    public final Revenue setLast7DaysTotalSpendUsd(float last7DaysTotalSpendUsd) {
        return this;
    }

    public final Revenue setLast7DaysUserLtvUsd(float last7DaysUserLtvUsd) {
        return this;
    }

    public final Revenue setLast7DaysUserPltvUsd(float last7DaysUserPltvUsd) {
        return this;
    }

    public final Revenue setTopNAdomain(List<String> topNAdomain) {
        return this;
    }

    public final Revenue setTotalEarningsUsd(float totalEarningsUsd) {
        return this;
    }

    public /* synthetic */ Revenue(int i10, Float f10, Float f11, Float f12, Boolean bool, y1 y1Var) {
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, Revenue$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.iaaRevenueUSD = null;
        } else {
            this.iaaRevenueUSD = f10;
        }
        if ((i10 & 2) == 0) {
            this.iapRevenueUSD = null;
        } else {
            this.iapRevenueUSD = f11;
        }
        if ((i10 & 4) == 0) {
            this.totalRevenueUSD = null;
        } else {
            this.totalRevenueUSD = f12;
        }
        if ((i10 & 8) == 0) {
            this.isUserAPurchaser = null;
        } else {
            this.isUserAPurchaser = bool;
        }
    }

    public static final void write$Self(Revenue revenue, d dVar, a aVar) {
        p.j(revenue, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        if (dVar.q(aVar, 0) || revenue.iaaRevenueUSD != null) {
            dVar.C(aVar, 0, f0.f5402a, revenue.iaaRevenueUSD);
        }
        if (dVar.q(aVar, 1) || revenue.iapRevenueUSD != null) {
            dVar.C(aVar, 1, f0.f5402a, revenue.iapRevenueUSD);
        }
        if (dVar.q(aVar, 2) || revenue.totalRevenueUSD != null) {
            dVar.C(aVar, 2, f0.f5402a, revenue.totalRevenueUSD);
        }
        if (dVar.q(aVar, 3) || revenue.isUserAPurchaser != null) {
            dVar.C(aVar, 3, bl.i.f5416a, revenue.isUserAPurchaser);
        }
    }

    public final Revenue setIAARevenueUSD(float iaaRevenueUSD) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, iaaRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.iaaRevenueUSD = Float.valueOf(iaaRevenueUSD);
        }
        return this;
    }

    public final Revenue setIAPRevenueUSD(float iapRevenueUSD) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, iapRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.iapRevenueUSD = Float.valueOf(iapRevenueUSD);
        }
        return this;
    }

    public final Revenue setTotalRevenueUSD(float totalRevenueUSD) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, totalRevenueUSD, 0.0f, 0.0f, 4, (Object) null)) {
            this.totalRevenueUSD = Float.valueOf(totalRevenueUSD);
        }
        return this;
    }

    public final Revenue setIsUserAPurchaser(boolean isUserAPurchaser) {
        this.isUserAPurchaser = Boolean.valueOf(isUserAPurchaser);
        return this;
    }
}
