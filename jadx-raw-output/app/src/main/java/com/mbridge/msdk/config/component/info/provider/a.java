package com.mbridge.msdk.config.component.info.provider;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.config.component.info.provider.subprovider.b;
import com.mbridge.msdk.config.component.info.provider.subprovider.c;
import com.mbridge.msdk.config.component.info.provider.subprovider.d;
import com.mbridge.msdk.config.component.info.provider.subprovider.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DeviceProvider.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<String, Object> f33181j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<String, Object> f33182k = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.subprovider.a f33186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f33187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f33188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f33189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f33190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.info.provider.listener.a f33191i = new com.mbridge.msdk.config.component.info.provider.listener.a() { // from class: s8.a
        @Override // com.mbridge.msdk.config.component.info.provider.listener.a
        public final void a(Map map) {
            com.mbridge.msdk.config.component.info.provider.a.a(map);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map) {
        if (map != null) {
            if (map.containsKey(f.b.f30919c)) {
                f33182k.put(Q6.V0, map.get(f.b.f30919c));
            }
            if (map.containsKey("adIdB64")) {
                f33182k.put("gaid2", map.get("adIdB64"));
            }
            if (map.containsKey("adIdLimit")) {
                f33182k.put("adid_litmit", map.get("adIdLimit"));
            }
            if (map.containsKey("amazonIdInfo")) {
                Map<String, Object> map2 = f33182k;
                map2.put("az_aid_info", map.get("amazonIdInfoB64"));
                map2.put("az_aid_info_origin", map.get("amazonIdInfo"));
            }
        }
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap();
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (this.f33184b == 1) {
                map.put("c1", this.f33188f.e(contextD));
                map.put("language", this.f33188f.a(contextD));
                map.put("orientation", Integer.valueOf(this.f33188f.j(contextD)));
                map.put(C3426d4.j.f28613q0, this.f33188f.k(contextD));
                map.put("play_service_enable", Integer.valueOf(this.f33188f.m()));
                map.put("withGP", Integer.valueOf(this.f33188f.l()));
                map.put("networkType", Integer.valueOf(this.f33190h.c()));
                map.put("network_str", this.f33190h.d());
                map.put("vpn", Integer.valueOf(this.f33190h.e()));
            }
            if (this.f33185c == 1) {
                map.put("isLPM", Integer.valueOf(this.f33189g.d(contextD)));
                map.put("mobilePowerValue", Integer.valueOf(this.f33189g.d(contextD)));
                Map<String, Object> mapA = this.f33189g.a(contextD);
                map.put("mobileIsCharging", mapA.get("charging"));
                map.put("mobilePowerValue", mapA.get(C3426d4.j.Y));
                map.put(Q6.f27437i0, this.f33189g.b(contextD));
            }
        } catch (Throwable th2) {
            q0.b("DeviceInfoProvider", th2.getMessage(), th2);
        }
        return map;
    }

    public a(int i10, int i11, int i12) {
        this.f33183a = i10;
        this.f33184b = i11;
        this.f33185c = i12;
        c();
    }

    public void c() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (this.f33183a == 1) {
            this.f33186d = new com.mbridge.msdk.config.component.info.provider.subprovider.a(contextD, this.f33191i);
        }
        if (this.f33184b == 1) {
            this.f33187e = new e(contextD);
        }
        this.f33188f = new c();
        this.f33189g = new d();
        this.f33190h = new b(contextD);
    }

    public Map<String, Object> a() {
        Map<String, Object> mapA;
        String str = "";
        Map<String, Object> map = f33181j;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f33182k;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
            return map;
        }
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            map.put("SDKVersion", MBConfiguration.SDK_VERSION);
            map.put("platform", "1");
            map.put("package_name", contextD.getPackageName());
            map.put(CommonUrlParts.APP_VERSION, this.f33188f.d(contextD));
            map.put("app_version_code", Integer.valueOf(this.f33188f.c(contextD)));
            map.put("version_flag", "1");
            map.put("dyview_type", "1");
            map.put("pkg_source", this.f33188f.a(contextD, contextD.getPackageName()));
            map.put("http_req", "2");
            map.put("unknown_source", Integer.valueOf(this.f33188f.i()));
            if (this.f33184b == 1) {
                map.put("osVersion", this.f33188f.g());
                map.put("model", this.f33188f.f());
                map.put("brand", this.f33188f.a());
                map.put(CommonUrlParts.MANUFACTURER, this.f33188f.d());
                map.put("userAgent", this.f33187e.c());
                map.put("cpuType", this.f33188f.h());
                map.put("screenSize", this.f33188f.h(contextD) + VastAttributes.HORIZONTAL_POSITION + this.f33188f.f(contextD));
                map.put("hm", "");
                Map<String, Object> mapE = this.f33188f.e();
                if (mapE != null && !mapE.isEmpty()) {
                    map.put("deviceMemoryTotal", mapE.get("totalMem"));
                    map.put("memory_free", mapE.get(Q6.f27478w));
                }
                map.put("hasWXOpenSDK", Integer.valueOf(this.f33188f.n()));
                map.put("hasWX", Integer.valueOf(this.f33188f.n(contextD)));
                map.put("wxApiVersion", Integer.valueOf(this.f33188f.j()));
                map.put("weChatSupportApi", Integer.valueOf(this.f33188f.a(com.mbridge.msdk.foundation.controller.c.n().h())));
                map.put("u3", Long.valueOf(this.f33188f.b()));
                map.put("simu", Integer.valueOf(this.f33188f.k()));
                Map<String, String> mapI = this.f33188f.i(contextD);
                if (mapI != null && !mapI.isEmpty()) {
                    String str2 = mapI.get("mnc");
                    String str3 = mapI.get("mcc");
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    map.put("mnc", str2);
                    if (!TextUtils.isEmpty(str3)) {
                        str = str3;
                    }
                    map.put("mcc", str);
                }
                map.put("harmony_info", this.f33188f.c());
                map.put("is_pad", Boolean.valueOf(this.f33188f.m(contextD)));
                map.put("time_format", this.f33188f.l(contextD));
                map.put("app_target_sdk_version", Integer.valueOf(this.f33188f.b(contextD)));
            }
            if (this.f33185c == 1) {
                map.put("font", Float.valueOf(this.f33189g.c(contextD)));
                map.put("timeZone", this.f33189g.b());
                Map<String, Object> mapA2 = this.f33189g.a();
                if (mapA2 != null && !mapA2.isEmpty()) {
                    map.put("mobileCapacity", mapA2.get("totalSpace"));
                    map.put("remainder", mapA2.get("freeExternalSize"));
                }
            }
            if (this.f33183a == 1 && (mapA = this.f33186d.a()) != null && !mapA.isEmpty()) {
                map.put(Q6.V0, mapA.get(f.b.f30919c));
                map.put("gaid2", mapA.get("adIdB64"));
                map.put("adid_litmit", mapA.get("adIdLimit"));
                map.put("az_aid_info", mapA.get("amazonIdInfoB64"));
                map.put("az_aid_info_origin", mapA.get("amazonIdInfo"));
            }
        } catch (Throwable th2) {
            q0.b("DeviceInfoProvider", th2.getMessage(), th2);
        }
        return f33181j;
    }

    public String a(String str) {
        Map<String, Object> map = f33181j;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f33182k;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
        }
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        Map<String, Object> map3 = f33182k;
        if (map3.containsKey(str)) {
            return String.valueOf(map3.get(str));
        }
        Map<String, Object> mapB = b();
        return mapB.containsKey(str) ? String.valueOf(mapB.get(str)) : "";
    }
}
