package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import java.io.File;

/* JADX INFO: compiled from: LocalVideoFileMonitor.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f33841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SimpleExoPlayer f33842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f33844e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33840a = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33845f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f33846g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33847h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f33848i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f33849j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f33850k = new a();

    /* JADX INFO: compiled from: LocalVideoFileMonitor.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        q0.b("LocalVideoFileMonitor", " 触发 一次检查");
        try {
            File file = new File(this.f33843d);
            if (file.exists()) {
                a(file);
            } else {
                q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件不存在");
                if (System.currentTimeMillis() - this.f33845f < this.f33840a) {
                    this.f33849j.postDelayed(this.f33850k, 1000L);
                } else {
                    a("resource buffer exception file is not found");
                }
            }
        } catch (Exception e10) {
            a("resource buffer exception" + e10.getMessage());
        }
    }

    private void d() {
        this.f33845f = 0L;
        this.f33846g = 0L;
        this.f33847h = 0L;
        this.f33848i = 0L;
    }

    private void e() {
        if (this.f33842c != null) {
            com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f33844e;
            if (aVar != null) {
                aVar.onBufferingEnd();
            }
            ExtractorMediaSource extractorMediaSourceCreateMediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f33841b, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(this.f33843d));
            this.f33842c.setRepeatMode(0);
            this.f33842c.prepare(extractorMediaSourceCreateMediaSource);
            this.f33842c.seekTo(this.f33846g);
            this.f33842c.setPlayWhenReady(true);
        }
        a();
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.baseview.video.a aVar, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33844e = aVar;
        if (i10 > 0) {
            this.f33840a = i10 * 1000;
        }
        this.f33843d = str;
    }

    public c(Context context, SimpleExoPlayer simpleExoPlayer) {
        this.f33841b = context;
        this.f33842c = simpleExoPlayer;
    }

    public void c() {
        a();
        this.f33846g = 0L;
        this.f33847h = 0L;
        this.f33848i = 0L;
        this.f33841b = null;
        this.f33842c = null;
        this.f33844e = null;
    }

    public boolean a(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException == null || exoPlaybackException.type != 0) {
            return false;
        }
        q0.b("LocalVideoFileMonitor", " 触发 资源异常 监控");
        d();
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f33844e;
        if (aVar != null) {
            aVar.onBufferingStart();
        }
        this.f33845f = System.currentTimeMillis();
        SimpleExoPlayer simpleExoPlayer = this.f33842c;
        if (simpleExoPlayer != null) {
            this.f33846g = simpleExoPlayer.getCurrentPosition();
        }
        this.f33849j.post(this.f33850k);
        return true;
    }

    private void a(File file) {
        q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件存在 但是不完整");
        long length = file.length();
        long jLastModified = file.lastModified();
        long j10 = this.f33847h;
        boolean z10 = (j10 == 0 || length == j10) ? false : true;
        long j11 = this.f33848i;
        boolean z11 = (j11 == 0 || jLastModified == j11) ? false : true;
        this.f33847h = length;
        this.f33848i = jLastModified;
        if (z10 || z11) {
            q0.b("LocalVideoFileMonitor", " 资源状态发生过变化 触发播放");
            e();
        } else if (System.currentTimeMillis() - this.f33845f < this.f33840a) {
            this.f33849j.postDelayed(this.f33850k, 1000L);
        } else {
            a("resource buffer time out");
        }
    }

    private void a() {
        this.f33849j.removeCallbacks(this.f33850k);
    }

    private void a(String str) {
        q0.b("LocalVideoFileMonitor", "通知外部 规定时间内 缓冲未成功");
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f33844e;
        if (aVar != null) {
            aVar.onBufferingTimeOut(str);
            this.f33844e.onPlayError(str);
        }
    }
}
