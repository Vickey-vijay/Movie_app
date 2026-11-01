package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class i extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f9280h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Float f9281i = Float.valueOf(15.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f9282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f9283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f9284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f9285d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9286e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9288g;

    public interface a {
        void a(int i10);
    }

    private Float a() {
        AudioManager audioManager = this.f9282a;
        if (audioManager == null) {
            return f9281i;
        }
        try {
            return Float.valueOf(audioManager.getStreamMaxVolume(3));
        } catch (Throwable th2) {
            this.f9284c.O();
            if (o.a()) {
                this.f9284c.O().a("AudioSessionManager", "Unable to collect the maximum device volume", th2);
            }
            return f9281i;
        }
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public Float b() {
        AudioManager audioManager = this.f9282a;
        if (audioManager == null) {
            return null;
        }
        try {
            return Float.valueOf(audioManager.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th2) {
            this.f9284c.O();
            if (o.a()) {
                this.f9284c.O().a("AudioSessionManager", "Unable to collect device volume", th2);
            }
            return null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f9282a.getRingerMode());
        }
    }

    private void d() {
        this.f9284c.O();
        if (o.a()) {
            this.f9284c.O().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f9288g = f9280h;
        this.f9283b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.f9284c.O();
        if (o.a()) {
            this.f9284c.O().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f9283b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int c() {
        return this.f9282a.getRingerMode();
    }

    public i(k kVar) {
        this.f9284c = kVar;
        Context contextO = k.o();
        this.f9283b = contextO;
        this.f9282a = (AudioManager) contextO.getSystemService("audio");
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f9287f = true;
            this.f9288g = this.f9282a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f9287f = false;
            if (this.f9288g != this.f9282a.getRingerMode()) {
                this.f9288g = f9280h;
                b(this.f9282a.getRingerMode());
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f9286e) {
            if (this.f9285d.contains(aVar)) {
                this.f9285d.remove(aVar);
                if (this.f9285d.isEmpty()) {
                    e();
                }
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f9286e) {
            if (this.f9285d.contains(aVar)) {
                return;
            }
            this.f9285d.add(aVar);
            if (this.f9285d.size() == 1) {
                d();
            }
        }
    }

    private void b(final int i10) {
        if (this.f9287f) {
            return;
        }
        this.f9284c.O();
        if (o.a()) {
            this.f9284c.O().a("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f9286e) {
            for (final a aVar : this.f9285d) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(i10);
                    }
                });
            }
        }
    }
}
