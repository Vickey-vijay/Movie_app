package sg.bigo.ads.common.ab;

import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69482b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ColorInt
    public final int f69484d;

    private b(int i10, int i11, @ColorInt int i12) {
        this.f69481a = i10;
        this.f69483c = i11;
        this.f69484d = i12;
    }

    public static b a(int i10, int i11, @ColorInt int i12) {
        return new b(i10, i11, i12);
    }
}
