package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f20961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f20962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f20963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f20964e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f20960a = context;
        this.f20961b = (AudioManager) context.getSystemService("audio");
        this.f20962c = aVar;
        this.f20963d = cVar;
    }

    private float a() {
        return this.f20962c.a(this.f20961b.getStreamVolume(3), this.f20961b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f20964e;
    }

    private void b() {
        this.f20963d.a(this.f20964e);
    }

    public void c() {
        this.f20964e = a();
        b();
        this.f20960a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f20960a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f20964e = fA;
            b();
        }
    }
}
