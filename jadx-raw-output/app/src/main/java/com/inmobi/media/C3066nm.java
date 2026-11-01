package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C3066nm;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3066nm extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3091om f24912a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3066nm(C3091om c3091om, rj.c cVar) {
        super(2, cVar);
        this.f24912a = c3091om;
    }

    public static final void a(C3091om c3091om, View view) {
        P4.a(c3091om.f25011d, c3091om.f25009b, Ol.f23300a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3066nm(this.f24912a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3066nm(this.f24912a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        final C3091om c3091om = this.f24912a;
        ViewGroup viewGroup = c3091om.f25017j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: b7.q9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3066nm.a(c3091om, view);
                }
            });
        }
        return mj.r.f64562a;
    }
}
