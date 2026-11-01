package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class ue {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f83436d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh f83437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zg f83438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te f83439c;

    public /* synthetic */ ue(Context context) {
        this(new bh(), new zg(context), new te(context));
    }

    public final void a(Context context) {
        Object objM3458constructorimpl;
        if (this.f83438b.b() && f83436d.compareAndSet(false, true)) {
            boolean z10 = !this.f83437a.f75821a.b(context);
            if (this.f83439c.f82998a.b()) {
                try {
                    Result.a aVar = Result.Companion;
                    AppMetricaLibraryAdapter.activate(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(z10).build());
                    objM3458constructorimpl = Result.m3458constructorimpl(mj.r.f64562a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
                    boolean z11 = ad1.f75480a;
                }
            }
        }
    }

    public ue(bh bhVar, zg zgVar, te teVar) {
        this.f83437a = bhVar;
        this.f83438b = zgVar;
        this.f83439c = teVar;
    }
}
