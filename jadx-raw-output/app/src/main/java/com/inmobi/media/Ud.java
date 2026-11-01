package com.inmobi.media;

import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import com.inmobi.media.Ud;

/* JADX INFO: loaded from: classes7.dex */
public final class Ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2900h5 f23641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f23642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f23643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3053n9 f23644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hj f23645e;

    public final void a(Hj hj2) {
        ck.p.j(hj2, "surfaceTextureListener");
        this.f23645e = hj2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.f23642b.addView(this.f23641a, layoutParams);
        a();
        int videoWidth = this.f23643c.getVideoWidth();
        int videoHeight = this.f23643c.getVideoHeight();
        if (videoHeight == 0) {
            this.f23641a.setAspectRatio(1.0f);
        } else {
            this.f23641a.setAspectRatio(videoWidth / videoHeight);
        }
        this.f23641a.setSurfaceTextureListener(new Td(this));
    }

    public Ud(C2900h5 c2900h5, RelativeLayout relativeLayout, MediaPlayer mediaPlayer, C3053n9 c3053n9) {
        ck.p.j(c2900h5, "textureView");
        ck.p.j(relativeLayout, "parentView");
        ck.p.j(mediaPlayer, "mediaPlayer");
        this.f23641a = c2900h5;
        this.f23642b = relativeLayout;
        this.f23643c = mediaPlayer;
        this.f23644d = c3053n9;
    }

    public final void a() {
        this.f23643c.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: b7.m4
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                Ud.a(this.f5055b, mediaPlayer, i10, i11);
            }
        });
    }

    public static final void a(Ud ud2, MediaPlayer mediaPlayer, int i10, int i11) {
        C3053n9 c3053n9 = ud2.f23644d;
        if (c3053n9 != null) {
            c3053n9.a("NativePlayerTextureManager", "Video Size Changed: " + i10 + " x " + i11);
        }
        int videoWidth = ud2.f23643c.getVideoWidth();
        int videoHeight = ud2.f23643c.getVideoHeight();
        if (videoHeight == 0) {
            ud2.f23641a.setAspectRatio(1.0f);
        } else {
            ud2.f23641a.setAspectRatio(videoWidth / videoHeight);
        }
    }
}
