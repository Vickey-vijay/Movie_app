package yads;

import android.os.Bundle;
import yads.xq;
import yads.yl1;

/* JADX INFO: loaded from: classes10.dex */
public final class yl1 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final yl1 f85037g = new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wq f85038h = new wq() { // from class: cp.tc
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return yl1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f85039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f85041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f85042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f85043f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl1)) {
            return false;
        }
        yl1 yl1Var = (yl1) obj;
        return this.f85039b == yl1Var.f85039b && this.f85040c == yl1Var.f85040c && this.f85041d == yl1Var.f85041d && this.f85042e == yl1Var.f85042e && this.f85043f == yl1Var.f85043f;
    }

    public static yl1 a(Bundle bundle) {
        return new yl1(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
    }

    public final int hashCode() {
        long j10 = this.f85039b;
        long j11 = this.f85040c;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f85041d;
        int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f85042e;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f85043f;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public yl1(long j10, long j11, long j12, float f10, float f11) {
        this.f85039b = j10;
        this.f85040c = j11;
        this.f85041d = j12;
        this.f85042e = f10;
        this.f85043f = f11;
    }
}
