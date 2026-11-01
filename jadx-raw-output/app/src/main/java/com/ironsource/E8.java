package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.sdk.IronSourceNetwork;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class E8 implements I8 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f26449j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ub f26451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3765w8 f26452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private G8 f26453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f26455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f26456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private I8.a f26457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private J8 f26458i;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final E8 a() {
            String string = UUID.randomUUID().toString();
            ck.p.i(string, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            ck.p.i(controllerManager, "controllerManager");
            return new E8(string, new Tb(string, controllerManager, null, null, 12, null), new C3782x8());
        }
    }

    public static final class b implements Ub.a {
        @Override // com.ironsource.Ub.a
        public void a(G8 g10) {
            ck.p.j(g10, "adData");
            E8.this.f26453d = g10;
            InterfaceC3765w8 interfaceC3765w8 = E8.this.f26452c;
            C3472fe.a aVar = C3472fe.f28920l;
            ck.p.i(aVar, com.safedk.android.analytics.brandsafety.creatives.discoveries.f.J);
            HashMap<String, Object> mapA = E8.this.d().a();
            ck.p.i(mapA, "baseEventParams().data");
            interfaceC3765w8.a(aVar, mapA);
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadSuccess(g10);
            }
        }

        public b() {
        }

        @Override // com.ironsource.Ub.a
        public void e() {
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Ub.a
        public void a(String str) {
            ck.p.j(str, "reason");
            C3748v8 c3748v8A = E8.this.d().a(G5.A, str);
            InterfaceC3765w8 interfaceC3765w8 = E8.this.f26452c;
            C3472fe.a aVar = C3472fe.f28915g;
            ck.p.i(aVar, "loadAdFailed");
            HashMap<String, Object> mapA = c3748v8A.a();
            ck.p.i(mapA, "eventParams.data");
            interfaceC3765w8.a(aVar, mapA);
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadFailed(str);
            }
        }

        @Override // com.ironsource.Ub.a
        public void a() {
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdShown();
            }
        }
    }

    public static final class c implements J8.a {
        @Override // com.ironsource.J8.a
        public void a(J8.b bVar) throws JSONException {
            ck.p.j(bVar, "viewName");
            if (a.f26461a[bVar.ordinal()] == 1) {
                E8.this.f26451b.c();
                return;
            }
            JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("viewName", bVar.b());
            Ub ub2 = E8.this.f26451b;
            ck.p.i(jSONObjectPut, "clickParams");
            ub2.a(jSONObjectPut);
        }

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f26461a;

            static {
                int[] iArr = new int[J8.b.values().length];
                try {
                    iArr[J8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f26461a = iArr;
            }
        }

        public c() {
        }

        @Override // com.ironsource.J8.a
        public void a(pg pgVar) {
            ck.p.j(pgVar, "viewVisibilityParams");
            E8.this.f26451b.a(pgVar);
        }
    }

    public E8(String str, Ub ub2, InterfaceC3765w8 interfaceC3765w8) {
        ck.p.j(str, "id");
        ck.p.j(ub2, "controller");
        ck.p.j(interfaceC3765w8, "eventTracker");
        this.f26450a = str;
        this.f26451b = ub2;
        this.f26452c = interfaceC3765w8;
        ub2.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3748v8 d() {
        C3748v8 c3748v8A = new C3748v8().a(G5.f26613x, this.f26455f).a(G5.f26611v, this.f26454e).a("producttype", C3714t8.e.NativeAd.toString()).a(G5.I, Long.valueOf(j()));
        ck.p.i(c3748v8A, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return c3748v8A;
    }

    public static final E8 e() {
        return f26449j.a();
    }

    private final b f() {
        return new b();
    }

    private final c g() {
        return new c();
    }

    private final long j() {
        Long l10 = this.f26456g;
        if (l10 == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l10.longValue();
    }

    @Override // com.ironsource.I8
    public I8.a b() {
        return this.f26457h;
    }

    @Override // com.ironsource.I8
    public G8 c() {
        return this.f26453d;
    }

    public final String h() {
        return this.f26454e;
    }

    public final String i() {
        return this.f26455f;
    }

    @Override // com.ironsource.I8
    public void a(I8.a aVar) {
        this.f26457h = aVar;
    }

    @Override // com.ironsource.I8
    public void a(Activity activity, JSONObject jSONObject) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(jSONObject, "loadParams");
        this.f26456g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.f26454e = jSONObject.optString("demandSourceName");
        this.f26455f = jSONObject.optString("inAppBidding");
        InterfaceC3765w8 interfaceC3765w8 = this.f26452c;
        C3472fe.a aVar = C3472fe.f28914f;
        ck.p.i(aVar, com.safedk.android.analytics.brandsafety.creatives.discoveries.f.H);
        HashMap<String, Object> mapA = d().a();
        ck.p.i(mapA, "baseEventParams().data");
        interfaceC3765w8.a(aVar, mapA);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(jSONObject.toString());
        jSONObjectJsonObjectInit.put(C3426d4.i.f28577y0, String.valueOf(this.f26456g));
        this.f26451b.a(activity, jSONObjectJsonObjectInit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ E8(String str, Ub ub2, InterfaceC3765w8 interfaceC3765w8, int i10, ck.i iVar) {
        if ((i10 & 1) != 0) {
            str = UUID.randomUUID().toString();
            ck.p.i(str, "randomUUID().toString()");
        }
        this(str, ub2, interfaceC3765w8);
    }

    @Override // com.ironsource.I8
    public void a(J8 j10) {
        ck.p.j(j10, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapA = d().a();
        ck.p.i(mapA, "baseEventParams().data");
        linkedHashMap.putAll(mapA);
        String string = j10.t().toString();
        ck.p.i(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(G5.f26614y, string);
        InterfaceC3765w8 interfaceC3765w8 = this.f26452c;
        C3472fe.a aVar = C3472fe.f28922n;
        ck.p.i(aVar, "registerAd");
        interfaceC3765w8.a(aVar, linkedHashMap);
        this.f26458i = j10;
        j10.a(g());
        this.f26451b.a(j10);
    }

    @Override // com.ironsource.I8
    public void a() {
        J8 j10 = this.f26458i;
        if (j10 != null) {
            j10.a((J8.a) null);
        }
        this.f26451b.a();
    }
}
