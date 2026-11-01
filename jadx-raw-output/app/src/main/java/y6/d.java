package y6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: EmojiconSpan.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends DynamicDrawableSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f75301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f75305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f75307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f75308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference<Drawable> f75309j;

    public final Drawable a() {
        WeakReference<Drawable> weakReference = this.f75309j;
        if (weakReference == null || weakReference.get() == null) {
            this.f75309j = new WeakReference<>(getDrawable());
        }
        return this.f75309j.get();
    }

    @Override // android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        if (this.f75308i == null) {
            try {
                Drawable drawable = this.f75301b.getResources().getDrawable(this.f75302c);
                this.f75308i = drawable;
                int i10 = this.f75303d;
                this.f75305f = i10;
                int intrinsicWidth = (i10 * drawable.getIntrinsicWidth()) / this.f75308i.getIntrinsicHeight();
                this.f75306g = intrinsicWidth;
                int i11 = this.f75304e;
                int i12 = this.f75305f;
                int i13 = (i11 - i12) / 2;
                this.f75307h = i13;
                this.f75308i.setBounds(0, i13, intrinsicWidth, i12 + i13);
            } catch (Exception unused) {
            }
        }
        return this.f75308i;
    }

    public d(Context context, int i10, int i11, int i12, int i13) {
        super(i12);
        this.f75301b = context;
        this.f75302c = i10;
        this.f75303d = i11;
        this.f75305f = i11;
        this.f75306g = i11;
        this.f75304e = i13;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Drawable drawableA = a();
        canvas.save();
        int i15 = i14 - drawableA.getBounds().bottom;
        if (((DynamicDrawableSpan) this).mVerticalAlignment == 1) {
            i15 = ((i12 + ((i14 - i12) / 2)) - ((drawableA.getBounds().bottom - drawableA.getBounds().top) / 2)) - this.f75307h;
        }
        canvas.translate(f10, i15);
        drawableA.draw(canvas);
        canvas.restore();
    }
}
