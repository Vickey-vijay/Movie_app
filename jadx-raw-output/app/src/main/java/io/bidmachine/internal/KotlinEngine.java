package io.bidmachine.internal;

import bk.p;
import com.ironsource.C3426d4;
import io.bidmachine.BidMachine;
import io.bidmachine.core.Logger;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.d;
import mj.r;
import nk.j;
import nk.j2;
import nk.l0;
import nk.w0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: KotlinEngine.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lio/bidmachine/internal/KotlinEngine;", "", "Lmj/r;", C3426d4.a.f28413f, "Lnk/l0;", "scope", "Lnk/l0;", "<init>", "()V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class KotlinEngine {
    public static final KotlinEngine INSTANCE = new KotlinEngine();
    private static final l0 scope = d.a(j2.b(null, 1, null).plus(w0.a()));

    private KotlinEngine() {
    }

    /* JADX INFO: renamed from: io.bidmachine.internal.KotlinEngine$init$1, reason: invalid class name */
    /* JADX INFO: compiled from: KotlinEngine.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.internal.KotlinEngine$init$1", f = "KotlinEngine.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                Logger.d(BidMachine.NAME, "Kotlin runtime version is " + KotlinVersion.CURRENT);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void init() {
        Logger.d(BidMachine.NAME, "Init Kt");
        j.d(scope, null, null, new AnonymousClass1(null), 3, null);
    }
}
