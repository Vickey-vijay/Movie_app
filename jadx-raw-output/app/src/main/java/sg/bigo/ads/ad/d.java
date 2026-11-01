package sg.bigo.ads.ad;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d<T extends Ad, U extends sg.bigo.ads.api.core.b> extends c<T, U> {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public d<T, U>.a f67637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f67638z;

    public final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f67644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f67645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f67646h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f67647i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f67648j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f67649k = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67639a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f67640b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f67641c = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f67650l = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f67642d = new Runnable() { // from class: sg.bigo.ads.ad.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                View view;
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f67544i || ((aVar.f67640b && aVar.f67641c) || (view = dVar.f67538c) == null)) {
                    aVar.a();
                    return;
                }
                Rect rect = new Rect();
                boolean z10 = sg.bigo.ads.common.ab.a.a(view, rect) || (d.this.p() && sg.bigo.ads.api.core.a.b(d.this.q()));
                if (z10) {
                    a aVar2 = a.this;
                    if (aVar2.f67639a == -1) {
                        aVar2.f67639a = u.a(view) ? 1 : 0;
                    }
                }
                if (z10) {
                    a aVar3 = a.this;
                    if (!aVar3.f67640b) {
                        a.a(aVar3, rect);
                    }
                    a aVar4 = a.this;
                    if (!aVar4.f67641c) {
                        a.b(aVar4, rect);
                    }
                }
                a aVar5 = a.this;
                if (aVar5.f67640b && aVar5.f67641c) {
                    aVar5.a();
                } else {
                    sg.bigo.ads.common.n.d.a(2, aVar5.f67642d, 500L);
                }
            }
        };

        public a() {
        }

        private float a(@NonNull Rect rect) {
            d dVar = d.this;
            if (dVar.f67538c == null || sg.bigo.ads.api.core.a.b(dVar.f67537b.f69376a.x())) {
                return 0.0f;
            }
            float height = d.this.f67538c.getHeight() * 1.0f * d.this.f67538c.getWidth();
            float fHeight = rect.height() * 1.0f * rect.width();
            if (height <= 0.0f) {
                return 0.0f;
            }
            return fHeight / height;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0052  */
        /* JADX WARN: Code duplicated, block: B:25:0x0057  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        
            if (r0 != 12) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void a(sg.bigo.ads.ad.d.a r7) {
            /*
                boolean r0 = r7.f67650l
                if (r0 != 0) goto L63
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = r0.r()
                r1 = 2
                if (r0 != r1) goto L14
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                long r2 = sg.bigo.ads.ad.d.a(r0)
                goto L1a
            L14:
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                long r2 = sg.bigo.ads.ad.d.b(r0)
            L1a:
                r7.f67644f = r2
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = r0.r()
                if (r0 != r1) goto L2b
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = sg.bigo.ads.ad.d.c(r0)
                goto L31
            L2b:
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = sg.bigo.ads.ad.d.d(r0)
            L31:
                r7.f67646h = r0
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.ad.d.this
                int r0 = r0.q()
                sg.bigo.ads.ad.d r2 = sg.bigo.ads.ad.d.this
                int r2 = r2.r()
                r3 = 0
                r4 = 1000(0x3e8, float:1.401E-42)
                r5 = 1
                if (r0 == r5) goto L54
                if (r0 == r1) goto L52
                r6 = 3
                if (r0 == r6) goto L52
                r6 = 4
                if (r0 == r6) goto L57
                r6 = 12
                if (r0 == r6) goto L54
                goto L59
            L52:
                r3 = r4
                goto L59
            L54:
                if (r2 == r1) goto L57
                goto L52
            L57:
                r3 = 2000(0x7d0, float:2.803E-42)
            L59:
                long r2 = (long) r3
                r7.f67645g = r2
                java.lang.Runnable r0 = r7.f67642d
                sg.bigo.ads.common.n.d.a(r1, r0)
                r7.f67650l = r5
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.d.a.a(sg.bigo.ads.ad.d$a):void");
        }

        public static /* synthetic */ void a(a aVar, Rect rect) {
            float fA;
            if (aVar.f67647i == 0) {
                aVar.f67647i = SystemClock.elapsedRealtime();
            }
            if (aVar.f67649k) {
                fA = 0.0f;
            } else {
                fA = aVar.a(rect);
                View view = d.this.f67538c;
                int i10 = aVar.f67646h;
                if ((view != null && view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0 && (i10 == 0 || ((float) i10) <= 100.0f * fA)) || (sg.bigo.ads.api.core.a.b(d.this.q()) && !d.this.f67543h)) {
                    aVar.f67649k = true;
                }
            }
            long jMax = aVar.f67639a == 1 ? Math.max(r.f70030a.a(1), aVar.f67644f) : aVar.f67644f;
            if (!aVar.f67649k || SystemClock.elapsedRealtime() - aVar.f67647i < jMax) {
                return;
            }
            if (fA == 0.0f) {
                fA = aVar.a(rect);
            }
            d.this.a("show_proportion", q.a("%.4f", Float.valueOf(fA)));
            d.this.a_();
            aVar.f67640b = true;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0057  */
        /* JADX WARN: Code duplicated, block: B:28:0x005e  */
        /* JADX WARN: Code duplicated, block: B:39:0x0071  */
        public static /* synthetic */ void b(a aVar, Rect rect) {
            boolean z10;
            if (aVar.f67648j == 0) {
                aVar.f67648j = SystemClock.elapsedRealtime();
            }
            float fA = aVar.a(rect);
            d dVar = d.this;
            View view = dVar.f67538c;
            int iQ = dVar.q();
            int iR = d.this.r();
            if (view == null || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                z10 = false;
            } else {
                int height = view.getHeight() * view.getWidth();
                if (iQ == 1) {
                    if (iR == 2 ? height <= 242000 ? fA <= 0.5f : fA <= 0.3f : fA <= 0.5f) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else if (iQ != 2) {
                    if (iQ == 3 || iQ == 4) {
                        z10 = true;
                    } else {
                        if (iQ == 12) {
                            if (iR == 2) {
                            }
                        }
                        z10 = false;
                    }
                } else if (height <= 242000 ? fA <= 0.5f : fA <= 0.3f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if ((z10 || (sg.bigo.ads.api.core.a.b(d.this.q()) && !d.this.f67543h)) && SystemClock.elapsedRealtime() - aVar.f67648j >= aVar.f67645g) {
                d.this.d(q.a("%.4f", Float.valueOf(fA)));
                aVar.f67641c = true;
            }
        }

        public final void a() {
            sg.bigo.ads.common.n.d.a(this.f67642d);
            this.f67650l = false;
        }

        public final void a(final View view, boolean z10) {
            d.this.f67538c = view;
            if (view == null) {
                return;
            }
            if (z10) {
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.d.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.a(a.this);
                    }
                });
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.d.a.3
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                        a.a(a.this);
                        view.removeOnAttachStateChangeListener(this);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                        a.this.a();
                    }
                });
            }
        }
    }

    public d(@NonNull f fVar) {
        super(fVar);
        this.f67638z = false;
        this.f67637y = new a();
    }

    public static /* synthetic */ long a(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f67537b.f69376a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0L;
        }
        return bVarAA.b();
    }

    public static /* synthetic */ long b(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f67537b.f69376a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0L;
        }
        return bVarAA.d();
    }

    public static /* synthetic */ int c(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f67537b.f69376a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0;
        }
        return bVarAA.a();
    }

    public static /* synthetic */ int d(d dVar) {
        n.b bVarAA;
        sg.bigo.ads.api.core.b bVar = dVar.f67537b.f69376a;
        if (!(bVar instanceof n) || (bVarAA = ((n) bVar).aA()) == null) {
            return 0;
        }
        return bVarAA.c();
    }

    @Override // sg.bigo.ads.ad.c
    public void a() {
        super.a();
        this.f67637y.a();
        this.f67638z = false;
        this.f67637y = new a();
    }

    public final void a(View view, boolean z10) {
        this.f67637y.a(view, z10);
    }

    public final void d(String str) {
        if (this.f67638z) {
            return;
        }
        this.f67638z = true;
        String strJ = j();
        int iIntValue = ((Integer) b("render_style", 0)).intValue();
        if (a("06002029")) {
            sg.bigo.ads.core.d.b.a(this, str, strJ, iIntValue);
        }
        sg.bigo.ads.api.b.a aVar = this.f69340aa;
        if (aVar != null) {
            aVar.a(str, strJ, iIntValue);
        }
    }

    @Override // sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.f67637y.a();
    }

    @Override // sg.bigo.ads.ad.c
    @CallSuper
    public final void m() {
        super.m();
        this.f67637y.a();
    }
}
