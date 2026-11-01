package com.fyber.inneractive.sdk.network;

import android.os.Process;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f16033a;

    public i0(l0 l0Var) {
        this.f16033a = l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    @Override // java.lang.Runnable
    public final void run() {
        t0 t0Var;
        boolean z10;
        a aVarI;
        o0 o0VarA;
        p0 p0Var;
        p0 p0Var2;
        p0 p0Var3;
        l0 l0Var = this.f16033a;
        l0Var.getClass();
        Process.setThreadPriority(10);
        while (l0Var.f16047b) {
            o0 o0Var = null;
            try {
                t0Var = (t0) l0Var.f16046a.take();
            } catch (InterruptedException unused) {
                if (!l0Var.f16047b) {
                    Thread.currentThread().interrupt();
                }
                t0Var = null;
            }
            if (t0Var != null && !t0Var.f16085a) {
                i1 i1Var = i1.RUNNING;
                t0Var.f16090f = i1Var;
                if (i1Var == i1.QUEUED_FOR_RETRY && (p0Var3 = t0Var.f16088d) != null) {
                    p0Var3.a("sdkRequestEndedButWillBeRetried");
                }
                if (t0Var.f16099o) {
                    Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.k) IAConfigManager.O.M.a(com.fyber.inneractive.sdk.config.global.features.k.class)).c("should_manage_request_watchdog");
                    if (boolC != null ? boolC.booleanValue() : true) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                boolean z11 = z10 || t0Var.v();
                IAlog.a("%s : NetworkExecutorImpl : should enabled watchdog : %s", IAlog.a(l0Var), Boolean.valueOf(z11));
                if (z11) {
                    j1 j1Var = l0Var.f16051f;
                    Thread threadCurrentThread = Thread.currentThread();
                    j1Var.getClass();
                    IAlog.a("%s : NetworkRequestWatchdog : register request: %s", IAlog.a(j1Var), t0Var.f16091g);
                    int iS = t0Var.s();
                    l1 l1VarP = t0Var.p();
                    n1 n1Var = new n1(t0Var, threadCurrentThread, l1VarP.f16052a + l1VarP.f16053b + iS);
                    j1Var.f16037a.putIfAbsent(t0Var.f16091g, n1Var);
                    com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(n1Var.f16062d, n1Var.f16061c);
                }
                try {
                    aVarI = (t0Var.f16085a || t0Var.h() == null) ? null : t0Var.i();
                } catch (Exception e10) {
                    IAlog.a("failed fetching cache data for url: %s msg: %s", t0Var.r(), e10.getMessage());
                    if (!t0Var.f16085a) {
                        t0Var.a((Object) null, e10, true);
                    }
                }
                if (aVarI != null && aVarI.f15993b != null && !t0Var.f16085a) {
                    t0Var.a(aVarI.f15993b, (Exception) null, true);
                }
                try {
                    l lVarA = l0Var.a(t0Var, aVarI);
                    o0VarA = l0Var.a(t0Var, lVarA);
                    try {
                        l0.a(t0Var, lVarA, o0VarA);
                        l0.a(t0Var, o0VarA);
                        try {
                            t0Var.e();
                        } catch (Exception unused2) {
                        }
                        i1 i1Var2 = i1.DONE;
                        t0Var.f16090f = i1Var2;
                        if (i1Var2 == i1.QUEUED_FOR_RETRY && (p0Var2 = t0Var.f16088d) != null) {
                            p0Var2.a("sdkRequestEndedButWillBeRetried");
                        }
                    } catch (t1 unused3) {
                        o0Var = o0VarA;
                        l0.a(t0Var, o0Var);
                        try {
                            t0Var.e();
                        } catch (Exception unused4) {
                        }
                        i1 i1Var3 = i1.DONE;
                        t0Var.f16090f = i1Var3;
                        if (i1Var3 == i1.QUEUED_FOR_RETRY && (p0Var2 = t0Var.f16088d) != null) {
                        }
                        l0Var.b(t0Var);
                    } catch (Exception e11) {
                        e = e11;
                        if (!t0Var.f16085a) {
                            t0Var.a((Object) null, e, false);
                        }
                        l0.a(t0Var, o0VarA);
                        try {
                            t0Var.e();
                        } catch (Exception unused5) {
                        }
                        i1 i1Var4 = i1.DONE;
                        t0Var.f16090f = i1Var4;
                        if (i1Var4 == i1.QUEUED_FOR_RETRY && (p0Var2 = t0Var.f16088d) != null) {
                        }
                        l0Var.b(t0Var);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            if (!t0Var.f16085a) {
                                t0Var.a((Object) null, new Exception(th), false);
                            }
                            l0.a(t0Var, o0VarA);
                            try {
                                t0Var.e();
                            } catch (Exception unused6) {
                            }
                            i1 i1Var5 = i1.DONE;
                            t0Var.f16090f = i1Var5;
                            if (i1Var5 == i1.QUEUED_FOR_RETRY && (p0Var2 = t0Var.f16088d) != null) {
                            }
                            l0Var.b(t0Var);
                        } catch (Throwable th3) {
                            l0.a(t0Var, o0VarA);
                            try {
                                t0Var.e();
                            } catch (Exception unused7) {
                            }
                            i1 i1Var6 = i1.DONE;
                            t0Var.f16090f = i1Var6;
                            if (i1Var6 == i1.QUEUED_FOR_RETRY && (p0Var = t0Var.f16088d) != null) {
                                p0Var.a("sdkRequestEndedButWillBeRetried");
                            }
                            l0Var.b(t0Var);
                            throw th3;
                        }
                    }
                } catch (t1 unused8) {
                } catch (Exception e12) {
                    e = e12;
                    o0VarA = null;
                } catch (Throwable th4) {
                    th = th4;
                    o0VarA = null;
                }
                l0Var.b(t0Var);
            }
        }
    }
}
