package com.mbridge.msdk.foundation.same.task;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mbridge.msdk.foundation.tools.s0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: CommonTaskLoader.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f35198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<Long, com.mbridge.msdk.foundation.same.task.a> f35199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<Context> f35200c;

    /* JADX INFO: compiled from: CommonTaskLoader.java */
    public class a implements com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.same.task.a f35201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a f35202b;

        public a(com.mbridge.msdk.foundation.same.task.a aVar, com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a interfaceC0332a) {
            this.f35201a = aVar;
            this.f35202b = interfaceC0332a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a
        public void a(com.mbridge.msdk.foundation.same.task.a.b bVar) {
            if (bVar == com.mbridge.msdk.foundation.same.task.a.b.CANCEL || bVar == com.mbridge.msdk.foundation.same.task.a.b.FINISH) {
                b.this.f35199b.remove(Long.valueOf(this.f35201a.getId()));
            } else if (bVar == com.mbridge.msdk.foundation.same.task.a.b.RUNNING && b.this.f35200c.get() == null) {
                b.this.a();
            }
            com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a interfaceC0332a = this.f35202b;
            if (interfaceC0332a != null) {
                interfaceC0332a.a(bVar);
            }
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context, int i10) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f35198a = c.b();
        } else {
            if (i10 == 0) {
                this.f35198a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f35198a = new ThreadPoolExecutor(i10, (i10 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f35198a.allowCoreThreadTimeOut(true);
        }
        this.f35199b = new HashMap<>();
        this.f35200c = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.f35198a.execute(aVar);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a interfaceC0332a) {
        this.f35199b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC0332a));
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, com.mbridge.msdk.foundation.same.task.a.InterfaceC0332a interfaceC0332a) {
        a(aVar, interfaceC0332a);
        this.f35198a.execute(aVar);
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.f35199b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f35199b.clear();
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f35198a = c.b();
        } else {
            if (s0.a().a("c_t_p_t_l", true)) {
                int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f35198a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f35198a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f35198a.allowCoreThreadTimeOut(true);
        }
        this.f35199b = new HashMap<>();
        this.f35200c = new WeakReference<>(context);
    }
}
