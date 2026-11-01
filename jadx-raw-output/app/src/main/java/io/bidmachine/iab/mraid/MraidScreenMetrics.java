package io.bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import io.bidmachine.iab.utils.Utils;

/* JADX INFO: loaded from: classes5.dex */
public class MraidScreenMetrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f59233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f59234b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f59235c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f59236d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f59237e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f59238f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f59239g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f59240h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f59241i = new Rect();

    public MraidScreenMetrics(@NonNull Context context) {
        this.f59233a = context.getResources().getDisplayMetrics().density;
    }

    public void a(Rect rect, Rect rect2) {
        rect2.set(Utils.pixelsToIntDips(rect.left, this.f59233a), Utils.pixelsToIntDips(rect.top, this.f59233a), Utils.pixelsToIntDips(rect.right, this.f59233a), Utils.pixelsToIntDips(rect.bottom, this.f59233a));
    }

    public Rect b() {
        return this.f59240h;
    }

    public Rect c() {
        return this.f59241i;
    }

    public Rect d() {
        return this.f59237e;
    }

    public Rect e() {
        return this.f59235c;
    }

    public float getDensity() {
        return this.f59233a;
    }

    public Rect a() {
        return this.f59239g;
    }

    public boolean b(int i10, int i11, int i12, int i13) {
        return a(this.f59240h, this.f59241i, i10, i11, i12, i13);
    }

    public boolean c(int i10, int i11, int i12, int i13) {
        return a(this.f59236d, this.f59237e, i10, i11, i12, i13);
    }

    public boolean a(int i10, int i11, int i12, int i13) {
        return a(this.f59238f, this.f59239g, i10, i11, i12, i13);
    }

    private boolean a(Rect rect, Rect rect2, int i10, int i11, int i12, int i13) {
        if (rect.left == i10 && rect.top == i11 && i10 + i12 == rect.right && i11 + i13 == rect.bottom) {
            return false;
        }
        rect.set(i10, i11, i12 + i10, i13 + i11);
        a(rect, rect2);
        return true;
    }

    public boolean a(int i10, int i11) {
        if (this.f59234b.width() == i10 && this.f59234b.height() == i11) {
            return false;
        }
        this.f59234b.set(0, 0, i10, i11);
        a(this.f59234b, this.f59235c);
        return true;
    }
}
