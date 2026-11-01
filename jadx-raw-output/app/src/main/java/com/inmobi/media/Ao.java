package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.Ao;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: loaded from: classes6.dex */
public final class Ao extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f22393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ao(ViewGroup viewGroup, rj.c cVar) {
        super(2, cVar);
        this.f22393c = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Ao ao2 = new Ao(this.f22393c, cVar);
        ao2.f22392b = obj;
        return ao2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        Ao ao2 = new Ao(this.f22393c, (rj.c) obj2);
        ao2.f22392b = (pk.n) obj;
        return ao2.invokeSuspend(mj.r.f64562a);
    }

    public static final mj.r a(View view, zo zoVar) {
        view.removeOnAttachStateChangeListener(zoVar);
        return mj.r.f64562a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22391a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            pk.n nVar = (pk.n) this.f22392b;
            nVar.n(tj.a.a(this.f22393c.isAttachedToWindow()));
            final zo zoVar = new zo(nVar);
            this.f22393c.addOnAttachStateChangeListener(zoVar);
            final ViewGroup viewGroup = this.f22393c;
            bk.a aVar = new bk.a() { // from class: b7.c
                @Override // bk.a
                public final Object invoke() {
                    return Ao.a(viewGroup, zoVar);
                }
            };
            this.f22391a = 1;
            if (ProduceKt.b(nVar, aVar, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
