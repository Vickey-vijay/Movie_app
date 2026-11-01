package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.b f33702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f33709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SurfaceHolder f33710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f33711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f33712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f33715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MediaEvents f33716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f33717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AudioManager f33718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f33719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f33720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f33721t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f33722u;

    public class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            CusPlayerView.this.a(i10);
        }
    }

    public class b implements SurfaceHolder.Callback {
        private b() {
        }

        public /* synthetic */ b(CusPlayerView cusPlayerView, a aVar) {
            this();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            try {
                q0.c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.f33705d && !CusPlayerView.this.f33706e && !CusPlayerView.this.isComplete() && !CusPlayerView.this.f33708g && !com.mbridge.msdk.foundation.feedback.b.f34851f) {
                    if (CusPlayerView.this.f33702a.f()) {
                        q0.c("PlayerView", "surfaceChanged  start====");
                        CusPlayerView.this.resumeStart();
                    } else {
                        q0.c("PlayerView", "surfaceChanged  PLAY====");
                        CusPlayerView.this.playVideo(0);
                        CusPlayerView.this.resumeOMSDK();
                    }
                    if (CusPlayerView.this.f33708g) {
                        if (CusPlayerView.this.f33709h) {
                            CusPlayerView.this.f33702a.n();
                            CusPlayerView.this.resumeOMSDK();
                        } else {
                            CusPlayerView.this.pause();
                        }
                    }
                }
                CusPlayerView.this.f33705d = false;
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.f33702a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.f33710i = surfaceHolder;
                CusPlayerView.this.f33702a.a(surfaceHolder);
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.f33705d = true;
                CusPlayerView.this.f33707f = true;
                CusPlayerView.this.f33702a.m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }
    }

    public interface c {
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public boolean isComplete() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
            return bVar != null && bVar.g();
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean playVideo(int i10) {
        try {
            if (this.f33702a == null) {
                q0.c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.f33704c) {
                q0.c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (e()) {
                this.f33702a.t();
            } else {
                q0.d("PlayerView", "Audio focus request denied");
                if (this.f33722u) {
                    q0.c("PlayerView", "Continuing playback without audio");
                    this.f33702a.j();
                }
            }
            this.f33702a.a(i10);
            this.f33707f = false;
            return true;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public void setMixWithOtherAudio(int i10) {
        this.f33721t = i10 == 1;
    }

    public void setNotifyListener(c cVar) {
    }

    private void c() {
        try {
            this.f33718q = (AudioManager) getContext().getSystemService("audio");
            this.f33719r = new a();
            q0.c("PlayerView", "AudioManager initialized");
        } catch (Exception e10) {
            q0.b("PlayerView", "Failed to initialize AudioManager: " + e10.getMessage());
        }
    }

    private void d() {
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.f33710i = holder;
        holder.setKeepScreenOn(true);
        this.f33710i.addCallback(new b(this, null));
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = new com.mbridge.msdk.config.dynamic.baseview.video.b();
        this.f33702a = bVar;
        bVar.a(getContext(), this.f33710i);
        addView(surfaceView, -1, -1);
    }

    private boolean e() {
        int i10;
        try {
            if (this.f33718q == null) {
                q0.b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z10 = true;
            if (this.f33721t) {
                q0.c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i10 = 3;
            } else {
                q0.c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i10 = 1;
            }
            if (this.f33718q.requestAudioFocus(this.f33719r, 3, i10) != 1) {
                z10 = false;
            }
            this.f33720s = z10;
            return z10;
        } catch (Exception e10) {
            q0.b("PlayerView", "Error requesting audio focus: " + e10.getMessage());
            return false;
        }
    }

    public void closeSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.f33702a != null) {
                q0.c("PlayerView", "coverUnlockResume========");
                if (!this.f33702a.f() || this.f33707f) {
                    playVideo(0);
                } else {
                    start(true);
                }
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public int getCurPosition() {
        long jC;
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
            jC = bVar != null ? bVar.c() : 0L;
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
        return Math.toIntExact(jC);
    }

    public int getDuration() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.f33717p;
    }

    public MediaEvents getVideoEvents() {
        return this.f33716o;
    }

    public float getVolume() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
        if (bVar != null) {
            return bVar.e();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.f33721t;
    }

    public boolean isPlayIng() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
            if (bVar != null) {
                return bVar.h();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.f33722u;
    }

    public boolean isSilent() {
        return this.f33702a.i();
    }

    public void onResume() {
        try {
            if (this.f33702a != null && !this.f33705d && !isComplete() && !this.f33706e) {
                q0.c("PlayerView", "onresume========");
                if (this.f33702a.f()) {
                    resumeStart();
                } else {
                    playVideo(0);
                }
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void openSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
        if (bVar != null) {
            bVar.t();
        }
    }

    public void pause() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
            if (bVar != null) {
                bVar.m();
            }
            pauseOmsdk();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.f33716o == null || this.f33715n) {
                return;
            }
            q0.a("omsdk", "play view:  pause");
            this.f33715n = true;
            this.f33716o.pause();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public void prepare() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
            if (bVar != null) {
                bVar.o();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void release() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
            if (bVar != null) {
                bVar.p();
            }
            if (this.f33716o != null) {
                this.f33716o = null;
            }
            a();
            if (this.f33710i != null) {
                q0.b("PlayerView", "mSurfaceHolder release");
                this.f33710i.getSurface().release();
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            MediaEvents mediaEvents = this.f33716o;
            if (mediaEvents != null) {
                this.f33715n = false;
                mediaEvents.resume();
                q0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public void seekTo(int i10) {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
            if (bVar != null) {
                bVar.a(i10);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekToEndFrame() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
        if (bVar != null) {
            bVar.q();
        }
    }

    public void setIsBTVideo(boolean z10) {
        this.f33708g = z10;
    }

    public void setIsBTVideoPlaying(boolean z10) {
        this.f33709h = z10;
    }

    public void setIsCovered(boolean z10) {
        try {
            this.f33706e = z10;
            q0.b("PlayerView", "mIsCovered:" + z10);
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void setPlayWithoutAudioFocus(boolean z10) {
        this.f33722u = z10;
        q0.c("PlayerView", "setPlayWithoutAudioFocus: " + z10);
    }

    public void setPlaybackParams(float f10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
        if (bVar != null) {
            bVar.a(f10);
        }
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f33716o = mediaEvents;
    }

    public void setVolume(float f10, float f11) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
        if (bVar != null) {
            bVar.a(f10, f11);
        }
    }

    public void start(boolean z10) {
        try {
            if (this.f33702a != null) {
                if (z10) {
                    if (e()) {
                        this.f33702a.t();
                    } else {
                        this.f33702a.j();
                    }
                }
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
                if (bVar == null || this.f33706e) {
                    return;
                }
                bVar.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
            if (bVar != null) {
                bVar.s();
            }
            if (this.f33716o != null) {
                this.f33716o = null;
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33704c = false;
        this.f33705d = false;
        this.f33706e = false;
        this.f33707f = false;
        this.f33708g = false;
        this.f33709h = false;
        this.f33713l = 1;
        this.f33714m = false;
        this.f33715n = false;
        this.f33717p = "";
        this.f33720s = false;
        this.f33721t = false;
        this.f33722u = true;
        b();
    }

    private void b() {
        try {
            d();
            c();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public boolean initVFPData(String str, String str2, com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.c("PlayerView", "playUrl==null");
            return false;
        }
        this.f33703b = str;
        this.f33702a.a(aVar);
        this.f33702a.c(this.f33703b);
        this.f33704c = true;
        return true;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f33711j = motionEvent.getRawX();
        this.f33712k = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        try {
            if (s0.a().a("i_l_s_t_r_i", false) && i10 == 0 && !this.f33714m) {
                this.f33714m = true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void resumeStart() {
        try {
            if (!e()) {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
                if (bVar != null) {
                    bVar.j();
                }
            } else {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f33702a;
                if (bVar2 != null) {
                    bVar2.t();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33717p = SameMD5.getMD5(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        try {
            if (i10 == -3) {
                q0.c("PlayerView", "Audio focus lost transient can duck");
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f33702a;
                if (bVar != null) {
                    bVar.a(0.3f, 0.3f);
                }
            } else if (i10 == -2) {
                q0.c("PlayerView", "Audio focus lost transient");
                this.f33720s = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f33702a;
                if (bVar2 != null && bVar2.h()) {
                    this.f33702a.m();
                }
            } else if (i10 == -1) {
                q0.c("PlayerView", "Audio focus lost");
                this.f33720s = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar3 = this.f33702a;
                if (bVar3 != null && bVar3.h()) {
                    this.f33702a.m();
                }
            } else {
                if (i10 != 1) {
                    return;
                }
                q0.c("PlayerView", "Audio focus gained");
                this.f33720s = true;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar4 = this.f33702a;
                if (bVar4 != null) {
                    bVar4.a(1.0f, 1.0f);
                    if (!this.f33702a.h()) {
                        this.f33702a.n();
                    }
                }
            }
        } catch (Exception e10) {
            q0.b("PlayerView", "Error handling audio focus change: " + e10.getMessage());
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    private void a() {
        try {
            AudioManager audioManager = this.f33718q;
            if (audioManager == null || !this.f33720s) {
                return;
            }
            int iAbandonAudioFocus = audioManager.abandonAudioFocus(this.f33719r);
            this.f33720s = false;
            q0.c("PlayerView", "Audio focus abandoned, result: " + iAbandonAudioFocus);
        } catch (Exception e10) {
            q0.b("PlayerView", "Error abandoning audio focus: " + e10.getMessage());
        }
    }
}
