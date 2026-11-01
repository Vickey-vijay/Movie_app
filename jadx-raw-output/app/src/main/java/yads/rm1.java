package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public class rm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f82311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f82314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f82315e;

    public rm1(int i10, long j10, Object obj) {
        this(obj, -1, -1, j10, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm1)) {
            return false;
        }
        rm1 rm1Var = (rm1) obj;
        return this.f82311a.equals(rm1Var.f82311a) && this.f82312b == rm1Var.f82312b && this.f82313c == rm1Var.f82313c && this.f82314d == rm1Var.f82314d && this.f82315e == rm1Var.f82315e;
    }

    public rm1(Object obj) {
        this(obj, -1L);
    }

    public final boolean a() {
        return this.f82312b != -1;
    }

    public final int hashCode() {
        return ((((((((this.f82311a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f82312b) * 31) + this.f82313c) * 31) + ((int) this.f82314d)) * 31) + this.f82315e;
    }

    public rm1(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public rm1(Object obj, int i10, int i11, long j10, int i12) {
        this.f82311a = obj;
        this.f82312b = i10;
        this.f82313c = i11;
        this.f82314d = j10;
        this.f82315e = i12;
    }

    public rm1(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public rm1(rm1 rm1Var) {
        this.f82311a = rm1Var.f82311a;
        this.f82312b = rm1Var.f82312b;
        this.f82313c = rm1Var.f82313c;
        this.f82314d = rm1Var.f82314d;
        this.f82315e = rm1Var.f82315e;
    }
}
