package com.inmobi.media;

import android.app.KeyguardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.PowerManager;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Rm {
    public static final boolean a(Context context, boolean z10) {
        ck.p.j(context, "<this>");
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        Object systemService2 = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        if (keyguardManager == null) {
            return false;
        }
        return powerManager.isInteractive() && (z10 || !keyguardManager.isKeyguardLocked());
    }

    public static final MediaPlayer a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        if (Build.VERSION.SDK_INT >= 34) {
            return new MediaPlayer(context);
        }
        return new MediaPlayer();
    }

    public static final void a(MediaPlayer mediaPlayer, Q1 q10) {
        ck.p.j(mediaPlayer, "<this>");
        ck.p.j(q10, "audioFocusManager");
        if (Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.setAudioAttributes(q10.f23362d);
        } else {
            mediaPlayer.setAudioStreamType(3);
        }
    }
}
