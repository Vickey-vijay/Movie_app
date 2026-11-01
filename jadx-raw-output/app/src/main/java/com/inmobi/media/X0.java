package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class X0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae f23774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f23775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FriendlyObstructionPurpose f23776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Ae ae2, View view, FriendlyObstructionPurpose friendlyObstructionPurpose, rj.c cVar) {
        super(2, cVar);
        this.f23774a = ae2;
        this.f23775b = view;
        this.f23776c = friendlyObstructionPurpose;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new X0(this.f23774a, this.f23775b, this.f23776c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((X0) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        try {
            AdSession adSession = this.f23774a.f24279c;
            if (adSession != null) {
                adSession.addFriendlyObstruction(this.f23775b, this.f23776c, null);
            }
        } catch (IllegalArgumentException e10) {
            InterfaceC3028m9 interfaceC3028m9 = this.f23774a.f24278b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a(AbstractC2819e1.f24276f, "Failed to addObstruction. Reason: " + Log.getStackTraceString(e10));
            }
        }
        return mj.r.f64562a;
    }
}
