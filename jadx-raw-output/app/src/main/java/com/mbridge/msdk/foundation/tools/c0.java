package com.mbridge.msdk.foundation.tools;

import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: FastKVConfig.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Executor f35260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static FastKV.c f35261b = new a();

    /* JADX INFO: compiled from: FastKVConfig.java */
    public class a implements FastKV.c {
        @Override // com.mbridge.msdk.foundation.tools.FastKV.c
        public void a(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                q0.c("FastKVConfig", str + Z7.f27998r + str2);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.c
        public void b(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                q0.b("FastKVConfig", str, exc);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.c
        public void a(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                q0.c("FastKVConfig", str, exc);
            }
        }
    }

    /* JADX INFO: compiled from: FastKVConfig.java */
    public class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "mb-sp-handler");
        }
    }

    public static Executor a() {
        if (f35260a == null) {
            synchronized (c0.class) {
                if (f35260a == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b(), new ThreadPoolExecutor.DiscardPolicy());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f35260a = threadPoolExecutor;
                }
            }
        }
        return f35260a;
    }

    private c0() {
    }
}
