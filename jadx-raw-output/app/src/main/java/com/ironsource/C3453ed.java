package com.ironsource;

import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3453ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f28793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f28794f;

    public C3453ed() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public final boolean a() {
        return this.f28789a;
    }

    public final String b() {
        return this.f28790b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3453ed)) {
            return false;
        }
        C3453ed c3453ed = (C3453ed) obj;
        return this.f28789a == c3453ed.f28789a && ck.p.e(this.f28790b, c3453ed.f28790b) && this.f28791c == c3453ed.f28791c && this.f28792d == c3453ed.f28792d && ck.p.e(this.f28793e, c3453ed.f28793e) && ck.p.e(this.f28794f, c3453ed.f28794f);
    }

    public C3453ed(boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2) {
        ck.p.j(str, Ne.f27119b1);
        this.f28789a = z10;
        this.f28790b = str;
        this.f28791c = z11;
        this.f28792d = i10;
        this.f28793e = iArr;
        this.f28794f = iArr2;
    }

    public final C3453ed a(boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2) {
        ck.p.j(str, Ne.f27119b1);
        return new C3453ed(z10, str, z11, i10, iArr, iArr2);
    }

    public final void b(boolean z10) {
        this.f28789a = z10;
    }

    public final boolean c() {
        return this.f28791c;
    }

    public final int d() {
        return this.f28792d;
    }

    public final int[] e() {
        return this.f28793e;
    }

    public final int[] f() {
        return this.f28794f;
    }

    public final boolean g() {
        return this.f28791c;
    }

    public final int h() {
        return this.f28792d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        boolean z10 = this.f28789a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iHashCode = ((r10 * 31) + this.f28790b.hashCode()) * 31;
        boolean z11 = this.f28791c;
        int iHashCode2 = (((iHashCode + (z11 ? 1 : z11)) * 31) + Integer.hashCode(this.f28792d)) * 31;
        int[] iArr = this.f28793e;
        int iHashCode3 = (iHashCode2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f28794f;
        return iHashCode3 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.f28789a;
    }

    public final String j() {
        return this.f28790b;
    }

    public final int[] k() {
        return this.f28794f;
    }

    public final int[] l() {
        return this.f28793e;
    }

    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f28789a + ", pixelEventsUrl=" + this.f28790b + ", pixelEventsCompression=" + this.f28791c + ", pixelEventsCompressionLevel=" + this.f28792d + ", pixelOptOut=" + Arrays.toString(this.f28793e) + ", pixelOptIn=" + Arrays.toString(this.f28794f) + ")";
    }

    public static /* synthetic */ C3453ed a(C3453ed c3453ed, boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = c3453ed.f28789a;
        }
        if ((i11 & 2) != 0) {
            str = c3453ed.f28790b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z11 = c3453ed.f28791c;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            i10 = c3453ed.f28792d;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            iArr = c3453ed.f28793e;
        }
        int[] iArr3 = iArr;
        if ((i11 & 32) != 0) {
            iArr2 = c3453ed.f28794f;
        }
        return c3453ed.a(z10, str2, z12, i12, iArr3, iArr2);
    }

    public final void b(int[] iArr) {
        this.f28793e = iArr;
    }

    public final void a(String str) {
        ck.p.j(str, "<set-?>");
        this.f28790b = str;
    }

    public final void a(boolean z10) {
        this.f28791c = z10;
    }

    public final void a(int i10) {
        this.f28792d = i10;
    }

    public final void a(int[] iArr) {
        this.f28794f = iArr;
    }

    public /* synthetic */ C3453ed(boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, ck.i iVar) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? C3471fd.f28905a : str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? -1 : i10, (i11 & 16) != 0 ? null : iArr, (i11 & 32) != 0 ? null : iArr2);
    }
}
