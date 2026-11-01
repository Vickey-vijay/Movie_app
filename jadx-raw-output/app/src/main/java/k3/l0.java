package k3;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: PlaybackParameters.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f62208e = new l0(1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f62209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f62210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f62211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f62212d;

    public l0(float f10) {
        this(f10, 1.0f, false);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f62209a == l0Var.f62209a && this.f62210b == l0Var.f62210b && this.f62211c == l0Var.f62211c;
    }

    public l0(float f10, float f11) {
        this(f10, f11, false);
    }

    public long a(long j10) {
        return j10 * ((long) this.f62212d);
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f62209a)) * 31) + Float.floatToRawIntBits(this.f62210b)) * 31) + (this.f62211c ? 1 : 0);
    }

    public l0(float f10, float f11, boolean z10) {
        g5.a.a(f10 > 0.0f);
        g5.a.a(f11 > 0.0f);
        this.f62209a = f10;
        this.f62210b = f11;
        this.f62211c = z10;
        this.f62212d = Math.round(f10 * 1000.0f);
    }
}
