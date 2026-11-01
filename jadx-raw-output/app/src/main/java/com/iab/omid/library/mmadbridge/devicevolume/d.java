package com.iab.omid.library.mmadbridge.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f21893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f21894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f21895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f21896e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f21892a = context;
        this.f21893b = (AudioManager) context.getSystemService("audio");
        this.f21894c = aVar;
        this.f21895d = cVar;
    }

    private float a() {
        return this.f21894c.a(this.f21893b.getStreamVolume(3), this.f21893b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f21896e;
    }

    private void b() {
        this.f21895d.a(this.f21896e);
    }

    public void c() {
        this.f21896e = a();
        b();
        this.f21892a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f21892a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f21896e = fA;
            b();
        }
    }
}
