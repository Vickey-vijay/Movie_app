package com.iab.omid.library.appodeal.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f21096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f21097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f21098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f21099e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f21095a = context;
        this.f21096b = (AudioManager) context.getSystemService("audio");
        this.f21097c = aVar;
        this.f21098d = cVar;
    }

    private float a() {
        return this.f21097c.a(this.f21096b.getStreamVolume(3), this.f21096b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f21099e;
    }

    private void b() {
        this.f21098d.a(this.f21099e);
    }

    public void c() {
        this.f21099e = a();
        b();
        this.f21095a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f21095a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f21099e = fA;
            b();
        }
    }
}
