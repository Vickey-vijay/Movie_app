package yads;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class s7 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f82546b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Map.Entry entry) {
        super(1);
        this.f82546b = entry;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        cl.s sVar = (cl.s) obj;
        cl.h.c(sVar, "usagePercent", Integer.valueOf(((h8) this.f82546b.getValue()).f78092a));
        cl.h.b(sVar, "isDisabled", Boolean.valueOf(((h8) this.f82546b.getValue()).f78093b));
        return mj.r.f64562a;
    }
}
