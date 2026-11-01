package io.bidmachine.rendering.internal.adform.video;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.adform.video.player.d;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.measurer.VideoMeasurer;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.Resource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.UrlResourceSource;
import io.bidmachine.rendering.utils.UiUtils;
import mj.r;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final VideoMeasurer f60033r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private io.bidmachine.rendering.internal.adform.video.player.b f60034s;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.video.a$a, reason: collision with other inner class name */
    public final class C0517a implements d {
        public C0517a() {
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void a(io.bidmachine.rendering.internal.adform.video.player.b bVar, boolean z10) {
            p.j(bVar, "player");
            io.bidmachine.rendering.internal.event.b bVarQ = a.this.q();
            if (z10) {
                bVarQ.f();
            } else {
                bVarQ.c();
            }
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void b(io.bidmachine.rendering.internal.adform.video.player.b bVar) {
            p.j(bVar, "player");
            a.this.B();
            VideoMeasurer videoMeasurer = a.this.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaResumed();
            }
            a.this.q().b();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void c(io.bidmachine.rendering.internal.adform.video.player.b bVar) {
            p.j(bVar, "player");
            VideoMeasurer videoMeasurer = a.this.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaPaused();
            }
            a.this.q().h();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void d(io.bidmachine.rendering.internal.adform.video.player.b bVar) {
            p.j(bVar, "player");
            VideoMeasurer videoMeasurer = a.this.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaSkipped();
            }
            a.this.q().e();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void e(io.bidmachine.rendering.internal.adform.video.player.b bVar) {
            p.j(bVar, "player");
            VideoMeasurer videoMeasurer = a.this.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaThirdQuartile();
            }
            a.this.q().d();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void f(io.bidmachine.rendering.internal.adform.video.player.b bVar) {
            p.j(bVar, "player");
            VideoMeasurer videoMeasurer = a.this.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onViewReady(bVar.p());
            }
            a.this.t().b(a.this);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void g(io.bidmachine.rendering.internal.adform.video.player.b bVar) {
            p.j(bVar, "player");
            VideoMeasurer videoMeasurer = a.this.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaStarted(bVar.g(), bVar.getVolume());
            }
            a.this.q().l();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void h(io.bidmachine.rendering.internal.adform.video.player.b bVar) {
            p.j(bVar, "player");
            VideoMeasurer videoMeasurer = a.this.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaMidpoint();
            }
            a.this.q().i();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void i(io.bidmachine.rendering.internal.adform.video.player.b bVar) {
            p.j(bVar, "player");
            VideoMeasurer videoMeasurer = a.this.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaCompleted();
            }
            a.this.q().a();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void a(io.bidmachine.rendering.internal.adform.video.player.b bVar, Error error) {
            p.j(bVar, "player");
            p.j(error, "error");
            a.this.b(error);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void b(io.bidmachine.rendering.internal.adform.video.player.b bVar, Error error) {
            p.j(bVar, "player");
            p.j(error, "error");
            a.this.a(error);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void a(io.bidmachine.rendering.internal.adform.video.player.b bVar, long j10) {
            p.j(bVar, "player");
            a.this.q().a(bVar.g(), j10);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void a(io.bidmachine.rendering.internal.adform.video.player.b bVar) {
            p.j(bVar, "player");
            VideoMeasurer videoMeasurer = a.this.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaFirstQuartile();
            }
            a.this.q().k();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void a(io.bidmachine.rendering.internal.adform.video.player.b bVar, float f10) {
            p.j(bVar, "player");
            VideoMeasurer videoMeasurer = a.this.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaVolumeChanged(f10);
            }
        }
    }

    public final class b implements io.bidmachine.rendering.internal.repository.a.InterfaceC0533a {
        public b() {
        }

        @Override // io.bidmachine.rendering.internal.repository.a.InterfaceC0533a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Uri uri) {
            p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            final a aVar = a.this;
            UiUtils.onUiThread(new Runnable() { // from class: xh.k
                @Override // java.lang.Runnable
                public final void run() {
                    io.bidmachine.rendering.internal.adform.video.a.b.a(aVar, uri);
                }
            });
        }

        @Override // io.bidmachine.rendering.internal.repository.a.InterfaceC0533a
        public void onError(Error error) {
            p.j(error, "error");
            a.this.a(error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a aVar, Uri uri) {
            p.j(aVar, "this$0");
            p.j(uri, "$uri");
            try {
                io.bidmachine.rendering.internal.adform.video.player.b bVar = aVar.f60034s;
                if (bVar != null) {
                    bVar.a(uri);
                    bVar.prepare();
                }
            } catch (Throwable th2) {
                o.b(th2);
                aVar.a(Error.INSTANCE.create(th2));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, c cVar, io.bidmachine.rendering.internal.event.b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2, VideoMeasurer videoMeasurer) {
        super(context, aVar, adElementParams, cVar, bVar, aVar2);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(aVar, "repository");
        p.j(adElementParams, "adElementParams");
        p.j(cVar, "adFormListener");
        p.j(bVar, "eventCallback");
        this.f60033r = videoMeasurer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar) {
        p.j(aVar, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = aVar.f60034s;
        if (bVar != null) {
            bVar.a();
        }
        aVar.f60034s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(a aVar) {
        p.j(aVar, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = aVar.f60034s;
        if (bVar != null) {
            bVar.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(a aVar) {
        p.j(aVar, "this$0");
        aVar.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(a aVar) {
        p.j(aVar, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = aVar.f60034s;
        if (bVar != null) {
            bVar.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a aVar) {
        p.j(aVar, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = aVar.f60034s;
        if (bVar != null) {
            bVar.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(a aVar) {
        p.j(aVar, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = aVar.f60034s;
        if (bVar != null) {
            bVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(a aVar) {
        p.j(aVar, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = aVar.f60034s;
        if (bVar != null) {
            bVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(a aVar) {
        p.j(aVar, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = aVar.f60034s;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void B() {
        super.B();
        VideoMeasurer videoMeasurer = this.f60033r;
        if (videoMeasurer != null) {
            videoMeasurer.onShown();
        }
    }

    public final void E() {
        UiUtils.onUiThread(new n() { // from class: xh.f
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.video.a.d(this.f74479b);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.q
    public void l() {
        UiUtils.onUiThread(new n() { // from class: xh.h
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.video.a.e(this.f74481b);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.t
    public void m() {
        UiUtils.onUiThread(new n() { // from class: xh.e
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.video.a.i(this.f74478b);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View x() {
        io.bidmachine.rendering.internal.adform.video.player.b bVar = this.f60034s;
        if (bVar != null) {
            return bVar.p();
        }
        return null;
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void y() {
        super.y();
        VideoMeasurer videoMeasurer = this.f60033r;
        if (videoMeasurer != null) {
            videoMeasurer.onClicked();
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void z() {
        r rVar;
        VideoMeasurer videoMeasurer = this.f60033r;
        if (videoMeasurer != null) {
            videoMeasurer.destroy(new n() { // from class: xh.g
                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    io.bidmachine.rendering.internal.adform.video.a.f(this.f74480b);
                }
            });
            rVar = r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            E();
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void c() {
        Resource resource = h().getResource();
        String source = null;
        ResourceSource source2 = resource != null ? resource.getSource() : null;
        if (source2 == null) {
            source = h().getSource();
        } else if (source2 instanceof UrlResourceSource) {
            source = ((UrlResourceSource) source2).getUrl();
        } else {
            b("Invalid resource type (" + source2.getClass().getSimpleName() + "), it should be UrlResourceSource");
        }
        MediaSource mediaSourceFromUrl = MediaSource.INSTANCE.fromUrl(source);
        if (mediaSourceFromUrl != null) {
            final String customParam = mediaSourceFromUrl.getDeliveryType() == MediaSource.DeliveryType.STREAM ? "exo" : h().getCustomParam("player");
            UiUtils.onUiThread(new Runnable() { // from class: xh.a
                @Override // java.lang.Runnable
                public final void run() {
                    io.bidmachine.rendering.internal.adform.video.a.a(this.f74473b, customParam);
                }
            });
            w().c(mediaSourceFromUrl, new b());
        } else {
            a(new Error("Invalid adm url (" + source + ')'));
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void d() {
        UiUtils.onUiThread(new n() { // from class: xh.c
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.video.a.h(this.f74476b);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.w
    public void e() {
        UiUtils.onUiThread(new n() { // from class: xh.b
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.video.a.j(this.f74475b);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void f() {
        super.f();
        UiUtils.onUiThread(new n() { // from class: xh.i
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.video.a.g(this.f74482b);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.q
    public void i() {
        UiUtils.onUiThread(new n() { // from class: xh.d
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.video.a.k(this.f74477b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, String str) {
        p.j(aVar, "this$0");
        try {
            io.bidmachine.rendering.internal.adform.video.player.b bVarA = io.bidmachine.rendering.internal.adform.video.player.c.a(aVar.v(), str);
            bVarA.a(aVar.new C0517a());
            VideoMeasurer videoMeasurer = aVar.f60033r;
            if (videoMeasurer != null) {
                videoMeasurer.onViewCreated(bVarA.p());
            }
            aVar.f60034s = bVarA;
        } catch (Throwable th2) {
            o.b(th2);
            aVar.a(Error.INSTANCE.create(th2));
        }
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.g
    public void b() {
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Error error) {
        VideoMeasurer videoMeasurer = this.f60033r;
        if (videoMeasurer != null) {
            videoMeasurer.onError(error);
        }
        t().a(this, error);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void a(final ViewGroup viewGroup) {
        p.j(viewGroup, "viewGroup");
        UiUtils.onUiThread(new n() { // from class: xh.j
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.video.a.a(this.f74483b, viewGroup);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, ViewGroup viewGroup) {
        p.j(aVar, "this$0");
        p.j(viewGroup, "$viewGroup");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = aVar.f60034s;
        VideoMeasurer videoMeasurer = aVar.f60033r;
        if (videoMeasurer == null || bVar == null) {
            return;
        }
        videoMeasurer.onViewAddedToContainer(bVar.p(), viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Error error) {
        VideoMeasurer videoMeasurer = this.f60033r;
        if (videoMeasurer != null) {
            videoMeasurer.onError(error);
        }
        t().c(this, error);
    }
}
