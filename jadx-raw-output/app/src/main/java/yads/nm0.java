package yads;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nm0 extends Lambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nl2 f80705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm0(nl2 nl2Var) {
        super(2);
        this.f80705b = nl2Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        this.f80705b.a((String) obj, (String) obj2);
        return mj.r.f64562a;
    }
}
