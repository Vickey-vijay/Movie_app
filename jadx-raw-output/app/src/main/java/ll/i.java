package ll;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.HashMap;
import java.util.Map;
import kl.p;

/* JADX INFO: compiled from: SimpleTextCacheStuffer.java */
/* JADX INFO: loaded from: classes8.dex */
public class i extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Float, Float> f63718a = new HashMap();

    @Override // ll.b
    public void d(kl.c cVar, TextPaint textPaint, boolean z10) {
        float fMax = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        if (cVar.f62893d == null) {
            CharSequence charSequence = cVar.f62892c;
            if (charSequence != null) {
                fMax = textPaint.measureText(charSequence.toString());
                fValueOf = j(cVar, textPaint);
            }
            cVar.f62904o = fMax;
            cVar.f62905p = fValueOf.floatValue();
            return;
        }
        Float fJ = j(cVar, textPaint);
        for (String str : cVar.f62893d) {
            if (str.length() > 0) {
                fMax = Math.max(textPaint.measureText(str), fMax);
            }
        }
        cVar.f62904o = fMax;
        cVar.f62905p = cVar.f62893d.length * fJ.floatValue();
    }

    public void g(kl.c cVar, Canvas canvas, float f10, float f11) {
    }

    @Override // ll.b
    public void a() {
        f63718a.clear();
    }

    @Override // ll.b
    public void c(kl.c cVar, Canvas canvas, float f10, float f11, boolean z10, a.C0577a c0577a) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10 = cVar.f62902m;
        float f18 = f10 + i10;
        float f19 = f11 + i10;
        if (cVar.f62901l != 0) {
            f18 += 4.0f;
            f19 += 4.0f;
        }
        float f20 = f19;
        float f21 = f18;
        c0577a.i(z10);
        TextPaint textPaintK = c0577a.k(cVar, z10);
        g(cVar, canvas, f10, f11);
        String[] strArr = cVar.f62893d;
        boolean z11 = true;
        boolean z12 = false;
        if (strArr == null) {
            if (c0577a.n(cVar)) {
                c0577a.f(cVar, textPaintK, true);
                float fAscent = f20 - textPaintK.ascent();
                if (c0577a.f63666s) {
                    float f22 = c0577a.f63658k + f21;
                    f12 = fAscent + c0577a.f63659l;
                    f13 = f22;
                } else {
                    f12 = fAscent;
                    f13 = f21;
                }
                h(cVar, null, canvas, f13, f12, textPaintK);
            }
            c0577a.f(cVar, textPaintK, false);
            i(cVar, null, canvas, f21, f20 - textPaintK.ascent(), textPaintK, z10);
        } else if (strArr.length == 1) {
            if (c0577a.n(cVar)) {
                c0577a.f(cVar, textPaintK, true);
                float fAscent2 = f20 - textPaintK.ascent();
                if (c0577a.f63666s) {
                    float f23 = c0577a.f63658k + f21;
                    f16 = fAscent2 + c0577a.f63659l;
                    f17 = f23;
                } else {
                    f16 = fAscent2;
                    f17 = f21;
                }
                h(cVar, strArr[0], canvas, f17, f16, textPaintK);
            }
            c0577a.f(cVar, textPaintK, false);
            i(cVar, strArr[0], canvas, f21, f20 - textPaintK.ascent(), textPaintK, z10);
        } else {
            float length = (cVar.f62905p - (cVar.f62902m * 2)) / strArr.length;
            int i11 = 0;
            while (i11 < strArr.length) {
                String str = strArr[i11];
                if (str == null || str.length() == 0) {
                    i11 = i11;
                } else {
                    if (c0577a.n(cVar)) {
                        c0577a.f(cVar, textPaintK, z11);
                        float fAscent3 = ((i11 * length) + f20) - textPaintK.ascent();
                        if (c0577a.f63666s) {
                            float f24 = c0577a.f63658k + f21;
                            f14 = fAscent3 + c0577a.f63659l;
                            f15 = f24;
                        } else {
                            f14 = fAscent3;
                            f15 = f21;
                        }
                        h(cVar, strArr[i11], canvas, f15, f14, textPaintK);
                    }
                    c0577a.f(cVar, textPaintK, z12);
                    i(cVar, strArr[i11], canvas, f21, ((i11 * length) + f20) - textPaintK.ascent(), textPaintK, z10);
                }
                i11++;
                z12 = z12;
                z11 = true;
            }
        }
        if (cVar.f62899j != 0) {
            Paint paintM = c0577a.m(cVar);
            float f25 = (f11 + cVar.f62905p) - c0577a.f63655h;
            canvas.drawLine(f10, f25, f10 + cVar.f62904o, f25, paintM);
        }
        if (cVar.f62901l != 0) {
            canvas.drawRect(f10, f11, f10 + cVar.f62904o, f11 + cVar.f62905p, c0577a.j(cVar));
        }
    }

    public void h(kl.c cVar, String str, Canvas canvas, float f10, float f11, Paint paint) {
        if (str != null) {
            canvas.drawText(str, f10, f11, paint);
        } else {
            canvas.drawText(cVar.f62892c.toString(), f10, f11, paint);
        }
    }

    public void i(kl.c cVar, String str, Canvas canvas, float f10, float f11, TextPaint textPaint, boolean z10) {
        if (z10 && (cVar instanceof p)) {
            textPaint.setAlpha(255);
        }
        if (str != null) {
            canvas.drawText(str, f10, f11, textPaint);
        } else {
            canvas.drawText(cVar.f62892c.toString(), f10, f11, textPaint);
        }
    }

    public Float j(kl.c cVar, Paint paint) {
        Float fValueOf = Float.valueOf(paint.getTextSize());
        Map<Float, Float> map = f63718a;
        Float f10 = map.get(fValueOf);
        if (f10 == null) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            Float fValueOf2 = Float.valueOf((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading);
            map.put(fValueOf, fValueOf2);
            return fValueOf2;
        }
        return f10;
    }
}
