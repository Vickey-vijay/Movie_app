package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class rk3 extends Lambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk3 f82293b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk3(wk3 wk3Var) {
        super(2);
        this.f82293b = wk3Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (qk3.f81879a[((z90) obj).ordinal()] == 1) {
            this.f82293b.f84249a.invoke(new c90(zBooleanValue));
        }
        return mj.r.f64562a;
    }
}
