package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.ironsource.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3400be extends AbstractC3692s3 {
    private static C3400be R;
    private String P;
    private final P8 Q = Lb.U().s();

    @Override // com.ironsource.AbstractC3692s3
    public boolean d(C5 c10) {
        int iC = c10.c();
        return iC == D5.FIRST_INSTANCE.b() || iC == D5.INIT_COMPLETE.b() || iC == D5.SDK_INIT_FAILED.b() || iC == D5.SDK_INIT_SUCCESS.b() || iC == D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || iC == D5.RV_BUSINESS_INSTANCE_OPENED.b() || iC == D5.RV_INSTANCE_CLOSED.b() || iC == D5.RV_BUSINESS_INSTANCE_REWARDED.b() || iC == D5.RV_AUCTION_FAILED.b() || iC == D5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC3692s3
    public boolean j(C5 c10) {
        return false;
    }

    public static synchronized C3400be i() {
        if (R == null) {
            C3400be c3400be = new C3400be();
            R = c3400be;
            c3400be.e();
        }
        return R;
    }

    @Override // com.ironsource.AbstractC3692s3
    public int c(C5 c10) {
        return this.Q.a(IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC3692s3
    public String e(int i10) {
        return (i10 == 15 || (i10 >= 300 && i10 < 400)) ? this.P : "";
    }

    private C3400be() {
        this.H = K5.f26927b;
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    @Override // com.ironsource.AbstractC3692s3
    public void f(C5 c10) {
        if (c10.c() == 15 || (c10.c() >= 300 && c10.c() < 400)) {
            this.P = c10.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC3692s3
    public void d() {
        this.J.add(Integer.valueOf(D5.RV_BUSINESS_MEDIATION_LOAD.b()));
        this.J.add(Integer.valueOf(D5.RV_BUSINESS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.RV_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(D5.RV_INSTANCE_SHOW_CHANCE.b()));
        this.J.add(Integer.valueOf(D5.RV_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(D5.RV_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(D5.RV_INSTANCE_LOAD_FAILED_REASON.b()));
        this.J.add(Integer.valueOf(D5.RV_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(D5.RV_MEDIATION_LOAD_ERROR.b()));
    }
}
