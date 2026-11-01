package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Pb extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3304xb f23325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f23326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3304xb f23328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f23329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f23330f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pb(C3304xb c3304xb, long j10, int i10, rj.c cVar) {
        super(2, cVar);
        this.f23328d = c3304xb;
        this.f23329e = j10;
        this.f23330f = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Pb(this.f23328d, this.f23329e, this.f23330f, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((Pb) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:7:0x0013, B:18:0x003d, B:20:0x0043, B:11:0x001f, B:17:0x0035, B:14:0x0026), top: B:28:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[LOOP:0: B:18:0x003d->B:33:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3304xb c3304xb;
        Iterator it;
        String str;
        Object objF = sj.a.f();
        int i10 = this.f23327c;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        it = this.f23326b;
                        c3304xb = this.f23325a;
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                }
                while (it.hasNext()) {
                    C3130qb c3130qb = (C3130qb) it.next();
                    Tb.a(c3130qb.f25161a);
                    str = c3130qb.f25161a;
                    this.f23325a = c3304xb;
                    this.f23326b = it;
                    this.f23327c = 2;
                    if (c3304xb.a(str, this) == objF) {
                        return objF;
                    }
                }
                Sb.f23498c.set(false);
                return mj.r.f64562a;
            }
            kotlin.c.b(obj);
            C3304xb c3304xb2 = this.f23328d;
            long j10 = this.f23329e;
            int i11 = this.f23330f;
            this.f23327c = 1;
            obj = c3304xb2.a(j10, i11, this);
            if (obj == objF) {
            }
            return objF;
            c3304xb = this.f23328d;
            it = ((List) obj).iterator();
            while (it.hasNext()) {
                C3130qb c3130qb2 = (C3130qb) it.next();
                Tb.a(c3130qb2.f25161a);
                str = c3130qb2.f25161a;
                this.f23325a = c3304xb;
                this.f23326b = it;
                this.f23327c = 2;
                if (c3304xb.a(str, this) == objF) {
                    return objF;
                }
            }
            Sb.f23498c.set(false);
            return mj.r.f64562a;
        } catch (Throwable th2) {
            Sb.f23498c.set(false);
            throw th2;
        }
    }
}
