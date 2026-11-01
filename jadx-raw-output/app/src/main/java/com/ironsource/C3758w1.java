package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3758w1 extends AbstractC3692s3 {
    @Override // com.ironsource.AbstractC3692s3
    public int c(C5 c10) {
        return 1;
    }

    @Override // com.ironsource.AbstractC3692s3
    public void d() {
    }

    @Override // com.ironsource.AbstractC3692s3
    public String e(int i10) {
        return "";
    }

    @Override // com.ironsource.AbstractC3692s3
    public void f(C5 c10) {
    }

    @Override // com.ironsource.AbstractC3692s3
    public boolean h(C5 c10) {
        return false;
    }

    @Override // com.ironsource.AbstractC3692s3
    public boolean j(C5 c10) {
        return false;
    }

    @Override // com.ironsource.AbstractC3692s3
    public boolean d(C5 c10) {
        ck.p.j(c10, "event");
        int iC = c10.c();
        return iC == D5.FIRST_INSTANCE.b() || iC == D5.INIT_COMPLETE.b() || iC == D5.SDK_INIT_FAILED.b() || iC == D5.SDK_INIT_SUCCESS.b();
    }

    public C3758w1() {
        this.H = K5.f26927b;
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }
}
