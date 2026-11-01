package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3136qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk.a f25186a = wk.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f25187b = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25188c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        C3086oh c3086oh;
        kotlin.coroutines.d dVar;
        if (continuationImpl instanceof C3086oh) {
            c3086oh = (C3086oh) continuationImpl;
            int i10 = c3086oh.f25001d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3086oh.f25001d = i10 - Integer.MIN_VALUE;
            } else {
                c3086oh = new C3086oh(this, continuationImpl);
            }
        } else {
            c3086oh = new C3086oh(this, continuationImpl);
        }
        Object obj = c3086oh.f24999b;
        Object objF = sj.a.f();
        int i11 = c3086oh.f25001d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            kotlin.coroutines.d context = c3086oh.getContext();
            System.out.println(c3086oh.getContext());
            if (ck.p.e(this.f25187b.get(), context)) {
                this.f25188c++;
                return mj.r.f64562a;
            }
            wk.a aVar = this.f25186a;
            c3086oh.f24998a = context;
            c3086oh.f25001d = 1;
            if (wk.a.C0783a.a(aVar, null, c3086oh, 1, null) == objF) {
                return objF;
            }
            dVar = context;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = c3086oh.f24998a;
            kotlin.c.b(obj);
        }
        this.f25187b = new WeakReference(dVar);
        this.f25188c = 1;
        return mj.r.f64562a;
    }

    public final mj.r a(C3111ph c3111ph) {
        kotlin.coroutines.d context = c3111ph.getContext();
        System.out.println(c3111ph.getContext());
        if (ck.p.e(this.f25187b.get(), context)) {
            int i10 = this.f25188c - 1;
            this.f25188c = i10;
            if (i10 == 0) {
                this.f25187b = new WeakReference(null);
                wk.a.C0783a.b(this.f25186a, null, 1, null);
            }
            return mj.r.f64562a;
        }
        throw new IllegalStateException("ReentrantMutex is not locked by this coroutine.");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(E3 e10, ContinuationImpl continuationImpl) throws Throwable {
        C3111ph c3111ph;
        bk.l lVar;
        if (continuationImpl instanceof C3111ph) {
            c3111ph = (C3111ph) continuationImpl;
            int i10 = c3111ph.f25084d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3111ph.f25084d = i10 - Integer.MIN_VALUE;
            } else {
                c3111ph = new C3111ph(this, continuationImpl);
            }
        } else {
            c3111ph = new C3111ph(this, continuationImpl);
        }
        Object objInvoke = c3111ph.f25082b;
        Object objF = sj.a.f();
        int i11 = c3111ph.f25084d;
        try {
            if (i11 == 0) {
                kotlin.c.b(objInvoke);
                c3111ph.f25081a = e10;
                c3111ph.f25084d = 1;
                if (a((ContinuationImpl) c3111ph) != objF) {
                }
                lVar = e10;
                return objF;
            }
            if (i11 == 1) {
                bk.l lVar2 = (bk.l) c3111ph.f25081a;
                kotlin.c.b(objInvoke);
                lVar = lVar2;
            } else {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Object obj = c3111ph.f25081a;
                        kotlin.c.b(objInvoke);
                        return obj;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) c3111ph.f25081a;
                    kotlin.c.b(objInvoke);
                    throw th2;
                }
                kotlin.c.b(objInvoke);
            }
            c3111ph.f25081a = objInvoke;
            c3111ph.f25084d = 3;
            if (a(c3111ph) == objF) {
                return objInvoke;
            }
            lVar = e10;
            return objF;
            lVar = e10;
            c3111ph.f25081a = null;
            c3111ph.f25084d = 2;
            objInvoke = lVar.invoke(c3111ph);
            if (objInvoke != objF) {
                c3111ph.f25081a = objInvoke;
                c3111ph.f25084d = 3;
                if (a(c3111ph) == objF) {
                    return objInvoke;
                }
            }
        } catch (Throwable th3) {
            c3111ph.f25081a = th3;
            c3111ph.f25084d = 4;
            if (a(c3111ph) != objF) {
                throw th3;
            }
        }
        lVar = e10;
        return objF;
    }
}
