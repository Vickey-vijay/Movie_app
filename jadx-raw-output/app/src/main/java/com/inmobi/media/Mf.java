package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Mf extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wk.a f23163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f23164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f23166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f23167e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mf(Context context, rj.c cVar) {
        super(2, cVar);
        this.f23167e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Mf mf2 = new Mf(this.f23167e, cVar);
        mf2.f23166d = obj;
        return mf2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        Mf mf2 = new Mf(this.f23167e, (rj.c) obj2);
        mf2.f23166d = (nk.l0) obj;
        return mf2.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        wk.a aVar;
        Context context;
        WeakReference weakReference;
        Object objF = sj.a.f();
        int i10 = this.f23165c;
        if (i10 != 0) {
            if (i10 == 1) {
                context = this.f23164b;
                aVar = this.f23163a;
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) this.f23166d;
            aVar = Qf.f23388b;
            Context context2 = this.f23167e;
            this.f23166d = l0Var;
            this.f23163a = aVar;
            this.f23164b = context2;
            this.f23165c = 1;
            if (aVar.a(null, this) == objF) {
                return objF;
            }
            context = context2;
        }
        int i11 = 0;
        try {
            int size = Qf.f23389c.size();
            while (true) {
                if (i11 < size) {
                    ArrayList arrayList = Qf.f23389c;
                    if (ck.p.e((Context) ((WeakReference) arrayList.get(i11)).get(), context)) {
                        weakReference = (WeakReference) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    weakReference = null;
                    break;
                }
            }
            if (weakReference == null) {
                Qf.f23389c.add(new WeakReference(context));
            }
            Picasso picassoA = Qf.f23387a;
            if (picassoA == null) {
                Ji.a(context, Qf.f23390d);
                picassoA = Qf.a(context);
                Qf.f23387a = picassoA;
            }
            return picassoA;
        } finally {
            aVar.b(null);
        }
    }
}
