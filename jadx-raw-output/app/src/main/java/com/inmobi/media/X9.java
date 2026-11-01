package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes7.dex */
public final class X9 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y9 f23786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f23790e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X9(Y9 y10, long j10, String str, int i10, String str2, rj.c cVar) {
        super(1, cVar);
        this.f23786a = y10;
        this.f23787b = j10;
        this.f23788c = str;
        this.f23789d = i10;
        this.f23790e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new X9(this.f23786a, this.f23787b, this.f23788c, this.f23789d, this.f23790e, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((X9) create((rj.c) obj)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.inmobi.media.L2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.inmobi.media.L2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3128q9.f25157a;
        ArrayList arrayList2 = new ArrayList();
        V9 v10 = new V9();
        ArrayList arrayList3 = new ArrayList();
        nk.i.b(null, new U9(v10, arrayList3, null), 1, null);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C2777ca((W9) it.next()));
        }
        arrayList.addAll(arrayList2);
        Iterator it2 = arrayList.iterator();
        ck.p.i(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next = it2.next();
            ck.p.i(next, "next(...)");
            Y9 y10 = this.f23786a;
            long j10 = this.f23787b;
            C2777ca c2777ca = (C2777ca) ((Z9) next);
            long j11 = c2777ca.f24128a.f23734c.f25162b;
            if (j10 >= j11 && j10 - j11 <= y10.f23830a) {
                String str = this.f23788c;
                int i10 = this.f23789d;
                c2777ca.a("Message - " + str + ", Reason - " + i10 + ", Timestamp - " + j10 + ", Data - " + this.f23790e);
                c2777ca.b(String.valueOf(i10));
                Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(c2777ca.b());
                if (thM3461exceptionOrNullimpl != null) {
                    try {
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ?? l10 = new L2(thM3461exceptionOrNullimpl);
                        ref$ObjectRef.element = l10;
                        P9.a(l10);
                        Object objA = c2777ca.a();
                        Throwable thM3461exceptionOrNullimpl2 = Result.m3461exceptionOrNullimpl(objA);
                        if (thM3461exceptionOrNullimpl2 != null) {
                            try {
                                ?? l11 = new L2(thM3461exceptionOrNullimpl2);
                                ref$ObjectRef.element = l11;
                                P9.a(l11);
                                objA = Result.m3458constructorimpl(mj.r.f64562a);
                            } catch (Throwable th2) {
                                Result.a aVar = Result.Companion;
                                objA = Result.m3458constructorimpl(kotlin.c.a(th2));
                            }
                        }
                        Result.m3458constructorimpl(Result.m3457boximpl(objA));
                    } catch (Throwable th3) {
                        Result.a aVar2 = Result.Companion;
                        Result.m3458constructorimpl(kotlin.c.a(th3));
                    }
                }
            }
        }
        return mj.r.f64562a;
    }
}
