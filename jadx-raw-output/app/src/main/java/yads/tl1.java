package yads;

import android.os.Bundle;
import yads.tl1;
import yads.xq;

/* JADX INFO: loaded from: classes11.dex */
public abstract class tl1 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f83078g = new wq() { // from class: cp.ja
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return tl1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f83080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f83081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f83082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f83083f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl1)) {
            return false;
        }
        tl1 tl1Var = (tl1) obj;
        return this.f83079b == tl1Var.f83079b && this.f83080c == tl1Var.f83080c && this.f83081d == tl1Var.f83081d && this.f83082e == tl1Var.f83082e && this.f83083f == tl1Var.f83083f;
    }

    public static ul1 a(Bundle bundle) {
        sl1 sl1Var = new sl1();
        long j10 = bundle.getLong(Integer.toString(0, 36), 0L);
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        sl1Var.f82681a = j10;
        long j11 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
        if (j11 != Long.MIN_VALUE && j11 < 0) {
            throw new IllegalArgumentException();
        }
        sl1Var.f82682b = j11;
        sl1Var.f82683c = bundle.getBoolean(Integer.toString(2, 36), false);
        sl1Var.f82684d = bundle.getBoolean(Integer.toString(3, 36), false);
        sl1Var.f82685e = bundle.getBoolean(Integer.toString(4, 36), false);
        return new ul1(sl1Var);
    }

    public final int hashCode() {
        long j10 = this.f83079b;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f83080c;
        return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f83081d ? 1 : 0)) * 31) + (this.f83082e ? 1 : 0)) * 31) + (this.f83083f ? 1 : 0);
    }

    public tl1(sl1 sl1Var) {
        this.f83079b = sl1Var.f82681a;
        this.f83080c = sl1Var.f82682b;
        this.f83081d = sl1Var.f82683c;
        this.f83082e = sl1Var.f82684d;
        this.f83083f = sl1Var.f82685e;
    }
}
