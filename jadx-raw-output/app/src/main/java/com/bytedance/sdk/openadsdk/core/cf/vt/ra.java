package com.bytedance.sdk.openadsdk.core.cf.vt;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.zih;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.adexpress.vt.pno;
import com.bytedance.sdk.component.adexpress.vt.tlj;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.bly.ko;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class ra implements tlj {
    private AtomicBoolean fkw = new AtomicBoolean(false);

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private ko f12667le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private Context f12668lh;
    public com.bytedance.sdk.openadsdk.core.cf.le.yu ouw;
    public mwh vt;
    private ScheduledFuture<?> yu;

    public class ouw implements Runnable {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private int f12669lh = 1;
        public tlj.ouw ouw;

        public ouw(tlj.ouw ouwVar) {
            this.ouw = ouwVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f12669lh == 1) {
                com.bytedance.sdk.component.utils.ko.vt("RenderInterceptor", "ugen Render timeout");
                ra.this.ouw.le();
                ra.this.ouw(this.ouw, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "real time out" + ra.this.vt.f11597lh);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final void ouw() {
    }

    public final void ouw(ko koVar) {
        this.f12667le = koVar;
        this.ouw.ouw(koVar);
    }

    public final void vt() {
        try {
            ScheduledFuture<?> scheduledFuture = this.yu;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.yu.cancel(false);
                this.yu = null;
            }
            com.bytedance.sdk.component.utils.ko.vt("RenderInterceptor", "ugen Render cancel timeout timer");
        } catch (Throwable th2) {
            qbp.yu("RenderInterceptor", "remove ugen time out task fail", th2.getMessage());
        }
    }

    public ra(Context context, com.bytedance.sdk.openadsdk.core.cf.le.yu yuVar, pno pnoVar, mwh mwhVar) {
        this.f12668lh = context;
        this.ouw = yuVar;
        this.vt = mwhVar;
        this.ouw.ouw(pnoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final boolean ouw(final tlj.ouw ouwVar) {
        int i10 = this.vt.f11597lh;
        if (i10 < 0) {
            ouw(ouwVar, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "time is ".concat(String.valueOf(i10)));
            return true;
        }
        if (!(this.ouw instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu)) {
            this.yu = bs.ouw().schedule(new ouw(ouwVar), i10, TimeUnit.MILLISECONDS);
        }
        this.ouw.ouw(new com.bytedance.sdk.component.adexpress.vt.ra() { // from class: com.bytedance.sdk.openadsdk.core.cf.vt.ra.1
            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(View view, jg jgVar) {
                ra.this.vt();
                if (ouwVar.yu()) {
                    return;
                }
                zih zihVar = new zih();
                zihVar.ouw = 0;
                ra raVar = ra.this;
                if (raVar.ouw instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) {
                    raVar.vt.vt.pno();
                } else {
                    ((com.bytedance.sdk.openadsdk.core.cf.le.ouw) raVar.vt).f12608cd.ouw(zihVar);
                }
                ra.this.vt.vt.cf();
                com.bytedance.sdk.component.adexpress.vt.ko koVarVt = ouwVar.vt();
                if (koVarVt == null) {
                    return;
                }
                koVarVt.ouw(ra.this.ouw, jgVar);
                ouwVar.lh();
            }

            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(int i11, String str) {
                ra.this.ouw(ouwVar, i11, str);
            }
        });
        return true;
    }

    public final void ouw(tlj.ouw ouwVar, int i10, String str) {
        com.bytedance.sdk.component.adexpress.vt.ko koVarVt;
        if (ouwVar.yu() || this.fkw.get()) {
            return;
        }
        vt();
        zih zihVar = new zih();
        zihVar.ouw = i10;
        zihVar.vt = str;
        ((com.bytedance.sdk.openadsdk.core.cf.le.ouw) this.vt).f12608cd.ouw(zihVar);
        if (ouwVar.vt(this)) {
            ouwVar.ouw(this);
        } else {
            if (ouwVar.yu() || (koVarVt = ouwVar.vt()) == null) {
                return;
            }
            ouwVar.lh();
            koVarVt.a_(i10);
        }
        this.fkw.getAndSet(true);
    }
}
