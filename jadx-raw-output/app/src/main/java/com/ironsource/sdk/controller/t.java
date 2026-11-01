package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.C3676r4;
import com.ironsource.V7;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes10.dex */
class t {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AudioManager f31058a;

        public a(AudioManager audioManager) {
            this.f31058a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f31058a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AudioManager f31059a;

        public b(AudioManager audioManager) {
            this.f31059a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.b(this.f31059a);
        }
    }

    public static void a(Activity activity) {
        V7.f27797a.b(new a((AudioManager) activity.getSystemService("audio")));
    }

    public static void b(Activity activity) {
        V7.f27797a.b(new b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }
}
