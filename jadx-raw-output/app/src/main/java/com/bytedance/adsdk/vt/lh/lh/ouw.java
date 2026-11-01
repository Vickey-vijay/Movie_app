package com.bytedance.adsdk.vt.lh.lh;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.vt.lh.vt.jg;
import com.bytedance.adsdk.vt.ouw.vt.rn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ouw implements com.bytedance.adsdk.vt.ouw.ouw.fkw, com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw {
    public final Matrix bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private final List<com.bytedance.adsdk.vt.ouw.vt.ouw<?, ?>> f11159cd;
    private final String ex;
    public final rn fkw;
    private ouw jae;
    private final RectF jqy;
    private ouw ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f11163le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final fkw f11164lh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private List<ouw> f11165od;
    public final Matrix ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private Paint f11166pd;
    public BlurMaskFilter pno;
    private final RectF qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public float f11167ra;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.pno f11169tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final RectF f11170th;
    public float tlj;
    private boolean uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final Paint f11171vm;
    private final RectF vpp;
    public final com.bytedance.adsdk.vt.bly vt;
    public com.bytedance.adsdk.vt.ouw.vt.yu yu;
    private final Paint zih;
    private final RectF zin;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final Path f11160cf = new Path();
    private final Matrix ryl = new Matrix();
    private final Matrix mwh = new Matrix();

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Paint f11161jg = new com.bytedance.adsdk.vt.ouw.ouw(1);

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final Paint f11162ko = new com.bytedance.adsdk.vt.ouw.ouw(PorterDuff.Mode.DST_IN, (byte) 0);

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final Paint f11168rn = new com.bytedance.adsdk.vt.ouw.ouw(PorterDuff.Mode.DST_OUT, (byte) 0);

    private void lh(float f10) {
        this.vt.ouw.ouw.ouw(this.f11164lh.f11144lh, f10);
    }

    public static ouw ouw(vt vtVar, fkw fkwVar, com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, Context context) {
        switch (AnonymousClass2.ouw[fkwVar.fkw.ordinal()]) {
            case 1:
                return new ra(blyVar, fkwVar, vtVar, raVar);
            case 2:
                return new vt(blyVar, fkwVar, raVar.vt.get(fkwVar.f11145ra), raVar, context);
            case 3:
                return new pno(blyVar, fkwVar);
            case 4:
                if (ouw(blyVar, fkwVar, "text:")) {
                    return new lh(blyVar, fkwVar, context);
                }
                return ouw(blyVar, fkwVar, "videoview:") ? new tlj(blyVar, fkwVar) : new yu(blyVar, fkwVar);
            case 5:
                return new le(blyVar, fkwVar);
            case 6:
                return new bly(blyVar, fkwVar);
            default:
                com.bytedance.adsdk.vt.le.yu.vt("Unknown layer type " + fkwVar.fkw);
                return null;
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<com.bytedance.adsdk.vt.ouw.ouw.lh> list, List<com.bytedance.adsdk.vt.ouw.ouw.lh> list2) {
    }

    public final void vt(ouw ouwVar) {
        this.jae = ouwVar;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.lh.lh.ouw$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] ouw;
        public static final /* synthetic */ int[] vt;

        static {
            int[] iArr = new int[com.bytedance.adsdk.vt.lh.vt.pno.ouw.values().length];
            vt = iArr;
            try {
                iArr[com.bytedance.adsdk.vt.lh.vt.pno.ouw.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                vt[com.bytedance.adsdk.vt.lh.vt.pno.ouw.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                vt[com.bytedance.adsdk.vt.lh.vt.pno.ouw.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                vt[com.bytedance.adsdk.vt.lh.vt.pno.ouw.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[fkw.ouw.values().length];
            ouw = iArr2;
            try {
                iArr2[fkw.ouw.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[fkw.ouw.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ouw[fkw.ouw.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ouw[fkw.ouw.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ouw[fkw.ouw.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ouw[fkw.ouw.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ouw[fkw.ouw.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private boolean fkw() {
        com.bytedance.adsdk.vt.ouw.vt.pno pnoVar = this.f11169tc;
        return (pnoVar == null || pnoVar.ouw.isEmpty()) ? false : true;
    }

    private void le() {
        if (this.f11165od != null) {
            return;
        }
        if (this.jae == null) {
            this.f11165od = Collections.emptyList();
            return;
        }
        this.f11165od = new ArrayList();
        for (ouw ouwVar = this.jae; ouwVar != null; ouwVar = ouwVar.jae) {
            this.f11165od.add(ouwVar);
        }
    }

    private boolean yu() {
        return this.ksc != null;
    }

    public void vt(Canvas canvas, Matrix matrix, int i10) {
        ouw(i10);
    }

    public ouw(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        com.bytedance.adsdk.vt.ouw.ouw ouwVar = new com.bytedance.adsdk.vt.ouw.ouw(1);
        this.zih = ouwVar;
        this.f11171vm = new com.bytedance.adsdk.vt.ouw.ouw(PorterDuff.Mode.CLEAR);
        this.f11170th = new RectF();
        this.qbp = new RectF();
        this.zin = new RectF();
        this.vpp = new RectF();
        this.jqy = new RectF();
        this.ouw = new Matrix();
        this.f11159cd = new ArrayList();
        this.f11163le = true;
        this.f11167ra = 0.0f;
        this.bly = new Matrix();
        this.tlj = 1.0f;
        this.vt = blyVar;
        this.f11164lh = fkwVar;
        this.ex = fkwVar.f11144lh + "#draw";
        if (fkwVar.zin == fkw.vt.INVERT) {
            ouwVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            ouwVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        rn rnVarOuw = fkwVar.bly.ouw();
        this.fkw = rnVarOuw;
        rnVarOuw.ouw((com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw) this);
        List<com.bytedance.adsdk.vt.lh.vt.pno> list = fkwVar.pno;
        if (list != null && !list.isEmpty()) {
            com.bytedance.adsdk.vt.ouw.vt.pno pnoVar = new com.bytedance.adsdk.vt.ouw.vt.pno(fkwVar.pno);
            this.f11169tc = pnoVar;
            Iterator<com.bytedance.adsdk.vt.ouw.vt.ouw<jg, Path>> it = pnoVar.ouw.iterator();
            while (it.hasNext()) {
                it.next().ouw(this);
            }
            for (com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar2 : this.f11169tc.vt) {
                ouw(ouwVar2);
                ouwVar2.ouw(this);
            }
        }
        if (!this.f11164lh.qbp.isEmpty()) {
            com.bytedance.adsdk.vt.ouw.vt.yu yuVar = new com.bytedance.adsdk.vt.ouw.vt.yu(this.f11164lh.qbp);
            this.yu = yuVar;
            yuVar.vt = true;
            yuVar.ouw(new com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw() { // from class: com.bytedance.adsdk.vt.lh.lh.ouw.1
                @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
                public final void ouw() {
                    ouw ouwVar3 = ouw.this;
                    ouwVar3.vt(ouwVar3.yu.pno() == 1.0f);
                }
            });
            vt(this.yu.le().floatValue() == 1.0f);
            ouw(this.yu);
            return;
        }
        vt(true);
    }

    public final void vt(boolean z10) {
        if (z10 != this.f11163le) {
            this.f11163le = z10;
            this.vt.invalidateSelf();
        }
    }

    public com.bytedance.adsdk.vt.lh.vt.ouw vt() {
        return this.f11164lh.jqy;
    }

    public com.bytedance.adsdk.vt.fkw.tlj lh() {
        return this.f11164lh.ex;
    }

    public final BlurMaskFilter vt(float f10) {
        if (this.f11167ra == f10) {
            return this.pno;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.pno = blurMaskFilter;
        this.f11167ra = f10;
        return blurMaskFilter;
    }

    public void ouw(boolean z10) {
        if (z10 && this.f11166pd == null) {
            this.f11166pd = new com.bytedance.adsdk.vt.ouw.ouw();
        }
        this.uq = z10;
    }

    public final void ouw(ouw ouwVar) {
        this.ksc = ouwVar;
    }

    public final void ouw(com.bytedance.adsdk.vt.ouw.vt.ouw<?, ?> ouwVar) {
        if (ouwVar == null) {
            return;
        }
        this.f11159cd.add(ouwVar);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public void ouw(RectF rectF, Matrix matrix, boolean z10) {
        this.f11170th.set(0.0f, 0.0f, 0.0f, 0.0f);
        le();
        this.ouw.set(matrix);
        if (z10) {
            List<ouw> list = this.f11165od;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.ouw.preConcat(this.f11165od.get(size).fkw.ouw());
                }
            } else {
                ouw ouwVar = this.jae;
                if (ouwVar != null) {
                    this.ouw.preConcat(ouwVar.fkw.ouw());
                }
            }
        }
        this.ouw.preConcat(this.fkw.ouw());
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i10) {
        float f10;
        Paint paint;
        boolean z10;
        Integer numLe;
        com.bytedance.adsdk.vt.fkw.ouw(this.ex);
        if (this.f11163le && !this.f11164lh.vpp) {
            le();
            com.bytedance.adsdk.vt.fkw.ouw("Layer#parentMatrix");
            this.bly.set(matrix);
            this.ryl.reset();
            this.ryl.set(matrix);
            int i11 = 1;
            for (int size = this.f11165od.size() - 1; size >= 0; size--) {
                this.ryl.preConcat(this.f11165od.get(size).fkw.ouw());
            }
            com.bytedance.adsdk.vt.fkw.vt("Layer#parentMatrix");
            int iIntValue = 100;
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar = this.fkw.fkw;
            if (ouwVar != null && (numLe = ouwVar.le()) != null) {
                iIntValue = numLe.intValue();
            }
            int i12 = (int) ((((i10 / 255.0f) * iIntValue) / 100.0f) * 255.0f);
            if (!yu() && !fkw()) {
                this.ryl.preConcat(this.fkw.ouw());
                com.bytedance.adsdk.vt.fkw.ouw("Layer#drawLayer");
                vt(canvas, this.ryl, i12);
                com.bytedance.adsdk.vt.fkw.vt("Layer#drawLayer");
                lh(com.bytedance.adsdk.vt.fkw.vt(this.ex));
                return;
            }
            com.bytedance.adsdk.vt.fkw.ouw("Layer#computeBounds");
            ouw(this.f11170th, this.ryl, false);
            RectF rectF = this.f11170th;
            if (yu() && this.f11164lh.zin != fkw.vt.INVERT) {
                this.vpp.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.ksc.ouw(this.vpp, matrix, true);
                if (!rectF.intersect(this.vpp)) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.ryl.preConcat(this.fkw.ouw());
            RectF rectF2 = this.f11170th;
            Matrix matrix2 = this.ryl;
            this.zin.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i13 = 3;
            int i14 = 2;
            if (fkw()) {
                int size2 = this.f11169tc.f11303lh.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size2) {
                        com.bytedance.adsdk.vt.lh.vt.pno pnoVar = this.f11169tc.f11303lh.get(i15);
                        Path pathLe = this.f11169tc.ouw.get(i15).le();
                        if (pathLe != null) {
                            this.f11160cf.set(pathLe);
                            this.f11160cf.transform(matrix2);
                            int i16 = AnonymousClass2.vt[pnoVar.ouw.ordinal()];
                            if (i16 != i11 && i16 != i14 && ((i16 != i13 && i16 != 4) || !pnoVar.yu)) {
                                this.f11160cf.computeBounds(this.jqy, false);
                                if (i15 == 0) {
                                    this.zin.set(this.jqy);
                                } else {
                                    RectF rectF3 = this.zin;
                                    rectF3.set(Math.min(rectF3.left, this.jqy.left), Math.min(this.zin.top, this.jqy.top), Math.max(this.zin.right, this.jqy.right), Math.max(this.zin.bottom, this.jqy.bottom));
                                }
                            }
                        }
                        i15++;
                        i11 = 1;
                        i13 = 3;
                        i14 = 2;
                    } else if (!rectF2.intersect(this.zin)) {
                        f10 = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        break;
                    }
                    f10 = 0.0f;
                    break;
                }
            } else {
                f10 = 0.0f;
            }
            this.qbp.set(f10, f10, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.mwh);
            if (!this.mwh.isIdentity()) {
                Matrix matrix3 = this.mwh;
                matrix3.invert(matrix3);
                this.mwh.mapRect(this.qbp);
            }
            if (!this.f11170th.intersect(this.qbp)) {
                this.f11170th.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.vt.fkw.vt("Layer#computeBounds");
            if (this.f11170th.width() >= 1.0f && this.f11170th.height() >= 1.0f) {
                com.bytedance.adsdk.vt.fkw.ouw("Layer#saveLayer");
                this.f11161jg.setAlpha(255);
                com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f11170th, this.f11161jg);
                com.bytedance.adsdk.vt.fkw.vt("Layer#saveLayer");
                ouw(canvas);
                com.bytedance.adsdk.vt.fkw.ouw("Layer#drawLayer");
                vt(canvas, this.ryl, i12);
                com.bytedance.adsdk.vt.fkw.vt("Layer#drawLayer");
                if (fkw()) {
                    Matrix matrix4 = this.ryl;
                    com.bytedance.adsdk.vt.fkw.ouw("Layer#saveLayer");
                    com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f11170th, this.f11162ko, 19);
                    if (Build.VERSION.SDK_INT < 28) {
                        ouw(canvas);
                    }
                    com.bytedance.adsdk.vt.fkw.vt("Layer#saveLayer");
                    for (int i17 = 0; i17 < this.f11169tc.f11303lh.size(); i17++) {
                        com.bytedance.adsdk.vt.lh.vt.pno pnoVar2 = this.f11169tc.f11303lh.get(i17);
                        com.bytedance.adsdk.vt.ouw.vt.ouw<jg, Path> ouwVar2 = this.f11169tc.ouw.get(i17);
                        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar3 = this.f11169tc.vt.get(i17);
                        int i18 = AnonymousClass2.vt[pnoVar2.ouw.ordinal()];
                        if (i18 == 1) {
                            if (this.f11169tc.ouw.isEmpty()) {
                                z10 = false;
                                break;
                            }
                            int i19 = 0;
                            while (true) {
                                if (i19 >= this.f11169tc.f11303lh.size()) {
                                    z10 = true;
                                    break;
                                } else {
                                    if (this.f11169tc.f11303lh.get(i19).ouw != com.bytedance.adsdk.vt.lh.vt.pno.ouw.MASK_MODE_NONE) {
                                        z10 = false;
                                        break;
                                    }
                                    i19++;
                                }
                            }
                            if (z10) {
                                this.f11161jg.setAlpha(255);
                                canvas.drawRect(this.f11170th, this.f11161jg);
                            }
                        } else if (i18 == 2) {
                            if (i17 == 0) {
                                this.f11161jg.setColor(ViewCompat.MEASURED_STATE_MASK);
                                this.f11161jg.setAlpha(255);
                                canvas.drawRect(this.f11170th, this.f11161jg);
                            }
                            if (pnoVar2.yu) {
                                com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f11170th, this.f11168rn);
                                canvas.drawRect(this.f11170th, this.f11161jg);
                                this.f11168rn.setAlpha((int) (ouwVar3.le().intValue() * 2.55f));
                                this.f11160cf.set(ouwVar2.le());
                                this.f11160cf.transform(matrix4);
                                canvas.drawPath(this.f11160cf, this.f11168rn);
                                canvas.restore();
                            } else {
                                this.f11160cf.set(ouwVar2.le());
                                this.f11160cf.transform(matrix4);
                                canvas.drawPath(this.f11160cf, this.f11168rn);
                            }
                        } else if (i18 != 3) {
                            if (i18 == 4) {
                                if (pnoVar2.yu) {
                                    com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f11170th, this.f11161jg);
                                    canvas.drawRect(this.f11170th, this.f11161jg);
                                    this.f11160cf.set(ouwVar2.le());
                                    this.f11160cf.transform(matrix4);
                                    this.f11161jg.setAlpha((int) (ouwVar3.le().intValue() * 2.55f));
                                    canvas.drawPath(this.f11160cf, this.f11168rn);
                                    canvas.restore();
                                } else {
                                    this.f11160cf.set(ouwVar2.le());
                                    this.f11160cf.transform(matrix4);
                                    this.f11161jg.setAlpha((int) (ouwVar3.le().intValue() * 2.55f));
                                    canvas.drawPath(this.f11160cf, this.f11161jg);
                                }
                            }
                        } else if (pnoVar2.yu) {
                            com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f11170th, this.f11162ko);
                            canvas.drawRect(this.f11170th, this.f11161jg);
                            this.f11168rn.setAlpha((int) (ouwVar3.le().intValue() * 2.55f));
                            this.f11160cf.set(ouwVar2.le());
                            this.f11160cf.transform(matrix4);
                            canvas.drawPath(this.f11160cf, this.f11168rn);
                            canvas.restore();
                        } else {
                            com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f11170th, this.f11162ko);
                            this.f11160cf.set(ouwVar2.le());
                            this.f11160cf.transform(matrix4);
                            this.f11161jg.setAlpha((int) (ouwVar3.le().intValue() * 2.55f));
                            canvas.drawPath(this.f11160cf, this.f11161jg);
                            canvas.restore();
                        }
                    }
                    com.bytedance.adsdk.vt.fkw.ouw("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.vt.fkw.vt("Layer#restoreLayer");
                }
                if (yu()) {
                    com.bytedance.adsdk.vt.fkw.ouw("Layer#drawMatte");
                    com.bytedance.adsdk.vt.fkw.ouw("Layer#saveLayer");
                    com.bytedance.adsdk.vt.le.pno.ouw(canvas, this.f11170th, this.zih, 19);
                    com.bytedance.adsdk.vt.fkw.vt("Layer#saveLayer");
                    ouw(canvas);
                    this.ksc.ouw(canvas, matrix, i12);
                    com.bytedance.adsdk.vt.fkw.ouw("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.vt.fkw.vt("Layer#restoreLayer");
                    com.bytedance.adsdk.vt.fkw.vt("Layer#drawMatte");
                }
                com.bytedance.adsdk.vt.fkw.ouw("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.vt.fkw.vt("Layer#restoreLayer");
            }
            if (this.uq && (paint = this.f11166pd) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f11166pd.setColor(-251901);
                this.f11166pd.setStrokeWidth(4.0f);
                canvas.drawRect(this.f11170th, this.f11166pd);
                this.f11166pd.setStyle(Paint.Style.FILL);
                this.f11166pd.setColor(1357638635);
                canvas.drawRect(this.f11170th, this.f11166pd);
            }
            lh(com.bytedance.adsdk.vt.fkw.vt(this.ex));
            return;
        }
        com.bytedance.adsdk.vt.fkw.vt(this.ex);
    }

    private void ouw(Canvas canvas) {
        com.bytedance.adsdk.vt.fkw.ouw("Layer#clearLayer");
        RectF rectF = this.f11170th;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f11171vm);
        com.bytedance.adsdk.vt.fkw.vt("Layer#clearLayer");
    }

    public final void ouw(int i10) {
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar = this.fkw.fkw;
        this.tlj = ((ouwVar != null ? ouwVar.le().intValue() : 100) / 100.0f) * (i10 / 255.0f);
    }

    public void ouw(float f10) {
        rn rnVar = this.fkw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar = rnVar.fkw;
        if (ouwVar != null) {
            ouwVar.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar2 = rnVar.pno;
        if (ouwVar2 != null) {
            ouwVar2.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, Float> ouwVar3 = rnVar.bly;
        if (ouwVar3 != null) {
            ouwVar3.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVar4 = rnVar.ouw;
        if (ouwVar4 != null) {
            ouwVar4.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> ouwVar5 = rnVar.vt;
        if (ouwVar5 != null) {
            ouwVar5.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.ra.lh, com.bytedance.adsdk.vt.ra.lh> ouwVar6 = rnVar.f11307lh;
        if (ouwVar6 != null) {
            ouwVar6.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar7 = rnVar.yu;
        if (ouwVar7 != null) {
            ouwVar7.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar = rnVar.f11306le;
        if (yuVar != null) {
            yuVar.ouw(f10);
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar2 = rnVar.f11308ra;
        if (yuVar2 != null) {
            yuVar2.ouw(f10);
        }
        if (this.f11169tc != null) {
            for (int i10 = 0; i10 < this.f11169tc.ouw.size(); i10++) {
                this.f11169tc.ouw.get(i10).ouw(f10);
            }
        }
        com.bytedance.adsdk.vt.ouw.vt.yu yuVar3 = this.yu;
        if (yuVar3 != null) {
            yuVar3.ouw(f10);
        }
        ouw ouwVar8 = this.ksc;
        if (ouwVar8 != null) {
            ouwVar8.ouw(f10);
        }
        for (int i11 = 0; i11 < this.f11159cd.size(); i11++) {
            this.f11159cd.get(i11).ouw(f10);
        }
    }

    private static boolean ouw(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar, String str) {
        com.bytedance.adsdk.vt.tlj tljVarYu;
        if (blyVar == null || fkwVar == null || (tljVarYu = blyVar.yu(fkwVar.f11145ra)) == null) {
            return false;
        }
        return str.equals(tljVarYu.fkw);
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0078ouw
    public final void ouw() {
        this.vt.invalidateSelf();
    }
}
