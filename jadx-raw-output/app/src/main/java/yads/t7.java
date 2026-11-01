package yads;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class t7 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f8 f82902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(f8 f8Var) {
        super(1);
        this.f82902b = f8Var;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        cl.s sVar = (cl.s) obj;
        for (Map.Entry entry : this.f82902b.f77332h.entrySet()) {
            cl.h.f(sVar, (String) entry.getKey(), new s7(entry));
        }
        return mj.r.f64562a;
    }
}
