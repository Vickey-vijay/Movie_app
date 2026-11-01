package com.bytedance.adsdk.ugeno.bly.yu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.ouw.pno;
import com.bytedance.adsdk.ugeno.ouw.ra;
import com.bytedance.adsdk.ugeno.yu;

/* JADX INFO: loaded from: classes10.dex */
public class ouw extends ImageView implements IAnimation, ra {
    private float bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f10783cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private boolean f10784jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f10785ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final float[] f10786le;
    private boolean mwh;
    private ColorStateList pno;
    private Shader.TileMode qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Drawable f10787ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private int f10788rn;
    private Drawable ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private Shader.TileMode f10789th;
    private ColorFilter tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private ImageView.ScaleType f10790vm;
    public yu vt;
    private float yu;
    private int zih;
    private pno zin;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final /* synthetic */ boolean f10782lh = true;
    public static final Shader.TileMode ouw = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] fkw = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    private Drawable ouw() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.f10788rn;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f10788rn, e10);
                this.f10788rn = 0;
            }
        }
        return vt.ouw(drawable);
    }

    public void setBorderColor(int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderWidth(int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f10788rn = 0;
        this.ryl = vt.ouw(bitmap);
        lh();
        super.setImageDrawable(this.ryl);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f10788rn = 0;
        this.ryl = vt.ouw(drawable);
        lh();
        super.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.bly.yu.ouw$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ouw = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void lh() {
        ouw(this.ryl, this.f10790vm);
    }

    private void yu() {
        Drawable drawable = this.ryl;
        if (drawable == null || !this.f10783cf) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.ryl = drawableMutate;
        if (this.mwh) {
            drawableMutate.setColorFilter(this.tlj);
        }
    }

    public int getBorderColor() {
        return this.pno.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.pno;
    }

    public float getBorderRadius() {
        return this.zin.ouw;
    }

    public float getBorderWidth() {
        return this.bly;
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f10 : this.f10786le) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.ouw.ra
    public float getRipple() {
        return this.yu;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public float getRubIn() {
        return this.zin.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f10790vm;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public float getShine() {
        return this.zin.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public float getStretch() {
        return this.zin.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.f10789th;
    }

    public Shader.TileMode getTileModeY() {
        return this.qbp;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.fkw();
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        yu yuVar = this.vt;
        if (yuVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrOuw = yuVar.ouw(i10, i11);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.f10787ra = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f10787ra = drawable;
        ouw(true);
        super.setBackgroundDrawable(this.f10787ra);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (this.zih != i10) {
            this.zih = i10;
            Drawable drawableVt = vt();
            this.f10787ra = drawableVt;
            setBackgroundDrawable(drawableVt);
        }
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.pno.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.pno = colorStateList;
        lh();
        ouw(false);
        if (this.bly > 0.0f) {
            invalidate();
        }
    }

    public void setBorderRadius(float f10) {
        pno pnoVar = this.zin;
        if (pnoVar != null) {
            pnoVar.ouw(f10);
        }
    }

    public void setBorderWidth(float f10) {
        if (this.bly == f10) {
            return;
        }
        this.bly = f10;
        lh();
        ouw(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.tlj != colorFilter) {
            this.tlj = colorFilter;
            this.mwh = true;
            this.f10783cf = true;
            yu();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f10788rn != i10) {
            this.f10788rn = i10;
            this.ryl = ouw();
            lh();
            super.setImageDrawable(this.ryl);
        }
    }

    public void setOval(boolean z10) {
        this.f10784jg = z10;
        lh();
        ouw(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.yu = f10;
        pno pnoVar = this.zin;
        if (pnoVar != null) {
            pnoVar.vt(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        pno pnoVar = this.zin;
        if (pnoVar != null) {
            pnoVar.fkw(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f10782lh && scaleType == null) {
            throw new AssertionError();
        }
        if (this.f10790vm != scaleType) {
            this.f10790vm = scaleType;
            int i10 = AnonymousClass1.ouw[scaleType.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            lh();
            ouw(false);
            invalidate();
        }
    }

    public void setShine(float f10) {
        pno pnoVar = this.zin;
        if (pnoVar != null) {
            pnoVar.lh(f10);
        }
    }

    public void setStretch(float f10) {
        pno pnoVar = this.zin;
        if (pnoVar != null) {
            pnoVar.yu(f10);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f10789th == tileMode) {
            return;
        }
        this.f10789th = tileMode;
        lh();
        ouw(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.qbp == tileMode) {
            return;
        }
        this.qbp = tileMode;
        lh();
        ouw(false);
        invalidate();
    }

    public ouw(Context context) {
        super(context);
        this.f10786le = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.pno = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.bly = 0.0f;
        this.tlj = null;
        this.f10783cf = false;
        this.mwh = false;
        this.f10784jg = false;
        this.f10785ko = false;
        Shader.TileMode tileMode = ouw;
        this.f10789th = tileMode;
        this.qbp = tileMode;
        this.zin = new pno(this);
    }

    private Drawable vt() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.zih;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.zih, e10);
                this.zih = 0;
            }
        }
        return vt.ouw(drawable);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.vt(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.ouw(canvas, this);
            this.vt.ouw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.vt(i10, i11);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setCornerRadius(float f10) {
        ouw(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i10) {
        float dimension = getResources().getDimension(i10);
        ouw(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    private void ouw(boolean z10) {
        if (this.f10785ko) {
            if (z10) {
                this.f10787ra = vt.ouw(this.f10787ra);
            }
            ouw(this.f10787ra, ImageView.ScaleType.FIT_XY);
        }
    }

    private void ouw(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof vt) {
            vt vtVar = (vt) drawable;
            vt vtVarOuw = vtVar.ouw(scaleType).ouw(this.bly).ouw(this.pno);
            vtVarOuw.ouw = this.f10784jg;
            vtVarOuw.ouw(this.f10789th).vt(this.qbp);
            float[] fArr = this.f10786le;
            if (fArr != null) {
                vtVar.ouw(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            yu();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                ouw(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    private void ouw(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f10786le;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        lh();
        ouw(false);
        invalidate();
    }
}
