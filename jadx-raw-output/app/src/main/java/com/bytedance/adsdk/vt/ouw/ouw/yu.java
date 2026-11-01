package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yu implements fkw, mwh, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {
    private final com.bytedance.adsdk.vt.bly bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.rn f11283cf;
    private final RectF fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final String f11284le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Matrix f11285lh;
    private final Paint ouw;
    private final List<lh> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final boolean f11286ra;
    private List<mwh> tlj;
    private final RectF vt;
    private final Path yu;

    public yu(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, String str, boolean z10, List<lh> list, com.bytedance.adsdk.vt.lh.ouw.ryl rylVar) {
        this.ouw = new com.bytedance.adsdk.vt.ouw.ouw();
        this.vt = new RectF();
        this.f11285lh = new Matrix();
        this.yu = new Path();
        this.fkw = new RectF();
        this.f11284le = str;
        this.bly = blyVar;
        this.f11286ra = z10;
        this.pno = list;
        if (rylVar != null) {
            com.bytedance.adsdk.vt.ouw.vt.rn rnVarOuw = rylVar.ouw();
            this.f11283cf = rnVarOuw;
            rnVarOuw.ouw(ouwVar);
            this.f11283cf.ouw(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            lh lhVar = list.get(size);
            if (lhVar instanceof tlj) {
                arrayList.add((tlj) lhVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((tlj) arrayList.get(size2)).ouw(list.listIterator(list.size()));
        }
    }

    private static List<lh> ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, List<com.bytedance.adsdk.vt.lh.vt.lh> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            lh lhVarOuw = list.get(i10).ouw(blyVar, raVar, ouwVar);
            if (lhVarOuw != null) {
                arrayList.add(lhVarOuw);
            }
        }
        return arrayList;
    }

    public final Matrix lh() {
        com.bytedance.adsdk.vt.ouw.vt.rn rnVar = this.f11283cf;
        if (rnVar != null) {
            return rnVar.ouw();
        }
        this.f11285lh.reset();
        return this.f11285lh;
    }

    public final List<mwh> vt() {
        if (this.tlj == null) {
            this.tlj = new ArrayList();
            for (int i10 = 0; i10 < this.pno.size(); i10++) {
                lh lhVar = this.pno.get(i10);
                if (lhVar instanceof mwh) {
                    this.tlj.add((mwh) lhVar);
                }
            }
        }
        return this.tlj;
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        this.f11285lh.reset();
        com.bytedance.adsdk.vt.ouw.vt.rn rnVar = this.f11283cf;
        if (rnVar != null) {
            this.f11285lh.set(rnVar.ouw());
        }
        this.yu.reset();
        if (this.f11286ra) {
            return this.yu;
        }
        for (int size = this.pno.size() - 1; size >= 0; size--) {
            lh lhVar = this.pno.get(size);
            if (lhVar instanceof mwh) {
                this.yu.addPath(((mwh) lhVar).yu(), this.f11285lh);
            }
        }
        return this.yu;
    }

    private static com.bytedance.adsdk.vt.lh.ouw.ryl ouw(List<com.bytedance.adsdk.vt.lh.vt.lh> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.adsdk.vt.lh.vt.lh lhVar = list.get(i10);
            if (lhVar instanceof com.bytedance.adsdk.vt.lh.ouw.ryl) {
                return (com.bytedance.adsdk.vt.lh.ouw.ryl) lhVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.bly.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.pno.size());
        arrayList.addAll(list);
        for (int size = this.pno.size() - 1; size >= 0; size--) {
            lh lhVar = this.pno.get(size);
            lhVar.ouw(arrayList, this.pno.subList(0, size));
            arrayList.add(lhVar);
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        if (this.f11286ra) {
            return;
        }
        this.f11285lh.set(matrix);
        com.bytedance.adsdk.vt.ouw.vt.rn rnVar = this.f11283cf;
        if (rnVar != null) {
            this.f11285lh.preConcat(rnVar.ouw());
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar = this.f11283cf.fkw;
            i10 = (int) (((((ouwVar == null ? 100 : ouwVar.le().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z11 = false;
        if (this.bly.jqy) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= this.pno.size()) {
                    z10 = false;
                    break;
                } else {
                    if ((this.pno.get(i11) instanceof fkw) && (i12 = i12 + 1) >= 2) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            }
            if (z10 && i10 != 255) {
                z11 = true;
            }
        }
        if (z11) {
            this.vt.set(0.0f, 0.0f, 0.0f, 0.0f);
            ouw(this.vt, this.f11285lh, true);
            this.ouw.setAlpha(i10);
            com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.vt, this.ouw);
        }
        if (z11) {
            i10 = 255;
        }
        for (int size = this.pno.size() - 1; size >= 0; size--) {
            lh lhVar = this.pno.get(size);
            if (lhVar instanceof fkw) {
                ((fkw) lhVar).ouw(canvas, this.f11285lh, i10);
            }
        }
        if (z11) {
            canvas.restore();
        }
    }

    public yu(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.rn rnVar, com.bytedance.adsdk.vt.ra raVar) {
        this(blyVar, ouwVar, rnVar.ouw, rnVar.f11214lh, ouw(blyVar, raVar, ouwVar, rnVar.vt), ouw(rnVar.vt));
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        this.f11285lh.set(matrix);
        com.bytedance.adsdk.vt.ouw.vt.rn rnVar = this.f11283cf;
        if (rnVar != null) {
            this.f11285lh.preConcat(rnVar.ouw());
        }
        this.fkw.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.pno.size() - 1; size >= 0; size--) {
            lh lhVar = this.pno.get(size);
            if (lhVar instanceof fkw) {
                ((fkw) lhVar).ouw(this.fkw, this.f11285lh, z10);
                rectF.union(this.fkw);
            }
        }
    }
}
