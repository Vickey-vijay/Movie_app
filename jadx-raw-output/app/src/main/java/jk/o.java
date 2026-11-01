package jk;

import ck.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;

/* JADX INFO: compiled from: KTypeProjection.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f61802c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f61803d = new o(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KVariance f61804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f61805b;

    /* JADX INFO: compiled from: KTypeProjection.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final o a(n nVar) {
            p.j(nVar, "type");
            return new o(KVariance.INVARIANT, nVar);
        }
    }

    /* JADX INFO: compiled from: KTypeProjection.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f61804a == oVar.f61804a && p.e(this.f61805b, oVar.f61805b);
    }

    public int hashCode() {
        KVariance kVariance = this.f61804a;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        n nVar = this.f61805b;
        return iHashCode + (nVar != null ? nVar.hashCode() : 0);
    }

    public final KVariance a() {
        return this.f61804a;
    }

    public final n getType() {
        return this.f61805b;
    }

    public String toString() {
        KVariance kVariance = this.f61804a;
        int i10 = kVariance == null ? -1 : b.$EnumSwitchMapping$0[kVariance.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f61805b);
        }
        if (i10 == 2) {
            return "in " + this.f61805b;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.f61805b;
    }

    public o(KVariance kVariance, n nVar) {
        boolean z10;
        boolean z11;
        String str;
        this.f61804a = kVariance;
        this.f61805b = nVar;
        if (kVariance == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (nVar == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z10 == z11)) {
            if (kVariance == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + kVariance + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }
}
