package com.mbridge.msdk.config.component.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: MBVolumeEventPublisher.java */
/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f33575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f33576c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33574a = "MBVolumeEventPublisher";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<com.mbridge.msdk.config.component.status.a> f33577d = new ArrayList<>();

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f33577d.remove(aVar);
        }
    }

    /* JADX INFO: compiled from: MBVolumeEventPublisher.java */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                e.this.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b("VolumeChanged");
        HashMap map = new HashMap();
        map.put("volume", String.valueOf(a()));
        bVar.a(map);
        Iterator<com.mbridge.msdk.config.component.status.a> it = this.f33577d.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (this.f33577d.contains(aVar)) {
            return;
        }
        this.f33577d.add(aVar);
    }

    public void d() {
        if (this.f33577d.isEmpty()) {
            e();
            this.f33575b = null;
        }
    }

    public e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            this.f33575b = (AudioManager) contextD.getApplicationContext().getSystemService("audio");
        }
        c();
    }

    public void c() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                this.f33576c = new b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                contextD.registerReceiver(this.f33576c, intentFilter);
            }
        } catch (Throwable th2) {
            q0.b("MBVolumeEventPublisher", th2.getMessage());
        }
    }

    public void e() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.unregisterReceiver(this.f33576c);
            }
        } catch (Throwable th2) {
            q0.b("MBVolumeEventPublisher", th2.getMessage());
        }
    }

    private double a() {
        AudioManager audioManager = this.f33575b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f33575b;
        return (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
    }
}
