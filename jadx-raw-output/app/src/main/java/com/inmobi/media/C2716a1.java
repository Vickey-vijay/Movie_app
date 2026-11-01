package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2716a1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae f23934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f23935b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2716a1(Ae ae2, View view, rj.c cVar) {
        super(2, cVar);
        this.f23934a = ae2;
        this.f23935b = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C2716a1(this.f23934a, this.f23935b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C2716a1(this.f23934a, this.f23935b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        try {
            AdSession adSession = this.f23934a.f24279c;
            if (adSession != null) {
                adSession.removeFriendlyObstruction(this.f23935b);
            }
        } catch (IllegalArgumentException e10) {
            String str = AbstractC2819e1.f24276f;
            Log.getStackTraceString(e10);
        }
        return mj.r.f64562a;
    }
}
