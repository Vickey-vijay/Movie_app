package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class gy2 extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f77973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy2 f77974e;

    public gy2(hy2 hy2Var) {
        this.f77974e = hy2Var;
        this.f77973d = hy2Var.f78415b.iterator();
    }

    @Override // yads.g
    public final Object a() {
        while (this.f77973d.hasNext()) {
            Object next = this.f77973d.next();
            if (this.f77974e.f78416c.contains(next)) {
                return next;
            }
        }
        this.f77560b = 3;
        return null;
    }
}
