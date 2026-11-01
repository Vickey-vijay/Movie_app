package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.vt.lh.vt.rn;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class ra extends ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.ouw.yu f11176cf;
    private final vt ryl;

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i10) {
        super.vt(canvas, matrix, i10);
        this.f11176cf.ouw(canvas, matrix, i10);
    }

    public ra(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar, vt vtVar, com.bytedance.adsdk.vt.ra raVar) {
        super(blyVar, fkwVar);
        this.ryl = vtVar;
        com.bytedance.adsdk.vt.ouw.ouw.yu yuVar = new com.bytedance.adsdk.vt.ouw.ouw.yu(blyVar, this, new rn("__container", fkwVar.ouw, false), raVar);
        this.f11176cf = yuVar;
        yuVar.ouw(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final com.bytedance.adsdk.vt.fkw.tlj lh() {
        com.bytedance.adsdk.vt.fkw.tlj tljVarLh = super.lh();
        if (tljVarLh != null) {
            return tljVarLh;
        }
        return this.ryl.lh();
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        super.ouw(rectF, matrix, z10);
        this.f11176cf.ouw(rectF, this.ouw, z10);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final com.bytedance.adsdk.vt.lh.vt.ouw vt() {
        com.bytedance.adsdk.vt.lh.vt.ouw ouwVarVt = super.vt();
        return ouwVarVt != null ? ouwVarVt : this.ryl.vt();
    }
}
