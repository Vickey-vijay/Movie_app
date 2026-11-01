package sg.bigo.ads.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69807c;

    public p(int i10, int i11) {
        this.f69806b = i10;
        this.f69807c = i11;
    }

    public static p a(int i10, int i11, int i12) {
        return new p((int) (((i12 * 1.0f) * i10) / i11), i12);
    }

    @NonNull
    public static p a(int i10, int i11, int i12, int i13) {
        float f10 = i10;
        float f11 = i11;
        float f12 = i12;
        float f13 = i13;
        if ((f10 * 1.0f) / f11 > (1.0f * f12) / f13) {
            f13 = (f12 / f10) * f11;
        } else {
            f12 = (f13 / f11) * f10;
        }
        return new p((int) f12, (int) f13);
    }

    public static p b(int i10, int i11, int i12) {
        return new p(i12, (int) (((i12 * 1.0f) * i11) / i10));
    }

    public final boolean a() {
        return this.f69806b > 0 && this.f69807c > 0;
    }

    public final boolean a(int i10, int i11) {
        int i12;
        int i13;
        return (i10 == 0 || i11 == 0 || (i12 = this.f69806b) == 0 || (i13 = this.f69807c) == 0 || i10 * i13 != i11 * i12) ? false : true;
    }

    public final boolean a(p pVar) {
        return pVar != null && this.f69806b * this.f69807c > pVar.f69806b * pVar.f69807c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.f69807c == this.f69807c && pVar.f69806b == this.f69806b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f69807c;
    }

    public int getWidth() {
        return this.f69806b;
    }

    public String toString() {
        return this.f69806b + VastAttributes.HORIZONTAL_POSITION + this.f69807c;
    }
}
