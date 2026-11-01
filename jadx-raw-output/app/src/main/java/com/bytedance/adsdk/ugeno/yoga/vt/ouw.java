package com.bytedance.adsdk.ugeno.yoga.vt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.yoga.fkw;
import com.bytedance.adsdk.ugeno.yoga.le;
import com.bytedance.adsdk.ugeno.yoga.mwh;
import com.bytedance.adsdk.ugeno.yoga.ryl;
import com.bytedance.adsdk.ugeno.yoga.tlj;
import com.bytedance.adsdk.ugeno.yoga.yu;

/* JADX INFO: loaded from: classes.dex */
public class ouw extends com.bytedance.adsdk.ugeno.vt.ouw<lh> {
    private com.bytedance.adsdk.ugeno.yoga.ouw byv;
    private tlj ehk;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.yoga.ouw f11043fn;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    public fkw f11044ln;
    private mwh qni;
    private le smu;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.vt.ouw$ouw, reason: collision with other inner class name */
    public static class C0076ouw extends com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw {
        public int bs;

        /* JADX INFO: renamed from: cd, reason: collision with root package name */
        public int f11045cd;
        private boolean ey;
        public int fak;
        private boolean fqk;
        public int fvf;
        private boolean hun;
        public float jae;
        private boolean jvy;
        public int ksc;

        /* JADX INFO: renamed from: od, reason: collision with root package name */
        public float f11046od;
        public float osn;

