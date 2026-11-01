package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public final class y82 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z82 f84843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f84844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f84845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ep f84846e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y82(z82 z82Var, CountDownLatch countDownLatch, ArrayList arrayList, ep epVar, rj.c cVar) {
        super(2, cVar);
        this.f84843b = z82Var;
        this.f84844c = countDownLatch;
        this.f84845d = arrayList;
        this.f84846e = epVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new y82(this.f84843b, this.f84844c, this.f84845d, this.f84846e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((y82) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        JSONArray jSONArray;
        sj.a.f();
        kotlin.c.b(obj);
        z82 z82Var = this.f84843b;
        CountDownLatch countDownLatch = this.f84844c;
        ArrayList arrayList = this.f84845d;
        ep epVar = this.f84846e;
        z82Var.getClass();
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                boolean z10 = ad1.f75480a;
            }
            epVar.f77162a.set(true);
            synchronized (z82Var.f85243b) {
                jSONArray = new JSONArray((Collection) arrayList);
            }
            return jSONArray;
        } catch (InterruptedException unused) {
            boolean z11 = ad1.f75480a;
            return null;
        }
    }
}
