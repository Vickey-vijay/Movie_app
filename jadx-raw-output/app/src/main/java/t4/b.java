package t4;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: Cue.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f72219p = new b("");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final CharSequence f72220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f72221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Bitmap f72222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f72223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f72224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f72225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f72226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f72227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f72228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f72229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f72230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f72231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f72232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f72233o;

    public b(Bitmap bitmap, float f10, int i10, float f11, int i11, float f12, float f13) {
        this(null, null, bitmap, f11, 0, i11, f10, i10, Integer.MIN_VALUE, -3.4028235E38f, f12, f13, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public b(CharSequence charSequence) {
        this(charSequence, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    public b(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        this(charSequence, alignment, f10, i10, i11, f11, i12, f12, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public b(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, int i13, float f13) {
        this(charSequence, alignment, null, f10, i10, i11, f11, i12, i13, f13, f12, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public b(CharSequence charSequence, @Nullable Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13) {
        this(charSequence, alignment, null, f10, i10, i11, f11, i12, Integer.MIN_VALUE, -3.4028235E38f, f12, -3.4028235E38f, z10, i13);
    }

    public b(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14) {
        this.f72220b = charSequence;
        this.f72221c = alignment;
        this.f72222d = bitmap;
        this.f72223e = f10;
        this.f72224f = i10;
        this.f72225g = i11;
        this.f72226h = f11;
        this.f72227i = i12;
        this.f72228j = f13;
        this.f72229k = f14;
        this.f72230l = z10;
        this.f72231m = i14;
        this.f72232n = i13;
        this.f72233o = f12;
    }
}
