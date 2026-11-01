package com.iab.omid.library.unity3d.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f22029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f22030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f22031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f22032e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f22028a = context;
        this.f22029b = (AudioManager) context.getSystemService("audio");
        this.f22030c = aVar;
        this.f22031d = cVar;
    }

    private float a() {
        return this.f22030c.a(this.f22029b.getStreamVolume(3), this.f22029b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f22032e;
    }

    private void b() {
        this.f22031d.a(this.f22032e);
    }

    public void c() {
        this.f22032e = a();
        b();
        this.f22028a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f22028a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f22032e = fA;
            b();
        }
    }
}
