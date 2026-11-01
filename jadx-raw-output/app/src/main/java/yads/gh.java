package yads;

import io.appmetrica.analytics.IReporter;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class gh implements io2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zg f77801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj.g f77802b;

    @Override // yads.io2
    public final void a(eo2 eo2Var) {
        if (this.f77801a.a()) {
            try {
                ((IReporter) this.f77802b.getValue()).reportEvent(eo2Var.f77158a, eo2Var.f77159b);
            } catch (Throwable unused) {
                boolean z10 = ad1.f75480a;
            }
        }
    }

    @Override // yads.io2
    public final void reportAnr(Map map) {
        if (this.f77801a.a()) {
            try {
                ((IReporter) this.f77802b.getValue()).reportAnr(map);
            } catch (Throwable unused) {
                boolean z10 = ad1.f75480a;
            }
        }
    }

    @Override // yads.rm0
    public final void reportError(String str, Throwable th2) {
        if (this.f77801a.a()) {
            try {
                ((IReporter) this.f77802b.getValue()).reportError(str, th2);
            } catch (Throwable unused) {
                boolean z10 = ad1.f75480a;
            }
        }
    }

    @Override // yads.io2
    public final void reportUnhandledException(Throwable th2) {
        if (this.f77801a.a()) {
            try {
                ((IReporter) this.f77802b.getValue()).reportUnhandledException(th2);
            } catch (Throwable unused) {
                boolean z10 = ad1.f75480a;
            }
        }
    }

    public gh(mj.g gVar, zg zgVar) {
        this.f77801a = zgVar;
        this.f77802b = gVar;
    }
}
