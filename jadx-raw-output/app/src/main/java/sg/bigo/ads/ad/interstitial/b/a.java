package sg.bigo.ads.ad.interstitial.b;

import androidx.annotation.CallSuper;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.utils.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.ad.b.b f67880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f67881b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f67885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0669a f67886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f67887h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67883d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67884e = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f67888i = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67882c = 1;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0669a {
        void a(boolean z10, boolean z11);

        void ax();

        void ay();

        void b(long j10);
    }

    public static class b implements VideoController.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final VideoController.d f67892a;

        private b(VideoController.d dVar) {
            this.f67892a = dVar;
        }

        public /* synthetic */ b(VideoController.d dVar, byte b10) {
            this(dVar);
        }

        @Override // sg.bigo.ads.api.VideoController.d
        @CallSuper
        public void a(int i10, int i11) {
            VideoController.d dVar = this.f67892a;
            if (dVar != null) {
                dVar.a(i10, i11);
            }
        }
    }

    public static class c implements VideoController.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final VideoController.b f67893a;

        private c(VideoController.b bVar) {
            this.f67893a = bVar;
        }

        public /* synthetic */ c(VideoController.b bVar, byte b10) {
            this(bVar);
        }

        @Override // sg.bigo.ads.api.VideoController.b
        @CallSuper
        public final void a() {
            VideoController.b bVar = this.f67893a;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.b
        @CallSuper
        public final void b() {
            VideoController.b bVar = this.f67893a;
            if (bVar != null) {
                bVar.b();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        @CallSuper
        public void onMuteChange(boolean z10) {
            VideoController.b bVar = this.f67893a;
            if (bVar != null) {
                bVar.onMuteChange(z10);
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        @CallSuper
        public void onVideoEnd() {
            VideoController.b bVar = this.f67893a;
            if (bVar != null) {
                bVar.onVideoEnd();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        @CallSuper
        public void onVideoPause() {
            VideoController.b bVar = this.f67893a;
            if (bVar != null) {
                bVar.onVideoPause();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        @CallSuper
        public void onVideoPlay() {
            VideoController.b bVar = this.f67893a;
            if (bVar != null) {
                bVar.onVideoPlay();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        @CallSuper
        public void onVideoStart() {
            VideoController.b bVar = this.f67893a;
            if (bVar != null) {
                bVar.onVideoStart();
            }
        }
    }

    public static /* synthetic */ void a(a aVar) {
        if (!aVar.a()) {
            if (aVar.f67883d) {
                aVar.b();
                return;
            }
            sg.bigo.ads.common.t.a.a(0, "CountdownHelper", "invalid status, isCountdownIgnoreVideoProgress=" + aVar.a() + ", mVideoEnd=" + aVar.f67883d);
            return;
        }
        if (aVar.f67884e) {
            aVar.b();
            return;
        }
        sg.bigo.ads.ad.b.b bVar = aVar.f67880a;
        VideoController videoController = bVar != null ? bVar.getVideoController() : null;
        if (videoController == null || videoController.isPlaying()) {
            return;
        }
        videoController.play();
    }

    private void b() {
        InterfaceC0669a interfaceC0669a = this.f67886g;
        if (interfaceC0669a != null) {
            interfaceC0669a.a(a(), this.f67883d);
        }
    }

    public final void a(long j10) {
        this.f67887h = j10;
        this.f67882c = 2;
    }

    public final void a(boolean z10) {
        if (z10 && !a()) {
            InterfaceC0669a interfaceC0669a = this.f67886g;
            if (interfaceC0669a != null) {
                interfaceC0669a.ax();
                return;
            }
            return;
        }
        if (z10 || !a()) {
            return;
        }
        n nVar = this.f67885f;
        if (nVar != null && nVar.e()) {
            this.f67885f.c();
        }
        InterfaceC0669a interfaceC0669a2 = this.f67886g;
        if (interfaceC0669a2 != null) {
            interfaceC0669a2.ax();
        }
    }

    public final boolean a() {
        return this.f67882c == 2;
    }

    public final void b(boolean z10) {
        if (z10 && !a()) {
            InterfaceC0669a interfaceC0669a = this.f67886g;
            if (interfaceC0669a != null) {
                interfaceC0669a.ay();
                return;
            }
            return;
        }
        if (z10 || !a()) {
            return;
        }
        n nVar = this.f67885f;
        if (nVar != null) {
            nVar.d();
        }
        InterfaceC0669a interfaceC0669a2 = this.f67886g;
        if (interfaceC0669a2 != null) {
            interfaceC0669a2.ay();
        }
    }
}
