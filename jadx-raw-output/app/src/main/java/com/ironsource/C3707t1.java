package com.ironsource;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.Result;

/* JADX INFO: renamed from: com.ironsource.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3707t1 {

    /* JADX INFO: renamed from: com.ironsource.t1$a */
    public static final class a implements OutcomeReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rj.c<mj.r> f31246a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(rj.c<? super mj.r> cVar) {
            this.f31246a = cVar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            ck.p.j(exc, "error");
            rj.c<mj.r> cVar = this.f31246a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(exc)));
        }

        public void onResult(Object obj) {
            rj.c<mj.r> cVar = this.f31246a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
        }
    }

    @RequiresApi(31)
    public static final OutcomeReceiver a(rj.c<? super mj.r> cVar) {
        ck.p.j(cVar, "<this>");
        return new a(cVar);
    }
}
