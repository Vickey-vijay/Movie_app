package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rc implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f82180d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return ck.p.e(this.f82177a, rcVar.f82177a) && ck.p.e(this.f82178b, rcVar.f82178b) && ck.p.e(this.f82179c, rcVar.f82179c) && ck.p.e(this.f82180d, rcVar.f82180d);
    }

    @Override // yads.m0
    public final String a() {
        return this.f82177a;
    }

    public final int hashCode() {
        return this.f82180d.hashCode() + k4.a(this.f82179c, k4.a(this.f82178b, this.f82177a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AdtuneAction(actionType=" + this.f82177a + ", adtuneUrl=" + this.f82178b + ", optOutUrl=" + this.f82179c + ", trackingUrls=" + this.f82180d + ")";
    }

    public rc(String str, String str2, String str3, ArrayList arrayList) {
        this.f82177a = str;
        this.f82178b = str2;
        this.f82179c = str3;
        this.f82180d = arrayList;
    }
}
