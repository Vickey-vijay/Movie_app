package com.bytedance.adsdk.vt.lh.lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vt extends ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final List<ouw> f11179cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final RectF f11180jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final RectF f11181ko;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final Paint f11182rn;
    public boolean ryl;

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void ouw(boolean z10) {
        super.ouw(z10);
        Iterator<ouw> it = this.f11179cf.iterator();
        while (it.hasNext()) {
            it.next().ouw(z10);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.lh.lh.vt$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[fkw.vt.values().length];
            ouw = iArr;
            try {
                iArr[fkw.vt.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[fkw.vt.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public vt(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar, List<fkw> list, com.bytedance.adsdk.vt.ra raVar, Context context) {
        int i10;
        ouw ouwVar;
        fkw.vt vtVar;
        int i11;
        super(blyVar, fkwVar);
        this.f11179cf = new ArrayList();
        this.f11180jg = new RectF();
        this.f11181ko = new RectF();
        this.f11182rn = new Paint();
        this.ryl = true;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2 = fkwVar.f11147th;
        if (vtVar2 != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = vtVar2.ouw();
            this.mwh = ouwVarOuw;
            ouw(ouwVarOuw);
            this.mwh.ouw(this);
        } else {
            this.mwh = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(raVar.pno.size());
        int size = list.size() - 1;
        ouw ouwVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            fkw fkwVar2 = list.get(size);
            ouw ouwVarOuw2 = ouw.ouw(this, fkwVar2, blyVar, raVar, context);
            if (ouwVarOuw2 != null) {
                longSparseArray.put(ouwVarOuw2.f11164lh.yu, ouwVarOuw2);
                if (ouwVar2 != null) {
                    ouwVar2.ouw(ouwVarOuw2);
                    ouwVar2 = null;
                } else {
                    this.f11179cf.add(0, ouwVarOuw2);
                    if (fkwVar2 != null && (vtVar = fkwVar2.zin) != null && ((i11 = AnonymousClass1.ouw[vtVar.ordinal()]) == 1 || i11 == 2)) {
                        ouwVar2 = ouwVarOuw2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < longSparseArray.size(); i10++) {
            ouw ouwVar3 = (ouw) longSparseArray.get(longSparseArray.keyAt(i10));
            if (ouwVar3 != null && (ouwVar = (ouw) longSparseArray.get(ouwVar3.f11164lh.f11143le)) != null) {
                ouwVar3.vt(ouwVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        boolean z11;
        boolean zClipRect;
        super.vt(canvas, matrix, i10);
        com.bytedance.adsdk.vt.fkw.ouw("CompositionLayer#draw");
        RectF rectF = this.f11181ko;
        fkw fkwVar = this.f11164lh;
        rectF.set(0.0f, 0.0f, fkwVar.f11142ko, fkwVar.f11146rn);
        matrix.mapRect(this.f11181ko);
        if (this.vt.jqy && this.f11179cf.size() > 1 && i10 != 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f11182rn.setAlpha(i10);
            com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f11181ko, this.f11182rn);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f11179cf.size() - 1; size >= 0; size--) {
            if (!this.ryl && "__container".equals(this.f11164lh.f11144lh)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !this.f11181ko.isEmpty()) {
                zClipRect = canvas.clipRect(this.f11181ko);
            } else {
                zClipRect = true;
            }
            if (zClipRect) {
                this.f11179cf.get(size).ouw(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.vt.fkw.vt("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        super.ouw(rectF, matrix, z10);
        for (int size = this.f11179cf.size() - 1; size >= 0; size--) {
            this.f11180jg.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f11179cf.get(size).ouw(this.f11180jg, this.ouw, true);
            rectF.union(this.f11180jg);
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void ouw(float f10) {
        super.ouw(f10);
        if (this.mwh != null) {
            f10 = ((this.mwh.le().floatValue() * this.f11164lh.vt.ryl) - this.f11164lh.vt.tlj) / (this.vt.ouw.vt() + 0.01f);
        }
        if (this.mwh == null) {
            fkw fkwVar = this.f11164lh;
            f10 -= fkwVar.f11141jg / fkwVar.vt.vt();
        }
        fkw fkwVar2 = this.f11164lh;
        if (fkwVar2.mwh != 0.0f && !"__container".equals(fkwVar2.f11144lh)) {
            f10 /= this.f11164lh.mwh;
        }
        for (int size = this.f11179cf.size() - 1; size >= 0; size--) {
            this.f11179cf.get(size).ouw(f10);
        }
    }
}
