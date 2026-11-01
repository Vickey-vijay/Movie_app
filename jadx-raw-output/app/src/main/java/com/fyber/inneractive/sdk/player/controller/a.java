package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.view.Surface;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.mediaplayer.p f16191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16195t;

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            pVar.reset();
            this.f16191p.release();
            this.f16191p = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z10) {
        if (g() && this.f16246n) {
            return;
        }
        this.f16246n = z10;
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            pVar.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final String d() {
        return C3426d4.i.I0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            return pVar.f18021r;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            return pVar.f18023t;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            return pVar.f18022s;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            return pVar.f18007d;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            pVar.pause();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            pVar.start();
        }
    }

    public a(Context context) {
        super(context);
        this.f16192q = 0;
        this.f16193r = 2;
        this.f16194s = 0;
        this.f16195t = false;
        IAlog.a("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z10) {
        if (!g() && this.f16246n) {
            return;
        }
        this.f16246n = z10;
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            IAlog.a("%s unmute", pVar.b());
            pVar.f18007d = false;
            if (pVar.a()) {
                pVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.m(pVar));
            } else {
                IAlog.a("%s unmute called when player is not ready!", pVar.b());
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            return pVar.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i10, boolean z10) {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            IAlog.a("%s seek to called with = %d mPlayAfterSeek = %s", pVar.b(), Integer.valueOf(i10), Boolean.valueOf(z10));
            if (!pVar.a()) {
                IAlog.a("%s seek called when player is not ready!", pVar.b());
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = pVar.f18005b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Seeking;
            if (bVar == bVar2) {
                IAlog.a("%s seek called when player is already seeking!", pVar.b());
                return;
            }
            pVar.a(bVar2);
            pVar.f18006c = z10;
            pVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.j(pVar, i10));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(Surface surface) {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f16191p;
        if (pVar != null) {
            pVar.setSurface(surface);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z10) {
        if (this.f16191p == null) {
            IAlog.a("MediaPlayerController: creating media player", new Object[0]);
            this.f16191p = new com.fyber.inneractive.sdk.player.mediaplayer.p(this.f16233a, this, this.f16241i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(String str, int i10) {
        this.f16191p.a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i10) {
        this.f16241i.post(new l(this, i10));
        if (i10 >= c()) {
            a(com.fyber.inneractive.sdk.player.enums.b.Completed);
        } else if (i10 == this.f16192q) {
            IAlog.a("%sVideo is stuck! Progress doesn't change", IAlog.a(this));
            int i11 = this.f16194s + 1;
            this.f16194s = i11;
            if (i11 == this.f16193r) {
                a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                this.f16195t = true;
            }
        } else if (this.f16195t) {
            IAlog.a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.a(this));
            a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            this.f16194s = 0;
            this.f16195t = false;
        }
        this.f16192q = i10;
    }
}
