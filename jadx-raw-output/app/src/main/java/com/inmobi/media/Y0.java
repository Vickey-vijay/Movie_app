package com.inmobi.media;

import android.util.Log;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Y0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2819e1 f23813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f23814b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(AbstractC2819e1 abstractC2819e1, ViewGroup viewGroup, rj.c cVar) {
        super(2, cVar);
        this.f23813a = abstractC2819e1;
        this.f23814b = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Y0(this.f23813a, this.f23814b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Y0(this.f23813a, this.f23814b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        try {
            AdSession adSession = this.f23813a.f24279c;
            if (adSession != null) {
                adSession.registerAdView(this.f23814b);
            }
        } catch (IllegalArgumentException e10) {
            InterfaceC3028m9 interfaceC3028m9 = this.f23813a.f24278b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a(AbstractC2819e1.f24276f, "Failed to registerAdView. " + Log.getStackTraceString(e10));
            }
        }
        return mj.r.f64562a;
    }
}
