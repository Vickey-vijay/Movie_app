package yads;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wa0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f84139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f84140d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return ck.p.e(this.f84137a, wa0Var.f84137a) && ck.p.e(this.f84138b, wa0Var.f84138b) && ck.p.e(this.f84139c, wa0Var.f84139c) && ck.p.e(this.f84140d, wa0Var.f84140d);
    }

    @Override // yads.m0
    public final String a() {
        return this.f84137a;
    }

    public final int hashCode() {
        int iA = k4.a(this.f84138b, this.f84137a.hashCode() * 31, 31);
        List list = this.f84139c;
        return this.f84140d.hashCode() + ((iA + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "DeeplinkAction(actionType=" + this.f84137a + ", fallbackUrl=" + this.f84138b + ", fallbackTrackingUrls=" + this.f84139c + ", preferredPackages=" + this.f84140d + ")";
    }

    public wa0(String str, String str2, List list, List list2) {
        this.f84137a = str;
        this.f84138b = str2;
        this.f84139c = list;
        this.f84140d = list2;
    }
}
