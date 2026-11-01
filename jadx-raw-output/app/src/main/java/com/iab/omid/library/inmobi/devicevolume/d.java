package com.iab.omid.library.inmobi.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f21616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f21618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.a f21619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f21620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f21621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f21622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f21623h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.inmobi.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0225a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f21625a;

            public RunnableC0225a(float f10) {
                this.f21625a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f21620e.a(this.f21625a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f21622g.set(false);
            if (((Float) d.this.f21621f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f21616a.post(new RunnableC0225a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.inmobi.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f21621f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f21622g = new AtomicBoolean(false);
        this.f21623h = Executors.newSingleThreadExecutor();
        this.f21616a = handler;
        this.f21617b = context;
        this.f21618c = (AudioManager) context.getSystemService("audio");
        this.f21619d = aVar;
        this.f21620e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f21619d.a(this.f21618c.getStreamVolume(3), this.f21618c.getStreamMaxVolume(3));
    }

    private void d() {
        this.f21623h.submit(new a());
    }

    public void b() {
        d();
        this.f21617b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f21617b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f21622g.getAndSet(true)) {
            return;
        }
        d();
    }
}
