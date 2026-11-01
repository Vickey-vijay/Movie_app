package com.yzq.zxinglibrary.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.yzq.zxinglibrary.R$color;
import com.yzq.zxinglibrary.bean.ZxingConfig;
import java.util.ArrayList;
import java.util.List;
import te.c;
import y5.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewfinderView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f51199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f51200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f51201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f51202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f51203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f51204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f51209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f51210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<j> f51211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<j> f51212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f51213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ZxingConfig f51214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f51215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Rect f51216s;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewfinderView.this.f51213p = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewfinderView.this.invalidate();
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int c(int i10) {
        return (int) TypedValue.applyDimension(1, i10, getResources().getDisplayMetrics());
    }

    public ViewfinderView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f51210m = -1;
        this.f51205h = ContextCompat.getColor(getContext(), R$color.viewfinder_mask);
        this.f51206i = ContextCompat.getColor(getContext(), R$color.result_view);
        this.f51207j = ContextCompat.getColor(getContext(), R$color.possible_result_points);
        this.f51211n = new ArrayList(10);
        this.f51212o = null;
    }

    public void b(j jVar) {
        List<j> list = this.f51211n;
        synchronized (list) {
            list.add(jVar);
            int size = list.size();
            if (size > 20) {
                list.subList(0, size - 10).clear();
            }
        }
    }

    public final void d(Canvas canvas, Rect rect) {
        if (this.f51210m != -1) {
            canvas.drawRect(rect, this.f51203f);
        }
        int iWidth = (int) (((double) rect.width()) * 0.07d);
        int i10 = (int) (((double) iWidth) * 0.2d);
        if (i10 > 15) {
            i10 = 15;
        }
        int i11 = rect.left;
        int i12 = rect.top;
        canvas.drawRect(i11 - i10, i12, i11, i12 + iWidth, this.f51202e);
        int i13 = rect.left;
        int i14 = rect.top;
        canvas.drawRect(i13 - i10, i14 - i10, i13 + iWidth, i14, this.f51202e);
        int i15 = rect.right;
        int i16 = rect.top;
        canvas.drawRect(i15, i16, i15 + i10, i16 + iWidth, this.f51202e);
        int i17 = rect.right;
        int i18 = rect.top;
        canvas.drawRect(i17 - iWidth, i18 - i10, i17 + i10, i18, this.f51202e);
        int i19 = rect.left;
        int i20 = rect.bottom;
        canvas.drawRect(i19 - i10, i20 - iWidth, i19, i20, this.f51202e);
        int i21 = rect.left;
        int i22 = rect.bottom;
        canvas.drawRect(i21 - i10, i22, i21 + iWidth, i22 + i10, this.f51202e);
        int i23 = rect.right;
        int i24 = rect.bottom;
        canvas.drawRect(i23, i24 - iWidth, i23 + i10, i24, this.f51202e);
        int i25 = rect.right;
        int i26 = rect.bottom;
        canvas.drawRect(i25 - iWidth, i26, i25 + i10, i26 + i10, this.f51202e);
    }

    public final void e(Canvas canvas, Rect rect, int i10, int i11) {
        this.f51200c.setColor(this.f51204g != null ? this.f51206i : this.f51205h);
        float f10 = i10;
        canvas.drawRect(0.0f, 0.0f, f10, rect.top, this.f51200c);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f51200c);
        canvas.drawRect(rect.right + 1, rect.top, f10, rect.bottom + 1, this.f51200c);
        canvas.drawRect(0.0f, rect.bottom + 1, f10, i11, this.f51200c);
    }

    public final void f(Canvas canvas, Rect rect) {
        float f10 = rect.left;
        int i10 = this.f51213p;
        canvas.drawLine(f10, i10, rect.right, i10, this.f51201d);
    }

    public void g() {
        Bitmap bitmap = this.f51204g;
        this.f51204g = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    public final void h() {
        if (this.f51215r == null) {
            Rect rect = this.f51216s;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(rect.top, rect.bottom);
            this.f51215r = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(3000L);
            this.f51215r.setInterpolator(new DecelerateInterpolator());
            this.f51215r.setRepeatMode(1);
            this.f51215r.setRepeatCount(-1);
            this.f51215r.addUpdateListener(new a());
            this.f51215r.start();
        }
    }

    public final void i() {
        this.f51200c = new Paint(1);
        Paint paint = new Paint(1);
        this.f51202e = paint;
        paint.setColor(this.f51208k);
        this.f51202e.setStyle(Paint.Style.FILL);
        this.f51202e.setStrokeWidth(c(1));
        if (this.f51210m != -1) {
            Paint paint2 = new Paint(1);
            this.f51203f = paint2;
            paint2.setColor(ContextCompat.getColor(getContext(), this.f51214q.getFrameLineColor()));
            this.f51203f.setStrokeWidth(c(1));
            this.f51203f.setStyle(Paint.Style.STROKE);
        }
        Paint paint3 = new Paint(1);
        this.f51201d = paint3;
        paint3.setStrokeWidth(c(2));
        this.f51201d.setStyle(Paint.Style.FILL);
        this.f51201d.setDither(true);
        this.f51201d.setColor(this.f51209l);
    }

    public void j() {
        ValueAnimator valueAnimator = this.f51215r;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f51215r.cancel();
            this.f51215r = null;
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        c cVar = this.f51199b;
        if (cVar == null) {
            return;
        }
        this.f51216s = cVar.c();
        Rect rectD = this.f51199b.d();
        if (this.f51216s == null || rectD == null) {
            return;
        }
        h();
        e(canvas, this.f51216s, canvas.getWidth(), canvas.getHeight());
        d(canvas, this.f51216s);
        if (this.f51204g == null) {
            f(canvas, this.f51216s);
        } else {
            this.f51200c.setAlpha(160);
            canvas.drawBitmap(this.f51204g, (Rect) null, this.f51216s, this.f51200c);
        }
    }

    public void setCameraManager(c cVar) {
        this.f51199b = cVar;
    }

    public void setZxingConfig(ZxingConfig zxingConfig) {
        this.f51214q = zxingConfig;
        this.f51208k = ContextCompat.getColor(getContext(), zxingConfig.getReactColor());
        if (zxingConfig.getFrameLineColor() != -1) {
            this.f51210m = ContextCompat.getColor(getContext(), zxingConfig.getFrameLineColor());
        }
        this.f51209l = ContextCompat.getColor(getContext(), zxingConfig.getScanLineColor());
        i();
    }
}