        /* JADX INFO: renamed from: pd, reason: collision with root package name */
        public int f11047pd;
        private boolean rrs;
        public int uoy;
        public float uq;
        private boolean ux;

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw
        public final void ouw(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.ouw(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasis":
                    this.ey = true;
                    float fOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, -1.0f);
                    this.uq = fOuw;
                    this.uq = ra.ouw(context, fOuw);
                    break;
                case "bottom":
                    this.jvy = true;
                    this.bs = (int) ra.ouw(context, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0));
                    break;
                case "top":
                    this.rrs = true;
                    this.fvf = (int) ra.ouw(context, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0));
                    break;
                case "left":
                    this.fqk = true;
                    this.fak = (int) ra.ouw(context, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0));
                    break;
                case "order":
                    this.ksc = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1);
                    break;
                case "ratio":
                    this.ux = true;
                    this.osn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                    break;
                case "right":
                    this.hun = true;
                    this.uoy = (int) ra.ouw(context, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0));
                    break;
                case "position":
                    this.f11047pd = ryl.ouw(str2).yu;
                    break;
                case "flexShrink":
                    this.f11046od = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.jae = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.f11045cd = com.bytedance.adsdk.ugeno.yoga.ouw.ouw(str2).tlj;
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw
        public final String toString() {
            return "LayoutParams{mOrder=" + this.ksc + ", mFlexGrow=" + this.jae + ", mFlexShrink=" + this.f11046od + ", mAlignSelf=" + this.f11045cd + ", mFlexBasis=" + this.uq + ", mPosition=" + this.f11047pd + ", mTop=" + this.fvf + ", mBottom=" + this.bs + ", mLeft=" + this.fak + ", mRight=" + this.uoy + '}';
        }

        public C0076ouw(com.bytedance.adsdk.ugeno.vt.ouw ouwVar) {
            super(ouwVar);
            this.ksc = 1;
            this.jae = 0.0f;
            this.f11046od = 1.0f;
            this.f11045cd = com.bytedance.adsdk.ugeno.yoga.ouw.AUTO.tlj;
            this.uq = -1.0f;
            this.f11047pd = ryl.RELATIVE.yu;
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw
        public final /* synthetic */ ViewGroup.LayoutParams ouw() {
            com.bytedance.adsdk.ugeno.vt.ouw ouwVar = this.f11011tc;
            boolean z10 = true;
            if (ouwVar instanceof ouw) {
                if (((ouw) ouwVar).f11044ln == fkw.ROW && ouwVar.od() == -2 && this.ouw == -1.0f && !this.f11011tc.fak()) {
                    this.ouw = -2.0f;
                    this.f11046od = 1.0f;
                    this.jae = 1.0f;
                    this.ey = true;
                    this.uq = -1.0f;
                }
                com.bytedance.adsdk.ugeno.vt.ouw ouwVar2 = this.f11011tc;
                if (((ouw) ouwVar2).f11044ln == fkw.COLUMN && ouwVar2.cd() == -2 && this.vt == -1.0f && !this.f11011tc.fak()) {
                    this.vt = -2.0f;
                    this.f11046od = 1.0f;
                    this.jae = 1.0f;
                    this.ey = true;
                    this.uq = -1.0f;
                }
            }
            lh.ouw ouwVar3 = new lh.ouw((int) this.ouw, (int) this.vt);
            float f10 = (int) (this.qbp ? this.f11007le : this.fkw);
            ouwVar3.yu = f10;
            ouwVar3.ouw.put(18, Float.valueOf(f10));
            float f11 = (int) (this.zin ? this.f11009ra : this.fkw);
            ouwVar3.f11037le = f11;
            ouwVar3.ouw.put(20, Float.valueOf(f11));
            float f12 = (int) (this.vpp ? this.pno : this.fkw);
            ouwVar3.f11038lh = f12;
            ouwVar3.ouw.put(17, Float.valueOf(f12));
            float f13 = (int) (this.jqy ? this.bly : this.fkw);
            ouwVar3.fkw = f13;
            ouwVar3.ouw.put(19, Float.valueOf(f13));
            float f14 = this.ksc;
            ouwVar3.f11039ra = f14;
            ouwVar3.ouw.put(5, Float.valueOf(f14));
            float f15 = this.f11045cd;
            ouwVar3.bly = f15;
            ouwVar3.ouw.put(9, Float.valueOf(f15));
            ouwVar3.ouw(this.jae);
            ouwVar3.vt(this.f11046od);
            float f16 = this.f11008lh;
            ouwVar3.mwh = f16;
            ouwVar3.ouw.put(27, Float.valueOf(f16));
            float f17 = this.yu;
            ouwVar3.f11035jg = f17;
            ouwVar3.ouw.put(28, Float.valueOf(f17));
            if (this.ey) {
                float f18 = this.uq;
                ouwVar3.pno = f18;
                ouwVar3.ouw.put(8, Float.valueOf(f18));
            }
            ouwVar3.lh(this.f11047pd);
            if (this.rrs) {
                ouwVar3.yu(this.fvf);
            }
            if (this.jvy) {
                float f19 = this.bs;
                ouwVar3.tlj = f19;
                ouwVar3.ouw.put(12, Float.valueOf(f19));
            }
            if (this.fqk) {
                ouwVar3.fkw(this.fak);
            }
            if (this.hun) {
                float f20 = this.uoy;
                ouwVar3.f11034cf = f20;
                ouwVar3.ouw.put(13, Float.valueOf(f20));
            }
            if (this.ux) {
                float f21 = this.ouw;
                if ((f21 == -1.0f && this.vt == -1.0f) || (f21 != -2.0f && this.vt != -2.0f)) {
                    z10 = false;
                }
                if (z10) {
                    float f22 = this.osn;
                    if (f22 > 0.0f) {
                        ouwVar3.ryl = f22;
                        ouwVar3.ouw.put(25, Float.valueOf(f22));
                        ouwVar3.vt(0.0f);
                        ouwVar3.ouw(0.0f);
                    }
                }
            }
            return ouwVar3;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final /* synthetic */ com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw bly() {
        return new C0076ouw(this);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.bly.yu.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.yu.ouw(this.vt);
        ouwVar.setImageDrawable(drawable);
        if (!this.hun || (scaleType = this.rrs) == ImageView.ScaleType.FIT_XY) {
            ouwVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            ouwVar.setScaleType(scaleType);
        }
        ouwVar.setCornerRadius(this.ux);
        lh.ouw ouwVar2 = new lh.ouw(-1, -1);
        ouwVar2.lh(ryl.ABSOLUTE.yu);
        ouwVar2.yu(0.0f);
        ouwVar2.fkw(0.0f);
        T t10 = this.fkw;
        if (t10 instanceof lh) {
            ((lh) t10).addView(ouwVar, 0, ouwVar2);
            ouw(ouwVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void tlj() {
        if (this.f10990pd) {
            this.ehk.vt(yu.ALL, this.ksc);
        }
        if (this.fvf) {
            this.ehk.vt(yu.LEFT, this.jae);
        }
        if (this.bs) {
            this.ehk.vt(yu.RIGHT, this.f10989od);
        }
        if (this.fak) {
            this.ehk.vt(yu.TOP, this.f10974cd);
        }
        if (this.uoy) {
            this.ehk.vt(yu.BOTTOM, this.uq);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public void vt() {
        super.vt();
        this.ehk.ouw(this.f11044ln);
        this.ehk.ouw(this.qni);
        this.ehk.ouw(this.smu);
        this.ehk.ouw(this.f11043fn);
        this.ehk.lh(this.byv);
        this.ehk.jg();
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void zin() {
        ImageView.ScaleType scaleType;
        if (this.fqk) {
            com.bytedance.adsdk.ugeno.fkw.ouw().f10849lh.ouw(this.bly, this.ey, new com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw() { // from class: com.bytedance.adsdk.ugeno.yoga.vt.ouw.1
                @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw
                public final void ouw(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (ouw.this.ms != null) {
                            com.bytedance.adsdk.ugeno.core.le unused = ouw.this.ms;
                            String unused2 = ouw.this.ey;
                            return;
                        }
                        return;
                    }
                    if (ouw.this.ms != null) {
                        com.bytedance.adsdk.ugeno.core.le unused3 = ouw.this.ms;
                        String unused4 = ouw.this.ey;
                    }
                    final Bitmap bitmapOuw = ra.ouw(ouw.this.vt, bitmap, (int) ouw.this.jvy);
                    if (bitmapOuw != null) {
                        ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.vt.ouw.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ouw.this.ouw(new BitmapDrawable(bitmapOuw));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.bly.yu.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.yu.ouw(this.vt);
        com.bytedance.adsdk.ugeno.ouw ouwVar2 = com.bytedance.adsdk.ugeno.fkw.ouw().f10849lh;
        cf cfVar = this.bly;
        String str = this.ey;
        int width = this.fkw.getWidth();
        int height = this.fkw.getHeight();
        new com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw() { // from class: com.bytedance.adsdk.ugeno.yoga.vt.ouw.2
            @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw
            public final void ouw(Bitmap bitmap) {
                if (bitmap == null) {
                    if (ouw.this.ms != null) {
                        com.bytedance.adsdk.ugeno.core.le unused = ouw.this.ms;
                        String unused2 = ouw.this.ey;
                        return;
                    }
                    return;
                }
                if (ouw.this.ms != null) {
                    com.bytedance.adsdk.ugeno.core.le unused3 = ouw.this.ms;
                    String unused4 = ouw.this.ey;
                }
            }
        };
        ouwVar2.ouw(cfVar, str, ouwVar, width, height);
        if (!this.hun || (scaleType = this.rrs) == ImageView.ScaleType.FIT_XY) {
            ouwVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            ouwVar.setScaleType(scaleType);
        }
        ouwVar.setCornerRadius(this.ux);
        lh.ouw ouwVar3 = new lh.ouw(-1, -1);
        ouwVar3.lh(ryl.ABSOLUTE.yu);
        ouwVar3.yu(0.0f);
        ouwVar3.fkw(0.0f);
        T t10 = this.fkw;
        if (t10 instanceof lh) {
            ((lh) t10).addView(ouwVar, 0, ouwVar3);
            ouw(ouwVar);
        }
    }

    public ouw(Context context) {
        super(context);
        this.f11044ln = fkw.ROW;
        this.qni = mwh.NO_WRAP;
        this.smu = le.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.ouw ouwVar = com.bytedance.adsdk.ugeno.yoga.ouw.STRETCH;
        this.f11043fn = ouwVar;
        this.byv = ouwVar;
    }

    private void ouw(final com.bytedance.adsdk.ugeno.bly.yu.ouw ouwVar) {
        this.fkw.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.vt.ouw.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                tlj tljVarOuw;
                if (ouw.this.fkw == null || (tljVarOuw = ((lh) ouw.this.fkw).ouw(ouwVar)) == null) {
                    return;
                }
                int width = ouw.this.fkw.getWidth();
                tljVarOuw.yu(width);
                int height = ouw.this.fkw.getHeight();
                tljVarOuw.fkw(height);
                ouwVar.setCornerRadius(ouw.this.ux);
                ouw.this.fkw.requestLayout();
                if (width > 0 || height > 0) {
                    ouw.this.fkw.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        super.ouw(lhVar);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, ViewGroup.LayoutParams layoutParams) {
        if (lhVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.add(lhVar);
        View view = lhVar.fkw;
        if (view != null) {
            ((lh) this.fkw).addView(view, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.f11043fn = com.bytedance.adsdk.ugeno.yoga.ouw.ouw(str2);
                break;
            case "flexDirection":
                this.f11044ln = fkw.ouw(str2);
                break;
            case "alignContent":
                this.byv = com.bytedance.adsdk.ugeno.yoga.ouw.ouw(str2);
                break;
            case "flexWrap":
                this.qni = mwh.ouw(str2);
                break;
            case "justifyContent":
                this.smu = le.ouw(str2);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        lh lhVar = new lh(this.vt);
        lhVar.ouw = this;
        this.ehk = lhVar.getYogaNode();
        return lhVar;
    }
}
