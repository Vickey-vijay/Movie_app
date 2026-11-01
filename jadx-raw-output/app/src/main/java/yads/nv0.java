package yads;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class nv0 implements a03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz2 f80815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn f80816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f80819e;

    @Override // yads.a03
    public final int a(Context context) {
        int i10 = this.f80818d;
        return -2 == i10 ? kl3.b(context) : i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ck.p.e(nv0.class, obj.getClass())) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        if (this.f80817c != nv0Var.f80817c) {
            return false;
        }
        return this.f80818d == nv0Var.f80818d && this.f80815a == nv0Var.f80815a;
    }

    @Override // yads.a03
    public final zz2 b() {
        return this.f80815a;
    }

    @Override // yads.a03
    public final int c(Context context) {
        int i10 = this.f80817c;
        return -1 == i10 ? kl3.d(context) : i10;
    }

    @Override // yads.a03
    public final int getHeight() {
        return this.f80818d;
    }

    @Override // yads.a03
    public final int getWidth() {
        return this.f80817c;
    }

    public final int hashCode() {
        return this.f80815a.hashCode() + k4.a(this.f80819e, ((this.f80817c * 31) + this.f80818d) * 31, 31);
    }

    public final String toString() {
        return this.f80819e;
    }

    public nv0(int i10, int i11, zz2 zz2Var, fn fnVar) {
        int i12;
        int i13;
        this.f80815a = zz2Var;
        this.f80816b = fnVar;
        if (i10 < 0 && -1 != i10) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        this.f80817c = i12;
        if (i11 < 0 && -2 != i11) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        this.f80818d = i13;
        ck.w wVar = ck.w.f6066a;
        String str = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, 2));
        ck.p.i(str, "format(...)");
        this.f80819e = str;
    }

    @Override // yads.a03
    public final fn a() {
        return this.f80816b;
    }
}
