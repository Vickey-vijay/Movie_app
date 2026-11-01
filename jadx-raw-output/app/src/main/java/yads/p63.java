package yads;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import yads.p63;
import yads.xq;

/* JADX INFO: loaded from: classes10.dex */
public final class p63 implements xq {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wq f81265i = new wq() { // from class: cp.a8
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return p63.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f81266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f81267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f81269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f81270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e6 f81272h = e6.f76925h;

    public static p63 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), 0);
        long j10 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
        long j11 = bundle.getLong(Integer.toString(2, 36), 0L);
        boolean z10 = bundle.getBoolean(Integer.toString(3, 36));
        Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
        e6 e6Var = bundle2 != null ? (e6) e6.f76927j.fromBundle(bundle2) : e6.f76925h;
        p63 p63Var = new p63();
        p63Var.a(null, null, i10, j10, j11, e6Var, z10);
        return p63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p63.class.equals(obj.getClass())) {
            return false;
        }
        p63 p63Var = (p63) obj;
        return ib3.a(this.f81266b, p63Var.f81266b) && ib3.a(this.f81267c, p63Var.f81267c) && this.f81268d == p63Var.f81268d && this.f81269e == p63Var.f81269e && this.f81270f == p63Var.f81270f && this.f81271g == p63Var.f81271g && ib3.a(this.f81272h, p63Var.f81272h);
    }

    public final int b(long j10) {
        e6 e6Var = this.f81272h;
        long j11 = this.f81269e;
        int i10 = e6Var.f76929c - 1;
        while (i10 >= 0 && j10 != Long.MIN_VALUE) {
            long j12 = e6Var.a(i10).f76580b;
            if (j12 != Long.MIN_VALUE) {
                if (j10 >= j12) {
                    break;
                }
                i10--;
            } else {
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    break;
                }
                i10--;
            }
        }
        if (i10 >= 0) {
            d6 d6VarA = e6Var.a(i10);
            if (d6VarA.f76581c == -1) {
                return i10;
            }
            for (int i11 = 0; i11 < d6VarA.f76581c; i11++) {
                int i12 = d6VarA.f76583e[i11];
                if (i12 == 0 || i12 == 1) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public final int hashCode() {
        Object obj = this.f81266b;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31;
        Object obj2 = this.f81267c;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f81268d) * 31;
        long j10 = this.f81269e;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f81270f;
        return this.f81272h.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f81271g ? 1 : 0)) * 31);
    }

    public final long a(int i10, int i11) {
        d6 d6VarA = this.f81272h.a(i10);
        if (d6VarA.f76581c != -1) {
            return d6VarA.f76584f[i11];
        }
        return -9223372036854775807L;
    }

    public final int a(long j10) {
        e6 e6Var = this.f81272h;
        long j11 = this.f81269e;
        e6Var.getClass();
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = e6Var.f76932f;
        while (i10 < e6Var.f76929c) {
            if (e6Var.a(i10).f76580b == Long.MIN_VALUE || e6Var.a(i10).f76580b > j10) {
                d6 d6VarA = e6Var.a(i10);
                if (d6VarA.f76581c == -1 || d6VarA.a(-1) < d6VarA.f76581c) {
                    break;
                }
            }
            i10++;
        }
        if (i10 < e6Var.f76929c) {
            return i10;
        }
        return -1;
    }

    public final int a(int i10) {
        return this.f81272h.a(i10).a(-1);
    }

    public final long a() {
        return this.f81270f;
    }

    public final p63 a(Object obj, Object obj2, int i10, long j10, long j11, e6 e6Var, boolean z10) {
        this.f81266b = obj;
        this.f81267c = obj2;
        this.f81268d = i10;
        this.f81269e = j10;
        this.f81270f = j11;
        this.f81272h = e6Var;
        this.f81271g = z10;
        return this;
    }
}
