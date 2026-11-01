package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class e62 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f76940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f76941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z30 f76942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f76943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f76944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h62 f76945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f76946h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e62(h62 h62Var, rj.c cVar) {
        super(cVar);
        this.f76945g = h62Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f76944f = obj;
        this.f76946h |= Integer.MIN_VALUE;
        return this.f76945g.a(false, (Context) null, (ry1) null, (z30) null, (rj.c) this);
    }
}
