package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import ck.i;
import ck.p;
import ck.s;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import jk.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: compiled from: AspectImageView.kt */
/* JADX INFO: loaded from: classes6.dex */
public class AspectImageView extends AppCompatImageView implements AspectView {
    public static final /* synthetic */ k<Object>[] $$delegatedProperties = {s.f(new MutablePropertyReference1Impl(AspectImageView.class, "gravity", "getGravity()I", 0)), s.f(new MutablePropertyReference1Impl(AspectImageView.class, "aspectRatio", "getAspectRatio()F", 0)), s.f(new MutablePropertyReference1Impl(AspectImageView.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", 0))};
    private final fk.d aspectRatio$delegate;
    private final fk.d gravity$delegate;
    private final fk.d imageScale$delegate;
    private boolean isMatrixInvalidated;
    private final Matrix transformMatrix;

    /* JADX INFO: compiled from: AspectImageView.kt */
    public enum Scale {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* JADX INFO: compiled from: AspectImageView.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Scale.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Scale.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AspectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AspectImageView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public AspectImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.gravity$delegate = ViewsKt.appearanceAffecting$default(0, null, 2, null);
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
        this.imageScale$delegate = ViewsKt.dimensionAffecting$default(Scale.NO_SCALE, null, 2, null);
        this.transformMatrix = new Matrix();
        this.isMatrixInvalidated = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    public final int getGravity() {
        return ((Number) this.gravity$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final Scale getImageScale() {
        return (Scale) this.imageScale$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.yandex.div.core.widget.AspectView
    public final void setAspectRatio(float f10) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f10));
    }

    public final void setGravity(int i10) {
        this.gravity$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i10));
    }

    public final void setImageScale(Scale scale) {
        this.imageScale$delegate.setValue(this, $$delegatedProperties[2], scale);
    }

    private final void applyAspectRatio(int i10, int i11) {
        boolean z10;
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        boolean zCanResizeWidth = canResizeWidth(i10);
        boolean zCanResizeHeight = canResizeHeight(i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!zCanResizeWidth && !zCanResizeHeight) {
            measuredHeight = ek.b.c(measuredWidth / aspectRatio);
        } else if (!zCanResizeWidth && zCanResizeHeight) {
            measuredHeight = ek.b.c(measuredWidth / aspectRatio);
        } else if (zCanResizeWidth && !zCanResizeHeight) {
            measuredWidth = ek.b.c(measuredHeight * aspectRatio);
        } else if (zCanResizeWidth && zCanResizeHeight) {
            measuredHeight = ek.b.c(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    private final void updateMatrix(int i10, int i11) {
        float fMin;
        float f10;
        float f11;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float fD = ik.k.d((i10 - getPaddingLeft()) - getPaddingRight(), 0);
        float fD2 = ik.k.d((i11 - getPaddingTop()) - getPaddingBottom(), 0);
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(getGravity(), ViewCompat.getLayoutDirection(this));
        Scale imageScale = getImageScale();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i12 = iArr[imageScale.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        fMin = fD / intrinsicWidth;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    fMin = Math.max(fD / intrinsicWidth, fD2 / intrinsicHeight);
                }
            } else {
                fMin = Math.min(fD / intrinsicWidth, fD2 / intrinsicHeight);
            }
        } else {
            fMin = 1.0f;
        }
        if (iArr[getImageScale().ordinal()] == 4) {
            f10 = fD2 / intrinsicHeight;
        } else {
            f10 = fMin;
        }
        int i13 = absoluteGravity & 7;
        float f12 = 0.0f;
        if (i13 != 1) {
            if (i13 != 5) {
                f11 = 0.0f;
            } else {
                f11 = fD - (intrinsicWidth * fMin);
            }
        } else {
            f11 = (fD - (intrinsicWidth * fMin)) / 2;
        }
        int i14 = absoluteGravity & 112;
        if (i14 != 16) {
            if (i14 == 80) {
                f12 = fD2 - (intrinsicHeight * f10);
            }
        } else {
            f12 = (fD2 - (intrinsicHeight * f10)) / 2;
        }
        Matrix matrix = this.transformMatrix;
        matrix.reset();
        matrix.postScale(fMin, f10);
        matrix.postTranslate(f11, f12);
        setImageMatrix(this.transformMatrix);
    }

    public boolean canResizeHeight(int i10) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            return true;
        }
        return false;
    }

    public boolean canResizeWidth(int i10) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if ((getImageMatrix() == null || p.e(getImageMatrix(), this.transformMatrix)) && this.isMatrixInvalidated && getWidth() > 0 && getHeight() > 0) {
            updateMatrix(getWidth(), getHeight());
            this.isMatrixInvalidated = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        applyAspectRatio(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.isMatrixInvalidated = true;
    }
}
