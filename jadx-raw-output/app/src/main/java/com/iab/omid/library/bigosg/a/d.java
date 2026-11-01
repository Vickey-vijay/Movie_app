package com.iab.omid.library.bigosg.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f21208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f21209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f21210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f21211e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f21207a = context;
        this.f21208b = (AudioManager) context.getSystemService("audio");
        this.f21209c = aVar;
        this.f21210d = cVar;
    }

    private boolean a(float f10) {
        return f10 != this.f21211e;
    }

    private float c() {
        return this.f21209c.a(this.f21208b.getStreamVolume(3), this.f21208b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f21210d.a(this.f21211e);
    }

    public final void a() {
        this.f21211e = c();
        d();
        this.f21207a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f21207a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fC = c();
        if (a(fC)) {
            this.f21211e = fC;
            d();
        }
    }
}
