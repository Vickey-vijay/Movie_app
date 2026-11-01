package pm;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.eclipse.jetty.security.UserDataConstraint;

/* JADX INFO: compiled from: RoleInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f66217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f66218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UserDataConstraint f66220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f66221e = new CopyOnWriteArraySet();

    public void a(String str) {
        this.f66221e.add(str);
    }

    public void b(h hVar) {
        if (hVar.f66219c) {
            j(true);
        } else if (!hVar.f66218b) {
            i(true);
        } else if (hVar.f66217a) {
            h(true);
        } else if (!this.f66217a) {
            Iterator<String> it = hVar.f66221e.iterator();
            while (it.hasNext()) {
                this.f66221e.add(it.next());
            }
        }
        k(hVar.f66220d);
    }

    public Set<String> c() {
        return this.f66221e;
    }

    public UserDataConstraint d() {
        return this.f66220d;
    }

    public boolean e() {
        return this.f66217a;
    }

    public boolean f() {
        return this.f66218b;
    }

    public boolean g() {
        return this.f66219c;
    }

    public void h(boolean z10) {
        this.f66217a = z10;
        if (z10) {
            this.f66218b = true;
            this.f66221e.clear();
        }
    }

    public void i(boolean z10) {
        this.f66218b = z10;
        if (z10) {
            return;
        }
        this.f66219c = false;
        this.f66221e.clear();
        this.f66217a = false;
    }

    public void j(boolean z10) {
        this.f66219c = z10;
        if (z10) {
            this.f66218b = true;
            this.f66220d = null;
            this.f66217a = false;
            this.f66221e.clear();
        }
    }

    public void k(UserDataConstraint userDataConstraint) {
        if (userDataConstraint == null) {
            throw new NullPointerException("Null UserDataConstraint");
        }
        UserDataConstraint userDataConstraint2 = this.f66220d;
        if (userDataConstraint2 == null) {
            this.f66220d = userDataConstraint;
        } else {
            this.f66220d = userDataConstraint2.combine(userDataConstraint);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{RoleInfo");
        sb2.append(this.f66219c ? ",F" : "");
        sb2.append(this.f66218b ? ",C" : "");
        sb2.append(this.f66217a ? ",*" : this.f66221e);
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
        return sb2.toString();
    }
}
