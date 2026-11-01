package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f58273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f58274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f58275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile d f58276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f58277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IExecutionPolicy f58278f;

    public NetworkCore(@NonNull IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f58275c) {
                    try {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f58276d = (d) this.f58273a.take();
                networkTask = this.f58276d.f58244a;
                Executor executor = networkTask.getExecutor();
                this.f58277e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f58275c) {
                    this.f58276d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f58275c) {
                        this.f58276d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th3) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f58275c) {
                        this.f58276d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th3;
            }
            networkTask.onTaskRemoved();
        }
    }

    public NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f58273a = new LinkedBlockingQueue();
        this.f58274b = new Object();
        this.f58275c = new Object();
        this.f58278f = iExecutionPolicy;
        this.f58277e = gVar;
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f58278f.canBeExecuted()) {
            synchronized (this.f58274b) {
                d dVar = new d(networkTask);
                if (isRunning() && !this.f58273a.contains(dVar) && !dVar.equals(this.f58276d) && networkTask.onTaskAdded()) {
                    this.f58273a.offer(dVar);
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f58275c) {
            ArrayList arrayList = new ArrayList(this.f58273a.size());
            this.f58273a.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f58244a.onTaskRemoved();
            }
        }
    }
}
