package yads;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class r7 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f8 f82135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(f8 f8Var) {
        super(1);
        this.f82135b = f8Var;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        cl.b bVar = (cl.b) obj;
        Iterator it = this.f82135b.f77331g.iterator();
        while (it.hasNext()) {
            cl.h.a(bVar, (String) it.next());
        }
        return mj.r.f64562a;
    }
}
