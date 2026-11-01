package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C3514i2;
import com.ironsource.C3641p2;
import com.ironsource.S1;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3641p2 f29803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29804b;

    @Override // com.ironsource.mediationsdk.g
    public e.a a(Context context, i iVar, S1 s10) throws JSONException {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(iVar, "auctionRequestParams");
        ck.p.j(s10, "auctionListener");
        JSONObject jSONObjectA = a(context, iVar);
        String strA = this.f29803a.a(iVar.s());
        return iVar.s() ? new C3514i2(s10, new URL(strA), jSONObjectA, iVar.t(), this.f29803a) : new e.a(s10, new URL(strA), jSONObjectA, iVar.t(), this.f29803a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.f29803a.g() > 0;
    }

    public f(C3641p2 c3641p2, String str) {
        ck.p.j(c3641p2, "settings");
        ck.p.j(str, JsonStorageKeyNames.SESSION_ID_KEY);
        this.f29803a = c3641p2;
        this.f29804b = str;
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.f29803a.n();
    }

    private final JSONObject a(Context context, i iVar) throws JSONException {
        JSONObject jSONObjectA = d.b().a(iVar);
        ck.p.i(jSONObjectA, "getInstance().enrichToke…low(auctionRequestParams)");
        return jSONObjectA;
    }
}
