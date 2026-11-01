package com.ironsource;

/* JADX INFO: loaded from: classes6.dex */
public final class M3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O3 f27035b;

    public M3(boolean z10, O3 o10) {
        this.f27034a = z10;
        this.f27035b = o10;
    }

    public final boolean a() {
        return this.f27034a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M3)) {
            return false;
        }
        M3 m10 = (M3) obj;
        return this.f27034a == m10.f27034a && this.f27035b == m10.f27035b;
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27036a;

        static {
            int[] iArr = new int[O3.values().length];
            try {
                iArr[O3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27036a = iArr;
        }
    }

    public /* synthetic */ M3(boolean z10, O3 o10, int i10, ck.i iVar) {
        this(z10, (i10 & 2) != 0 ? null : o10);
    }

    public final M3 a(boolean z10, O3 o10) {
        return new M3(z10, o10);
    }

    public final O3 b() {
        return this.f27035b;
    }

    public final O3 c() {
        return this.f27035b;
    }

    public final boolean d() {
        return this.f27034a;
    }

    public final String e() {
        O3 o10 = this.f27035b;
        int i10 = o10 == null ? -1 : a.f27036a[o10.ordinal()];
        if (i10 == 1) {
            return "Placement delivery is false";
        }
        if (i10 == 2) {
            return "In pacing mode";
        }
        if (i10 != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f27034a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        O3 o10 = this.f27035b;
        return i10 + (o10 == null ? 0 : o10.hashCode());
    }

    public String toString() {
        return "CappingStatus(isCapped=" + this.f27034a + " reason=" + this.f27035b + ")";
    }

    public static /* synthetic */ M3 a(M3 m10, boolean z10, O3 o10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = m10.f27034a;
        }
        if ((i10 & 2) != 0) {
            o10 = m10.f27035b;
        }
        return m10.a(z10, o10);
    }
}
