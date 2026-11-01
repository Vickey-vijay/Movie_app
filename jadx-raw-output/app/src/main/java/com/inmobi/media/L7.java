package com.inmobi.media;

import android.view.Surface;

/* JADX INFO: loaded from: classes7.dex */
public final class L7 implements Ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f23063a;

    public L7(N7 n10) {
        this.f23063a = n10;
    }

    @Override // com.inmobi.media.Ij
    public final void a() {
        this.f23063a.d();
    }

    @Override // com.inmobi.media.Ij
    public final void b() {
        this.f23063a.c();
    }

    @Override // com.inmobi.media.Ij
    public final void c() {
        Surface surface;
        N7 n10 = this.f23063a;
        if (n10.f23212q != null) {
            C3077o8 c3077o8 = n10.f23221z;
            if (c3077o8.f24969g || (surface = c3077o8.f24967e) == null) {
                return;
            }
            c3077o8.f24969g = true;
            c3077o8.f24964b.setVideoSurface(surface);
        }
    }
}
