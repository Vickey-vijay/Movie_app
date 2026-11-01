package yads;

/* JADX INFO: loaded from: classes11.dex */
@xk.f
public final class m50 {
    public static final l50 Companion = new l50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f80087d;

    public /* synthetic */ m50(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            bl.o1.a(i10, 15, k50.f79307a.getDescriptor());
        }
        this.f80084a = str;
        this.f80085b = str2;
        this.f80086c = str3;
        this.f80087d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return ck.p.e(this.f80084a, m50Var.f80084a) && ck.p.e(this.f80085b, m50Var.f80085b) && ck.p.e(this.f80086c, m50Var.f80086c) && ck.p.e(this.f80087d, m50Var.f80087d);
    }

    public m50(String str, String str2, String str3, String str4) {
        this.f80084a = str;
        this.f80085b = str2;
        this.f80086c = str3;
        this.f80087d = str4;
    }

    public final int hashCode() {
        return this.f80087d.hashCode() + k4.a(this.f80086c, k4.a(this.f80085b, this.f80084a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DebugPanelAppData(appId=" + this.f80084a + ", appVersion=" + this.f80085b + ", system=" + this.f80086c + ", androidApiLevel=" + this.f80087d + ")";
    }
}
