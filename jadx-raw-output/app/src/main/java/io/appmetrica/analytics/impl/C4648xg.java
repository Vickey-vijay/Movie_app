package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.C4424og;
import io.appmetrica.analytics.impl.C4648xg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4648xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f57932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sa f57933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ec f57934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f57935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f57936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f57937g;

    public C4648xg(Context context, SafePackageManager safePackageManager, Sa sa2) {
        this.f57931a = context;
        this.f57932b = safePackageManager;
        this.f57933c = sa2;
        Ec ec2 = new Ec(0);
        ec2.a(EnumC4399ng.f57351d, 1);
        ec2.a(EnumC4399ng.f57350c, 2);
        this.f57934d = ec2;
        this.f57935e = TimeUnit.DAYS.toSeconds(1L);
        this.f57936f = "com.android.vending";
        this.f57937g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    public final C4424og a(List list) {
        C4424og c4424og;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (C4424og) list.get(0);
        }
        SafePackageManager safePackageManager = this.f57932b;
        Context context = this.f57931a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C4424og c4424og2 = (C4424og) it.next();
            Pair pairA = mj.h.a(c4424og2, Long.valueOf(Math.abs(c4424og2.f57447c - seconds)));
            while (it.hasNext()) {
                C4424og c4424og3 = (C4424og) it.next();
                Pair pairA2 = mj.h.a(c4424og3, Long.valueOf(Math.abs(c4424og3.f57447c - seconds)));
                if (qj.b.d((Comparable) pairA.getSecond(), (Comparable) pairA2.getSecond()) > 0) {
                    pairA = pairA2;
                }
            }
            c4424og = (C4424og) pairA.component1();
            if (((Number) pairA.component2()).longValue() >= this.f57935e) {
                c4424og = null;
            }
        } else {
            c4424og = null;
        }
        if (c4424og == null) {
            Comparator comparator = new Comparator() { // from class: af.w0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C4648xg.a(this.f3595b, (C4424og) obj, (C4424og) obj2);
                }
            };
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C4424og c4424og4 = (C4424og) it2.next();
            while (it2.hasNext()) {
                C4424og c4424og5 = (C4424og) it2.next();
                if (comparator.compare(c4424og4, c4424og5) < 0) {
                    c4424og4 = c4424og5;
                }
            }
            c4424og = c4424og4;
        }
        Sa sa2 = this.f57933c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C4424og c4424og6 = (C4424og) it3.next();
            arrayList.add(new JSONObject().put("referrer", c4424og6.f57445a).put("install_timestamp_seconds", c4424og6.f57447c).put("click_timestamp_seconds", c4424og6.f57446b).put("source", c4424og6.f57448d.f57353a));
        }
        sa2.reportEvent("several_filled_referrers", jSONObject.put("candidates", mo.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", c4424og.f57445a).put("install_timestamp_seconds", c4424og.f57447c).put("click_timestamp_seconds", c4424og.f57446b).put("source", c4424og.f57448d.f57353a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c4424og;
    }

    public /* synthetic */ C4648xg(Context context) {
        this(context, new SafePackageManager(), AbstractC4658y1.a());
    }

    public static final int a(C4648xg c4648xg, C4424og c4424og, C4424og c4424og2) {
        int iA = ek.b.a(c4424og.f57447c - c4424og2.f57447c);
        return iA == 0 ? ((Number) c4648xg.f57934d.a(c4424og.f57448d)).intValue() - ((Number) c4648xg.f57934d.a(c4424og2.f57448d)).intValue() : iA;
    }
}
