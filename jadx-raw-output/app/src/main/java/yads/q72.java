package yads;

import android.content.Context;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class q72 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r72 f81733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f81734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ry1 f81735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f81736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v5 f81737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f81738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f81739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r72 f81740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f81741j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q72(r72 r72Var, rj.c cVar) {
        super(cVar);
        this.f81740i = r72Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f81739h = obj;
        this.f81741j |= Integer.MIN_VALUE;
        return this.f81740i.a(null, null, this);
    }
}
