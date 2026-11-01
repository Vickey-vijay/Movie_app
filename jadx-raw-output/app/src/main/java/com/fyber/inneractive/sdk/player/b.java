package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f16145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f16146b;

    public final a a() {
        com.fyber.inneractive.sdk.config.t0 t0Var;
        UnitDisplayType unitDisplayType;
        if (this.f16146b == null) {
            Application application = com.fyber.inneractive.sdk.util.o.f18599a;
            t0 t0Var2 = this.f16145a;
            com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var2.f15747b;
            s0 s0Var = t0Var2.f15749d;
            InneractiveAdRequest inneractiveAdRequest = t0Var2.f15746a;
            com.fyber.inneractive.sdk.measurement.e eVar = null;
            if (s0Var != null) {
                Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.l) t0Var2.f15748c.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c(com.ironsource.mediationsdk.metadata.a.f29888j);
                boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
                IAlog.a("OMSDK AB %s", String.valueOf(zBooleanValue));
                if (zBooleanValue && (t0Var = ((r0) this.f16145a.f15749d).f15149f) != null && ((unitDisplayType = t0Var.f15209j) == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED)) {
                    eVar = IAConfigManager.O.K;
                }
            }
            this.f16146b = new n(application, gVar, s0Var, inneractiveAdRequest, t0Var2, eVar);
        }
        return this.f16146b;
    }

    public b(t0 t0Var) {
        this.f16145a = t0Var;
    }
}
