package com.mbridge.msdk.config.component.vc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.ironsource.C3426d4;
import com.ironsource.C3605n2;
import com.mbridge.msdk.config.activity.MBRewardVideoActivity;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class VCCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static ConcurrentHashMap<String, VCCpt> f33614l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33615h = "1200001";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f33616i = "1200002";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f33617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.vc.model.a f33618k;

    public static class b implements com.mbridge.msdk.config.activity.lifecycle.a, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f33619a;

        private b() {
        }

        public void a(String str) {
            this.f33619a = str;
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void e() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void f() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void onStart() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a(ViewGroup viewGroup) {
            VCCpt vCCpt;
            if (VCCpt.f33614l == null || VCCpt.f33614l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f33614l.get(this.f33619a)) == null) {
                return;
            }
            Object objB = vCCpt.f32955d.b("sdk_context");
            if (objB instanceof Map) {
                ((Map) objB).put("rootView", viewGroup);
            } else {
                HashMap map = new HashMap();
                map.put("rootView", viewGroup);
                vCCpt.f32955d.a("sdk_context", map);
            }
            vCCpt.a(vCCpt.a("902002", new HashMap()));
            vCCpt.a(vCCpt.a("902003", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void b() {
            VCCpt vCCpt;
            if (VCCpt.f33614l != null && !VCCpt.f33614l.isEmpty() && (vCCpt = (VCCpt) VCCpt.f33614l.get(this.f33619a)) != null) {
                vCCpt.a(vCCpt.a("902007", new HashMap()));
                vCCpt.c(C3426d4.i.f28569u0);
            }
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void c() {
            if (VCCpt.f33614l != null && !VCCpt.f33614l.isEmpty() && ((VCCpt) VCCpt.f33614l.get(this.f33619a)) != null) {
                q0.b("RenderViewComponent", "onBackPressed clicked");
            }
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a() {
            VCCpt vCCpt;
            if (VCCpt.f33614l == null || VCCpt.f33614l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f33614l.get(this.f33619a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902006", new HashMap()));
            vCCpt.c("onStop");
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44969o);
        p10.startActivity(p11);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44969o);
        p10.startActivity(p11);
    }

    private void a(String str, String str2) {
        a("902008", str, str2);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0039 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r4) {
        /*
            r3 = this;
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a r0 = r3.f32955d
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "sdk_context"
            java.lang.Object r0 = r0.b(r1)
            boolean r1 = r0 instanceof java.util.Map     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L43
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "lifecycleListeners"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L39
            boolean r1 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L43
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L39
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L36
        L22:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L36
            com.mbridge.msdk.config.component.vc.inter.a r2 = (com.mbridge.msdk.config.component.vc.inter.a) r2     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L22
            r2.a(r4)     // Catch: java.lang.Throwable -> L36
            goto L22
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L43
        L36:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r4     // Catch: java.lang.Throwable -> L39
        L39:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            java.lang.String r1 = "RenderViewComponent"
            com.mbridge.msdk.foundation.tools.q0.b(r1, r0, r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.vc.VCCpt.c(java.lang.String):void");
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        Object objB = this.f32955d.b("sdk_context");
        if (objB instanceof Map) {
            ((Map) objB).put("lifecycleListeners", arrayList);
            return;
        }
        HashMap map = new HashMap();
        map.put("lifecycleListeners", arrayList);
        this.f32955d.a("sdk_context", map);
    }

    private void i() {
        a(a("902005", new HashMap()));
        k();
        if (e() == null || !(e().getContext() instanceof Activity)) {
            return;
        }
        ((Activity) e().getContext()).finish();
    }

    private void j() {
        String strA = this.f33618k.a();
        if (TextUtils.isEmpty(strA)) {
            a("1200001", "Input parameter error");
            return;
        }
        byte b10 = -1;
        try {
            int iHashCode = strA.hashCode();
            if (iHashCode != 3529469) {
                if (iHashCode == 94756344 && strA.equals("close")) {
                    b10 = 1;
                }
            } else if (strA.equals(C3605n2.f30216v)) {
                b10 = 0;
            }
            if (b10 == 0) {
                l();
            } else {
                if (b10 != 1) {
                    return;
                }
                i();
            }
        } catch (Exception e10) {
            q0.b("RenderViewComponent", "Error in doRenderTemplateAction", e10);
            a("1200002", "Root view render fail");
        }
    }

    private void k() {
        try {
            Object objB = this.f32955d.b("sdk_context");
            if (objB instanceof Map) {
                Map map = (Map) objB;
                Object obj = map.get("lifecycleListeners");
                if (obj instanceof List) {
                    ((List) obj).clear();
                }
                Object obj2 = map.get("component_cache");
                if (obj2 instanceof Map) {
                    ((Map) obj2).clear();
                }
            }
            ConcurrentHashMap<String, VCCpt> concurrentHashMap = f33614l;
            if (concurrentHashMap != null) {
                concurrentHashMap.remove(this.f33617j);
                if (f33614l.isEmpty()) {
                    f33614l = null;
                }
            }
        } catch (Throwable th2) {
            q0.b("RenderViewComponent", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f32957f = "902001";
        this.f33618k = new com.mbridge.msdk.config.component.vc.model.a(map);
        f33614l = new ConcurrentHashMap<>();
        String string = UUID.randomUUID().toString();
        this.f33617j = string;
        f33614l.put(string, this);
    }

    private void l() {
        h();
        Intent intent = new Intent(c.n().d(), (Class<?>) MBRewardVideoActivity.class);
        intent.putExtra("hide_status_bar", this.f33618k.c());
        intent.putExtra("modal", this.f33618k.d());
        intent.putExtra("width", this.f33618k.f());
        intent.putExtra("height", this.f33618k.b());
        intent.putExtra("orientation", this.f33618k.e());
        b bVar = new b();
        bVar.a(this.f33617j);
        intent.putExtra("lifecycleCallbackByActivity", bVar);
        try {
            if (c.n() != null && c.n().f() != null) {
                safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533((Activity) c.n().f(), intent);
                return;
            }
        } catch (Throwable th2) {
            q0.b("RenderViewComponent", th2.getMessage());
        }
        intent.addFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(c.n().d(), intent);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        j();
    }
}
