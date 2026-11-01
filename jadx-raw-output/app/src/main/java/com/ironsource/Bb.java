package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Bb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26057c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f26058d = "revenue";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f26059e = "precision";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f26060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26061b;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final Bb a(JSONObject jSONObject) {
            ck.p.j(jSONObject, "json");
            try {
                double d10 = jSONObject.getDouble("revenue");
                String string = jSONObject.getString("precision");
                ck.p.i(string, "precision");
                return new Bb(d10, string);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                C3772wf.a(e10);
                return null;
            }
        }
    }

    public final double a() {
        return this.f26060a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bb)) {
            return false;
        }
        Bb bb2 = (Bb) obj;
        return Double.compare(this.f26060a, bb2.f26060a) == 0 && ck.p.e(this.f26061b, bb2.f26061b);
    }

    public Bb(double d10, String str) {
        ck.p.j(str, "precision");
        this.f26060a = d10;
        this.f26061b = str;
    }

    public final Bb a(double d10, String str) {
        ck.p.j(str, "precision");
        return new Bb(d10, str);
    }

    public final String b() {
        return this.f26061b;
    }

    public final String c() {
        return this.f26061b;
    }

    public final double d() {
        return this.f26060a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f26060a) * 31) + this.f26061b.hashCode();
    }

    public String toString() {
        return "LoadArmData(revenue=" + this.f26060a + ", precision=" + this.f26061b + ")";
    }

    public static /* synthetic */ Bb a(Bb bb2, double d10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = bb2.f26060a;
        }
        if ((i10 & 2) != 0) {
            str = bb2.f26061b;
        }
        return bb2.a(d10, str);
    }

    public static final Bb a(JSONObject jSONObject) {
        return f26057c.a(jSONObject);
    }
}
