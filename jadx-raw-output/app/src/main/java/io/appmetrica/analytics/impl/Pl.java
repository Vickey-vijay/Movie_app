package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Pl implements Ql {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f55748k = Collections.unmodifiableMap(new Ml());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4650xi f55750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Xl f55751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f55752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PublicLogger f55753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nl f55754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f55755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakHashMap f55756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f55757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f55758j;

    public Pl(@NonNull Context context, C4650xi c4650xi, We we2, @NonNull Handler handler) {
        this(c4650xi, new Xl(context, we2), handler);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, @Nullable Map<String, String> map) {
        synchronized (this.f55755g) {
            Xl xl2 = this.f55751c;
            xl2.getClass();
            if (!mo.a((Map) map) && !mo.a(map, xl2.f56178e)) {
                xl2.f56178e = new HashMap(map);
                xl2.f56180g = true;
                xl2.c();
            }
            a(startupParamsCallback, list);
            if (this.f55751c.a((List) list)) {
                a(list, new Ol(this, startupParamsCallback), map, true);
            } else {
                a(new Bundle(), startupParamsCallback);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x007f A[Catch: all -> 0x0115, TryCatch #0 {, blocks: (B:4:0x0063, B:6:0x0071, B:10:0x0082, B:12:0x00b1, B:13:0x00b8, B:15:0x00be, B:16:0x00c5, B:18:0x00da, B:21:0x00e5, B:22:0x00f1, B:19:0x00df, B:9:0x007f), top: B:29:0x0063 }] */
    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResultA = T3.a(bundle, "Uuid");
        IdentifiersResult identifiersResultA2 = T3.a(bundle, "DeviceId");
        IdentifiersResult identifiersResultA3 = T3.a(bundle, "DeviceIdHash");
        IdentifiersResult identifiersResultA4 = T3.a(bundle, "AdUrlReport");
        IdentifiersResult identifiersResultA5 = T3.a(bundle, "AdUrlGet");
        IdentifiersResult identifiersResultA6 = T3.a(bundle, "Clids");
        IdentifiersResult identifiersResultA7 = T3.a(bundle, "RequestClids");
        IdentifiersResult identifiersResultA8 = T3.a(bundle, IronSourceConstants.TYPE_GAID);
        IdentifiersResult identifiersResultA9 = T3.a(bundle, "HOAID");
        IdentifiersResult identifiersResultA10 = T3.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult identifiersResultA11 = T3.a(bundle, "CUSTOM_SDK_HOSTS");
        long j10 = bundle.getLong("ServerTimeOffset");
        long j11 = bundle.getLong("NextStartupTime");
        W9 w9A = T3.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        Xl xl2 = this.f55751c;
        synchronized (xl2) {
            IdentifiersResult identifiersResult = (IdentifiersResult) xl2.f56175b.get(StartupParamsCallback.APPMETRICA_UUID);
            if (identifiersResult != null) {
                qo qoVar = xl2.f56188o;
                String str = identifiersResult.f58084id;
                qoVar.getClass();
                if (!qo.a(str)) {
                    xl2.c(identifiersResultA);
                }
            } else {
                xl2.c(identifiersResultA);
            }
            xl2.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, identifiersResultA2);
            xl2.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, identifiersResultA3);
            xl2.f56175b.put("appmetrica_google_adv_id", identifiersResultA8);
            xl2.f56175b.put("appmetrica_huawei_oaid", identifiersResultA9);
            xl2.f56175b.put("appmetrica_yandex_adv_id", identifiersResultA10);
            xl2.f56185l.a(identifiersResultA11);
            xl2.f56186m.a(w9A);
            if (!Xl.a(identifiersResultA5)) {
                xl2.f56175b.put("appmetrica_get_ad_url", identifiersResultA5);
            }
            if (!Xl.a(identifiersResultA4)) {
                xl2.f56175b.put("appmetrica_report_ad_url", identifiersResultA4);
            }
            xl2.f56179f = j10;
            D3 d10 = xl2.f56184k;
            HashMap map = xl2.f56178e;
            HashMap mapA = AbstractC4241hb.a(identifiersResultA7.f58084id);
            d10.getClass();
            if (mo.a((Map) map) ? mo.a((Map) mapA) : map.equals(mapA)) {
                xl2.f56175b.put("appmetrica_clids", identifiersResultA6);
                xl2.f56180g = false;
            }
            xl2.f56181h = j11;
            xl2.c();
        }
        C4105c4.l().m().a(bundle2, new SdkIdentifiers(identifiersResultA.f58084id, identifiersResultA2.f58084id, identifiersResultA3.f58084id));
        h();
    }

    public Pl(C4650xi c4650xi, Xl xl2, Handler handler) {
        this.f55749a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f55755g = new Object();
        this.f55756h = new WeakHashMap();
        this.f55758j = false;
        this.f55750b = c4650xi;
        this.f55751c = xl2;
        this.f55752d = handler;
        this.f55754f = new Nl(this);
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    public final B6 c() {
        return this.f55754f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f55751c.f56175b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f58084id;
    }

    @NonNull
    public final Y9 e() {
        W9 w10;
        Xl xl2 = this.f55751c;
        T9 t10 = xl2.f56187n;
        U9 u10 = xl2.f56186m;
        synchronized (u10) {
            w10 = u10.f55975b;
        }
        t10.getClass();
        Boolean bool = w10.f56080a;
        return new Y9();
    }

    public final long f() {
        return this.f55751c.f56179f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f55751c.f56175b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f58084id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f55756h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f55751c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.f55755g) {
            if (!this.f55758j || this.f55751c.b()) {
                this.f55758j = true;
                a(this.f55749a, this.f55754f, this.f55757i, false);
            }
        }
    }

    public final void a(@NonNull Bundle bundle) {
        b(bundle, null);
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.f55753e = publicLogger;
    }

    public final void a(List list, B6 b10, Map map, boolean z10) {
        C6 c10 = new C6(this.f55752d, b10);
        C4650xi c4650xi = this.f55750b;
        c4650xi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new Ya(c10, list, map, z10));
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC4641x9.f57918a;
        N3 n10 = new N3("", "", 1536, 0, anonymousInstance);
        n10.f55785m = bundle;
        G4 g10 = c4650xi.f57938a;
        c4650xi.a(C4650xi.a(n10, g10), g10, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (mo.a((Map) map)) {
            return;
        }
        synchronized (this.f55755g) {
            HashMap mapB = Gm.b(map);
            this.f55757i = mapB;
            this.f55750b.a(mapB);
            Xl xl2 = this.f55751c;
            xl2.getClass();
            if (!mo.a((Map) mapB) && !mo.a(mapB, xl2.f56178e)) {
                xl2.f56178e = new HashMap(mapB);
                xl2.f56180g = true;
                xl2.c();
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f55755g) {
            this.f55750b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Kl kl2;
        if (this.f55756h.containsKey(startupParamsCallback)) {
            List list = (List) this.f55756h.get(startupParamsCallback);
            if (this.f55751c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i10 = bundle.getInt("startup_error_key_code");
                    kl2 = Kl.UNKNOWN;
                    if (i10 == 1) {
                        kl2 = Kl.NETWORK;
                    } else if (i10 == 2) {
                        kl2 = Kl.PARSE;
                    }
                } else {
                    kl2 = null;
                }
                if (kl2 == null) {
                    if (!this.f55751c.a()) {
                        PublicLogger publicLogger = this.f55753e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f55757i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        kl2 = Kl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f55748k, kl2, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f55756h.remove(startupParamsCallback);
            if (this.f55756h.isEmpty()) {
                C4433p0 c4433p0 = this.f55750b.f57941d;
                synchronized (c4433p0.f57467f) {
                    c4433p0.f57464c = false;
                    c4433p0.c();
                }
            }
        }
    }

    public final void b(@NonNull Bundle bundle, @Nullable StartupParamsCallback startupParamsCallback) {
        synchronized (this.f55755g) {
            b(bundle);
            h();
            if (startupParamsCallback != null) {
                a(bundle, startupParamsCallback);
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.f55755g) {
            List list2 = this.f55751c.f56177d;
            if (mo.a((Collection) list)) {
                if (!mo.a((Collection) list2)) {
                    Xl xl2 = this.f55751c;
                    xl2.f56177d = null;
                    xl2.f56182i.a((List<String>) null);
                    this.f55750b.a((List) null);
                }
            } else if (!mo.a(list, list2)) {
                Xl xl3 = this.f55751c;
                xl3.f56177d = list;
                xl3.f56182i.a(list);
                this.f55750b.a(list);
            } else {
                this.f55750b.a(list2);
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap map = new HashMap();
        Xl xl2 = this.f55751c;
        synchronized (xl2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) xl2.f56175b.get(str);
                if (identifiersResult != null) {
                    map.put(str, xl2.f56176c.a(identifiersResult));
                }
            }
            xl2.f56185l.a(list, map);
            xl2.f56186m.a(list, map);
        }
        return new StartupParamsCallback.Result(map);
    }

    public final void b(@Nullable String str) {
        synchronized (this.f55755g) {
            this.f55750b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f55751c.f56175b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.f58084id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC4241hb.a(str);
        }
        return this.f55757i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f55756h.isEmpty()) {
            C4433p0 c4433p0 = this.f55750b.f57941d;
            synchronized (c4433p0.f57467f) {
                c4433p0.f57464c = true;
                c4433p0.b();
            }
        }
        this.f55756h.put(startupParamsCallback, list);
    }

    @NonNull
    public final AdvIdentifiersResult a() {
        Xl xl2 = this.f55751c;
        P p10 = xl2.f56183j;
        IdentifiersResult identifiersResult = (IdentifiersResult) xl2.f56175b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) xl2.f56175b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) xl2.f56175b.get("appmetrica_yandex_adv_id");
        p10.getClass();
        return new AdvIdentifiersResult(P.a(identifiersResult), P.a(identifiersResult2), P.a(identifiersResult3));
    }
}
