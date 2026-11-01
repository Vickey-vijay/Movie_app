package sg.bigo.ads.ad.interstitial.e;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f68341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.e.a.a f68342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.e.a.c f68343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.h.a f68344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconAds f68345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f68346f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f68348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f68349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.e.a f68350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.e.a f68351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f68352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f68353m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f68347g = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f68354n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f68355o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f68356p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<NativeAd> f68357q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<NativeAd> f68358r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map<Integer, Boolean> f68359s = new ConcurrentHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map<Integer, Boolean> f68360t = new ConcurrentHashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List<Integer> f68361u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<Integer> f68362v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final sg.bigo.ads.api.d f68363w = new sg.bigo.ads.api.d() { // from class: sg.bigo.ads.ad.interstitial.e.c.1
        private int a(@NonNull NativeAd nativeAd, @NonNull List<NativeAd> list) {
            c cVar = c.this;
            int iA = sg.bigo.ads.ad.interstitial.e.a.b.a(cVar.f68356p ? cVar.f68342b : cVar.f68343c);
            int iIndexOf = list.indexOf(nativeAd);
            if (iA == 0) {
                return 0;
            }
            return iIndexOf / iA;
        }

        @Override // sg.bigo.ads.api.d
        public final void a(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.ad.interstitial.e.a.b bVar;
            List<Integer> list;
            List<NativeAd> list2;
            Map<Integer, Boolean> map;
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad impression.");
            c cVar = c.this;
            if (cVar.f68356p) {
                bVar = cVar.f68342b;
                list = cVar.f68361u;
                list2 = cVar.f68357q;
                map = cVar.f68359s;
            } else {
                bVar = cVar.f68343c;
                list = cVar.f68362v;
                list2 = cVar.f68358r;
                map = cVar.f68360t;
            }
            c.a(bVar, list, list2, map, a(nativeAd, list2));
        }

        @Override // sg.bigo.ads.api.d
        public final void a(@NonNull NativeAd nativeAd, @NonNull AdError adError) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad error, code=" + adError.getCode() + ", message=" + adError.getMessage());
        }

        @Override // sg.bigo.ads.api.d
        public final void b(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
            n nVar = c.this.f68352l;
            if (nVar != null) {
                nVar.b();
                c.this.f68352l = null;
            }
            n nVar2 = c.this.f68353m;
            if (nVar2 != null) {
                nVar2.b();
                c.this.f68353m = null;
            }
        }

        @Override // sg.bigo.ads.api.d
        public final void c(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
        }

        @Override // sg.bigo.ads.api.d
        public final void d(@NonNull NativeAd nativeAd) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "ad click.");
        }
    };

    public static class a implements IconAdsRequest.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68374a;

        private a() {
            this.f68374a = 1;
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        @Override // sg.bigo.ads.api.IconAdsRequest.b
        public final int a() {
            return this.f68374a;
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f68375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f68376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final ViewGroup f68377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final sg.bigo.ads.ad.interstitial.e.a.b f68378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f68379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f68380f;

        private b(@NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar) {
            this.f68377c = viewGroup;
            this.f68378d = bVar;
            this.f68375a = 0L;
            this.f68376b = false;
            this.f68379e = false;
            this.f68380f = false;
        }

        public /* synthetic */ b(ViewGroup viewGroup, sg.bigo.ads.ad.interstitial.e.a.b bVar, byte b10) {
            this(viewGroup, bVar);
        }

        public final ValueAnimator a(@Nullable Integer num) {
            if (num == null) {
                return null;
            }
            return sg.bigo.ads.common.w.b.a(this.f68377c, num.intValue(), new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f68381a = 300;

                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return this.f68381a;
                }
            });
        }

        public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable Integer num, final sg.bigo.ads.ad.interstitial.e.a aVar) {
            u.b(view);
            viewGroup.addView(view);
            sg.bigo.ads.common.e.a.a(view, 100.0f);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(12);
            } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
            }
            final ValueAnimator valueAnimatorA = a(num);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.1f, 1, 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setAnimationListener(new sg.bigo.ads.common.utils.b.d() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.2
                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    b.this.a(aVar);
                }

                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    ValueAnimator valueAnimator = valueAnimatorA;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            });
            view.startAnimation(translateAnimation);
        }

        public void a(final sg.bigo.ads.ad.interstitial.e.a aVar) {
            if (aVar != null && aVar.f68311c > 0) {
                aVar.f68310b.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.ad.interstitial.e.a aVar2 = aVar;
                        aVar2.f68310b.setFlipInterval(aVar2.f68311c);
                        aVar.f68310b.c();
                    }
                });
            }
        }

        public abstract boolean a();

        public final void b() {
            this.f68376b = true;
            this.f68379e = false;
            this.f68377c.removeCallbacks(this);
        }

        public final void c() {
            this.f68379e = false;
            this.f68380f = true;
            this.f68377c.removeCallbacks(this);
        }

        public final boolean d() {
            if (this.f68376b || this.f68379e) {
                return false;
            }
            this.f68379e = true;
            this.f68380f = false;
            if (this.f68375a == 0) {
                this.f68375a = SystemClock.elapsedRealtime();
            }
            this.f68377c.postDelayed(this, Math.max(this.f68378d.j() - (SystemClock.elapsedRealtime() - this.f68375a), 0L));
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f68376b && !this.f68380f && a()) {
                this.f68376b = true;
            }
            this.f68379e = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NonNull s sVar, @NonNull m mVar, @Nullable sg.bigo.ads.ad.interstitial.h.a aVar) {
        this.f68341a = sVar;
        this.f68342b = new sg.bigo.ads.ad.interstitial.e.a.a(mVar);
        this.f68343c = new sg.bigo.ads.ad.interstitial.e.a.c(mVar, aVar == null || aVar.g());
        this.f68344d = aVar;
    }

    public static /* synthetic */ List a(IconAds iconAds) {
        if (!(iconAds instanceof sg.bigo.ads.ad.a.a)) {
            if (iconAds != null) {
                return Arrays.asList(iconAds.getNativeAds());
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (sg.bigo.ads.ad.b.a.c cVar : ((sg.bigo.ads.ad.a.a) iconAds).f67326a) {
            if (!cVar.isExpired() && !cVar.f67544i) {
                if (cVar.I) {
                    arrayList.add(cVar);
                } else if (!cVar.J) {
                    arrayList2.add(cVar);
                }
            }
        }
        arrayList.addAll(arrayList2);
        sg.bigo.ads.ad.b.a.c[] cVarArr = new sg.bigo.ads.ad.b.a.c[arrayList.size()];
        sg.bigo.ads.common.utils.k.a(arrayList, cVarArr);
        return Arrays.asList(cVarArr);
    }

    public static /* synthetic */ n a(c cVar, final sg.bigo.ads.ad.interstitial.e.a.b bVar, final List list) {
        int iO;
        if (bVar == null || !bVar.a() || (iO = bVar.o()) < 0) {
            return null;
        }
        return new n(r.f70030a.a(iO)) { // from class: sg.bigo.ads.ad.interstitial.e.c.5
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                NativeAd nativeAd = (NativeAd) list.get(0);
                if (nativeAd instanceof sg.bigo.ads.ad.b.b) {
                    sg.bigo.ads.ad.b.a.c cVar2 = (sg.bigo.ads.ad.b.a.c) nativeAd;
                    if (cVar2.f67542g) {
                        return;
                    }
                    cVar2.a((sg.bigo.ads.common.i) null, bVar.b(), 22);
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public static /* synthetic */ void a(sg.bigo.ads.ad.interstitial.e.a.b bVar, List list, List list2, Map map, int i10) {
        int i11;
        if (bVar == null || sg.bigo.ads.common.utils.k.a((Collection) list2) || i10 < 0) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(map.get(Integer.valueOf(i10)))) {
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "tryEarlyIconImpTracker, showIconListIndex has handled, return");
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "tryEarlyIconImpTracker, showIconListIndex=".concat(String.valueOf(i10)));
        map.put(Integer.valueOf(i10), bool);
        boolean z10 = i10 == 0;
        int iM = bVar.m();
        if (iM == 0) {
            i11 = 0;
        } else {
            int iA = sg.bigo.ads.ad.interstitial.e.a.b.a(bVar);
            int iN = bVar.n();
            if (iM != 1) {
                if (iM != 2) {
                    if (iM == 3) {
                        i11 = iA + iN;
                    } else if (iM != 4) {
                        i11 = 0;
                    } else {
                        i11 = iA * iN;
                    }
                } else if (z10) {
                    i11 = iA * iN;
                } else {
                    i11 = 0;
                }
            } else if (z10) {
                i11 = iN + iA;
            } else {
                i11 = 0;
            }
        }
        sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", "tryEarlyIconImpTracker, earlyImpTrackingNum=".concat(String.valueOf(i11)));
        if (i11 > 0) {
            while (list.size() <= i10) {
                list.add(0);
            }
            list.set(i10, i10 > 0 ? Integer.valueOf(((Integer) list.get(i10 - 1)).intValue() + i11) : Integer.valueOf(i11));
            int iIntValue = i10 > 0 ? ((Integer) list.get(i10 - 1)).intValue() : 0;
            int iMin = Math.min(i11 + iIntValue, list2.size());
            StringBuilder sb2 = new StringBuilder("tryEarlyIconImpTracker, handle ads from index ");
            sb2.append(iIntValue);
            sb2.append(" to ");
            sb2.append(iMin - 1);
            sg.bigo.ads.common.t.a.a(0, 3, "IconAdsMgr", sb2.toString());
            while (iIntValue < iMin) {
                NativeAd nativeAd = (NativeAd) list2.get(iIntValue);
                if (nativeAd instanceof sg.bigo.ads.ad.b.a.c) {
                    sg.bigo.ads.ad.b.a.c cVar = (sg.bigo.ads.ad.b.a.c) nativeAd;
                    sg.bigo.ads.core.e.a.b bVar2 = cVar.f67539d;
                    if (!(bVar2 instanceof sg.bigo.ads.core.e.a.a ? ((sg.bigo.ads.core.e.a.a) bVar2).f71266a.get() : false)) {
                        sg.bigo.ads.core.e.a.b bVar3 = cVar.f67539d;
                        if (bVar3 instanceof sg.bigo.ads.core.e.a.a) {
                            sg.bigo.ads.core.e.a.a aVar = (sg.bigo.ads.core.e.a.a) bVar3;
                            if (aVar.f71266a.get()) {
                                sg.bigo.ads.common.t.a.a(0, 3, "IconAds", "tryTrackerImpressionEarly: Impression already tracked.");
                            } else {
                                aVar.a(cVar.f67537b.f69380e, 0);
                            }
                        }
                    }
                }
                iIntValue++;
            }
        }
    }

    public static void a(sg.bigo.ads.ad.interstitial.e.a aVar, b bVar) {
        if (aVar != null) {
            aVar.f68310b.d();
        } else if (bVar != null) {
            bVar.c();
        }
    }

    public static /* synthetic */ void a(c cVar, int i10) {
        Ad ad2 = cVar.f68345e;
        if (ad2 instanceof sg.bigo.ads.api.b.g) {
            ((sg.bigo.ads.api.b.g) ad2).f69343b = i10;
        }
    }

    public static /* synthetic */ void a(c cVar, sg.bigo.ads.ad.interstitial.e.a.b bVar, int i10, List list) {
        if (bVar == null || list == null) {
            return;
        }
        sg.bigo.ads.core.d.b.a(cVar.f68341a.f(), i10, bVar.i(), cVar.f68355o, list.size(), bVar.f(), bVar.a());
    }

    public static /* synthetic */ void a(c cVar, boolean z10) {
        Ad ad2 = cVar.f68345e;
        if (ad2 instanceof sg.bigo.ads.api.b.g) {
            ((sg.bigo.ads.api.b.g) ad2).f69344c = z10;
        }
    }

    public static void b(sg.bigo.ads.ad.interstitial.e.a aVar, b bVar) {
        if (aVar == null) {
            if (bVar != null) {
                bVar.d();
            }
        } else {
            int i10 = aVar.f68311c;
            if (i10 > 0) {
                aVar.f68310b.setFlipInterval(i10);
                aVar.f68310b.c();
            }
        }
    }

    private void d() {
        b();
        sg.bigo.ads.ad.interstitial.e.a aVar = this.f68350j;
        if (aVar != null) {
            aVar.f68310b.d();
            u.b(this.f68350j.f68309a);
        }
        this.f68350j = null;
    }

    public final void a(ViewGroup viewGroup, final int i10) {
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) this.f68341a.f(), i10);
        this.f68356p = true;
        if (viewGroup == null) {
            a(this.f68342b, "endPageView is null", i10);
            return;
        }
        if (sg.bigo.ads.ad.interstitial.e.a.b.b(this.f68342b)) {
            a(this.f68342b, "config is invalid", i10);
            return;
        }
        if (!a(i10)) {
            a(this.f68342b, "icon request hasScene return false", i10);
            return;
        }
        d();
        b bVar = new b(viewGroup, this.f68342b) { // from class: sg.bigo.ads.ad.interstitial.e.c.3
            {
                byte b10 = 0;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0059  */
            @Override // sg.bigo.ads.ad.interstitial.e.c.b
            public final boolean a() {
                ViewGroup viewGroup2;
                c cVar;
                sg.bigo.ads.ad.interstitial.e.a.a aVar;
                int i11;
                String str;
                sg.bigo.ads.ad.interstitial.e.a.a aVar2;
                int i12;
                String str2;
                c cVar2 = c.this;
                boolean z10 = false;
                if (cVar2.f68345e == null) {
                    aVar2 = cVar2.f68342b;
                    i12 = i10;
                    str2 = "icon ads is null";
                } else {
                    if (!cVar2.f68354n) {
                        if (cVar2.a()) {
                            cVar = c.this;
                            aVar = cVar.f68342b;
                            i11 = i10;
                            str = "host ad is destroyed";
                        } else {
                            List listA = c.a(c.this.f68345e);
                            if (!sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                                boolean zA = c.this.f68342b.a();
                                c cVar3 = c.this;
                                int i13 = i10;
                                if (i13 != 1) {
                                    sg.bigo.ads.ad.interstitial.e.a.a aVar3 = cVar3.f68342b;
                                    if (aVar3 != null && zA) {
                                        int iD = aVar3.d();
                                        if ((i13 == 4 && iD == 1) || (i13 == 8 && (iD == 1 || iD == 2))) {
                                            z10 = true;
                                        }
                                    }
                                } else {
                                    z10 = true;
                                }
                                if (!z10) {
                                    cVar = c.this;
                                    aVar = cVar.f68342b;
                                    i11 = i10;
                                    str = "icon ads can not show in this scene";
                                } else if (u.c(this.f68377c) && u.d(this.f68377c)) {
                                    c.a(c.this, i10);
                                    c cVar4 = c.this;
                                    Context context = this.f68377c.getContext();
                                    c cVar5 = c.this;
                                    cVar4.f68350j = sg.bigo.ads.ad.interstitial.e.a.a(context, cVar5.f68342b, listA, cVar5.f68357q);
                                    c.a(c.this, zA);
                                    ViewGroup viewGroup3 = this.f68377c;
                                    if (zA && (viewGroup2 = (ViewGroup) viewGroup3.findViewById(R.id.word_icon_container)) != null) {
                                        viewGroup3 = viewGroup2;
                                    }
                                    sg.bigo.ads.ad.interstitial.e.a aVar4 = c.this.f68350j;
                                    a(viewGroup3, aVar4.f68309a, null, aVar4);
                                    c cVar6 = c.this;
                                    cVar6.f68352l = c.a(cVar6, cVar6.f68342b, cVar6.f68357q);
                                    n nVar = c.this.f68352l;
                                    if (nVar != null) {
                                        nVar.c();
                                    }
                                    c.a(c.this, this.f68378d, i10, listA);
                                }
                                c.this.b();
                                return true;
                            }
                            cVar = c.this;
                            aVar = cVar.f68342b;
                            i11 = i10;
                            str = "icon ads download failed";
                        }
                        cVar.a(aVar, str, i11);
                        c.this.b();
                        return true;
                    }
                    aVar2 = cVar2.f68342b;
                    i12 = i10;
                    str2 = "page is Paused";
                }
                cVar2.a(aVar2, str2, i12);
                return false;
            }
        };
        this.f68348h = bVar;
        bVar.d();
    }

    public final void a(sg.bigo.ads.ad.interstitial.e.a.b bVar, String str, int i10) {
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a(this.f68341a.f(), str, i10, bVar.i(), this.f68355o, bVar.f());
        }
    }

    public final boolean a() {
        s sVar = this.f68341a;
        return sVar.f67544i || sVar.H().f67544i;
    }

    public final boolean a(int i10) {
        return (this.f68346f & i10) == i10;
    }

    public final void b() {
        b bVar = this.f68348h;
        if (bVar != null) {
            bVar.b();
        }
        this.f68348h = null;
    }

    public final void c() {
        b bVar = this.f68349i;
        if (bVar != null) {
            bVar.b();
        }
        this.f68349i = null;
    }
}
