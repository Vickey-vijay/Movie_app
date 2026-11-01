package yads;

import java.util.Set;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class ga3 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f77714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f77715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nt2 f77716c;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2;
        try {
            Set setF = this.f77716c.f80782n0;
            if (setF == null) {
                setF = nj.q0.f();
            }
            Set set = h33.f78052a;
            if (h33.a(th2.getStackTrace(), setF)) {
                this.f77714a.reportUnhandledException(th2);
            }
            if (this.f77716c.f80780m0 || (uncaughtExceptionHandler2 = this.f77715b) == null) {
                return;
            }
        } catch (Throwable th3) {
            try {
                Result.a aVar = Result.Companion;
                this.f77714a.reportError("Failed to report uncaught exception", th3);
                Result.m3458constructorimpl(mj.r.f64562a);
            } catch (Throwable th4) {
                try {
                    Result.a aVar2 = Result.Companion;
                    Result.m3458constructorimpl(kotlin.c.a(th4));
                } finally {
                    if (!this.f77716c.f80780m0 && (uncaughtExceptionHandler = this.f77715b) != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                    }
                }
            }
            if (this.f77716c.f80780m0 || uncaughtExceptionHandler == null) {
                return;
            }
        }
        uncaughtExceptionHandler2.uncaughtException(thread, th2);
    }

    public ga3(at1 at1Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, nt2 nt2Var) {
        this.f77714a = at1Var;
        this.f77715b = uncaughtExceptionHandler;
        this.f77716c = nt2Var;
    }
}
