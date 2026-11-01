package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import chuangyuan.ycj.videolibrary.R$styleable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ExoVideoAnim extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<b> f5987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f5988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f5989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f5990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5993h;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5997d;

        public b() {
        }
    }

    private int getDefaultHeight() {
        return this.f5991f * 2;
    }

    private int getDefaultWidth() {
        return (this.f5991f * 2 * this.f5987b.size()) + ((this.f5987b.size() - 1) * this.f5992g);
    }

    public final void a() {
        this.f5987b = new ArrayList();
        int i10 = this.f5991f * 2;
        b bVar = new b();
        bVar.f5994a = i10;
        bVar.f5995b = i10;
        bVar.f5996c = bVar.f5995b;
        bVar.f5997d = -1;
        this.f5987b.add(bVar);
        b bVar2 = new b();
        bVar2.f5994a = i10;
        double d10 = i10;
        bVar2.f5995b = (int) (0.75d * d10);
        bVar2.f5996c = bVar2.f5995b;
        bVar2.f5997d = 1;
        this.f5987b.add(bVar2);
        b bVar3 = new b();
        bVar3.f5994a = i10;
        bVar3.f5995b = (int) (d10 * 0.5d);
        bVar3.f5996c = bVar3.f5995b;
        bVar3.f5997d = 1;
        this.f5987b.add(bVar3);
    }

    public final void b(Canvas canvas) {
        this.f5989d.setColor(this.f5988c[0]);
        b bVar = this.f5987b.get(0);
        bVar.f5996c += bVar.f5997d * this.f5993h;
        if (bVar.f5996c >= bVar.f5994a) {
            bVar.f5997d = -1;
            bVar.f5996c = bVar.f5994a;
        }
        if (bVar.f5996c <= 0) {
            bVar.f5997d = 1;
            bVar.f5996c = 0;
        }
        int width = ((getWidth() / 2) - ((((this.f5991f * 2) * this.f5987b.size()) + ((this.f5987b.size() - 1) * this.f5992g)) / 2)) + this.f5991f;
        int height = getHeight() / 2;
        this.f5990e.left = width - (bVar.f5996c / 2);
        this.f5990e.top = height - (bVar.f5996c / 2);
        RectF rectF = this.f5990e;
        rectF.right = rectF.left + bVar.f5996c;
        RectF rectF2 = this.f5990e;
        rectF2.bottom = rectF2.top + bVar.f5996c;
        canvas.drawArc(this.f5990e, 0.0f, 360.0f, false, this.f5989d);
    }

    public final void c(Canvas canvas) {
        this.f5989d.setColor(this.f5988c[1]);
        b bVar = this.f5987b.get(1);
        b bVar2 = this.f5987b.get(0);
        if (bVar2.f5996c == bVar2.f5995b) {
            bVar.f5996c = bVar.f5995b;
        } else {
            bVar.f5996c += bVar.f5997d * this.f5993h;
            if (bVar.f5996c >= bVar.f5994a) {
                bVar.f5997d = -1;
                bVar.f5996c = bVar.f5994a;
            }
            if (bVar.f5996c <= 0) {
                bVar.f5997d = 1;
                bVar.f5996c = 0;
            }
        }
        int width = ((getWidth() / 2) - ((((this.f5991f * 2) * this.f5987b.size()) + ((this.f5987b.size() - 1) * this.f5992g)) / 2)) + ((bVar.f5994a + this.f5992g) * 1) + this.f5991f;
        int height = getHeight() / 2;
        this.f5990e.left = width - (bVar.f5996c / 2);
        this.f5990e.top = height - (bVar.f5996c / 2);
        RectF rectF = this.f5990e;
        rectF.right = rectF.left + bVar.f5996c;
        RectF rectF2 = this.f5990e;
        rectF2.bottom = rectF2.top + bVar.f5996c;
        canvas.drawArc(this.f5990e, 0.0f, 360.0f, false, this.f5989d);
    }

    public final void d(Canvas canvas) {
        this.f5989d.setColor(this.f5988c[2]);
        b bVar = this.f5987b.get(2);
        b bVar2 = this.f5987b.get(0);
        if (bVar2.f5996c == bVar2.f5995b) {
            bVar.f5996c = bVar.f5995b;
        } else {
            bVar.f5996c += bVar.f5997d * this.f5993h;
            if (bVar.f5996c >= bVar.f5994a) {
                bVar.f5997d = -1;
                bVar.f5996c = bVar.f5994a;
            }
            if (bVar.f5996c <= 0) {
                bVar.f5997d = 1;
                bVar.f5996c = 0;
            }
        }
        int width = ((getWidth() / 2) - ((((this.f5991f * 2) * this.f5987b.size()) + ((this.f5987b.size() - 1) * this.f5992g)) / 2)) + ((bVar.f5994a + this.f5992g) * 2) + this.f5991f;
        int height = getHeight() / 2;
        this.f5990e.left = width - (bVar.f5996c / 2);
        this.f5990e.top = height - (bVar.f5996c / 2);
        RectF rectF = this.f5990e;
        rectF.right = rectF.left + bVar.f5996c;
        RectF rectF2 = this.f5990e;
        rectF2.bottom = rectF2.top + bVar.f5996c;
        canvas.drawArc(this.f5990e, 0.0f, 360.0f, false, this.f5989d);
    }

    public void setColors(@ColorRes int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int[] iArr2 = this.f5988c;
            if (i10 >= iArr2.length) {
                return;
            }
            iArr2[i10] = iArr[i10];
        }
    }

    public ExoVideoAnim(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5988c = new int[]{-14848, -15415176, -16590337};
        this.f5989d = new Paint();
        this.f5990e = new RectF();
        this.f5993h = 2;
        s.b bVar = new s.b(getContext());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.exoVideoAnim);
        this.f5991f = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.exoVideoAnim_circleRadius, bVar.a());
        this.f5992g = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.exoVideoAnim_circleSpacing, bVar.b());
        int i10 = (int) ((((double) this.f5991f) * 2.0d) / ((double) ((int) (((((double) (typedArrayObtainStyledAttributes.getInt(R$styleable.exoVideoAnim_cycle, 2000) / 2)) * 1.0d) / 1000.0d) * 83.0d))));
        this.f5993h = i10;
        this.f5993h = i10 <= 0 ? 1 : i10;
        a();
    }

    public final int e(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824) {
            int defaultHeight = getDefaultHeight();
            if (mode == Integer.MIN_VALUE) {
                return Math.min(defaultHeight, size);
            }
            return defaultHeight;
        }
        return size;
    }

    public final int f(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824) {
            int defaultWidth = getDefaultWidth();
            if (mode == Integer.MIN_VALUE) {
                return Math.min(defaultWidth, size);
            }
            return defaultWidth;
        }
        return size;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5989d.setAntiAlias(true);
        this.f5989d.setStyle(Paint.Style.FILL);
        b(canvas);
        c(canvas);
        d(canvas);
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(f(i10), e(i11));
    }
}
