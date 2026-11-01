package sg.bigo.ads.core.player.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import java.util.HashMap;
import java.util.Objects;
import sg.bigo.ads.R;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends f implements c.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean E;
    private int F;
    private boolean G;
    private long H;
    private String I;
    private String J;
    private boolean K;
    private boolean L;
    private View M;
    private b N;
    private final TextureView.SurfaceTextureListener O;
    private final View.OnClickListener P;
    private Runnable Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71846a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f71847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f71848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f71849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private ImageView f71850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageView f71851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdImageView f71852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f71853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ProgressBar f71854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f71855p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c f71856q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f71857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f71858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f71859t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f71860u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f71861v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f71862w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Runnable f71863x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Runnable f71864y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f71865z;

    public e(Context context, int i10, int i11, @NonNull sg.bigo.ads.api.c.b bVar, @Nullable sg.bigo.ads.core.a.a aVar) {
        sg.bigo.ads.core.a.a aVar2;
        super(context, bVar, aVar);
        this.f71856q = new c();
        this.f71857r = 0;
        this.f71858s = 0;
        this.f71859t = true;
        this.f71865z = false;
        this.A = true;
        this.B = false;
        this.C = false;
        this.E = false;
        this.H = 0L;
        this.I = "";
        this.J = "";
        this.K = true;
        this.L = false;
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: sg.bigo.ads.core.player.b.e.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f71867b = SystemClock.elapsedRealtime();

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i12, int i13) {
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onSurfaceTextureAvailable");
                sg.bigo.ads.common.n.d.a(e.this.f71864y);
                e.this.a(13, SystemClock.elapsedRealtime() - this.f71867b, 0);
                e.this.H = SystemClock.elapsedRealtime();
                e.this.f71856q.a(new Surface(surfaceTexture));
                sg.bigo.ads.core.a.a aVar3 = e.this.f71876e;
                if (aVar3 != null && aVar3.aZ()) {
                    e.this.f71856q.a(e.this.f71853n);
                    e.d(e.this);
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "real video is not ready, begin to load backup image");
                sg.bigo.ads.core.a.a aVar4 = e.this.f71876e;
                if (aVar4 == null || aVar4.bh() == null) {
                    e.g(e.this);
                    return;
                }
                Pair<Bitmap, String> pairBh = e.this.f71876e.bh();
                if (pairBh != null) {
                    e.this.a(pairBh.first);
                    if (e.this.N != null) {
                        e.this.N.a((Bitmap) pairBh.first);
                    }
                }
                e.this.w();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                sg.bigo.ads.common.t.a.b("VideoPlayView", "onSurfaceTextureDestroyed");
                e.this.d(false);
                c cVar = e.this.f71856q;
                try {
                    if (!c.f71817h.get()) {
                        cVar.f71818a.reset();
                    }
                    sg.bigo.ads.common.n.d.a(cVar.f71824g);
                } catch (IllegalStateException e10) {
                    c.a aVar3 = cVar.f71820c;
                    if (aVar3 != null) {
                        aVar3.a(11, Log.getStackTraceString(e10), cVar.f71825i);
                    }
                    sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "reset IllegalStateException");
                }
                cVar.f71823f = false;
                cVar.f71822e = false;
                if (!e.this.f71860u) {
                    e eVar = e.this;
                    eVar.f71878g = false;
                    if (eVar.f71857r > 0) {
                        e eVar2 = e.this;
                        eVar2.f71858s = eVar2.f71857r;
                    }
                }
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i12, int i13) {
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onSurfaceTextureSizeChanged");
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.O = surfaceTextureListener;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sg.bigo.ads.core.player.b.e.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (view.getId()) {
                    case 200011:
                        e.this.o();
                        break;
                    case 200012:
                        if (!e.this.G || !e.this.C) {
                            e.this.v();
                        }
                        break;
                }
            }
        };
        this.P = onClickListener;
        this.f71846a = 0;
        this.Q = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.5
            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f71851l != null) {
                    e.this.f71851l.setVisibility(8);
                }
            }
        };
        this.J = aVar != null ? aVar.aT() : "";
        if (aVar != null && aVar.bq() != null) {
            this.I = aVar.bq().f71390b;
        }
        w();
        this.f71862w = bVar.f69353f;
        this.f71860u = bVar.f69352e;
        this.f71847h = i10;
        this.f71848i = i11;
        int i12 = bVar.f69348a;
        this.f71861v = bVar.f69349b;
        g gVar = new g(this.f71874c, i10, i11, i12);
        this.f71849j = gVar;
        u.a(gVar, this, null, -1);
        this.f71849j.setSurfaceTextureListener(surfaceTextureListener);
        sg.bigo.ads.core.a.a aVar3 = this.f71876e;
        if (aVar3 != null && aVar3.x() != 2 && y()) {
            sg.bigo.ads.common.n.d.a(this.f71864y);
            if (this.f71864y == null) {
                this.f71864y = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.x();
                        sg.bigo.ads.core.a.a aVar4 = e.this.f71876e;
                        sg.bigo.ads.core.d.b.a(aVar4, aVar4 != null ? aVar4.aK() : "", 13, "onSurfaceTextureAvailable not called", 0);
                        e.this.a("AdVideoTooLate", new int[]{10311});
                    }
                };
            }
            sg.bigo.ads.common.n.d.a(2, this.f71864y, this.f71862w);
        }
        if (!bVar.f69354g && (aVar2 = this.f71876e) != null && !TextUtils.isEmpty(aVar2.aN())) {
            a(o.b(getContext().getApplicationContext(), this.f71876e.aN()));
        }
        this.f71859t = this.f71856q.a(bVar.f69351d);
        if (!bVar.f69350c) {
            int iB = sg.bigo.ads.common.utils.a.b(this.f71874c, R.dimen.bigo_ad_volume_padding);
            ImageView imageView = new ImageView(this.f71874c);
            this.f71850k = imageView;
            imageView.setId(200011);
            this.f71850k.setOnClickListener(onClickListener);
            this.f71850k.setPadding(iB, iB, iB, iB);
            this.f71850k.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f71874c, this.f71859t ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
            int iB2 = sg.bigo.ads.common.utils.a.b(this.f71874c, R.dimen.bigo_ad_volume_size) + (iB * 2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB2, iB2, 85);
            layoutParams.rightMargin = iB;
            layoutParams.bottomMargin = iB;
            this.f71850k.setVisibility(0);
            u.a(this.f71850k, this, layoutParams, -1);
        }
        sg.bigo.ads.core.a.a aVar4 = this.f71876e;
        boolean z10 = aVar4 != null && aVar4.aO();
        this.G = z10;
        if (z10) {
            z();
        }
        int iB3 = sg.bigo.ads.common.utils.a.b(this.f71874c, R.dimen.bigo_ad_replay_size);
        sg.bigo.ads.core.a.a aVar5 = this.f71876e;
        if (aVar5 != null && aVar5.x() == 2 && sg.bigo.ads.api.c.b.b() > 0) {
            iB3 = sg.bigo.ads.common.utils.e.a(this.f71874c, sg.bigo.ads.api.c.b.b());
        }
        ImageView imageView2 = new ImageView(this.f71874c);
        this.f71851l = imageView2;
        imageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f71874c, R.drawable.bigo_ad_ic_media_play));
        this.f71851l.setVisibility(this.f71860u ? 0 : 8);
        u.a(this.f71851l, this, new FrameLayout.LayoutParams(iB3, iB3, 17), -1);
        this.f71856q.f71820c = this;
        setId(200012);
        setOnClickListener(onClickListener);
        b(0);
    }

    private void A() {
        if (this.f71854o == null) {
            z();
        }
        this.f71854o.setVisibility(8);
    }

    private void B() {
        if (this.f71855p == null) {
            this.f71855p = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = this.f71855p;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, long j10, int i11) {
        sg.bigo.ads.core.a.a aVar = this.f71876e;
        sg.bigo.ads.core.d.b.a(aVar, aVar != null ? aVar.aK() : "", i10, j10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void a(T t10) {
        if (t10 == 0) {
            return;
        }
        if (this.f71852m == null) {
            AdImageView adImageView = new AdImageView(this.f71874c);
            this.f71852m = adImageView;
            adImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        u.a(this.f71852m, this, new FrameLayout.LayoutParams(-1, -1, 17), -1);
        boolean z10 = false;
        if (t10 instanceof String) {
            String str = (String) t10;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f71852m.setVisibility(0);
            AdImageView adImageView2 = this.f71852m;
            sg.bigo.ads.core.a.a aVar = this.f71876e;
            if (aVar != null && aVar.al()) {
                z10 = true;
            }
            adImageView2.a(str, z10);
            return;
        }
        if (t10 instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) t10;
            this.f71852m.setVisibility(0);
            this.f71852m.setImageBitmap(bitmap);
            ImageView imageView = this.f71850k;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            this.f71849j.f71885a = bitmap.getWidth();
            this.f71849j.f71886b = bitmap.getHeight();
            this.f71849j.requestLayout();
        }
    }

    public static /* synthetic */ void d(e eVar) {
        if (eVar.y()) {
            sg.bigo.ads.common.n.d.a(eVar.f71863x);
            if (eVar.f71863x == null) {
                eVar.f71863x = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.x();
                        e.this.a("AdVideoTooLate", new int[]{10107});
                    }
                };
            }
            sg.bigo.ads.common.n.d.a(2, eVar.f71863x, eVar.f71862w);
        }
    }

    public static /* synthetic */ void g(e eVar) {
        if (eVar.f71855p == null) {
            eVar.f71855p = sg.bigo.ads.common.utils.a.a(eVar.getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = eVar.f71855p;
        if (view != null) {
            u.a(view, eVar, new FrameLayout.LayoutParams(-2, -2, 17), -1);
            eVar.f71855p.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        sg.bigo.ads.core.a.a aVar;
        int i10;
        sg.bigo.ads.core.a.a aVar2 = this.f71876e;
        if (aVar2 == null) {
            return;
        }
        Pair<Bitmap, String> pairBh = aVar2.bh();
        if (this.f71876e.aZ()) {
            aVar = this.f71876e;
            i10 = 0;
        } else if (pairBh == null) {
            aVar = this.f71876e;
            i10 = 5;
        } else {
            if (!Objects.equals(pairBh.second, this.I)) {
                if (Objects.equals(pairBh.second, this.J)) {
                    this.f71876e.j(2);
                    return;
                }
                return;
            }
            aVar = this.f71876e;
            i10 = 1;
        }
        aVar.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f71856q.g();
        this.f71856q.d();
        this.f71856q.e();
    }

    private boolean y() {
        return this.f71862w > 0;
    }

    private void z() {
        Context context = getContext();
        ProgressBar progressBar = new ProgressBar(context);
        this.f71854o = progressBar;
        progressBar.setBackgroundColor(sg.bigo.ads.common.utils.a.c(context, android.R.color.transparent));
        s.a(context, this.f71854o, R.drawable.bigo_ad_progressbar_white);
        this.f71854o.setVisibility(8);
        u.a(this.f71854o, this, new FrameLayout.LayoutParams(-2, -2, 17), -1);
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        c cVar = this.f71856q;
        if (cVar.f71822e && cVar.b()) {
            this.f71865z = false;
            if (this.G) {
                A();
            }
            this.E = false;
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "pauseAd called");
        }
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void a(int i10, String str, int i11) {
        sg.bigo.ads.core.a.a aVar = this.f71876e;
        sg.bigo.ads.core.d.b.a(aVar, aVar != null ? aVar.aK() : "", i10, str, i11);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void a(MediaPlayer mediaPlayer, int i10) {
        sg.bigo.ads.common.n.d.a(this.f71863x);
        A();
        B();
        boolean z10 = this.f71847h == 0 && this.f71848i == 0;
        this.f71847h = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f71848i = videoHeight;
        if (this.L || (z10 && this.f71847h > 0 && videoHeight > 0)) {
            g gVar = this.f71849j;
            gVar.f71885a = this.f71847h;
            gVar.f71886b = videoHeight;
            gVar.requestLayout();
        }
        new HashMap();
        if (this.H > 0) {
            a(10, SystemClock.elapsedRealtime() - this.H, i10);
            this.H = 0L;
        }
        if (this.K) {
            b(18);
        }
        if (this.f71865z || y()) {
            this.f71865z = false;
            b();
        } else {
            if (this.f71878g || this.f71860u) {
                return;
            }
            d(true);
        }
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final void a(boolean z10) {
        super.a(z10);
        this.f71878g = false;
        if (this.f71856q.f71822e) {
            if (!sg.bigo.ads.common.aa.b.a(getContext().getApplicationContext())) {
                sg.bigo.ads.common.t.a.b("VideoPlayView", "screen is off, start ad cancel");
                return;
            }
            if (this.f71856q.a()) {
                this.F = getAdDuration();
                sg.bigo.ads.core.a.a aVar = this.f71876e;
                if (aVar != null) {
                    aVar.j(0);
                }
            }
            AdImageView adImageView = this.f71852m;
            if (adImageView != null) {
                adImageView.setVisibility(8);
            }
            this.f71851l.setVisibility(8);
            d(true);
            return;
        }
        StringBuilder sb2 = new StringBuilder("incorrect status, the player is not prepared");
        sb2.append(z10 ? " wating to play" : ", start ad failed");
        sg.bigo.ads.common.t.a.b("VideoPlayView", sb2.toString());
        this.f71865z = z10;
        int i10 = this.f71846a;
        if (i10 < 8) {
            int i11 = i10 + 1;
            this.f71846a = i11;
            if (i11 == 8) {
                sg.bigo.ads.core.d.b.a(this.f71876e, 3003, 10107, "Not prepared, src path = " + this.f71853n);
            }
        }
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final boolean a(int i10) {
        sg.bigo.ads.common.t.a.a("VideoPlayView", "onInfo called, whatInfo = ".concat(String.valueOf(i10)));
        if (i10 == 3) {
            sg.bigo.ads.common.t.a.a("VideoPlayView", "player pushed first video frame for rendering, video started");
            AdImageView adImageView = this.f71852m;
            if (adImageView != null) {
                adImageView.setVisibility(8);
            }
            ImageView imageView = this.f71850k;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f71856q.e();
            this.f71856q = new c();
        }
        sg.bigo.ads.common.t.a.a(2, "VideoPlayView", "An error occurred during the video playback: ".concat(String.valueOf(i10)));
        a("AdError", new int[]{i10, i11});
        if (i10 == -38) {
            sg.bigo.ads.common.t.a.a(0, "VideoPlayView", "onError code = -38, now reset status and init again.Range=" + this.f71857r);
            this.f71856q.a(this.f71853n);
        } else {
            sg.bigo.ads.common.t.a.a(0, "VideoPlayView", "onError code = " + i10 + ", now reset status and init again.Range=" + this.f71857r);
            if (this.f71856q.c() == 0) {
                c cVar = this.f71856q;
                if (cVar.f71825i < 3) {
                    cVar.b(15);
                }
            }
        }
        return true;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void b() {
        if (this.f71878g || this.f71860u) {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "tryStartAd, video is completed play, unregister it from list");
            d(false);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "try start play video ad");
            a(false);
        }
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final boolean c() {
        return this.f71859t;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "destroy player");
        d(false);
        x();
        setOnEventListener(null);
        this.f71854o = null;
        sg.bigo.ads.common.n.d.a(this.f71863x);
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final boolean e() {
        return this.f71856q.f71822e;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onPlay");
        this.f71860u = false;
        int i10 = this.f71858s;
        if (i10 > 0) {
            this.f71856q.a(i10);
            this.f71858s = -1;
        }
        a("AdVideoPlaying", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void g() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", C3426d4.i.f28567t0);
        a("AdVideoPaused", (int[]) null);
    }

    public final int getAdDuration() {
        return this.f71856q.f();
    }

    public final int getAdRemainingTime() {
        return this.f71856q.c();
    }

    public final ImageView getCoverView() {
        return this.f71852m;
    }

    public final int getCurrentPos() {
        return this.f71857r;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final int getPlayStatus() {
        return this.f71856q.f71821d;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void h() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onStop");
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void i() {
        String str;
        int adRemainingTime = getAdRemainingTime();
        if (this.G && (str = this.f71853n) != null && !str.startsWith("file:")) {
            if (this.D == adRemainingTime) {
                if (!this.E) {
                    if (this.f71854o == null) {
                        z();
                    }
                    this.f71854o.setVisibility(0);
                    sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onBuffering");
                    this.C = true;
                    a("AdVideoBuffering", (int[]) null);
                }
                this.E = true;
            } else {
                if (this.E) {
                    A();
                    sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onBuffered");
                    this.C = false;
                    a("AdVideoBuffered", (int[]) null);
                }
                this.E = false;
            }
            this.D = adRemainingTime;
        }
        if (this.F <= 0) {
            int adDuration = getAdDuration();
            this.F = adDuration;
            if (adDuration <= 0) {
                return;
            }
        }
        int i10 = this.F;
        if (adRemainingTime > i10) {
            adRemainingTime = i10;
        }
        this.f71857r = adRemainingTime;
        a("AdRemainingTimeChange", new int[]{adRemainingTime, i10, (int) ((adRemainingTime * 100.0f) / i10)});
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void j() {
        this.f71860u = true;
        AdImageView adImageView = this.f71852m;
        if (adImageView != null) {
            adImageView.setVisibility(0);
        }
        this.f71851l.setVisibility(this.f71861v ? 8 : 0);
        this.f71851l.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f71874c, R.drawable.bigo_ad_ic_media_play));
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onCompletion play");
        d(false);
        a("AdVideoComplete", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void j_() {
        a("AdVideoStart", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void k() {
        a("AdSizeChange", (int[]) null);
    }

    public final void l() {
        g gVar;
        if (this.f71876e == null || (gVar = this.f71849j) == null || !gVar.isAvailable() || this.L || this.f71876e.bh() == null || this.f71876e.bb()) {
            return;
        }
        Bitmap bitmap = (Bitmap) this.f71876e.bh().first;
        this.L = true;
        B();
        a(bitmap);
        int[] iArr = new int[1];
        c cVar = this.f71856q;
        iArr[0] = (cVar == null || !(TextUtils.isEmpty(cVar.f71819b) ^ true)) ? 0 : 1;
        a("AdBackupImgReady", iArr);
    }

    public final void m() {
        g gVar;
        if (this.f71876e == null || (gVar = this.f71849j) == null || this.L || !gVar.isAvailable() || this.f71876e.bb()) {
            return;
        }
        this.L = true;
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "real video is download success, update media player datasource:  " + this.f71876e.c(getContext()));
        this.f71856q.a(this.f71876e.c(getContext().getApplicationContext()));
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final boolean n() {
        return this.K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onDetachedFromWindow called");
        d(false);
        this.f71854o = null;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onVisibilityChanged visibility != VISIBLE");
            d(false);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onVisibilityChanged visibility == VISIBLE");
            d(true);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onWindowVisibilityChanged: ".concat(String.valueOf(i10)));
        View view = this.M;
        if (view != null) {
            if (i10 == 0) {
                u.b(view);
                u.a(this.f71849j, this, null, 0);
            } else {
                u.b(this.f71849j);
                u.a(this.M, this, new FrameLayout.LayoutParams(this.f71847h, this.f71848i), 0);
            }
        }
    }

    public final void setIVideoPlayerViewListener(b bVar) {
        this.N = bVar;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void setMute(boolean z10) {
        if (this.f71859t == z10) {
            this.A = false;
            return;
        }
        boolean zA = this.f71856q.a(z10);
        this.f71859t = zA;
        ImageView imageView = this.f71850k;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f71874c, zA ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
        if (this.A || this.B) {
            this.A = false;
            this.B = false;
        } else {
            int[] iArr = new int[1];
            iArr[0] = this.f71859t ? 0 : 100;
            a("AdVolumeChange", iArr);
        }
    }

    public final void setPlayInfo$505cff1c(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "setPlayInfo path=" + str + ",position=0");
        this.f71853n = str;
        this.f71857r = 0;
    }

    public final void setSeekPos(int i10) {
        this.f71858s = i10;
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final void setStatPrepareEventOnce(boolean z10) {
        this.K = z10;
    }
}
