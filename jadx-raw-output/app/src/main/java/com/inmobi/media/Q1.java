package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.inmobi.media.Q1;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f23361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioAttributes f23362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioFocusRequest f23363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f23364f;

    public final void a() {
        this.f23360b = false;
        Object systemService = this.f23359a.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.f23363e;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f23364f;
            if (onAudioFocusChangeListener != null) {
                audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            }
        }
    }

    public Q1(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        Context applicationContext = context.getApplicationContext();
        ck.p.i(applicationContext, "getApplicationContext(...)");
        this.f23359a = applicationContext;
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        ck.p.i(audioAttributesBuild, "build(...)");
        this.f23362d = audioAttributesBuild;
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: b7.w3
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Q1.a(this.f5225b, i10);
            }
        };
    }

    public final void c() {
        WeakReference weakReference = this.f23361c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f23361c = null;
        a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f23363e = null;
        }
        this.f23364f = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    public final boolean d() {
        int iRequestAudioFocus;
        Object systemService = this.f23359a.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            iRequestAudioFocus = 0;
        } else {
            if (this.f23364f == null) {
                this.f23364f = b();
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (this.f23363e == null) {
                    AudioFocusRequest.Builder audioAttributes = new AudioFocusRequest.Builder(2).setAudioAttributes(this.f23362d);
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f23364f;
                    ck.p.g(onAudioFocusChangeListener);
                    AudioFocusRequest audioFocusRequestBuild = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener, ((Wb) AbstractC3075o6.f24960e.getValue()).f23740a).build();
                    ck.p.i(audioFocusRequestBuild, "build(...)");
                    this.f23363e = audioFocusRequestBuild;
                }
                AudioFocusRequest audioFocusRequest = this.f23363e;
                if (audioFocusRequest != null) {
                    iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                } else {
                    iRequestAudioFocus = 0;
                }
            } else {
                iRequestAudioFocus = audioManager.requestAudioFocus(this.f23364f, 3, 2);
            }
        }
        return iRequestAudioFocus == 1;
    }

    public static final void a(Q1 q10, int i10) {
        P1 p10;
        P1 p11;
        WeakReference weakReference;
        P1 p12;
        if (i10 == -2) {
            q10.f23360b = true;
            WeakReference weakReference2 = q10.f23361c;
            if (weakReference2 == null || (p10 = (P1) weakReference2.get()) == null) {
                return;
            }
            p10.a();
            return;
        }
        if (i10 == -1) {
            q10.f23360b = false;
            WeakReference weakReference3 = q10.f23361c;
            if (weakReference3 == null || (p11 = (P1) weakReference3.get()) == null) {
                return;
            }
            p11.a();
            return;
        }
        if (i10 != 1) {
            return;
        }
        if (q10.f23360b && (weakReference = q10.f23361c) != null && (p12 = (P1) weakReference.get()) != null) {
            p12.b();
        }
        q10.f23360b = false;
    }
}
