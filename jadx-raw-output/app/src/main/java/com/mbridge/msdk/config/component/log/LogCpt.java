package com.mbridge.msdk.config.component.log;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.log.LogCpt;
import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class LogCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.log.model.a f33417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f33418i;

    private p a(int i10) {
        return i10 == 1 ? new p(new m((byte) 2), this.f33417h.i(), this.f33417h.j()) : new p(new h(), this.f33417h.c(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f32957f = "913001";
        com.mbridge.msdk.config.component.log.model.a aVar = new com.mbridge.msdk.config.component.log.model.a();
        this.f33417h = aVar;
        aVar.a(map);
        this.f33418i = new x.b().a(this.f33417h.k()).b(this.f33417h.d()).d(this.f33417h.g()).c(this.f33417h.b()).e(this.f33417h.a()).a(new d()).a(new f() { // from class: t8.a
            @Override // com.mbridge.msdk.tracker.f
            public final boolean a(e eVar) {
                return LogCpt.a(eVar);
            }
        }).a(new n()).a(this.f33417h.f(), a(this.f33417h.f())).a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.common.metrics.a.a().a(this.f33418i);
        if (this.f33417h.h() != null) {
            com.mbridge.msdk.config.component.common.metrics.a.a().b(this.f33417h.h());
        }
        if (this.f33417h.e() == 1) {
            com.mbridge.msdk.config.component.common.metrics.a.a().d();
        }
    }
}
