package com.iab.omid.library.vungle.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f22155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f22156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f22157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.a f22158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f22159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f22160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f22161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f22162h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.vungle.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0242a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f22164a;

            public RunnableC0242a(float f10) {
                this.f22164a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f22159e.a(this.f22164a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f22161g.set(false);
            if (((Float) d.this.f22160f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f22155a.post(new RunnableC0242a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.vungle.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f22160f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f22161g = new AtomicBoolean(false);
        this.f22162h = Executors.newSingleThreadExecutor();
        this.f22155a = handler;
        this.f22156b = context;
        this.f22157c = (AudioManager) context.getSystemService("audio");
        this.f22158d = aVar;
        this.f22159e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f22158d.a(this.f22157c.getStreamVolume(3), this.f22157c.getStreamMaxVolume(3));
    }

    private void d() {
        this.f22162h.submit(new a());
    }

    public void b() {
        d();
        this.f22156b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f22156b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f22161g.getAndSet(true)) {
            return;
        }
        d();
    }
}
