package sg.bigo.ads.ad.b.a.a;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.b.e;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends sg.bigo.ads.ad.b.b implements e {
    public sg.bigo.ads.ad.b.b I;
    public sg.bigo.ads.api.b.d.a<NativeAd> J;
    public final Object K;
    public final LinkedHashMap<sg.bigo.ads.ad.b.b, a> L;
    public final AtomicInteger O;
    public sg.bigo.ads.ad.b.a.a.a P;
    public boolean Q;
    public boolean R;
    public final int S;
    public final AtomicInteger T;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private sg.bigo.ads.api.b.d.a<NativeAd> f67376ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private final AtomicInteger f67377ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private final AtomicInteger f67378af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private final AtomicInteger f67379ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private final int f67380ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private boolean f67381ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private final sg.bigo.ads.api.b.d.a<NativeAd> f67382aj;

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f67387d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f67388e = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f67384a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f67385b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f67386c = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f67389f = false;
    }

    public b(@NonNull f fVar, int i10) {
        super(fVar);
        this.K = new Object();
        LinkedHashMap<sg.bigo.ads.ad.b.b, a> linkedHashMap = new LinkedHashMap<>();
        this.L = linkedHashMap;
        this.f67377ae = new AtomicInteger(0);
        this.O = new AtomicInteger(0);
        this.Q = false;
        this.R = false;
        this.f67378af = new AtomicInteger(0);
        this.f67379ag = new AtomicInteger(0);
        this.T = new AtomicInteger(0);
        this.f67382aj = new sg.bigo.ads.api.b.d.a<NativeAd>() { // from class: sg.bigo.ads.ad.b.a.a.b.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // sg.bigo.ads.api.b.d.a
            public void a(NativeAd nativeAd) {
                if (nativeAd instanceof sg.bigo.ads.ad.b.b) {
                    b.this.a(true, (sg.bigo.ads.ad.b.b) nativeAd);
                }
            }

            private void b(NativeAd nativeAd) {
                b.this.f67377ae.addAndGet(1);
                if (nativeAd instanceof sg.bigo.ads.ad.b.b) {
                    b.this.a(false, (sg.bigo.ads.ad.b.b) nativeAd);
                }
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2, int i11, int i12, String str) {
                b((NativeAd) ad2);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2, boolean z10, int i11, int i12, String str, boolean z11) {
                NativeAd nativeAd = (NativeAd) ad2;
                if (nativeAd instanceof sg.bigo.ads.ad.b.c) {
                    sg.bigo.ads.ad.b.c cVar = (sg.bigo.ads.ad.b.c) nativeAd;
                    if (((sg.bigo.ads.core.a.a) cVar.f()).bh() != null || z10) {
                        a((NativeAd) cVar);
                    } else if (z11) {
                        b(cVar);
                    }
                }
            }
        };
        this.f67380ah = i10;
        sg.bigo.ads.api.core.b bVar = fVar.f69376a;
        int iW = bVar.w();
        if (i10 == 3) {
            HashMap map = new HashMap();
            map.put("video_play_page", "ad1_video_page");
            map.put("endpage", "ad1_end_page");
            bVar.a(bVar.e().a(map));
        }
        if (bVar instanceof n) {
            ((n) bVar).l(1);
        }
        a(iW, fVar.a(bVar));
        List<sg.bigo.ads.api.core.b> listAm = bVar.am();
        if (listAm != null && !listAm.isEmpty()) {
            sg.bigo.ads.api.core.b bVar2 = listAm.get(0);
            if (bVar.e() != null && i10 == 3) {
                HashMap map2 = new HashMap();
                map2.put("video_play_page", "ad2_video_page");
                map2.put("endpage", "ad2_end_page");
                bVar2.a(bVar.e().a(map2));
            }
            int iW2 = bVar2.w();
            if (bVar2 instanceof n) {
                ((n) bVar2).l(2);
            }
            a(iW2, fVar.a(bVar2));
        }
        this.S = linkedHashMap.size();
    }

    private void a(int i10, f fVar) {
        if (i10 == 1) {
            this.L.put(new c(fVar, this), new a());
        } else if (i10 == 2) {
            this.L.put(new d(fVar, this), new a());
        }
    }

    public final sg.bigo.ads.ad.b.b G() {
        sg.bigo.ads.ad.b.b key;
        synchronized (this.K) {
            key = null;
            for (Map.Entry<sg.bigo.ads.ad.b.b, a> entry : this.L.entrySet()) {
                if (!entry.getKey().p() && entry.getValue().f67384a) {
                    key = entry.getKey();
                    entry.getValue().f67389f = true;
                    break;
                }
            }
        }
        return key;
    }

    public final void H() {
        sg.bigo.ads.ad.b.b bVar = this.I;
        if (bVar == null || bVar.f67544i) {
            return;
        }
        bVar.destroy();
    }

    @Override // sg.bigo.ads.api.b.e
    public final void K() {
        AdInteractionListener adInteractionListener = this.f67536a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
    }

    @Override // sg.bigo.ads.api.b.e
    public final int L() {
        return this.f67380ah;
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i10) {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(i10);
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void a(sg.bigo.ads.api.b.a aVar) {
        super.a(aVar);
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(aVar);
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull sg.bigo.ads.api.b.d.a<NativeAd> aVar, int i10) {
        this.f67376ad = aVar;
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(this.f67382aj, i10);
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(boolean z10) {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0049 A[Catch: all -> 0x0068, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x0014, B:13:0x001b, B:15:0x0023, B:16:0x0027, B:18:0x002b, B:20:0x0034, B:22:0x0038, B:24:0x0041, B:26:0x0045, B:32:0x0066, B:27:0x0049, B:29:0x004d, B:31:0x005b), top: B:37:0x0005 }] */
    public final void a(boolean z10, sg.bigo.ads.ad.b.b bVar) {
        sg.bigo.ads.api.b.d.a<NativeAd> aVar;
        sg.bigo.ads.ad.b.a.a.a aVar2;
        synchronized (this.K) {
            if (z10) {
                if (this.f67376ad != null) {
                    a aVar3 = this.L.get(bVar);
                    boolean z11 = aVar3 != null && aVar3.f67384a;
                    int iAddAndGet = this.O.addAndGet(1);
                    if (aVar3 != null) {
                        aVar3.f67384a = true;
                        aVar3.f67387d = iAddAndGet;
                    }
                    if (!this.f67381ai) {
                        this.f67381ai = true;
                        this.f67376ad.a(bVar);
                    }
                    if (!z11 && (aVar2 = this.P) != null) {
                        aVar2.a(bVar, this.f67537b.f69377b);
                    }
                    if (!z11 && (aVar = this.J) != null) {
                        aVar.a(bVar);
                    }
                } else if (this.f67376ad != null && this.L.size() == this.f67377ae.get()) {
                    this.f67376ad.a(bVar, 1023, 10205, "Double video empty ads.");
                }
            } else if (this.f67376ad != null) {
                this.f67376ad.a(bVar, 1023, 10205, "Double video empty ads.");
            }
            throw th;
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(boolean z10, boolean z11) {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().a(z10, z11);
        }
    }

    @Override // sg.bigo.ads.api.b.e
    public final int b(sg.bigo.ads.api.b.a aVar) {
        a aVar2;
        if (!(aVar instanceof sg.bigo.ads.ad.b.b) || (aVar2 = this.L.get(aVar)) == null) {
            return 0;
        }
        if (aVar2.f67386c <= 0) {
            aVar2.f67386c = this.f67379ag.incrementAndGet();
        }
        return aVar2.f67386c;
    }

    @Override // sg.bigo.ads.ad.c
    @NonNull
    public final <ValueType> ValueType b(String str, ValueType valuetype) {
        sg.bigo.ads.ad.b.b bVar = this.I;
        return bVar != null ? (ValueType) bVar.b(str, valuetype) : (ValueType) super.b(str, valuetype);
    }

    @Override // sg.bigo.ads.api.b.a
    public final void b(int i10) {
        sg.bigo.ads.ad.b.b bVar = this.I;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void b(Activity activity) {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().b(activity);
        }
    }

    @Override // sg.bigo.ads.ad.b.d
    public final void b(boolean z10) {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().b(z10);
        }
    }

    @Override // sg.bigo.ads.api.b.e
    public final int c(sg.bigo.ads.api.b.a aVar) {
        b(aVar);
        a aVar2 = this.L.get(aVar);
        if (aVar2 == null) {
            return 0;
        }
        if (aVar2.f67385b <= 0) {
            aVar2.f67385b = this.f67378af.incrementAndGet();
        }
        return aVar2.f67385b;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        H();
        Iterator<sg.bigo.ads.ad.b.b> it = this.L.keySet().iterator();
        while (it.hasNext()) {
            sg.bigo.ads.core.player.b.a().a(((sg.bigo.ads.core.a.a) it.next().f()).aJ());
        }
        this.L.clear();
        this.I = null;
        this.J = null;
    }

    public final sg.bigo.ads.ad.b.b e(int i10) {
        if (this.O.get() == this.S) {
            return f(i10);
        }
        sg.bigo.ads.ad.b.b key = null;
        for (Map.Entry<sg.bigo.ads.ad.b.b, a> entry : this.L.entrySet()) {
            a value = entry.getValue();
            if (!value.f67389f && value.f67384a) {
                value.f67389f = true;
                key = entry.getKey();
                break;
            }
        }
        if (key != null) {
            return key;
        }
        for (Map.Entry<sg.bigo.ads.ad.b.b, a> entry2 : this.L.entrySet()) {
            a value2 = entry2.getValue();
            if (!value2.f67389f) {
                value2.f67389f = true;
                return entry2.getKey();
            }
        }
        return key;
    }

    public final sg.bigo.ads.ad.b.b f(int i10) {
        if (i10 > this.L.size() - 1) {
            return null;
        }
        int i11 = 0;
        for (sg.bigo.ads.ad.b.b bVar : this.L.keySet()) {
            if (i11 == i10) {
                return bVar;
            }
            i11++;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.a
    @NonNull
    public final /* bridge */ /* synthetic */ sg.bigo.ads.api.core.b f() {
        sg.bigo.ads.ad.b.b bVar = this.I;
        return (sg.bigo.ads.core.a.a) (bVar != null ? bVar.f() : super.f());
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    @Nullable
    public final AdBid getBid() {
        sg.bigo.ads.ad.b.b bVarF = f(0);
        if (bVarF != null) {
            return bVarF.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        sg.bigo.ads.ad.b.b bVarF = f(0);
        if (bVarF != null) {
            return bVarF.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.c
    public final boolean p() {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().p()) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(adInteractionListener);
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().setAdInteractionListener(adInteractionListener);
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void u() {
        Iterator<Map.Entry<sg.bigo.ads.ad.b.b, a>> it = this.L.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().u();
        }
    }
}
