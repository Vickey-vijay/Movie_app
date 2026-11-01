package com.ironsource;

import android.util.Log;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3625o4 implements InterfaceC3781x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3569l4 f30337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bk.l<C8, Object> f30338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C7 f30339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3710t4 f30340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C8 f30342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f30343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3417cd f30344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f30345i;

    /* JADX INFO: renamed from: com.ironsource.o4$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements bk.l<Result<? extends C8>, mj.r> {
        public a(Object obj) {
            super(1, obj, C3625o4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C3625o4) this.receiver).b(obj);
        }

        @Override // bk.l
        public /* bridge */ /* synthetic */ mj.r invoke(Result<? extends C8> result) {
            a(result.m3466unboximpl());
            return mj.r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o4$b */
    public /* synthetic */ class b extends FunctionReferenceImpl implements bk.l<Result<? extends JSONObject>, mj.r> {
        public b(Object obj) {
            super(1, obj, C3625o4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) throws JSONException {
            ((C3625o4) this.receiver).a(obj);
        }

        @Override // bk.l
        public /* bridge */ /* synthetic */ mj.r invoke(Result<? extends JSONObject> result) throws JSONException {
            a(result.m3466unboximpl());
            return mj.r.f64562a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3625o4(C3569l4 c3569l4, bk.l<? super C8, ? extends Object> lVar, C7 c10, InterfaceC3710t4 interfaceC3710t4) {
        ck.p.j(c3569l4, "config");
        ck.p.j(lVar, "onFinish");
        ck.p.j(c10, "downloadManager");
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        this.f30337a = c3569l4;
        this.f30338b = lVar;
        this.f30339c = c10;
        this.f30340d = interfaceC3710t4;
        this.f30341e = C3625o4.class.getSimpleName();
        this.f30342f = new C8(c3569l4.d(), "mobileController_0.html");
        this.f30343g = interfaceC3710t4.a();
        this.f30344h = new C3417cd(c3569l4.a());
        this.f30345i = "";
    }

    public final InterfaceC3710t4 a() {
        return this.f30340d;
    }

    @Override // com.ironsource.InterfaceC3781x7
    public void b() {
        this.f30343g = this.f30340d.a();
        new C3403c(new C3421d(this.f30344h), this.f30337a.d() + "/temp", this.f30339c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC3781x7
    public C8 c() {
        return this.f30342f;
    }

    public final bk.l<C8, Object> d() {
        return this.f30338b;
    }

    @Override // com.ironsource.InterfaceC3781x7
    public boolean a(C8 c10) {
        ck.p.j(c10, C3426d4.i.f28530b);
        String name = c10.getName();
        ck.p.i(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) throws JSONException {
        if (Result.m3463isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !ck.p.e(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            ck.p.i(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.f30345i = string;
            C3607n4 c3607n4A = a(string);
            if (c3607n4A.j()) {
                C8 c8K = c3607n4A.k();
                this.f30342f = c8K;
                this.f30338b.invoke(c8K);
                return;
            }
            c3607n4A.m();
            return;
        }
        a("0").m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj) {
        if (Result.m3464isSuccessimpl(obj)) {
            C8 c10 = (C8) (Result.m3463isFailureimpl(obj) ? null : obj);
            if (!ck.p.e(c10 != null ? c10.getAbsolutePath() : null, this.f30342f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f30342f);
                    ck.p.g(c10);
                    yj.i.t(c10, this.f30342f, true, 0, 4, null);
                } catch (Exception e10) {
                    C3676r4.d().a(e10);
                    Log.e(this.f30341e, "Unable to copy downloaded mobileController.html to cache folder: " + e10.getMessage());
                }
                ck.p.g(c10);
                this.f30342f = c10;
            }
            new InterfaceC3587m4.b(this.f30337a.b(), this.f30343g, this.f30340d).a();
        } else {
            new InterfaceC3587m4.a(this.f30337a.b()).a();
        }
        bk.l<C8, Object> lVar = this.f30338b;
        if (Result.m3463isFailureimpl(obj)) {
            obj = null;
        }
        lVar.invoke((C8) obj);
    }

    private final C3607n4 a(String str) {
        return new C3607n4(new C3581lg(this.f30344h, str), this.f30337a.d() + "/mobileController_" + str + ".html", this.f30339c, new a(this));
    }
}
