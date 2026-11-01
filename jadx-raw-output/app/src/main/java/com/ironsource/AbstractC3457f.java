package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3457f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f28848a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f28849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f28851d;

    /* JADX INFO: renamed from: com.ironsource.f$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC3457f.this.b();
        }
    }

    public AbstractC3457f() {
    }

    public boolean a() {
        return this.f28850c <= 0;
    }

    public abstract void b();

    public void d() {
        this.f28851d = null;
    }

    public void a(T t10) {
        if (a() || t10 == null) {
            return;
        }
        this.f28851d = t10;
        c();
        synchronized (this.f28848a) {
            Timer timer = new Timer();
            this.f28849b = timer;
            timer.schedule(new a(), this.f28850c);
        }
    }

    public void c() {
        synchronized (this.f28848a) {
            Timer timer = this.f28849b;
            if (timer != null) {
                timer.cancel();
                this.f28849b = null;
            }
        }
    }

    public AbstractC3457f(long j10) {
        this.f28850c = j10;
    }
}
