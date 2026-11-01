package y2;

import ck.p;

/* JADX INFO: compiled from: MintegralSlotIdentifier.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75256b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p.e(this.f75255a, iVar.f75255a) && p.e(this.f75256b, iVar.f75256b);
    }

    public int hashCode() {
        return (this.f75255a.hashCode() * 31) + this.f75256b.hashCode();
    }

    public String toString() {
        return "MintegralSlotIdentifier(adUnitId=" + this.f75255a + ", placementId=" + this.f75256b + ")";
    }

    public i(String str, String str2) {
        p.j(str, "adUnitId");
        p.j(str2, "placementId");
        this.f75255a = str;
        this.f75256b = str2;
    }
}
