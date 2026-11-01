package yads;

import android.view.View;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes11.dex */
public final class u0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v0 f83278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f83279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ref$ObjectRef f83280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f83281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f83282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f83283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f83284h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, rj.c cVar) {
        super(cVar);
        this.f83283g = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f83282f = obj;
        this.f83284h |= Integer.MIN_VALUE;
        return this.f83283g.a(null, null, this);
    }
}
