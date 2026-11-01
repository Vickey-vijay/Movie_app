package com.bytedance.adsdk.vt;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public class jg<T> {
    public static Executor ouw = Executors.newCachedThreadPool();
    private volatile mwh<T> fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Set<cf<Throwable>> f11098lh;
    private final Set<cf<T>> vt;
    private final Handler yu;

    public class ouw extends FutureTask<mwh<T>> {
        public ouw(Callable<mwh<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            if (!isCancelled()) {
                try {
                    jg.this.ouw((mwh) get());
                } catch (InterruptedException | ExecutionException e10) {
                    jg.this.ouw(new mwh(e10));
                }
            }
        }
    }

    public jg(Callable<mwh<T>> callable) {
        this(callable, false);
    }

    public final synchronized jg<T> lh(cf<Throwable> cfVar) {
        Throwable th2;
        mwh<T> mwhVar = this.fkw;
        if (mwhVar != null && (th2 = mwhVar.vt) != null) {
            cfVar.ouw(th2);
        }
        this.f11098lh.add(cfVar);
        return this;
    }

    public final synchronized jg<T> vt(cf<T> cfVar) {
        this.vt.remove(cfVar);
        return this;
    }

    public final synchronized jg<T> yu(cf<Throwable> cfVar) {
        this.f11098lh.remove(cfVar);
        return this;
    }

    public jg(Callable<mwh<T>> callable, boolean z10) {
        this.vt = new LinkedHashSet(1);
        this.f11098lh = new LinkedHashSet(1);
        this.yu = new Handler(Looper.getMainLooper());
        this.fkw = null;
        if (!z10) {
            ouw.execute(new ouw(callable));
            return;
        }
        try {
            ouw((mwh) callable.call());
        } catch (Throwable th2) {
            ouw((mwh) new mwh<>(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(mwh<T> mwhVar) {
        if (this.fkw == null) {
            this.fkw = mwhVar;
            ouw();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final synchronized jg<T> ouw(cf<T> cfVar) {
        T t10;
        mwh<T> mwhVar = this.fkw;
        if (mwhVar != null && (t10 = mwhVar.ouw) != null) {
            cfVar.ouw(t10);
        }
        this.vt.add(cfVar);
        return this;
    }

    private void ouw() {
        this.yu.post(new Runnable() { // from class: com.bytedance.adsdk.vt.jg.1
            @Override // java.lang.Runnable
            public final void run() {
                mwh mwhVar = jg.this.fkw;
                if (mwhVar == null) {
                    return;
                }
                V v10 = mwhVar.ouw;
                if (v10 != 0) {
                    jg.this.ouw(v10);
                } else {
                    jg.this.ouw(mwhVar.vt);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ouw(T t10) {
        Iterator it = new ArrayList(this.vt).iterator();
        while (it.hasNext()) {
            ((cf) it.next()).ouw(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ouw(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f11098lh);
        if (arrayList.isEmpty()) {
            com.bytedance.adsdk.vt.le.yu.ouw("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((cf) it.next()).ouw(th2);
        }
    }
}
