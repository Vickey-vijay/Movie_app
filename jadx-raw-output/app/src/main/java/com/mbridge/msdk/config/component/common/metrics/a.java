package com.mbridge.msdk.config.component.common.metrics;

import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: ComponentMetrics.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f33078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f33079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f33080c;

    /* JADX INFO: compiled from: ComponentMetrics.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33081a = new a();
    }

    public static a a() {
        return b.f33081a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.f33080c = new JSONObject(map);
            } catch (Exception e10) {
                q0.b("ComponentMetrics", e10.getMessage());
            }
        }
    }

    private a() {
    }

    private m c() {
        try {
            m mVar = this.f33078a;
            if (mVar == null) {
                m mVarB = m.b("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), b());
                this.f33078a = mVarB;
                if (mVarB != null) {
                    JSONObject jSONObject = this.f33080c;
                    if (jSONObject != null) {
                        mVarB.a(jSONObject);
                    }
                    this.f33078a.h();
                }
            } else {
                JSONObject jSONObject2 = this.f33080c;
                if (jSONObject2 != null) {
                    mVar.a(jSONObject2);
                }
            }
        } catch (Exception e10) {
            q0.b("ComponentMetrics", e10.getMessage());
        }
        return this.f33078a;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                String strValueOf = String.valueOf(map.get(C3426d4.i.W));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e eVar = new e(strValueOf);
                    eVar.a(jSONObject);
                    eVar.b(0);
                    eVar.a(0);
                    c().d(eVar);
                }
            } catch (Throwable th2) {
                q0.b("ComponentMetrics", th2.getMessage(), th2);
            }
        }
    }

    public void d() {
        if (this.f33078a == null) {
            this.f33078a = c();
        }
        this.f33078a.a();
    }

    private x b() {
        if (this.f33079b == null) {
            this.f33079b = new x.b().a(604800000).b(50).d(50).c(15000).e(2).a(new d()).a(new f() { // from class: com.mbridge.msdk.config.component.common.metrics.c
                @Override // com.mbridge.msdk.tracker.f
                public final boolean a(e eVar) {
                    return a.a(eVar);
                }
            }).a(new n()).a(0, new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().f35030d, 0)).a();
        }
        return this.f33079b;
    }

    public void a(x xVar) {
        if (xVar != null) {
            this.f33079b = xVar;
            m mVar = this.f33078a;
            if (mVar != null) {
                mVar.a("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), xVar);
            }
        }
    }
}
