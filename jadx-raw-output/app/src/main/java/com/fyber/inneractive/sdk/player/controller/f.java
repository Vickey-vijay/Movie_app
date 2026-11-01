package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends q {
    public final boolean A;
    public final CopyOnWriteArrayList B;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u C;
    public boolean D;
    public int E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f16208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f16209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.g f16211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16213u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.a[] f16215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Handler f16216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b0 f16217y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16218z;

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        if (this.f16211s != null) {
            if (!this.f16218z) {
                this.f16218z = true;
                com.fyber.inneractive.sdk.util.r.f18606a.execute(new e(this));
            }
            b0 b0Var = this.f16217y;
            if (b0Var != null) {
                b0Var.f16196a.clear();
            }
            this.f16217y = null;
        }
        Iterator it = this.B.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.B.clear();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        this.f16246n = z10;
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f16215w;
        if (aVarArr == null || (gVar = this.f16211s) == null || this.f16218z || aVarArr.length < 2) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, Float.valueOf(0.0f)));
        this.f16214v = true;
        c(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z10) {
        this.f16246n = z10;
        if (this.f16211s == null || this.f16218z) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f16233a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = streamVolume / streamMaxVolume;
        IAlog.a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f10));
        if (streamVolume == 0) {
            IAlog.a("Avoided unmute - Device is muted", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f16215w;
        if (aVarArr != null && aVarArr.length >= 2) {
            this.f16211s.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, Float.valueOf(f10)));
        }
        this.f16214v = false;
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f16211s;
        if (gVar == null || this.f16218z) {
            return 0;
        }
        return (int) (gVar.f17366m.c() ? -9223372036854775807L : com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f17366m.a(gVar.a(), gVar.f17359f).f17960f));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        return this.f16213u;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        return this.f16212t;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        return this.f16214v;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean h() {
        return (this.f16211s == null || this.f16218z || this.f16237e != com.fyber.inneractive.sdk.player.enums.b.Playing) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.enums.b bVar;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f16237e;
        if (bVar2 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar2 == (bVar = com.fyber.inneractive.sdk.player.enums.b.Paused) || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            IAlog.a("%s paused called when player is in mState: %s ignoring", IAlog.a(this), bVar2);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f16211s;
        if (gVar != null && !this.f16218z) {
            gVar.a(false);
        }
        k();
        a(bVar);
    }

    public f(Context context, boolean z10, com.fyber.inneractive.sdk.config.global.r rVar) {
        Integer numA;
        int iIntValue;
        super(context);
        this.f16212t = 0;
        this.f16213u = 0;
        this.f16214v = false;
        this.f16218z = false;
        this.B = new CopyOnWriteArrayList();
        this.C = null;
        this.E = 0;
        this.A = z10;
        this.f16209q = rVar;
        this.f16210r = IAConfigManager.O.f15026u.f15195b.a("extractor_source_retry_count", 6, 3);
        com.fyber.inneractive.sdk.config.global.features.u uVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class) : null;
        if (uVar == null || (numA = uVar.a("max_tries")) == null) {
            iIntValue = 0;
        } else {
            iIntValue = numA.intValue();
        }
        this.f16208p = iIntValue;
        IAlog.a("Creating IAExoPlayer2Controller", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        IAlog.a("%sstart called", IAlog.a(this));
        if (!h()) {
            a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
            this.f16211s.a(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        long jA;
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f16211s;
        if (gVar == null || this.f16218z) {
            return 0;
        }
        if (!gVar.f17366m.c() && gVar.f17364k <= 0) {
            gVar.f17366m.a(gVar.f17370q.f17392a, gVar.f17360g, false);
            jA = com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f17370q.f17394c) + com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f17360g.f17885e);
        } else {
            jA = gVar.f17372s;
        }
        return (int) jA;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final String d() {
        return this.A ? "exo_c" : "exo";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i10, boolean z10) {
        IAlog.a("%sseekTo called with %d playAfterSeek = %s", IAlog.a(this), Integer.valueOf(i10), Boolean.valueOf(z10));
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f16211s;
        if (gVar == null || this.f16218z) {
            return;
        }
        gVar.a(z10);
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f16211s;
        gVar2.a(gVar2.a(), i10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(Surface surface) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        IAlog.a("%ssetSurface called with %s", IAlog.a(this), surface);
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f16215w;
        if (aVarArr == null || (gVar = this.f16211s) == null || this.f16218z) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[0], 1, surface));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z10) {
        if (this.f16211s != null || this.f16218z) {
            return;
        }
        this.D = z10;
        IAlog.a("%sMediaPlayerController: creating media player", IAlog.a(this));
        b0 b0Var = this.f16217y;
        if (b0Var != null) {
            b0Var.f16196a.clear();
        }
        this.f16217y = new b0(this);
        this.f16216x = new Handler(Looper.getMainLooper());
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.a[z10 ? 2 : 1];
        this.f16215w = aVarArr;
        aVarArr[0] = new MediaCodecVideoRenderer(this.f16216x, this.f16217y);
        if (z10) {
            this.f16215w[1] = new MediaCodecAudioRenderer();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.g(this.f16215w, new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d(), new com.fyber.inneractive.sdk.player.exoplayer2.c());
        this.f16211s = gVar;
        gVar.f17358e.add(this.f16217y);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(String str, int i10) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g fVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.u jVar;
        if (this.f16211s == null || this.f16218z) {
            return;
        }
        char c10 = 0;
        IAlog.a("%sloadMediaPlayerUri called with %s", IAlog.a(this), str);
        Uri uri = Uri.parse(str);
        int i11 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f17873a;
        String path = uri.getPath();
        if (path == null) {
            c10 = 3;
        } else {
            String lowerCase = path.toLowerCase();
            if (!lowerCase.endsWith(".mpd")) {
                if (lowerCase.endsWith(".m3u8")) {
                    c10 = 2;
                } else if (lowerCase.endsWith(".ism") || lowerCase.endsWith(".isml") || lowerCase.endsWith(".ism/manifest") || lowerCase.endsWith(".isml/manifest")) {
                    c10 = 1;
                } else {
                    c10 = 3;
                }
            }
        }
        if (this.A && com.fyber.inneractive.sdk.player.cache.n.f16185f.f16188c && com.fyber.inneractive.sdk.util.s.a() && c10 != 2) {
            fVar = new com.fyber.inneractive.sdk.player.cache.i(this, i10, this.f16209q);
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.m();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.o(this.f16233a, mVar, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.q(IAConfigManager.O.f15030y.a(), mVar));
            File fileA = com.fyber.inneractive.sdk.player.cache.n.a(this.f16233a, "ia-vid-cache-ex2");
            if (fileA != null) {
                fVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.f(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l(fileA, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j()), oVar);
            } else {
                gVar = oVar;
            }
            if (c10 != 2) {
                jVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.q(uri, gVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.c(), this.f16210r, this.f16216x, this.f16217y);
            } else {
                jVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j(uri, gVar, this.f16216x, this.f16217y);
            }
            this.C = jVar;
            a(jVar);
        }
        gVar = fVar;
        if (c10 != 2) {
            jVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.q(uri, gVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.c(), this.f16210r, this.f16216x, this.f16217y);
        } else {
            jVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j(uri, gVar, this.f16216x, this.f16217y);
        }
        this.C = jVar;
        a(jVar);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f16211s;
        if (gVar == null || uVar == null) {
            return;
        }
        if (!gVar.f17366m.c() || gVar.f17367n != null) {
            gVar.f17366m = com.fyber.inneractive.sdk.player.exoplayer2.x.f17962a;
            gVar.f17367n = null;
            Iterator it = gVar.f17358e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).getClass();
            }
        }
        if (gVar.f17361h) {
            gVar.f17361h = false;
            int i10 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.f17627d;
            gVar.f17368o = gVar.f17355b;
            ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) gVar.f17354a).getClass();
            Iterator it2 = gVar.f17358e.iterator();
            while (it2.hasNext()) {
                ((b0) it2.next()).getClass();
            }
        }
        gVar.f17365l++;
        gVar.f17357d.f17407f.obtainMessage(0, 1, 0, uVar).sendToTarget();
        a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
    }
}
