package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3403c implements InterfaceC3552k5<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3392b6 f28284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C7 f28286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bk.l<Result<? extends JSONObject>, mj.r> f28287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C8 f28288e;

    @Override // com.ironsource.Oc
    public void a(C8 c10) {
        ck.p.j(c10, C3426d4.i.f28530b);
        if (ck.p.e(c10.getName(), C3426d4.f28391i)) {
            try {
                i().invoke(Result.m3457boximpl(Result.m3458constructorimpl(c(c10))));
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                bk.l<Result<? extends JSONObject>, mj.r> lVarI = i();
                Result.a aVar = Result.Companion;
                lVarI.invoke(Result.m3457boximpl(Result.m3458constructorimpl(kotlin.c.a(e10))));
            }
        }
    }

    @Override // com.ironsource.InterfaceC3552k5
    public String c() {
        return this.f28285b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3403c(InterfaceC3392b6 interfaceC3392b6, String str, C7 c10, bk.l<? super Result<? extends JSONObject>, mj.r> lVar) {
        ck.p.j(interfaceC3392b6, Y5.c.f27927a);
        ck.p.j(str, "destinationPath");
        ck.p.j(c10, "downloadManager");
        ck.p.j(lVar, "onFinish");
        this.f28284a = interfaceC3392b6;
        this.f28285b = str;
        this.f28286c = c10;
        this.f28287d = lVar;
        this.f28288e = new C8(c(), C3426d4.f28391i);
    }

    private final JSONObject c(C8 c10) {
        return IronSourceVideoBridge.jsonObjectInit(IronSourceStorageUtils.readFile(c10));
    }

    @Override // com.ironsource.InterfaceC3552k5
    public void b(C8 c10) {
        ck.p.j(c10, "<set-?>");
        this.f28288e = c10;
    }

    @Override // com.ironsource.InterfaceC3552k5
    public InterfaceC3392b6 d() {
        return this.f28284a;
    }

    @Override // com.ironsource.InterfaceC3552k5
    public bk.l<Result<? extends JSONObject>, mj.r> i() {
        return this.f28287d;
    }

    @Override // com.ironsource.InterfaceC3552k5
    public C8 k() {
        return this.f28288e;
    }

    @Override // com.ironsource.InterfaceC3552k5
    public C7 l() {
        return this.f28286c;
    }

    @Override // com.ironsource.Oc
    public void a(C8 c10, C3731u8 c3731u8) {
        ck.p.j(c3731u8, "error");
        bk.l<Result<? extends JSONObject>, mj.r> lVarI = i();
        Result.a aVar = Result.Companion;
        lVarI.invoke(Result.m3457boximpl(Result.m3458constructorimpl(kotlin.c.a(new Exception("Unable to download abTestMap.json: " + c3731u8.b())))));
    }
}
