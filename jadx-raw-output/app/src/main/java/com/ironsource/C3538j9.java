package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3538j9 {
    public final void a(Runnable runnable) {
        ck.p.j(runnable, "runnable");
        V7.a(V7.f27797a, runnable, 0L, 2, (Object) null);
    }

    public final void b(Runnable runnable) {
        ck.p.j(runnable, "callback");
        V7.f27797a.a(runnable);
    }

    /* JADX INFO: renamed from: com.ironsource.j9$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29272a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29272a = iArr;
        }
    }

    public final IronSource.a[] a(List<? extends IronSourceAds.AdFormat> list) {
        ck.p.j(list, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = list.iterator();
        while (it.hasNext()) {
            int i10 = a.f29272a[it.next().ordinal()];
            if (i10 == 1) {
                arrayList.add(IronSource.a.BANNER);
            } else if (i10 == 2) {
                arrayList.add(IronSource.a.INTERSTITIAL);
            } else if (i10 == 3) {
                arrayList.add(IronSource.a.REWARDED_VIDEO);
            }
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final C3617ne b(C3617ne c3617ne) {
        ck.p.j(c3617ne, "error");
        return c3617ne.c() == 2080 ? new C3617ne(c3617ne.c(), "serverResponseIsNotValid") : c3617ne;
    }

    public final IronSourceError a(C3617ne c3617ne) {
        ck.p.j(c3617ne, "error");
        if (c3617ne.c() != 2070 && c3617ne.c() != 2110) {
            if (c3617ne.c() != 2080 && c3617ne.c() != 2100) {
                if (c3617ne.c() == 2090) {
                    return C3813z5.f31697a.a();
                }
                return new IronSourceError(510, c3617ne.d());
            }
            return C3813z5.f31697a.c();
        }
        return C3813z5.f31697a.b();
    }

    public final void a(long j10, Ne.a aVar) {
        ck.p.j(aVar, "responseOrigin");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put("isMultipleAdObjects", 1);
            jSONObjectB.put("duration", j10);
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Lb.f26968s.d().q().a(new C5(D5.SDK_INIT_SUCCESS, jSONObjectB));
    }

    public final void a(C3617ne c3617ne, long j10) {
        ck.p.j(c3617ne, "error");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, c3617ne.c());
            jSONObjectB.put("reason", c3617ne.d());
            jSONObjectB.put("duration", j10);
            jSONObjectB.put("isMultipleAdObjects", 1);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Lb.f26968s.d().q().a(new C5(D5.SDK_INIT_FAILED, jSONObjectB));
    }
}
