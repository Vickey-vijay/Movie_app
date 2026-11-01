package k3;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: RendererConfiguration.java */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f62237b = new r0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62238a;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r0.class == obj.getClass() && this.f62238a == ((r0) obj).f62238a;
    }

    public int hashCode() {
        return this.f62238a;
    }

    public r0(int i10) {
        this.f62238a = i10;
    }
}
