package io.appmetrica.analytics.impl;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.U;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class U implements Ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f55942b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FutureTask f55949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final J f55950j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f55953m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55943c = "advertising identifiers collecting is forbidden by client configuration";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55944d = "advertising identifiers collecting is forbidden by startup";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55945e = "advertising identifiers collecting is forbidden by unknown reason";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N f55946f = new N(new Ag(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final N f55947g = new N(new Ag("huawei"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N f55948h = new N(new Ag("yandex"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f55951k = new AdvertisingIdsHolder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public G f55952l = new G(4, 4, 4);

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final synchronized AdvertisingIdsHolder getIdentifiers(Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized void init() {
        if (this.f55949i == null) {
            this.f55952l = this.f55950j.a();
            FutureTask futureTask = new FutureTask(new Callable() { // from class: af.s
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return U.e(this.f3587b);
                }
            });
            this.f55949i = futureTask;
            this.f55942b.execute(futureTask);
        }
    }

    public static final Void e(U u10) {
        u10.f55951k = new AdvertisingIdsHolder(u10.a(u10.f55952l.f55247a, new Q(u10)), u10.a(u10.f55952l.f55248b, new S(u10)), u10.a(u10.f55952l.f55249c, new T(u10, new Yd())));
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Ba, io.appmetrica.analytics.impl.InterfaceC4355lm
    public final synchronized void a(C4226gm c4226gm) {
        this.f55950j.a(c4226gm);
        a((Hi) new Yd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized void b(boolean z10) {
        this.f55953m = true;
        this.f55950j.f55368b.update(z10);
        a((Hi) new Yd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized void c(boolean z10) {
        if (!this.f55953m) {
            b(z10);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f55949i;
        if (futureTask == null) {
            ck.p.B(ToolBar.REFRESH);
            futureTask = null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f55951k;
    }

    public U(Context context, ICommonExecutor iCommonExecutor, C4226gm c4226gm) {
        this.f55941a = context;
        this.f55942b = iCommonExecutor;
        this.f55950j = new J(c4226gm);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized AdvertisingIdsHolder a() {
        return a(new Yd());
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized AdvertisingIdsHolder a(Hi hi2) {
        try {
            a(hi2, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f55951k;
    }

    public final FutureTask a(final Hi hi2, final boolean z10) {
        final G gA = this.f55950j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: af.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z10, gA, this, hi2);
            }
        });
        this.f55949i = futureTask;
        this.f55942b.execute(futureTask);
        FutureTask futureTask2 = this.f55949i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        ck.p.B(ToolBar.REFRESH);
        return null;
    }

    public static final Void a(boolean z10, G g10, U u10, Hi hi2) {
        if (!z10 && ck.p.e(g10, u10.f55952l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u10.f55951k;
        AdTrackingInfoResult adTrackingInfoResultA = u10.a(g10.f55247a, new Q(u10));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = adTrackingInfoResultA.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            adTrackingInfoResultA = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, adTrackingInfoResultA.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA2 = u10.a(g10.f55248b, new S(u10));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = adTrackingInfoResultA2.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            adTrackingInfoResultA2 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, adTrackingInfoResultA2.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA3 = u10.a(g10.f55249c, new T(u10, hi2));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = adTrackingInfoResultA3.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            adTrackingInfoResultA3 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, adTrackingInfoResultA3.mErrorExplanation);
        }
        u10.f55951k = new AdvertisingIdsHolder(adTrackingInfoResultA, adTrackingInfoResultA2, adTrackingInfoResultA3);
        return null;
    }

    public final AdTrackingInfoResult a(int i10, bk.a aVar) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (AdTrackingInfoResult) aVar.invoke();
        }
        if (i11 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f55943c);
        }
        if (i11 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f55944d);
        }
        if (i11 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f55945e);
        }
        throw new NoWhenBranchMatchedException();
    }
}
