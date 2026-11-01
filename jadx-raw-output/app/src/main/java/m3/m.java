package m3;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: AuxEffectInfo.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f64006b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f64005a == mVar.f64005a && Float.compare(mVar.f64006b, this.f64006b) == 0;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f64005a) * 31) + Float.floatToIntBits(this.f64006b);
    }

    public m(int i10, float f10) {
        this.f64005a = i10;
        this.f64006b = f10;
    }
}
