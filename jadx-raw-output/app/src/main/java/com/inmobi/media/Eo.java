package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.inmobi.media.Eo;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: loaded from: classes5.dex */
public final class Eo extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f22610c;

    public static final void a(pk.n nVar, int i10) {
        nVar.n(Boolean.valueOf(i10 == 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eo(ViewGroup viewGroup, rj.c cVar) {
        super(2, cVar);
        this.f22610c = viewGroup;
    }

    public static final mj.r a() {
        return mj.r.f64562a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        Eo eo2 = new Eo(this.f22610c, cVar);
        eo2.f22609b = obj;
        return eo2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        Eo eo2 = new Eo(this.f22610c, (rj.c) obj2);
        eo2.f22609b = (pk.n) obj;
        return eo2.invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z10;
        Object objF = sj.a.f();
        int i10 = this.f22608a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            final pk.n nVar = (pk.n) this.f22609b;
            if (this.f22610c.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            nVar.n(tj.a.a(z10));
            ViewTreeObserver.OnWindowVisibilityChangeListener onWindowVisibilityChangeListener = new ViewTreeObserver.OnWindowVisibilityChangeListener() { // from class: b7.c0
                @Override // android.view.ViewTreeObserver.OnWindowVisibilityChangeListener
                public final void onWindowVisibilityChanged(int i11) {
                    Eo.a(nVar, i11);
                }
            };
            this.f22610c.getViewTreeObserver().addOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            ViewGroup viewGroup = this.f22610c;
            if (!ViewCompat.isAttachedToWindow(viewGroup)) {
                viewGroup.getViewTreeObserver().removeOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            } else {
                viewGroup.addOnAttachStateChangeListener(new Do(viewGroup, viewGroup, onWindowVisibilityChangeListener));
            }
            bk.a aVar = new bk.a() { // from class: b7.d0
                @Override // bk.a
                public final Object invoke() {
                    return Eo.a();
                }
            };
            this.f22608a = 1;
            if (ProduceKt.b(nVar, aVar, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
