package yads;

import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.concurrent.Executor;
import kotlin.Result;
import yads.ve;

/* JADX INFO: loaded from: classes11.dex */
public final class ve implements dg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f83883c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te f83884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f83885b;

    public static void a(bg bgVar) {
        bgVar.a();
        bgVar.b();
        boolean z10 = ad1.f75480a;
    }

    public final void b(final bg bgVar) {
        this.f83885b.execute(new Runnable() { // from class: cp.hb
            @Override // java.lang.Runnable
            public final void run() {
                ve.a(this.f51360b, bgVar);
            }
        });
    }

    public ve(te teVar, Executor executor) {
        this.f83884a = teVar;
        this.f83885b = executor;
    }

    public static final void a(ve veVar, bg bgVar) {
        Object objM3458constructorimpl;
        veVar.getClass();
        a(bgVar);
        if (veVar.f83884a.f82998a.b()) {
            try {
                Result.a aVar = Result.Companion;
                AppMetricaLibraryAdapter.reportEvent("ads_sdk", bgVar.f75813a, bgVar.f75814b);
                objM3458constructorimpl = Result.m3458constructorimpl(mj.r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
                boolean z10 = ad1.f75480a;
            }
        }
    }
}
