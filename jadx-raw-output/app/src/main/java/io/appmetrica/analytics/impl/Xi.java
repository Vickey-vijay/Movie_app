package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Xi extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4572uf f56165b;

    public Xi(@NonNull Y4 y10) {
        this(y10, C4418oa.k().t());
    }

    public Xi(Y4 y10, C4572uf c4572uf) {
        super(y10);
        this.f56165b = c4572uf;
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        JSONObject jSONObjectOptJSONObject;
        try {
            jSONObjectOptJSONObject = new JSONObject(q10.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        this.f56165b.b(C4497rf.a(jSONObjectOptJSONObject));
        return false;
    }
}
