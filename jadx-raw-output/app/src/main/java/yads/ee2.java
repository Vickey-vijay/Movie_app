package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;
import yads.ee2;
import yads.xq;

/* JADX INFO: loaded from: classes7.dex */
public final class ee2 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ee2 f77039e = new ee2(1.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f77040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f77041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77042d;

    public static ee2 a(Bundle bundle) {
        return new ee2(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ee2.class != obj.getClass()) {
            return false;
        }
        ee2 ee2Var = (ee2) obj;
        return this.f77040b == ee2Var.f77040b && this.f77041c == ee2Var.f77041c;
    }

    static {
        new wq() { // from class: cp.i1
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return ee2.a(bundle);
            }
        };
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f77041c) + ((Float.floatToRawIntBits(this.f77040b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f77040b), Float.valueOf(this.f77041c)};
        int i10 = ib3.f78556a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public ee2(float f10, float f11) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        ni.a(z10);
        ni.a(f11 > 0.0f);
        this.f77040b = f10;
        this.f77041c = f11;
        this.f77042d = Math.round(f10 * 1000.0f);
    }
}
