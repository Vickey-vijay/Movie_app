package com.inmobi.media;

import android.R;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Wd extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2729ae f23741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wd(C2729ae c2729ae, rj.c cVar) {
        super(2, cVar);
        this.f23741a = c2729ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Wd(this.f23741a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Wd(this.f23741a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        C2729ae c2729ae = this.f23741a;
        c2729ae.getClass();
        c2729ae.f23992a.addView(c2729ae.f23998g, new RelativeLayout.LayoutParams(-1, -1));
        C2729ae c2729ae2 = this.f23741a;
        boolean z10 = c2729ae2.f23995d.f23414d.f23261a;
        c2729ae2.f24000i = z10;
        if (z10) {
            c2729ae2.a(c2729ae2.f24001j, c2729ae2.f24002k);
        } else {
            c2729ae2.a(c2729ae2.f24002k, c2729ae2.f24001j);
        }
        C2764bn c2764bn = this.f23741a.f24003l;
        if (c2764bn.f24090c.f22648a) {
            float fB = J5.b();
            ProgressBar progressBar = new ProgressBar(c2764bn.f24089b.getContext(), null, R.attr.progressBarStyleHorizontal);
            c2764bn.f24092e = progressBar;
            D6.a(progressBar, c2764bn.f24090c, fB);
            c2764bn.f24089b.addView(c2764bn.f24092e);
            nk.j.d(c2764bn.f24088a, nk.w0.c(), null, new Zm(c2764bn.f24091d, null, c2764bn), 2, null);
        }
        return mj.r.f64562a;
    }
}
