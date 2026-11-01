package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f21352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f21353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f21354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f21355e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f21351a = context;
        this.f21352b = (AudioManager) context.getSystemService("audio");
        this.f21353c = aVar;
        this.f21354d = cVar;
    }

    private float a() {
        return this.f21353c.a(this.f21352b.getStreamVolume(3), this.f21352b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f21355e;
    }

    private void b() {
        this.f21354d.a(this.f21355e);
    }

    public final void c() {
        this.f21355e = a();
        b();
        this.f21351a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void d() {
        this.f21351a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f21355e = fA;
            b();
        }
    }
}
