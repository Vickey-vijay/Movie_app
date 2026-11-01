package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C3216tn;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: renamed from: com.inmobi.media.tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3216tn extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f25414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3216tn(View view, ViewGroup viewGroup, rj.c cVar) {
        super(2, cVar);
        this.f25414c = view;
        this.f25415d = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3216tn c3216tn = new C3216tn(this.f25414c, this.f25415d, cVar);
        c3216tn.f25413b = obj;
        return c3216tn;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3216tn) create((pk.n) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    public static final mj.r a(View view, ViewOnAttachStateChangeListenerC3191sn viewOnAttachStateChangeListenerC3191sn) {
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3191sn);
        return mj.r.f64562a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25412a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            pk.n nVar = (pk.n) this.f25413b;
            View view = this.f25414c;
            final ViewOnAttachStateChangeListenerC3191sn viewOnAttachStateChangeListenerC3191sn = new ViewOnAttachStateChangeListenerC3191sn(nVar, view, this.f25415d);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3191sn);
            nVar.n(tj.a.a(AbstractC3266vn.b(this.f25414c, this.f25415d)));
            final View view2 = this.f25414c;
            bk.a aVar = new bk.a() { // from class: b7.la
                @Override // bk.a
                public final Object invoke() {
                    return C3216tn.a(view2, viewOnAttachStateChangeListenerC3191sn);
                }
            };
            this.f25412a = 1;
            if (ProduceKt.b(nVar, aVar, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
