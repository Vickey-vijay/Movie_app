package d5;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.RelativeSizeSpan;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import g5.k0;
import g5.m;

/* JADX INFO: compiled from: SubtitlePainter.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f51865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f51866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f51867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f51868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f51869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextPaint f51870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f51871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f51872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Layout.Alignment f51873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f51874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f51875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f51876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f51877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f51878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f51879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f51880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f51881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f51882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f51883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f51884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f51885u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f51886v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f51887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f51888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f51889y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f51890z;

    public void b(t4.b bVar, boolean z10, boolean z11, t4.a aVar, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z12 = bVar.f72222d == null;
        int i14 = ViewCompat.MEASURED_STATE_MASK;
        if (z12) {
            if (TextUtils.isEmpty(bVar.f72220b)) {
                return;
            } else {
                i14 = (bVar.f72230l && z10) ? bVar.f72231m : aVar.f72215c;
            }
        }
        if (a(this.f51872h, bVar.f72220b) && k0.c(this.f51873i, bVar.f72221c) && this.f51874j == bVar.f72222d && this.f51875k == bVar.f72223e && this.f51876l == bVar.f72224f && k0.c(Integer.valueOf(this.f51877m), Integer.valueOf(bVar.f72225g)) && this.f51878n == bVar.f72226h && k0.c(Integer.valueOf(this.f51879o), Integer.valueOf(bVar.f72227i)) && this.f51880p == bVar.f72228j && this.f51881q == bVar.f72229k && this.f51882r == z10 && this.f51883s == z11 && this.f51884t == aVar.f72213a && this.f51885u == aVar.f72214b && this.f51886v == i14 && this.f51888x == aVar.f72216d && this.f51887w == aVar.f72217e && k0.c(this.f51870f.getTypeface(), aVar.f72218f) && this.f51889y == f10 && this.f51890z == f11 && this.A == f12 && this.B == i10 && this.C == i11 && this.D == i12 && this.E == i13) {
            d(canvas, z12);
            return;
        }
        this.f51872h = bVar.f72220b;
        this.f51873i = bVar.f72221c;
        this.f51874j = bVar.f72222d;
        this.f51875k = bVar.f72223e;
        this.f51876l = bVar.f72224f;
        this.f51877m = bVar.f72225g;
        this.f51878n = bVar.f72226h;
        this.f51879o = bVar.f72227i;
        this.f51880p = bVar.f72228j;
        this.f51881q = bVar.f72229k;
        this.f51882r = z10;
        this.f51883s = z11;
        this.f51884t = aVar.f72213a;
        this.f51885u = aVar.f72214b;
        this.f51886v = i14;
        this.f51888x = aVar.f72216d;
        this.f51887w = aVar.f72217e;
        this.f51870f.setTypeface(aVar.f72218f);
        this.f51889y = f10;
        this.f51890z = f11;
        this.A = f12;
        this.B = i10;
        this.C = i11;
        this.D = i12;
        this.E = i13;
        if (z12) {
            g();
        } else {
            f();
        }
        d(canvas, z12);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.f51874j, (Rect) null, this.J, (Paint) null);
    }

    public final void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
        } else {
            c(canvas);
        }
    }

    public final void e(Canvas canvas) {
        StaticLayout staticLayout = this.F;
        if (staticLayout == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f51886v) > 0) {
            this.f51871g.setColor(this.f51886v);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f51871g);
        }
        int i10 = this.f51888x;
        if (i10 == 1) {
            this.f51870f.setStrokeJoin(Paint.Join.ROUND);
            this.f51870f.setStrokeWidth(this.f51865a);
            this.f51870f.setColor(this.f51887w);
            this.f51870f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f51870f;
            float f10 = this.f51866b;
            float f11 = this.f51867c;
            textPaint.setShadowLayer(f10, f11, f11, this.f51887w);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f51887w;
            int i12 = z10 ? this.f51887w : -1;
            float f12 = this.f51866b / 2.0f;
            this.f51870f.setColor(this.f51884t);
            this.f51870f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f51870f.setShadowLayer(this.f51866b, f13, f13, i11);
            staticLayout.draw(canvas);
            this.f51870f.setShadowLayer(this.f51866b, f12, f12, i12);
        }
        this.f51870f.setColor(this.f51884t);
        this.f51870f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f51870f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    public final void f() {
        float f10;
        int i10;
        float f11;
        int i11 = this.D;
        int i12 = this.B;
        int i13 = this.E;
        int i14 = this.C;
        float f12 = i11 - i12;
        float f13 = i12 + (this.f51878n * f12);
        float f14 = i13 - i14;
        float f15 = i14 + (this.f51875k * f14);
        int iRound = Math.round(f12 * this.f51880p);
        float f16 = this.f51881q;
        int iRound2 = f16 != -3.4028235E38f ? Math.round(f14 * f16) : Math.round(iRound * (this.f51874j.getHeight() / this.f51874j.getWidth()));
        int i15 = this.f51877m;
        if (i15 != 2) {
            if (i15 == 1) {
                f10 = iRound / 2;
            }
            int iRound3 = Math.round(f13);
            i10 = this.f51879o;
            if (i10 == 2) {
                if (i10 == 1) {
                    f11 = iRound2 / 2;
                }
                int iRound4 = Math.round(f15);
                this.J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f11 = iRound2;
            f15 -= f11;
            int iRound5 = Math.round(f15);
            this.J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f10 = iRound;
        f13 -= f10;
        int iRound6 = Math.round(f13);
        i10 = this.f51879o;
        if (i10 == 2) {
            if (i10 == 1) {
                f11 = iRound2 / 2;
            }
            int iRound7 = Math.round(f15);
            this.J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f11 = iRound2;
        f15 -= f11;
        int iRound8 = Math.round(f15);
        this.J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    public final void g() {
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence;
        int iMax;
        int iMin;
        int i10;
        int iRound;
        int i11;
        int i12 = this.D - this.B;
        int i13 = this.E - this.C;
        this.f51870f.setTextSize(this.f51889y);
        int i14 = (int) ((this.f51889y * 0.125f) + 0.5f);
        int i15 = i14 * 2;
        int i16 = i12 - i15;
        float f10 = this.f51880p;
        if (f10 != -3.4028235E38f) {
            i16 = (int) (i16 * f10);
        }
        if (i16 <= 0) {
            m.h("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        CharSequence string = this.f51872h;
        if (this.f51882r) {
            if (!this.f51883s) {
                spannableStringBuilder = new SpannableStringBuilder(string);
                int length = spannableStringBuilder.length();
                AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(0, length, AbsoluteSizeSpan.class);
                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(0, length, RelativeSizeSpan.class);
                for (AbsoluteSizeSpan absoluteSizeSpan : absoluteSizeSpanArr) {
                    spannableStringBuilder.removeSpan(absoluteSizeSpan);
                }
                for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr) {
                    spannableStringBuilder.removeSpan(relativeSizeSpan);
                }
            } else if (this.f51890z > 0.0f) {
                spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f51890z), 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
            }
            string = spannableStringBuilder;
        } else {
            string = string.toString();
        }
        if (Color.alpha(this.f51885u) > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
            spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f51885u), 0, spannableStringBuilder2.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
            charSequence = spannableStringBuilder2;
        } else {
            charSequence = string;
        }
        Layout.Alignment alignment = this.f51873i;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f51870f, i16, alignment2, this.f51868d, this.f51869e, true);
        this.F = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.F.getLineCount();
        int iMax2 = 0;
        for (int i17 = 0; i17 < lineCount; i17++) {
            iMax2 = Math.max((int) Math.ceil(this.F.getLineWidth(i17)), iMax2);
        }
        if (this.f51880p == -3.4028235E38f || iMax2 >= i16) {
            i16 = iMax2;
        }
        int i18 = i16 + i15;
        float f11 = this.f51878n;
        if (f11 != -3.4028235E38f) {
            int iRound2 = Math.round(i12 * f11);
            int i19 = this.B;
            int i20 = iRound2 + i19;
            int i21 = this.f51879o;
            if (i21 == 2) {
                i20 -= i18;
            } else if (i21 == 1) {
                i20 = ((i20 * 2) - i18) / 2;
            }
            iMax = Math.max(i20, i19);
            iMin = Math.min(i18 + iMax, this.D);
        } else {
            iMax = ((i12 - i18) / 2) + this.B;
            iMin = iMax + i18;
        }
        int i22 = iMin - iMax;
        if (i22 <= 0) {
            m.h("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f12 = this.f51875k;
        if (f12 != -3.4028235E38f) {
            if (this.f51876l == 0) {
                iRound = Math.round(i13 * f12);
                i11 = this.C;
            } else {
                int lineBottom = this.F.getLineBottom(0) - this.F.getLineTop(0);
                float f13 = this.f51875k;
                if (f13 >= 0.0f) {
                    iRound = Math.round(f13 * lineBottom);
                    i11 = this.C;
                } else {
                    iRound = Math.round((f13 + 1.0f) * lineBottom);
                    i11 = this.E;
                }
            }
            i10 = iRound + i11;
            int i23 = this.f51877m;
            if (i23 == 2) {
                i10 -= height;
            } else if (i23 == 1) {
                i10 = ((i10 * 2) - height) / 2;
            }
            int i24 = i10 + height;
            int i25 = this.E;
            if (i24 > i25) {
                i10 = i25 - height;
            } else {
                int i26 = this.C;
                if (i10 < i26) {
                    i10 = i26;
                }
            }
        } else {
            i10 = (this.E - height) - ((int) (i13 * this.A));
        }
        this.F = new StaticLayout(charSequence, this.f51870f, i22, alignment2, this.f51868d, this.f51869e, true);
        this.G = iMax;
        this.H = i10;
        this.I = i14;
    }

    public c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f51869e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f51868d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f51865a = fRound;
        this.f51866b = fRound;
        this.f51867c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f51870f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f51871g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }
}
