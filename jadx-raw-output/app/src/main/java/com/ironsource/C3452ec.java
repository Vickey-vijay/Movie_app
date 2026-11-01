package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3452ec extends AbstractC3639p0 {
    @Override // com.ironsource.AbstractC3639p0
    public D a() {
        return new D() { // from class: com.ironsource.xk
            @Override // com.ironsource.D
            public final A a(B b10, H h10) {
                return C3452ec.a(this.f31608a, b10, h10);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3452ec(C3621o0 c3621o0, C3470fc c3470fc, InterfaceC3488gc interfaceC3488gc) {
        String str;
        int iB;
        super(c3621o0, c3470fc, interfaceC3488gc, null, 8, null);
        ck.p.j(c3621o0, "adTools");
        ck.p.j(c3470fc, "adUnitData");
        ck.p.j(interfaceC3488gc, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3489gd c3489gdG = g();
        IronLog.INTERNAL.verbose("placement = " + c3489gdG);
        if (c3489gdG == null || TextUtils.isEmpty(c3489gdG.c())) {
            ck.w wVar = ck.w.f6066a;
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c3489gdG == null ? "placement is null" : "placement name is empty"}, 1));
            ck.p.i(str, "format(format, *args)");
            iB = A0.b(c3470fc.b().a());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A a(C3452ec c3452ec, B b10, H h10) {
        ck.p.j(c3452ec, "this$0");
        ck.p.j(b10, "adInstanceData");
        ck.p.j(h10, "adInstancePayload");
        return new Wb(new W0(c3452ec.f(), E0.b.PROVIDER), b10, h10, new AbstractC3639p0.a());
    }
}
