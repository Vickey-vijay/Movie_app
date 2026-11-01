package sg.bigo.ads.ad.interstitial.e.a;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import io.bidmachine.media3.ui.DefaultTimeBar;
import sg.bigo.ads.ad.interstitial.d;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f68314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f68316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f68317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f68318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f68319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f68320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f68321k = new a(this, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f68322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f68323m;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f68324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f68325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f68326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f68327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f68328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f68329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f68330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f68331h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f68332i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f68333j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f68334k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f68335l;

        /* JADX WARN: Code duplicated, block: B:14:0x005c  */
        /* JADX WARN: Code duplicated, block: B:17:0x006e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:18:0x0070  */
        /* JADX WARN: Code duplicated, block: B:20:0x0078  */
        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        private a(@NonNull b bVar) {
            int iE;
            int iG;
            int i10 = d.f68105b;
            int iH = bVar.h();
            if (iH != 2) {
                if (iH != 3) {
                    this.f68324a = false;
                    this.f68325b = -1;
                    this.f68326c = sg.bigo.ads.common.w.b.a(i10, 0.15f);
                    this.f68327d = i10;
                    this.f68329f = i10;
                } else {
                    this.f68324a = true;
                    this.f68325b = sg.bigo.ads.common.w.b.a(ViewCompat.MEASURED_STATE_MASK, 0.3f);
                }
                this.f68328e = sg.bigo.ads.common.w.b.a(this.f68329f, 128);
                iE = bVar.e();
                if (iE != 2 || iE == 4) {
                    this.f68330g = 0;
                    this.f68331h = 0;
                } else {
                    this.f68330g = this.f68325b;
                    this.f68331h = this.f68326c;
                }
                this.f68332i = -1;
                this.f68333j = sg.bigo.ads.common.w.b.a(i10, 0.15f);
                iG = bVar.g();
                if (iG != 2) {
                    this.f68334k = -14972829;
                    this.f68335l = 0;
                } else if (iG != 3) {
                    this.f68334k = -16736769;
                    this.f68335l = 0;
                } else {
                    this.f68334k = DefaultTimeBar.DEFAULT_UNPLAYED_COLOR;
                    this.f68335l = -1;
                }
            }
            this.f68324a = false;
            this.f68325b = ViewCompat.MEASURED_STATE_MASK;
            this.f68326c = sg.bigo.ads.common.w.b.a(-1, 0.15f);
            this.f68327d = -1;
            this.f68329f = -1;
            this.f68328e = sg.bigo.ads.common.w.b.a(this.f68329f, 128);
            iE = bVar.e();
            if (iE != 2) {
                this.f68330g = 0;
                this.f68331h = 0;
            } else {
                this.f68330g = 0;
                this.f68331h = 0;
            }
            this.f68332i = -1;
            this.f68333j = sg.bigo.ads.common.w.b.a(i10, 0.15f);
            iG = bVar.g();
            if (iG != 2) {
                this.f68334k = -14972829;
                this.f68335l = 0;
            } else if (iG != 3) {
                this.f68334k = -16736769;
                this.f68335l = 0;
            } else {
                this.f68334k = DefaultTimeBar.DEFAULT_UNPLAYED_COLOR;
                this.f68335l = -1;
            }
        }

        public /* synthetic */ a(b bVar, byte b10) {
            this(bVar);
        }
    }

    public b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.f68312b = i10;
        this.f68313c = i11;
        this.f68314d = i12;
        this.f68315e = i13;
        this.f68316f = i14;
        this.f68317g = i15;
        this.f68318h = i16;
        this.f68319i = i17;
        this.f68320j = i18;
        this.f68322l = i19;
        this.f68323m = i20;
    }

    public static int a(b bVar) {
        if (bVar == null) {
            return 0;
        }
        if (bVar.a()) {
            return 1;
        }
        int iE = bVar.e();
        if (iE == 3 || iE == 4) {
            return 2;
        }
        if (iE != 5) {
            return iE != 6 ? 4 : 6;
        }
        return 3;
    }

    public static boolean b(b bVar) {
        return bVar == null || bVar.d() == 0;
    }

    public boolean a() {
        return false;
    }

    public int b() {
        return 9;
    }

    @NonNull
    public final a c() {
        return this.f68321k;
    }

    public final int d() {
        int i10 = this.f68312b;
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 0;
    }

    public int e() {
        int i10 = this.f68313c;
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return i10;
        }
        return 1;
    }

    public int f() {
        int i10 = this.f68313c;
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return i10;
        }
        return 1;
    }

    public final int g() {
        int i10 = this.f68314d;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 1;
    }

    public final int h() {
        int i10 = this.f68315e;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 1;
    }

    public final int i() {
        return Math.max(1, this.f68316f);
    }

    public final long j() {
        return r.f70030a.a(Math.min(99, Math.max(0, this.f68317g)));
    }

    public final long k() {
        int i10 = this.f68318h;
        return i10 < 0 ? r.f70030a.a(0) : r.f70030a.a(i10);
    }

    public final int l() {
        int i10 = this.f68319i;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 3;
    }

    public final int m() {
        int i10 = this.f68322l;
        if (i10 < 0 || i10 > 4) {
            return 0;
        }
        return i10;
    }

    public final int n() {
        return Math.max(1, this.f68323m);
    }

    public final int o() {
        int i10 = this.f68320j;
        if (i10 < 0) {
            return -1;
        }
        return i10;
    }
}
