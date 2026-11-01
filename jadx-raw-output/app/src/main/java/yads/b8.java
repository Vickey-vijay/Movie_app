package yads;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class b8 implements a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdQualityVerifierAdapter f75753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdQualityVerifierAdapterConfiguration f75754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f75755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y8 f75756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n8 f75757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o8 f75758f;

    public /* synthetic */ b8(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long j10, y8 y8Var, n8 n8Var) {
        this(adQualityVerifierAdapter, adQualityVerifierAdapterConfiguration, j10, y8Var, n8Var, new o8());
    }

    @Override // yads.a9
    public final void onAdWillDisplay() {
        try {
            Result.a aVar = Result.Companion;
            this.f75753a.onAdWillDisplay();
            Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    @Override // yads.a9
    public final void onInvalidated() {
        try {
            Result.a aVar = Result.Companion;
            this.f75753a.onInvalidated();
            Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    public b8(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long j10, y8 y8Var, n8 n8Var, o8 o8Var) {
        this.f75753a = adQualityVerifierAdapter;
        this.f75754b = adQualityVerifierAdapterConfiguration;
        this.f75755c = j10;
        this.f75756d = y8Var;
        this.f75757e = n8Var;
        this.f75758f = o8Var;
    }
}
