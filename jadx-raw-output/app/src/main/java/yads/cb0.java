package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class cb0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public db0 f76221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wa0 f76222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f76223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db0 f76224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f76225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(db0 db0Var, rj.c cVar) {
        super(cVar);
        this.f76224e = db0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f76223d = obj;
        this.f76225f |= Integer.MIN_VALUE;
        return this.f76224e.a(null, null, this);
    }
}
