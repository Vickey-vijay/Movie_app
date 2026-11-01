package yads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f85472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wl1 f85474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f85475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f85476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p51 f85477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f85478g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl1)) {
            return false;
        }
        zl1 zl1Var = (zl1) obj;
        return this.f85472a.equals(zl1Var.f85472a) && ib3.a(this.f85473b, zl1Var.f85473b) && ib3.a(this.f85474c, zl1Var.f85474c) && ib3.a((Object) null, (Object) null) && this.f85475d.equals(zl1Var.f85475d) && ib3.a(this.f85476e, zl1Var.f85476e) && this.f85477f.equals(zl1Var.f85477f) && ib3.a(this.f85478g, zl1Var.f85478g);
    }

    public final int hashCode() {
        int iHashCode = this.f85472a.hashCode() * 31;
        String str = this.f85473b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        wl1 wl1Var = this.f85474c;
        int iHashCode3 = (this.f85475d.hashCode() + ((iHashCode2 + (wl1Var == null ? 0 : wl1Var.hashCode())) * 961)) * 31;
        String str2 = this.f85476e;
        int iHashCode4 = (this.f85477f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f85478g;
        return iHashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public zl1(Uri uri, String str, wl1 wl1Var, List list, String str2, p51 p51Var, Object obj) {
        this.f85472a = uri;
        this.f85473b = str;
        this.f85474c = wl1Var;
        this.f85475d = list;
        this.f85476e = str2;
        this.f85477f = p51Var;
        l51 l51VarF = p51.f();
        if (p51Var.size() <= 0) {
            l51VarF.a();
            this.f85478g = obj;
        } else {
            ((dm1) p51Var.get(0)).a();
            throw null;
        }
    }
}
