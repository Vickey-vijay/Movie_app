package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Tb implements Ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.sdk.controller.e f27697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X8 f27698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3387b1 f27699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Ub.a f27701f;

    public Tb(String str, com.ironsource.sdk.controller.e eVar, X8 x10, InterfaceC3387b1 interfaceC3387b1) {
        ck.p.j(str, "id");
        ck.p.j(eVar, "controllerManager");
        ck.p.j(x10, "imageLoader");
        ck.p.j(interfaceC3387b1, "adViewManagement");
        this.f27696a = str;
        this.f27697b = eVar;
        this.f27698c = x10;
        this.f27699d = interfaceC3387b1;
        this.f27700e = Tb.class.getSimpleName();
        eVar.a(str, d());
    }

    private final com.ironsource.sdk.controller.l.b d() {
        return new com.ironsource.sdk.controller.l.b() { // from class: com.ironsource.lj
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Nb nb2) {
                Tb.a(this.f29441a, nb2);
            }
        };
    }

    private final JSONObject e() throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put(com.ironsource.sdk.controller.f.b.f30923g, a.f27706e).put("sdkCallback", C3426d4.h.U);
        ck.p.i(jSONObjectPut, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.ironsource.Ub
    public void a(Ub.a aVar) {
        this.f27701f = aVar;
    }

    @Override // com.ironsource.Ub
    public Ub.a b() {
        return this.f27701f;
    }

    @Override // com.ironsource.Ub
    public void c() {
        this.f27697b.a(new com.ironsource.sdk.controller.f.c(this.f27696a, a.f27707f, IronSourceVideoBridge.jsonObjectInit()), (com.ironsource.sdk.controller.l.a) null);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27702a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f27703b = "nativeAd.load";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f27704c = "nativeAd.loadReport";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f27705d = "nativeAd.register";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f27706e = "nativeAd.click";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f27707f = "nativeAd.privacyClick";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f27708g = "nativeAd.visibilityChanged";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f27709h = "nativeAd.destroy";

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Tb tb2, com.ironsource.sdk.controller.f.a aVar) {
        ck.p.j(tb2, "this$0");
        ck.p.j(aVar, "it");
        tb2.b(aVar);
    }

    @Override // com.ironsource.Ub
    public void a(final Activity activity, JSONObject jSONObject) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(jSONObject, "loadParams");
        this.f27697b.a(activity);
        this.f27697b.a(new com.ironsource.sdk.controller.f.c(this.f27696a, a.f27703b, jSONObject), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.oj
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                Tb.a(this.f30373a, activity, aVar);
            }
        });
    }

    private final void b(com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f27700e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String strOptString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.f27700e, "failed to handle show on native ad: " + strOptString);
            return;
        }
        Ub.a aVarB = b();
        if (aVarB != null) {
            aVarB.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb2, Activity activity, com.ironsource.sdk.controller.f.a aVar) {
        ck.p.j(tb2, "this$0");
        ck.p.j(activity, "$activity");
        ck.p.j(aVar, "it");
        tb2.a(activity, aVar);
    }

    private final void a(Activity activity, com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Ub.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String strOptString = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Ub.a aVarB2 = b();
            if (aVarB2 != null) {
                ck.p.i(strOptString, "reason");
                aVarB2.a(strOptString);
                return;
            }
            return;
        }
        G8.b bVarA = new G8.a(this.f27698c, this.f27699d).a(activity, aVar.d());
        a(bVarA, bVarA.a().h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Tb(String str, com.ironsource.sdk.controller.e eVar, X8 x10, InterfaceC3387b1 interfaceC3387b1, int i10, ck.i iVar) {
        x10 = (i10 & 4) != 0 ? new W8(null, 1, null) : x10;
        if ((i10 & 8) != 0) {
            interfaceC3387b1 = C3664q8.a();
            ck.p.i(interfaceC3387b1, "getInstance()");
        }
        this(str, eVar, x10, interfaceC3387b1);
    }

    private final void a(G8.b bVar, final G8 g10) {
        this.f27697b.a(new com.ironsource.sdk.controller.f.c(this.f27696a, "nativeAd.loadReport." + this.f27696a, bVar.b()), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.kj
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                Tb.a(this.f29381a, g10, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb2, G8 g10, com.ironsource.sdk.controller.f.a aVar) {
        ck.p.j(tb2, "this$0");
        ck.p.j(g10, "$adData");
        ck.p.j(aVar, "it");
        tb2.a(g10, aVar);
    }

    private final void a(G8 g10, com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Ub.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String strOptString = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Ub.a aVarB2 = b();
            if (aVarB2 != null) {
                ck.p.i(strOptString, "reason");
                aVarB2.a(strOptString);
                return;
            }
            return;
        }
        Ub.a aVarB3 = b();
        if (aVarB3 != null) {
            aVarB3.a(g10);
        }
    }

    @Override // com.ironsource.Ub
    public void a() {
        this.f27697b.a(new com.ironsource.sdk.controller.f.c(this.f27696a, a.f27709h, IronSourceVideoBridge.jsonObjectInit()), (com.ironsource.sdk.controller.l.a) null);
    }

    @Override // com.ironsource.Ub
    public void a(J8 j10) throws JSONException {
        ck.p.j(j10, "viewHolder");
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("assetViews", j10.t()).put("adViewClickCommand", e());
        String str = this.f27696a;
        ck.p.i(jSONObjectPut, "params");
        this.f27697b.a(new com.ironsource.sdk.controller.f.c(str, a.f27705d, jSONObjectPut), (com.ironsource.sdk.controller.l.a) null);
    }

    @Override // com.ironsource.Ub
    public void a(pg pgVar) {
        ck.p.j(pgVar, "viewVisibilityParams");
        this.f27697b.a(new com.ironsource.sdk.controller.f.c(this.f27696a, a.f27708g, pgVar.g()), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.nj
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                Tb.b(this.f30321a, aVar);
            }
        });
    }

    @Override // com.ironsource.Ub
    public void a(JSONObject jSONObject) {
        ck.p.j(jSONObject, "clickParams");
        this.f27697b.a(new com.ironsource.sdk.controller.f.c(this.f27696a, a.f27706e, jSONObject), new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.mj
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                Tb.a(this.f30192a, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb2, com.ironsource.sdk.controller.f.a aVar) {
        ck.p.j(tb2, "this$0");
        ck.p.j(aVar, "it");
        tb2.a(aVar);
    }

    private final void a(com.ironsource.sdk.controller.f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f27700e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String strOptString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.f27700e, "failed to handle click on native ad: " + strOptString);
            return;
        }
        Ub.a aVarB = b();
        if (aVarB != null) {
            aVarB.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb2, Nb nb2) {
        ck.p.j(tb2, "this$0");
        ck.p.j(nb2, NotificationCompat.CATEGORY_MESSAGE);
        if (ck.p.e(nb2.e(), a.f27706e)) {
            tb2.a(nb2);
        }
    }

    private final void a(Nb nb2) {
        if (nb2.f() == null) {
            Logger.i(this.f27700e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!nb2.f().optBoolean("success", false)) {
            String strOptString = nb2.f().optString("reason", "unexpected error");
            Logger.i(this.f27700e, "failed to handle click on native ad: " + strOptString);
            return;
        }
        Ub.a aVarB = b();
        if (aVarB != null) {
            aVarB.e();
        }
    }
}
