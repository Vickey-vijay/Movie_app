package com.scwang.smart.refresh.classics;

import ac.a;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import cc.e;
import cc.f;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.footer.classics.R$id;
import fc.b;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ClassicsAbstract<T extends ClassicsAbstract<?>> extends b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f45034r = R$id.srl_classics_title;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f45035s = R$id.srl_classics_arrow;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f45036t = R$id.srl_classics_progress;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f45037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f45038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f45039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f45040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f45041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f45042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45049q;

    /* JADX WARN: Multi-variable type inference failed */
    public T r() {
        return this;
    }

    public T s(@ColorInt int i10) {
        this.f45043k = true;
        this.f45037e.setTextColor(i10);
        a aVar = this.f45041i;
        if (aVar != null) {
            aVar.a(i10);
            this.f45038f.invalidateDrawable(this.f45041i);
        }
        a aVar2 = this.f45042j;
        if (aVar2 != null) {
            aVar2.a(i10);
            this.f45039g.invalidateDrawable(this.f45042j);
        }
        return (T) r();
    }

    @Override // fc.b, cc.a
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.f45044l) {
                t(iArr[0]);
                this.f45044l = false;
            }
            if (this.f45043k) {
                return;
            }
            if (iArr.length > 1) {
                s(iArr[1]);
            }
            this.f45043k = false;
        }
    }

    public T t(@ColorInt int i10) {
        this.f45044l = true;
        this.f45045m = i10;
        e eVar = this.f45040h;
        if (eVar != null) {
            eVar.b(this, i10);
        }
        return (T) r();
    }

    @Override // fc.b, cc.a
    public void h(@NonNull e eVar, int i10, int i11) {
        this.f45040h = eVar;
        eVar.b(this, this.f45045m);
    }

    @Override // fc.b, cc.a
    public int k(@NonNull f fVar, boolean z10) {
        ImageView imageView = this.f45039g;
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.f45046n;
    }

    @Override // fc.b, cc.a
    public void n(@NonNull f fVar, int i10, int i11) {
        ImageView imageView = this.f45039g;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Object drawable = this.f45039g.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f45049q == 0) {
            this.f45047o = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f45048p = paddingBottom;
            if (this.f45047o == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int iC = this.f45047o;
                if (iC == 0) {
                    iC = gc.b.c(20.0f);
                }
                this.f45047o = iC;
                int iC2 = this.f45048p;
                if (iC2 == 0) {
                    iC2 = gc.b.c(20.0f);
                }
                this.f45048p = iC2;
                setPadding(paddingLeft, this.f45047o, paddingRight, iC2);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            int size = View.MeasureSpec.getSize(i11);
            int i12 = this.f45049q;
            if (size < i12) {
                int i13 = (size - i12) / 2;
                setPadding(getPaddingLeft(), i13, getPaddingRight(), i13);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.f45047o, getPaddingRight(), this.f45048p);
        }
        super.onMeasure(i10, i11);
        if (this.f45049q == 0) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                int measuredHeight = getChildAt(i14).getMeasuredHeight();
                if (this.f45049q < measuredHeight) {
                    this.f45049q = measuredHeight;
                }
            }
        }
    }

    public T u(float f10) {
        this.f45037e.setTextSize(f10);
        e eVar = this.f45040h;
        if (eVar != null) {
            eVar.d(this);
        }
        return (T) r();
    }

    public ClassicsAbstract(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45046n = 500;
        this.f45047o = 20;
        this.f45048p = 20;
        this.f45049q = 0;
        this.f52940c = dc.b.f51929d;
    }

    @Override // fc.b, cc.a
    public void j(@NonNull f fVar, int i10, int i11) {
        n(fVar, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f45038f;
        ImageView imageView2 = this.f45039g;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Object drawable = this.f45039g.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }
}
