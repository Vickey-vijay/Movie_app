package yads;

import android.webkit.WebView;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hw3 f79343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e4 f79344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public il1 f79345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f79347f;

    public final void a(WebView webView) {
        this.f79343b = new hw3(webView);
    }

    public void c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, JSONObject jSONObject) {
        ix3.f78850a.a((WebView) this.f79343b.get(), "publishMediaEvent", str, jSONObject, this.f79342a);
    }

    public void b() {
        this.f79343b.clear();
    }

    public ka(String str) {
        a();
        this.f79342a = str;
        this.f79343b = new hw3(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(ha haVar) {
        ix3 ix3Var = ix3.f78850a;
        WebView webView = (WebView) this.f79343b.get();
        String str = this.f79342a;
        JSONObject jSONObject = new JSONObject();
        lw3.a(jSONObject, "impressionOwner", haVar.f78146a);
        lw3.a(jSONObject, "mediaEventsOwner", haVar.f78147b);
        lw3.a(jSONObject, "creativeType", haVar.f78149d);
        lw3.a(jSONObject, "impressionType", haVar.f78150e);
        lw3.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(haVar.f78148c));
        ix3Var.a(webView, C3426d4.a.f28413f, jSONObject, str);
    }

    public void a(wv3 wv3Var, ia iaVar) {
        a(wv3Var, iaVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(wv3 wv3Var, ia iaVar, JSONObject jSONObject) {
        String str = wv3Var.f84358h;
        JSONObject jSONObject2 = new JSONObject();
        lw3.a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        lw3.a(jSONObject2, "adSessionType", iaVar.f78541h);
        lw3.a(jSONObject2, "deviceInfo", ew3.a());
        lw3.a(jSONObject2, "deviceCategory", gg0.a(sv3.a()));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        lw3.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        lw3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, iaVar.f78534a.f82174a);
        lw3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, iaVar.f78534a.f82175b);
        lw3.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        lw3.a(jSONObject4, "libraryVersion", "1.5.6-Yandex");
        lw3.a(jSONObject4, "appId", fx3.f77541b.f77542a.getApplicationContext().getPackageName());
        lw3.a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        String str2 = iaVar.f78540g;
        if (str2 != null) {
            lw3.a(jSONObject2, "contentUrl", str2);
        }
        String str3 = iaVar.f78539f;
        if (str3 != null) {
            lw3.a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (md3 md3Var : Collections.unmodifiableList(iaVar.f78536c)) {
            lw3.a(jSONObject5, md3Var.f80147a, md3Var.f80149c);
        }
        ix3.f78850a.a((WebView) this.f79343b.get(), "startSession", str, jSONObject2, jSONObject5, jSONObject);
    }

    public final void a() {
        this.f79347f = System.nanoTime();
        this.f79346e = 1;
    }
}
