package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.inmobi.media.Co;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: loaded from: classes5.dex */
public final class Co extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f22484c;

    public static final void a(pk.n nVar, boolean z10) {
        nVar.n(Boolean.valueOf(z10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Co(ViewGroup viewGroup, rj.c cVar) {
        super(2, cVar);
        this.f22484c = viewGroup;
    }

    public static final mj.r a() {
        return mj.r.f64562a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Co co2 = new Co(this.f22484c, cVar);
        co2.f22483b = obj;
        return co2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        Co co2 = new Co(this.f22484c, (rj.c) obj2);
        co2.f22483b = (pk.n) obj;
        return co2.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f22482a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            final pk.n nVar = (pk.n) this.f22483b;
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: b7.g
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z10) {
                    Co.a(nVar, z10);
                }
            };
            this.f22484c.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
            ViewGroup viewGroup = this.f22484c;
            if (!ViewCompat.isAttachedToWindow(viewGroup)) {
                viewGroup.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            } else {
                viewGroup.addOnAttachStateChangeListener(new Bo(viewGroup, viewGroup, onWindowFocusChangeListener));
            }
            bk.a aVar = new bk.a() { // from class: b7.h
                @Override // bk.a
                public final Object invoke() {
                    return Co.a();
                }
            };
            this.f22482a = 1;
            if (ProduceKt.b(nVar, aVar, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
