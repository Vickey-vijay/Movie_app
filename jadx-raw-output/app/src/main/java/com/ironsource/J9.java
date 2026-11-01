package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes7.dex */
public class J9 extends AbstractC3692s3 {
    private static J9 R;
    private String P;
    private final P8 Q = Lb.U().s();

    @Override // com.ironsource.AbstractC3692s3
    public boolean d(C5 c10) {
        int iC = c10.c();
        return iC == D5.IS_CALLBACK_LOAD_SUCCESS.b() || iC == D5.IS_INSTANCE_OPENED.b() || iC == D5.IS_INSTANCE_CLOSED.b() || iC == D5.IS_AUCTION_SUCCESS.b() || iC == D5.IS_AUCTION_FAILED.b() || iC == D5.BN_INSTANCE_SHOW.b() || iC == D5.BN_AUCTION_SUCCESS.b() || iC == D5.BN_AUCTION_FAILED.b() || iC == D5.NT_INSTANCE_LOAD_SUCCESS.b() || iC == D5.NT_INSTANCE_SHOW.b() || iC == D5.NT_AUCTION_SUCCESS.b() || iC == D5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC3692s3
    public boolean j(C5 c10) {
        return false;
    }

    public static synchronized J9 i() {
        if (R == null) {
            J9 j10 = new J9();
            R = j10;
            j10.e();
        }
        return R;
    }

    @Override // com.ironsource.AbstractC3692s3
    public String e(int i10) {
        return this.P;
    }

    private J9() {
        this.H = K5.f26926a;
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    @Override // com.ironsource.AbstractC3692s3
    public int c(C5 c10) {
        int iF = f(c10.c());
        if (iF == AbstractC3692s3.e.BANNER.b()) {
            return this.Q.a(IronSource.a.BANNER);
        }
        if (iF == AbstractC3692s3.e.NATIVE_AD.b()) {
            return this.Q.a(IronSource.a.NATIVE_AD);
        }
        return this.Q.a(IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC3692s3
    public void f(C5 c10) {
        this.P = c10.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC3692s3
    public void d() {
        this.J.add(Integer.valueOf(D5.IS_LOAD_CALLED.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.IS_CALLBACK_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(D5.IS_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(D5.BN_LOAD.b()));
        this.J.add(Integer.valueOf(D5.BN_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.BN_RELOAD.b()));
        this.J.add(Integer.valueOf(D5.BN_CALLBACK_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.BN_CALLBACK_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_RELOAD.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.BN_INSTANCE_SHOW.b()));
        this.J.add(Integer.valueOf(D5.NT_LOAD.b()));
        this.J.add(Integer.valueOf(D5.NT_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.NT_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(D5.NT_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(D5.NT_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(D5.NT_INSTANCE_SHOW.b()));
    }
}
