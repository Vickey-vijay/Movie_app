package com.bytedance.adsdk.vt;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bly extends Drawable implements Animatable, Drawable.Callback {
    public com.bytedance.adsdk.vt.vt.vt bly;
    private Rect bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private int f11077cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public yu f11078cf;
    public qbp ex;
    private Rect ey;
    private RectF fak;
    public boolean fkw;
    private Matrix fqk;
    private Canvas fvf;
    public View jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public String f11079jg;
    public boolean jqy;
    private Matrix jvy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public lh f11080ko;
    public RectF ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public vt f11081le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f11082lh;
    public Map<String, Typeface> mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public boolean f11083od;
    private Rect osn;
    public ra ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private Bitmap f11084pd;
    public final ValueAnimator.AnimatorUpdateListener pno;
    public com.bytedance.adsdk.vt.lh.lh.vt qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final ArrayList<ouw> f11085ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public zin f11086rn;
    private RectF rrs;
    public com.bytedance.adsdk.vt.vt.ouw ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public boolean f11087tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public boolean f11088th;
    public String tlj;
    private Paint uoy;
    private final Matrix uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public boolean f11089vm;
    public boolean vpp;
    public final com.bytedance.adsdk.vt.le.fkw vt;
    public boolean yu;
    public boolean zih;
    public boolean zin;

    public interface ouw {
        void ouw();
    }

    public enum vt {
        NONE,
        PLAY,
        RESUME
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void lh() {
        if (this.vt.isRunning()) {
            this.vt.cancel();
            if (!isVisible()) {
                this.f11081le = vt.NONE;
            }
        }
        this.ouw = null;
        this.qbp = null;
        this.bly = null;
        this.vt.ra();
        invalidateSelf();
    }

    public final void yu() {
        if (this.qbp == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.6
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.yu();
                }
            });
            return;
        }
        vt();
        if (tlj() || this.vt.getRepeatCount() == 0) {
            if (isVisible()) {
                this.vt.pno();
                this.f11081le = vt.NONE;
            } else {
                this.f11081le = vt.PLAY;
            }
        }
        if (tlj()) {
            return;
        }
        com.bytedance.adsdk.vt.le.fkw fkwVar = this.vt;
        lh((int) (fkwVar.ouw < 0.0f ? fkwVar.ryl() : fkwVar.mwh()));
        this.vt.bly();
        if (isVisible()) {
            return;
        }
        this.f11081le = vt.NONE;
    }

    private boolean tlj() {
        return this.f11082lh || this.yu;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f3  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        fkw.ouw("Drawable#draw");
        try {
            if (this.f11087tc) {
                com.bytedance.adsdk.vt.lh.lh.vt vtVar = this.qbp;
                if (this.ouw != null && vtVar != null) {
                    if (this.fvf == null) {
                        this.fvf = new Canvas();
                        this.ksc = new RectF();
                        this.jvy = new Matrix();
                        this.fqk = new Matrix();
                        this.bs = new Rect();
                        this.fak = new RectF();
                        this.uoy = new com.bytedance.adsdk.vt.ouw.ouw();
                        this.osn = new Rect();
                        this.ey = new Rect();
                        this.rrs = new RectF();
                    }
                    canvas.getMatrix(this.jvy);
                    canvas.getClipBounds(this.bs);
                    Rect rect = this.bs;
                    this.fak.set(rect.left, rect.top, rect.right, rect.bottom);
                    this.jvy.mapRect(this.fak);
                    ouw(this.fak, this.bs);
                    if (this.f11088th) {
                        this.ksc.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
                    } else {
                        vtVar.ouw(this.ksc, (Matrix) null, false);
                    }
                    this.jvy.mapRect(this.ksc);
                    Rect bounds = getBounds();
                    float fWidth = bounds.width() / getIntrinsicWidth();
                    float fHeight = bounds.height() / getIntrinsicHeight();
                    RectF rectF = this.ksc;
                    rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
                    Drawable.Callback callback = getCallback();
                    if (callback instanceof View) {
                        ViewParent parent = ((View) callback).getParent();
                        if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        RectF rectF2 = this.ksc;
                        Rect rect2 = this.bs;
                        rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    }
                    int iCeil = (int) Math.ceil(this.ksc.width());
                    int iCeil2 = (int) Math.ceil(this.ksc.height());
                    if (iCeil != 0 && iCeil2 != 0) {
                        Bitmap bitmap = this.f11084pd;
                        if (bitmap == null || bitmap.getWidth() < iCeil || this.f11084pd.getHeight() < iCeil2) {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
                            this.f11084pd = bitmapCreateBitmap;
                            this.fvf.setBitmap(bitmapCreateBitmap);
                            this.f11083od = true;
                        } else if (this.f11084pd.getWidth() > iCeil || this.f11084pd.getHeight() > iCeil2) {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f11084pd, 0, 0, iCeil, iCeil2);
                            this.f11084pd = bitmapCreateBitmap2;
                            this.fvf.setBitmap(bitmapCreateBitmap2);
                            this.f11083od = true;
                        }
                        if (this.f11083od) {
                            this.uq.set(this.jvy);
                            this.uq.preScale(fWidth, fHeight);
                            Matrix matrix = this.uq;
                            RectF rectF3 = this.ksc;
                            matrix.postTranslate(-rectF3.left, -rectF3.top);
                            this.f11084pd.eraseColor(0);
                            vtVar.ouw(this.fvf, this.uq, this.f11077cd);
                            this.jvy.invert(this.fqk);
                            this.fqk.mapRect(this.rrs, this.ksc);
                            ouw(this.rrs, this.ey);
                        }
                        this.osn.set(0, 0, iCeil, iCeil2);
                        canvas.drawBitmap(this.f11084pd, this.osn, this.ey, this.uoy);
                    }
                }
            } else {
                com.bytedance.adsdk.vt.lh.lh.vt vtVar2 = this.qbp;
                ra raVar = this.ouw;
                if (vtVar2 != null && raVar != null) {
                    this.uq.reset();
                    Rect bounds2 = getBounds();
                    if (!bounds2.isEmpty()) {
                        this.uq.preScale(bounds2.width() / raVar.bly.width(), bounds2.height() / raVar.bly.height());
                        this.uq.preTranslate(bounds2.left, bounds2.top);
                    }
                    vtVar2.ouw(canvas, this.uq, this.f11077cd);
                }
            }
        } catch (Throwable th2) {
            com.bytedance.adsdk.vt.le.yu.vt("Lottie crashed in draw!", th2);
        }
        this.f11083od = false;
        fkw.vt("Drawable#draw");
    }

    public final void fkw() {
        if (this.qbp == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.7
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.fkw();
                }
            });
            return;
        }
        vt();
        if (tlj() || this.vt.getRepeatCount() == 0) {
            if (isVisible()) {
                this.vt.cf();
                this.f11081le = vt.NONE;
            } else {
                this.f11081le = vt.RESUME;
            }
        }
        if (tlj()) {
            return;
        }
        com.bytedance.adsdk.vt.le.fkw fkwVar = this.vt;
        lh((int) (fkwVar.ouw < 0.0f ? fkwVar.ryl() : fkwVar.mwh()));
        this.vt.bly();
        if (isVisible()) {
            return;
        }
        this.f11081le = vt.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f11077cd;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return -1;
        }
        return raVar.bly.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return -1;
        }
        return raVar.bly.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f11083od) {
            return;
        }
        this.f11083od = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean le() {
        com.bytedance.adsdk.vt.le.fkw fkwVar = this.vt;
        if (fkwVar == null) {
            return false;
        }
        return fkwVar.isRunning();
    }

    public final qbp ouw() {
        return this.f11087tc ? qbp.SOFTWARE : qbp.HARDWARE;
    }

    public final com.bytedance.adsdk.vt.vt.vt pno() {
        com.bytedance.adsdk.vt.vt.vt vtVar = this.bly;
        if (vtVar != null && !vtVar.ouw(cf())) {
            this.bly = null;
        }
        if (this.bly == null) {
            this.bly = new com.bytedance.adsdk.vt.vt.vt(getCallback(), this.tlj, this.f11078cf, this.ouw.f11320lh);
        }
        return this.bly;
    }

    public final void ra() {
        this.f11085ra.clear();
        this.vt.tlj();
        if (isVisible()) {
            return;
        }
        this.f11081le = vt.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f11077cd = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        com.bytedance.adsdk.vt.le.yu.vt("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f11085ra.clear();
        this.vt.bly();
        if (isVisible()) {
            return;
        }
        this.f11081le = vt.NONE;
    }

    public final void vt() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return;
        }
        this.f11087tc = this.ex.ouw(Build.VERSION.SDK_INT, raVar.mwh, raVar.f11317jg);
    }

    public bly() {
        com.bytedance.adsdk.vt.le.fkw fkwVar = new com.bytedance.adsdk.vt.le.fkw();
        this.vt = fkwVar;
        this.f11082lh = true;
        this.yu = false;
        this.fkw = false;
        this.f11081le = vt.NONE;
        this.f11085ra = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.bly.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (bly.this.qbp != null) {
                    bly.this.qbp.ouw(bly.this.vt.le());
                }
            }
        };
        this.pno = animatorUpdateListener;
        this.f11089vm = false;
        this.f11088th = true;
        this.f11077cd = 255;
        this.ex = qbp.AUTOMATIC;
        this.f11087tc = false;
        this.uq = new Matrix();
        this.f11083od = false;
        fkwVar.addUpdateListener(animatorUpdateListener);
    }

    private Context cf() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    public final com.bytedance.adsdk.vt.vt.ouw bly() {
        if (getCallback() == null) {
            return null;
        }
        if (this.ryl == null) {
            com.bytedance.adsdk.vt.vt.ouw ouwVar = new com.bytedance.adsdk.vt.vt.ouw(getCallback(), this.f11080ko);
            this.ryl = ouwVar;
            String str = this.f11079jg;
            if (str != null) {
                ouwVar.yu = str;
            }
        }
        return this.ryl;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return le();
    }

    public final void ouw(Context context) {
        ra raVar = this.ouw;
        if (raVar == null) {
            return;
        }
        com.bytedance.adsdk.vt.lh.lh.vt vtVar = new com.bytedance.adsdk.vt.lh.lh.vt(this, com.bytedance.adsdk.vt.fkw.qbp.ouw(raVar), raVar.pno, raVar, context);
        this.qbp = vtVar;
        if (this.vpp) {
            vtVar.ouw(true);
        }
        this.qbp.ryl = this.f11088th;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            vt vtVar = this.f11081le;
            if (vtVar == vt.PLAY) {
                yu();
            } else if (vtVar == vt.RESUME) {
                fkw();
            }
        } else if (this.vt.isRunning()) {
            ra();
            this.f11081le = vt.RESUME;
        } else if (!z12) {
            this.f11081le = vt.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        yu();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void vt(final int i10) {
        if (this.ouw == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.10
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.vt(i10);
                }
            });
        } else {
            this.vt.vt(i10 + 0.99f);
        }
    }

    public final void lh(final String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.2
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.lh(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.vt.lh.le leVarVt = raVar.vt(str);
        if (leVarVt != null) {
            int i10 = (int) leVarVt.vt;
            ouw(i10, ((int) leVarVt.f11128lh) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public final void vt(final float f10) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.11
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.vt(f10);
                }
            });
        } else {
            this.vt.vt(com.bytedance.adsdk.vt.le.ra.ouw(raVar.tlj, raVar.f11316cf, f10));
        }
    }

    public final void ouw(final int i10) {
        if (this.ouw == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.8
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(i10);
                }
            });
        } else {
            this.vt.ouw(i10);
        }
    }

    public final void ouw(final float f10) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.9
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(f10);
                }
            });
        } else {
            ouw((int) com.bytedance.adsdk.vt.le.ra.ouw(raVar.tlj, raVar.f11316cf, f10));
        }
    }

    public final void lh(final int i10) {
        if (this.ouw == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.4
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.lh(i10);
                }
            });
        } else {
            this.vt.ouw(i10);
        }
    }

    public final void vt(final String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.13
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.vt(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.vt.lh.le leVarVt = raVar.vt(str);
        if (leVarVt != null) {
            vt((int) (leVarVt.vt + leVarVt.f11128lh));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final void lh(final float f10) {
        if (this.ouw == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.5
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.lh(f10);
                }
            });
            return;
        }
        fkw.ouw("Drawable#setProgress");
        this.vt.ouw(this.ouw.ouw(f10));
        fkw.vt("Drawable#setProgress");
    }

    public final void yu(int i10) {
        this.vt.setRepeatCount(i10);
    }

    public final void ouw(final String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.12
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.vt.lh.le leVarVt = raVar.vt(str);
        if (leVarVt != null) {
            ouw((int) leVarVt.vt);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final tlj yu(String str) {
        ra raVar = this.ouw;
        if (raVar == null) {
            return null;
        }
        return raVar.f11320lh.get(str);
    }

    public final void ouw(final int i10, final int i11) {
        if (this.ouw == null) {
            this.f11085ra.add(new ouw() { // from class: com.bytedance.adsdk.vt.bly.3
                @Override // com.bytedance.adsdk.vt.bly.ouw
                public final void ouw() {
                    bly.this.ouw(i10, i11);
                }
            });
        } else {
            this.vt.ouw(i10, i11 + 0.99f);
        }
    }

    public final void ouw(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.vt.addUpdateListener(animatorUpdateListener);
    }

    public final void ouw(Animator.AnimatorListener animatorListener) {
        this.vt.addListener(animatorListener);
    }

    private static void ouw(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }
}
