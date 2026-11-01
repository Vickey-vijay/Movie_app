package com.fyber.inneractive.sdk.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h0 f16045g = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f16046a = new PriorityBlockingQueue(100, new k0());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f16047b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f16048c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f16049d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), f16045g);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f16050e = new i0(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j1 f16051f = new j1();

    public final void a(t0 t0Var) {
        p0 p0Var;
        if (!this.f16046a.offer(t0Var)) {
            IAlog.a("Request queue is full! current request is dropped! %s", t0Var.r());
            return;
        }
        i1 i1Var = i1.QUEUED;
        t0Var.f16090f = i1Var;
        if (i1Var != i1.QUEUED_FOR_RETRY || (p0Var = t0Var.f16088d) == null) {
            return;
        }
        p0Var.a("sdkRequestEndedButWillBeRetried");
    }

    public final void b(t0 t0Var) {
        j1 j1Var = this.f16051f;
        j1Var.getClass();
        String str = t0Var.f16091g;
        IAlog.a("%s : NetworkRequestWatchdog : finalize request: %s", IAlog.a(j1Var), str);
        n1 n1Var = (n1) j1Var.f16037a.get(str);
        if (n1Var != null) {
            com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(n1Var.f16062d);
        }
        j1Var.f16037a.remove(str);
    }

    public final boolean c(t0 t0Var) {
        if (!t0Var.u()) {
            return false;
        }
        t0Var.f16090f = i1.QUEUED_FOR_RETRY;
        p0 p0Var = t0Var.f16088d;
        if (p0Var != null) {
            p0Var.a("sdkRequestEndedButWillBeRetried");
        }
        long jG = t0Var.g();
        IAlog.e("retryNetworkRequest queue up in main thread - %s with delay of %d", t0Var.getClass().getName(), Long.valueOf(jG));
        this.f16048c.postDelayed(new j0(this, t0Var), jG);
        return true;
    }

    public static void a(t0 t0Var, l lVar, o0 o0Var) {
        try {
            if (t0Var.f16085a || t0Var.h() == null || o0Var == null || lVar == null || lVar.f16039a != 200) {
                return;
            }
            t0Var.a(o0Var, t0Var.h(), lVar.f16043e);
        } catch (Exception e10) {
            IAlog.a("Failed cache network response data for url: %s msg: %s", t0Var.r(), e10.getMessage());
        }
    }

    public static void a(t0 t0Var, o0 o0Var) {
        try {
            if (t0Var.f16085a || o0Var == null) {
                return;
            }
            t0Var.a(o0Var.f16063a, (Exception) null, false);
        } catch (Exception e10) {
            IAlog.a("failed notifying the listener request complete for url: %s msg: %s", t0Var.r(), e10.getMessage());
            if (t0Var.f16085a) {
                return;
            }
            t0Var.a((Object) null, e10, false);
        }
    }

    public final o0 a(t0 t0Var, l lVar) throws Exception {
        o0 o0VarA = null;
        if (lVar != null) {
            try {
                if (!t0Var.f16085a) {
                    int i10 = lVar.f16039a;
                    if (i10 == 200 || (i10 >= 300 && i10 < 304)) {
                        o0VarA = t0Var.a(lVar, lVar.f16042d, i10);
                    } else if (i10 == 304) {
                        t0Var.a((Object) null, (Exception) new g(), false);
                    } else {
                        t0Var.a((Object) null, (Exception) new k1(lVar.f16040b, lVar.f16039a), false);
                    }
                }
            } catch (t1 e10) {
                IAlog.a("failed parsing network request but will retry url: %s msg: %s", t0Var.r(), e10.getMessage());
                if (c(t0Var)) {
                    throw e10;
                }
                throw new s1(e10);
            } catch (Exception e11) {
                IAlog.a("failed parsing network request url: %s msg: %s", t0Var.r(), e11.getMessage());
                throw e11;
            }
        }
        return o0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    public final l a(t0 t0Var, a aVar) throws Exception {
        try {
            if (t0Var.f16085a) {
                return null;
            }
            String str = aVar != null ? aVar.f15992a : "";
            a();
            return t0Var.a(str);
        } catch (b e10) {
            e = e10;
            IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (c(t0Var)) {
                throw new t1(e);
            }
            throw new s1(e);
        } catch (t1 e11) {
            IAlog.a("failed sending network request but will retry url: %s msg: %s", t0Var.r(), e11.getMessage());
            if (c(t0Var)) {
                throw e11;
            }
            throw new s1(e11);
        } catch (SocketTimeoutException e12) {
            e = e12;
            IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (c(t0Var)) {
                throw new t1(e);
            }
            throw new s1(e);
        } catch (UnknownHostException e13) {
            e = e13;
            IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (c(t0Var)) {
                throw new t1(e);
            }
            throw new s1(e);
        } catch (Exception e14) {
            IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e14.getMessage());
            throw e14;
        }
    }

    public static void a() throws b {
        Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.k) IAConfigManager.O.M.a(com.fyber.inneractive.sdk.config.global.features.k.class)).c("should_use_is_network_connected");
        boolean z10 = false;
        if (boolC != null ? boolC.booleanValue() : false) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) com.fyber.inneractive.sdk.util.o.f18599a.getSystemService("connectivity");
                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                if (com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_NETWORK_STATE") && activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                    z10 = true;
                }
            } catch (Throwable unused) {
                IAlog.b("Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file.", new Object[0]);
            }
            if (!z10) {
                throw new b("No network connection");
            }
        }
    }
}
