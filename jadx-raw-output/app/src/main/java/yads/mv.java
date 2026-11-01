package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class mv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f80398a = new w5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mc2 f80399b = new mc2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5 f80400c = v5.A;

    public final Long a() {
        List listO0;
        Object next;
        w5 w5Var = this.f80398a;
        synchronized (w5Var.f84105a) {
            listO0 = nj.b0.O0(w5Var.f84108d);
        }
        Iterator it = listO0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((u5) next).f83374a != this.f80400c);
        u5 u5Var = (u5) next;
        if (u5Var == null) {
            return null;
        }
        Object obj = u5Var.f83375b.get("duration");
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }
}
