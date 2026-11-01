package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class z72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f85235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f85236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f85237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b51 f85238d;

    public /* synthetic */ z72(d4 d4Var, v9 v9Var, List list) {
        this(d4Var, v9Var, list, new b51());
    }

    public final boolean a() {
        if (this.f85235a.f76571m) {
            if (!this.f85236b.B) {
                return true;
            }
            Set setA = this.f85238d.a(this.f85237c);
            if (!setA.isEmpty()) {
                Iterator it = setA.iterator();
                while (it.hasNext()) {
                    if (!((u41) it.next()).f83371f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public z72(d4 d4Var, v9 v9Var, List list, b51 b51Var) {
        this.f85235a = d4Var;
        this.f85236b = v9Var;
        this.f85237c = list;
        this.f85238d = b51Var;
    }
}
