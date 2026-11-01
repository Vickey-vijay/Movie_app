package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: MraidVolumeChangeReceiver.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static double f36079f = -1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f36081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36082c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f36083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f36084e;

    /* JADX INFO: compiled from: MraidVolumeChangeReceiver.java */
    public interface b {
        void a(double d10);
    }

    public double a() {
        AudioManager audioManager = this.f36081b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f36081b;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        f36079f = streamVolume;
        return streamVolume;
    }

    /* JADX INFO: compiled from: MraidVolumeChangeReceiver.java */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<d> f36085a;

        public a(d dVar) {
            this.f36085a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar;
            b bVarB;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (dVar = this.f36085a.get()) != null && (bVarB = dVar.b()) != null) {
                double dA = dVar.a();
                if (dA >= 0.0d) {
                    bVarB.a(dA);
                }
            }
        }
    }

    public b b() {
        return this.f36083d;
    }

    public void c() {
        if (this.f36080a != null) {
            this.f36084e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f36080a.registerReceiver(this.f36084e, intentFilter);
            this.f36082c = true;
        }
    }

    public void d() {
        Context context;
        if (!this.f36082c || (context = this.f36080a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f36084e);
            this.f36083d = null;
            this.f36082c = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public d(Context context) {
        this.f36080a = context;
        this.f36081b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public void a(b bVar) {
        this.f36083d = bVar;
    }
}
