package yads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class rn extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zn f82318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ra3 f82319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f82320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn f82321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f82322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(zn znVar, rj.c cVar) {
        super(cVar);
        this.f82321e = znVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f82320d = obj;
        this.f82322f |= Integer.MIN_VALUE;
        return zn.a(this.f82321e, null, this);
    }
}
