package com.iab.omid.library.fyber.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f21482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f21483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f21484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f21485e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f21481a = context;
        this.f21482b = (AudioManager) context.getSystemService("audio");
        this.f21483c = aVar;
        this.f21484d = cVar;
    }

    private float a() {
        return this.f21483c.a(this.f21482b.getStreamVolume(3), this.f21482b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f21485e;
    }

    private void b() {
        this.f21484d.a(this.f21485e);
    }

    public void c() {
        this.f21485e = a();
        b();
        this.f21481a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f21481a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f21485e = fA;
            b();
        }
    }
}
