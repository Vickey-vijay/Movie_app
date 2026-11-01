package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class Xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f56174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f56175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ul f56176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f56177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f56178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f56179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f56181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final We f56182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P f56183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D3 f56184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C4663y6 f56185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final U9 f56186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final T9 f56187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qo f56188o;

    public Xl(Context context, We we2) {
        this(we2, new P(), new D3(), C4105c4.l().a(context), new C4663y6(), new U9(), new T9(), new qo());
    }

    public final synchronized boolean a(List list) {
        boolean z10;
        boolean z11;
        z10 = true;
        boolean z12 = !a(nj.b0.l0(list, AbstractC4149dm.f56613a));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            if (this.f56174a.contains((String) it.next())) {
                z11 = true;
                break;
            }
        }
        boolean z13 = AbstractC4149dm.f56614b.currentTimeSeconds() > this.f56181h;
        if (!z12 && !z11 && !z13 && !this.f56180g) {
            z10 = false;
        }
        return z10;
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f56175b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            qo qoVar = this.f56188o;
            String str = identifiersResult.f58084id;
            qoVar.getClass();
            if (qo.a(str)) {
                this.f56175b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        W9 w10;
        We weD = this.f56182i.i((IdentifiersResult) this.f56175b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f56175b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f56175b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f56175b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f56175b.get("appmetrica_report_ad_url")).e(this.f56179f).h((IdentifiersResult) this.f56175b.get("appmetrica_clids")).j(Gm.a((Map) this.f56178e)).f((IdentifiersResult) this.f56175b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f56175b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f56175b.get("appmetrica_yandex_adv_id")).b(this.f56180g).c(this.f56185l.f58014d).d(this.f56181h);
        U9 u10 = this.f56186m;
        synchronized (u10) {
            w10 = u10.f55975b;
        }
        weD.a(w10).b();
    }

    public Xl(We we2, P p10, D3 d10, C4620wd c4620wd, C4663y6 c4663y6, U9 u10, T9 t10, qo qoVar) {
        HashSet hashSet = new HashSet();
        this.f56174a = hashSet;
        this.f56175b = new HashMap();
        this.f56176c = new Ul();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f56182i = we2;
        this.f56183j = p10;
        this.f56184k = d10;
        this.f56185l = c4663y6;
        this.f56186m = u10;
        this.f56187n = t10;
        this.f56188o = qoVar;
        c(c4620wd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, we2.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, we2.i());
        a("appmetrica_get_ad_url", we2.d());
        a("appmetrica_report_ad_url", we2.e());
        b(we2.o());
        a("appmetrica_google_adv_id", we2.l());
        a("appmetrica_huawei_oaid", we2.m());
        a("appmetrica_yandex_adv_id", we2.r());
        c4663y6.a(we2.h());
        u10.a(we2.k());
        this.f56177d = we2.g();
        String strI = we2.i((String) null);
        this.f56178e = strI != null ? Gm.a(strI) : null;
        this.f56180g = we2.a(true);
        this.f56179f = we2.b(0L);
        this.f56181h = we2.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f56175b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.f58084id.isEmpty()) {
            return mo.a((Map) this.f56178e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.f58084id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f58084id)) {
            return;
        }
        this.f56175b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            IdentifiersResult identifiersResult = (IdentifiersResult) this.f56175b.get(str2);
            if (identifiersResult == null) {
                identifiersResult = (IdentifiersResult) this.f56185l.f58013c.get(str2);
            }
            if (identifiersResult == null) {
                W9 w10 = this.f56186m.f55975b;
                if (!ck.p.e(str2, "appmetrica_lib_ssl_enabled") || (bool = w10.f56080a) == null) {
                    identifiersResult = null;
                } else {
                    boolean zBooleanValue = bool.booleanValue();
                    IdentifierStatus identifierStatus = w10.f56081b;
                    String str3 = w10.f56082c;
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = com.ironsource.mediationsdk.metadata.a.f29886h;
                    }
                    identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                }
            }
            if ("appmetrica_clids".equals(str2)) {
                if (this.f56180g || a(identifiersResult) || (identifiersResult.f58084id.isEmpty() && !mo.a((Map) this.f56178e))) {
                    return false;
                }
            } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                if (identifiersResult == null) {
                    return false;
                }
            } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f58084id)) {
                return false;
            }
        }
        return true;
    }
}
