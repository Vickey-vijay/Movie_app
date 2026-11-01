package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class l13 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm f79684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bp f79685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m13 f79686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u41 f79687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f79688e;

    /* JADX WARN: Code duplicated, block: B:103:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Bitmap bitmap;
        g13 g13Var;
        List list;
        Object obj;
        dm dmVar;
        String str;
        g13 g13Var2;
        dm dmVar2;
        g13 g13Var3;
        float fWidth;
        int i18;
        String str2;
        String str3;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        Drawable drawable = this.f79688e;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return;
        }
        boolean z10 = (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) ? false : true;
        boolean z11 = (i13 == i11 || i10 == i12) ? false : true;
        if (z10 && z11) {
            RectF rectF = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
            if (rectF.height() == 0.0f) {
                return;
            }
            bm bmVar = this.f79684a;
            u41 u41Var = this.f79687d;
            bmVar.getClass();
            o13 o13Var = u41Var.f83370e;
            if (o13Var != null && (dmVar = o13Var.f80898e) != null) {
                String str4 = dmVar.f76730d;
                boolean z12 = (str4 == null || (str3 = dmVar.f76727a) == null || !ck.p.e(str4, str3)) ? false : true;
                String str5 = dmVar.f76729c;
                boolean z13 = (str5 == null || (str2 = dmVar.f76728b) == null || !ck.p.e(str5, str2)) ? false : true;
                if (z12 || z13) {
                    bm bmVar2 = this.f79684a;
                    u41 u41Var2 = this.f79687d;
                    bmVar2.getClass();
                    o13 o13Var2 = u41Var2.f83370e;
                    if (o13Var2 == null || (dmVar2 = o13Var2.f80898e) == null || (g13Var3 = o13Var2.f80899f) == null) {
                        str = null;
                    } else {
                        float fWidth2 = rectF.width();
                        float fHeight = rectF.height();
                        float f10 = u41Var2.f83366a;
                        float f11 = u41Var2.f83367b;
                        float f12 = g13Var3.f77588c;
                        float f13 = g13Var3.f77589d;
                        if (fWidth2 == 0.0f || fHeight == 0.0f || f10 == 0.0f || f11 == 0.0f || f12 == 0.0f || f13 == 0.0f) {
                            str = null;
                        } else {
                            if (rectF.width() / rectF.height() > g13Var3.f77588c / g13Var3.f77589d) {
                                fWidth = rectF.height();
                                i18 = g13Var3.f77589d;
                            } else {
                                fWidth = rectF.width();
                                i18 = g13Var3.f77588c;
                            }
                            if (fWidth / i18 <= 1.0f) {
                                if (fWidth2 / fHeight > f12 / f13) {
                                    if (ck.p.e(dmVar2.f76728b, dmVar2.f76729c)) {
                                        str = dmVar2.f76728b;
                                    } else {
                                        str = null;
                                    }
                                } else if (ck.p.e(dmVar2.f76727a, dmVar2.f76730d)) {
                                    str = dmVar2.f76727a;
                                } else {
                                    str = null;
                                }
                            } else if (fWidth2 / fHeight > f10 / f11) {
                                if (ck.p.e(dmVar2.f76728b, dmVar2.f76729c)) {
                                    str = dmVar2.f76728b;
                                } else {
                                    str = null;
                                }
                            } else if (ck.p.e(dmVar2.f76727a, dmVar2.f76730d)) {
                                str = dmVar2.f76727a;
                            } else {
                                str = null;
                            }
                        }
                    }
                    o13 o13Var3 = this.f79687d.f83370e;
                    if (o13Var3 == null || (g13Var2 = o13Var3.f80899f) == null) {
                        return;
                    }
                    if (str == null) {
                        this.f79686c.a(imageView, bitmap, g13Var2);
                        return;
                    }
                    m13 m13Var = this.f79686c;
                    m13Var.getClass();
                    float width = imageView.getWidth();
                    float height = imageView.getHeight();
                    float width2 = bitmap.getWidth();
                    float height2 = bitmap.getHeight();
                    int i19 = g13Var2.f77588c;
                    float f14 = i19;
                    int i20 = g13Var2.f77589d;
                    float f15 = i20;
                    if (height == 0.0f || f15 == 0.0f || height2 == 0.0f) {
                        return;
                    }
                    float f16 = width / height;
                    float f17 = f16 < f14 / f15 ? width / f14 : height / f15;
                    if (f17 > 1.0f) {
                        f17 = f16 < width2 / height2 ? width / width2 : height / height2;
                    }
                    float f18 = 2;
                    float f19 = (width / f18) - (((i19 / 2) + g13Var2.f77586a) * f17);
                    float f20 = (height / f18) - (((i20 / 2) + g13Var2.f77587b) * f17);
                    m13Var.f80027b.setScale(f17, f17);
                    m13Var.f80027b.postTranslate(f19, f20);
                    imageView.setScaleType(ImageView.ScaleType.MATRIX);
                    imageView.setImageMatrix(m13Var.f80027b);
                    imageView.setBackgroundColor(Color.parseColor(str));
                    i13 i13Var = m13Var.f80026a;
                    Context context = imageView.getContext();
                    i13Var.getClass();
                    if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
                        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                        Canvas canvas = new Canvas(bitmapCopy);
                        Rect rect = m13Var.f80029d;
                        int i21 = g13Var2.f77586a;
                        int i22 = g13Var2.f77587b;
                        rect.set(i21, i22, g13Var2.f77588c + i21, g13Var2.f77589d + i22);
                        canvas.drawRect(rect, m13Var.f80028c);
                        imageView.setImageBitmap(bitmapCopy);
                        return;
                    }
                    return;
                }
            }
            bp bpVar = this.f79685b;
            u41 u41Var3 = this.f79687d;
            bpVar.getClass();
            RectF rectF2 = new RectF(0.0f, 0.0f, u41Var3.f83366a, u41Var3.f83367b);
            o13 o13Var4 = u41Var3.f83370e;
            if (o13Var4 == null || (list = o13Var4.f80900g) == null) {
                g13Var = null;
            } else {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        g13 g13Var4 = (g13) it.next();
                        next = (g13) next;
                        bpVar.f75926a.getClass();
                        float fA = k13.a(next, rectF, rectF2);
                        float fA2 = k13.a(g13Var4, rectF, rectF2);
                        if (fA != Float.MAX_VALUE) {
                            if (fA == fA2) {
                                if (next.f77590e > g13Var4.f77590e) {
                                }
                            } else if (fA > fA2) {
                            }
                        }
                        next = g13Var4;
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                g13Var = (g13) obj;
            }
            if (g13Var != null) {
                this.f79686c.a(imageView, bitmap, g13Var);
            }
        }
    }

    public l13(bm bmVar, bp bpVar, m13 m13Var, u41 u41Var, Drawable drawable) {
        this.f79684a = bmVar;
        this.f79685b = bpVar;
        this.f79686c = m13Var;
        this.f79687d = u41Var;
        this.f79688e = drawable;
    }
}
