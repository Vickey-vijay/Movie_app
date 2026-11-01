package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class A4 implements S8, R8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A7 f25928a;

    /* JADX WARN: Multi-variable type inference failed */
    public A4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.R8
    public void a(Context context, EnumC3812z4 enumC3812z4, String str, String str2) {
        mj.r rVar;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(enumC3812z4, "source");
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "value");
        F4 f4A = this.f25928a.a(context, enumC3812z4);
        if (f4A != null) {
            f4A.b(str, str2);
            rVar = mj.r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + enumC3812z4);
        }
    }

    public A4(A7 a10) {
        ck.p.j(a10, "sharedSignalsStorageFactory");
        this.f25928a = a10;
    }

    @Override // com.ironsource.S8
    public String a(Context context, EnumC3812z4 enumC3812z4, String str) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(enumC3812z4, "source");
        ck.p.j(str, C3426d4.i.W);
        F4 f4A = this.f25928a.a(context, enumC3812z4);
        if (f4A != null) {
            return F4.a(f4A, str, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + enumC3812z4);
        return null;
    }

    public /* synthetic */ A4(A7 a10, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new D4() : a10);
    }
}
