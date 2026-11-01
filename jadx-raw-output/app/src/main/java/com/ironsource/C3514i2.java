package com.ironsource;

import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3514i2 extends com.ironsource.mediationsdk.e.a {
    @Override // com.ironsource.mediationsdk.e.a
    public void a(boolean z10, S1 s10, long j10) {
        try {
            if (z10) {
                ((InterfaceC3388b2) s10).a(this.f29780b, this.f29784f + 1, j10, this.f29788j, this.f29787i);
            } else {
                s10.a(this.f29781c, this.f29782d, this.f29784f + 1, this.f29785g, j10);
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            s10.a(1009, e10.getMessage(), this.f29784f + 1, this.f29785g, j10);
        }
    }

    public C3514i2(S1 s10, URL url, JSONObject jSONObject, boolean z10, C3641p2 c3641p2) {
        super(s10, url, jSONObject, z10, c3641p2);
    }
}
