package com.bytedance.sdk.openadsdk.core.bly;

import com.bytedance.sdk.openadsdk.utils.bs;
import com.ironsource.C3426d4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class mwh implements com.bytedance.adsdk.ugeno.core.vm, com.bytedance.sdk.component.adexpress.vt.bly {
    private long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f12530le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.yu.yu.fkw f12531lh;
    public final String ouw;
    public final com.bytedance.sdk.openadsdk.core.model.vpp vt;
    private final String yu;

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void fkw() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "WebView start load");
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void le() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "webview render success");
        this.f12531lh.vt();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void lh(int i10) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicParseEnd() called with: renderType = [" + i10 + C3426d4.j.f28588e);
        if (i10 == 3) {
            this.f12531lh.yu("dynamic_sub_analysis2_end");
        } else {
            this.f12531lh.yu("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void ouw(boolean z10) {
        this.f12531lh.ouw(z10 ? 1 : 0);
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "webview start request");
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void vt(int i10) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicParseStart() called with: renderType = [" + i10 + C3426d4.j.f28588e);
        if (i10 == 3) {
            this.f12531lh.yu("dynamic_sub_analysis2_start");
        } else {
            this.f12531lh.yu("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void yu() {
        this.f12531lh.ouw();
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "start render ");
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void bly() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "no native render");
        this.f12531lh.ko();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void cf() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "render success");
        this.f12531lh.vt();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void fkw(int i10) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicRealRenderEnd() called with: renderType = [" + i10 + C3426d4.j.f28588e);
        if (i10 == 3) {
            this.f12531lh.yu("dynamic_sub_render2_end");
        } else {
            this.f12531lh.yu("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void pno() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "native success");
        this.f12531lh.ryl();
        this.f12531lh.jg();
        bs.vt(new com.bytedance.sdk.component.pno.pno("native_success") { // from class: com.bytedance.sdk.openadsdk.core.bly.mwh.2
            @Override // java.lang.Runnable
            public final void run() {
                mwh mwhVar = mwh.this;
                com.bytedance.sdk.openadsdk.yu.lh.vt(mwhVar.vt, mwhVar.ouw, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void ra() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "native render start");
        this.f12531lh.lh();
    }

    public final void ryl() {
        this.f12531lh.cf();
        this.f12531lh.mwh();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void tlj() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "render fail");
        this.f12531lh.rn();
    }

    public mwh(com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar, String str, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str2, boolean z10) {
        this.f12531lh = fkwVar;
        this.ouw = str;
        this.yu = str2;
        this.vt = vppVar;
        this.f12530le = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void le(int i10) {
        final String str;
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "dynamic render success render type: " + i10 + "; ****cost time(ms): " + (System.currentTimeMillis() - this.fkw) + "****");
        if (i10 == 3) {
            this.f12531lh.ra("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.f12531lh.ra("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.f12531lh.ryl();
        bs.vt(new com.bytedance.sdk.component.pno.pno("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.bly.mwh.1
            @Override // java.lang.Runnable
            public final void run() {
                mwh mwhVar = mwh.this;
                com.bytedance.sdk.openadsdk.yu.lh.vt(mwhVar.vt, mwhVar.ouw, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void ouw(int i10, String str) {
        this.f12531lh.ouw(i10, str);
        cf.ouw("Web", i10, str, this.ouw, this.yu, this.vt);
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onWebViewFail() called with: errorCode = [" + i10 + C3426d4.j.f28588e);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void yu(int i10) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicRealRenderStart() called with: renderType = [" + i10 + C3426d4.j.f28588e);
        if (i10 == 3) {
            this.f12531lh.yu("dynamic_sub_render2_start");
        } else {
            this.f12531lh.yu("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.vm
    public final void lh() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "ugen real render start ");
        this.f12531lh.fkw("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.vm
    public final void vt() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "ugen parse end");
        this.f12531lh.fkw("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void ouw(int i10) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicStart() called with: renderType = [" + i10 + C3426d4.j.f28588e);
        this.fkw = System.currentTimeMillis();
        if (i10 == 3) {
            this.f12531lh.lh("dynamic_render2_start");
        } else {
            this.f12531lh.lh("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.bly
    public final void ouw(int i10, int i11, String str, boolean z10) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "onDynamicFail() called with: renderType = [" + i10 + "], errorCode = [" + i11 + "], hasNext = [" + z10 + C3426d4.j.f28588e);
        if (!z10) {
            this.f12531lh.ryl();
        }
        if (i10 == 3) {
            this.f12531lh.vt(i11, "dynamic_render2_error");
        } else {
            this.f12531lh.vt(i11, "dynamic_render_error");
        }
        cf.ouw("NDR", i11, str, this.ouw, this.yu, this.vt);
    }

    @Override // com.bytedance.adsdk.ugeno.core.vm
    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "ugen parse start");
        this.f12531lh.ouw("ugen_render_start", this.f12530le);
        this.f12531lh.fkw("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.vm
    public final void ouw(com.bytedance.adsdk.ugeno.core.zih zihVar) {
        com.bytedance.sdk.component.utils.ko.vt("ExpressRenderEventMonitor", "ugen real render end ");
        int i10 = zihVar.ouw;
        if (i10 == 0) {
            this.f12531lh.fkw("ugen_sub_render_end");
            this.f12531lh.le("ugen_render_success");
        } else {
            this.f12531lh.lh(i10, "ugen_render_error");
            cf.ouw("UGen", zihVar.ouw, zihVar.vt, this.ouw, this.yu, this.vt);
        }
        this.f12531lh.ryl();
    }
}
