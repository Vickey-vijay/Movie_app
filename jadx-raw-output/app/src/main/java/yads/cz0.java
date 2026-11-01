package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class cz0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dz0 f76490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f76491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f76492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz0 f76493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f76494f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz0(dz0 dz0Var, rj.c cVar) {
        super(cVar);
        this.f76493e = dz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f76492d = obj;
        this.f76494f |= Integer.MIN_VALUE;
        return this.f76493e.a(null, false, this);
    }
}
