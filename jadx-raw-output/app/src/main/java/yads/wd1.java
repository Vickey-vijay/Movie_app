package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class wd1 extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterator f84174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ og2 f84175e;

    public wd1(Iterator it, og2 og2Var) {
        this.f84174d = it;
        this.f84175e = og2Var;
    }

    @Override // yads.g
    public final Object a() {
        while (this.f84174d.hasNext()) {
            Object next = this.f84174d.next();
            if (this.f84175e.apply(next)) {
                return next;
            }
        }
        this.f77560b = 3;
        return null;
    }
}
