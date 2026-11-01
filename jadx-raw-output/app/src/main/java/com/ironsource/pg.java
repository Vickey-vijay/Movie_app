package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30462c;

    public final boolean a() {
        return this.f30460a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg)) {
            return false;
        }
        pg pgVar = (pg) obj;
        return this.f30460a == pgVar.f30460a && this.f30461b == pgVar.f30461b && this.f30462c == pgVar.f30462c;
    }

    public final pg a(boolean z10, boolean z11, boolean z12) {
        return new pg(z10, z11, z12);
    }

    public final boolean b() {
        return this.f30461b;
    }

    public final boolean c() {
        return this.f30462c;
    }

    public final boolean d() {
        return this.f30462c;
    }

    public final boolean e() {
        return this.f30460a;
    }

    public final boolean f() {
        return this.f30461b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z10 = this.f30460a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z11 = this.f30461b;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.f30462c;
        return i11 + (z12 ? 1 : z12);
    }

    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f30460a + ", isWindowVisible=" + this.f30461b + ", isShown=" + this.f30462c + ")";
    }

    public pg(boolean z10, boolean z11, boolean z12) {
        this.f30460a = z10;
        this.f30461b = z11;
        this.f30462c = z12;
    }

    public static /* synthetic */ pg a(pg pgVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = pgVar.f30460a;
        }
        if ((i10 & 2) != 0) {
            z11 = pgVar.f30461b;
        }
        if ((i10 & 4) != 0) {
            z12 = pgVar.f30462c;
        }
        return pgVar.a(z10, z11, z12);
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put(C3537j8.f29257k, this.f30460a).put(C3537j8.f29258l, this.f30461b).put(C3537j8.f29259m, this.f30462c);
        ck.p.i(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }
}
