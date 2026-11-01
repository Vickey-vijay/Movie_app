package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C3676r4;
import com.ironsource.C3714t8;
import com.ironsource.InterfaceC3761w4;
import com.ironsource.InterfaceC3778x4;
import com.ironsource.InterfaceC3795y4;
import com.ironsource.V7;
import com.ironsource.Y4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V7 f30970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30971b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l.a f30972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.controller.f.c f30973b;

        public a(l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.f30972a = aVar;
            this.f30973b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f30972a == null) {
                    return;
                }
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put("success", false);
                jSONObjectJsonObjectInit.put("reason", n.this.f30971b);
                this.f30972a.a(new com.ironsource.sdk.controller.f.a(this.f30973b.f(), jSONObjectJsonObjectInit));
            } catch (JSONException e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3795y4 f30975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4 f30976b;

        public b(InterfaceC3795y4 interfaceC3795y4, Y4 y10) {
            this.f30975a = interfaceC3795y4;
            this.f30976b = y10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30975a.a(C3714t8.e.RewardedVideo, this.f30976b.h(), n.this.f30971b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3795y4 f30978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30979b;

        public c(InterfaceC3795y4 interfaceC3795y4, JSONObject jSONObject) {
            this.f30978a = interfaceC3795y4;
            this.f30979b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30978a.b(this.f30979b.optString("demandSourceName"), n.this.f30971b);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3778x4 f30981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4 f30982b;

        public d(InterfaceC3778x4 interfaceC3778x4, Y4 y10) {
            this.f30981a = interfaceC3778x4;
            this.f30982b = y10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30981a.a(C3714t8.e.Interstitial, this.f30982b.h(), n.this.f30971b);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3778x4 f30984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30985b;

        public e(InterfaceC3778x4 interfaceC3778x4, String str) {
            this.f30984a = interfaceC3778x4;
            this.f30985b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30984a.a(this.f30985b, n.this.f30971b);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3778x4 f30987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4 f30988b;

        public f(InterfaceC3778x4 interfaceC3778x4, Y4 y10) {
            this.f30987a = interfaceC3778x4;
            this.f30988b = y10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30987a.a(this.f30988b.h(), n.this.f30971b);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3778x4 f30990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30991b;

        public g(InterfaceC3778x4 interfaceC3778x4, JSONObject jSONObject) {
            this.f30990a = interfaceC3778x4;
            this.f30991b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30990a.d(this.f30991b.optString("demandSourceName"), n.this.f30971b);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3778x4 f30993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4 f30994b;

        public h(InterfaceC3778x4 interfaceC3778x4, Y4 y10) {
            this.f30993a = interfaceC3778x4;
            this.f30994b = y10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30993a.d(this.f30994b.h(), n.this.f30971b);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3761w4 f30996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f30997b;

        public i(InterfaceC3761w4 interfaceC3761w4, Map map) {
            this.f30996a = interfaceC3761w4;
            this.f30997b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30996a.c((String) this.f30997b.get("demandSourceName"), n.this.f30971b);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3761w4 f30999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f31000b;

        public j(InterfaceC3761w4 interfaceC3761w4, JSONObject jSONObject) {
            this.f30999a = interfaceC3761w4;
            this.f31000b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30999a.c(this.f31000b.optString("demandSourceName"), n.this.f30971b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y10) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y10, InterfaceC3795y4 interfaceC3795y4) {
        if (interfaceC3795y4 != null) {
            a(new b(interfaceC3795y4, y10));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y10) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3795y4 interfaceC3795y4) {
        if (interfaceC3795y4 != null) {
            a(new c(interfaceC3795y4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y10, Map<String, String> map, InterfaceC3778x4 interfaceC3778x4) {
        if (interfaceC3778x4 != null) {
            a(new f(interfaceC3778x4, y10));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public C3714t8.c h() {
        return C3714t8.c.Native;
    }

    public n(String str, V7 v10) {
        this.f30970a = v10;
        this.f30971b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y10, InterfaceC3778x4 interfaceC3778x4) {
        if (interfaceC3778x4 != null) {
            a(new d(interfaceC3778x4, y10));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC3778x4 interfaceC3778x4) {
        if (interfaceC3778x4 != null) {
            a(new e(interfaceC3778x4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3778x4 interfaceC3778x4) {
        if (interfaceC3778x4 != null) {
            a(new g(interfaceC3778x4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y10, Map<String, String> map, InterfaceC3778x4 interfaceC3778x4) {
        if (interfaceC3778x4 != null) {
            a(new h(interfaceC3778x4, y10));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y10, InterfaceC3761w4 interfaceC3761w4) {
        if (interfaceC3761w4 != null) {
            interfaceC3761w4.a(C3714t8.e.Banner, y10.h(), this.f30971b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y10, Map<String, String> map, InterfaceC3761w4 interfaceC3761w4) {
        if (interfaceC3761w4 != null) {
            a(new i(interfaceC3761w4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3761w4 interfaceC3761w4) {
        if (interfaceC3761w4 != null) {
            a(new j(interfaceC3761w4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, l.a aVar) {
        a(new a(aVar, cVar));
    }

    public void a(Runnable runnable) {
        V7 v10 = this.f30970a;
        if (v10 != null) {
            v10.c(runnable);
        }
    }
}
