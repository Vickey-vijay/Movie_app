package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class fkw {
    public Context bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public ouw f10834cf;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public mwh f10835le;
    private boolean mwh;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public mwh f10837ra;
    public boolean tlj;
    public float ouw = Float.MIN_VALUE;
    public float vt = Float.MIN_VALUE;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f10836lh = 0;
    private int ryl = Integer.MAX_VALUE;
    public int yu = Integer.MAX_VALUE;
    public AtomicBoolean fkw = new AtomicBoolean(true);

    public fkw(Context context, mwh mwhVar, boolean z10, boolean z11) {
        this.bly = context;
        this.f10835le = mwhVar;
        this.tlj = z10;
        this.mwh = z11;
        vt();
    }

    public final void ouw() {
        this.ouw = Float.MIN_VALUE;
        this.vt = Float.MIN_VALUE;
    }

    private void vt() {
        if (this.mwh) {
            this.f10834cf = new ouw();
        }
        mwh mwhVar = this.f10835le;
        if (mwhVar == null) {
            return;
        }
        this.f10836lh = mwhVar.f10810lh.optInt("slideThreshold");
        this.pno = this.f10835le.f10810lh.optString("slideDirection");
        this.ryl = this.f10835le.f10810lh.optInt("frequency", Integer.MAX_VALUE);
        this.yu = this.f10835le.f10810lh.optInt("effectiveDuration", Integer.MAX_VALUE);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.ryl + ", mEffectiveDuration: " + this.yu + ", inEffectiveDuation: " + this.fkw.get());
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (this.f10834cf != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.f10834cf.ouw(lhVar);
        }
    }

    public final void ouw(ko koVar, mwh mwhVar, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (this.ryl <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            ouw(lhVar);
        } else {
            if (!this.fkw.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                ouw(lhVar);
                return;
            }
            koVar.ouw(mwhVar, lhVar);
            int i10 = this.ryl;
            if (i10 != Integer.MAX_VALUE) {
                this.ryl = i10 - 1;
            }
        }
    }

    public fkw(Context context, mwh mwhVar, mwh mwhVar2, boolean z10, boolean z11) {
        this.bly = context;
        this.f10835le = mwhVar;
        this.f10837ra = mwhVar2;
        this.tlj = z10;
        this.mwh = z11;
        vt();
    }
}
