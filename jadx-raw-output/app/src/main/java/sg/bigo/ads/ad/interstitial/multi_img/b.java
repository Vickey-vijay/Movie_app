package sg.bigo.ads.ad.interstitial.multi_img;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.p.h;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f68652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f68653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f68655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f68656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<a> f68657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f68658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.b.b f68659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashSet<String> f68660i = new HashSet<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f68667b;

        private a(String str) {
            this.f68666a = str;
            this.f68667b = 0;
        }

        public /* synthetic */ a(String str, byte b10) {
            this(str);
        }
    }

    private b(@NonNull sg.bigo.ads.ad.b.b bVar, m mVar, d dVar, int i10, c cVar, boolean z10, boolean z11, List<a> list) {
        this.f68659h = bVar;
        this.f68652a = mVar;
        this.f68653b = dVar;
        this.f68655d = cVar;
        this.f68654c = z10;
        this.f68656e = z11;
        this.f68657f = list;
        this.f68658g = i10;
    }

    @Nullable
    public static b a(sg.bigo.ads.ad.b.b bVar, m mVar) {
        if (bVar == null || mVar == null) {
            return null;
        }
        switch (mVar.a("endpage.ad_component_layout")) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return a(bVar, mVar, mVar.a("endpage.multi_img_load"), d.a(mVar.a("endpage.multi_img")), c.a(mVar.a("endpage.multi_render_way")), true, true);
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000b A[PHI: r4
  0x000b: PHI (r4v12 java.util.ArrayList) = (r4v3 java.util.ArrayList), (r4v3 java.util.ArrayList), (r4v0 java.util.ArrayList) binds: [B:40:0x00ae, B:42:0x00b2, B:4:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    @NonNull
    private static b a(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull m mVar, int i10, d dVar, c cVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        byte b10 = 0;
        ArrayList arrayList2 = null;
        if (dVar != d.NONE || z11) {
            sg.bigo.ads.api.core.b.d popPage = bVar.getPopPage();
            if (popPage != null) {
                String[] strArrE = popPage.e();
                if (!k.a(strArrE)) {
                    arrayList2 = new ArrayList();
                    for (String str : strArrE) {
                        arrayList2.add(new a(str, b10));
                    }
                }
            }
            if (k.a((Collection) arrayList2) && (z10 || z11)) {
                arrayList2 = new ArrayList();
                n.a[] aVarArrAx = ((sg.bigo.ads.core.a.a) bVar.f()).ax();
                for (int i11 = 0; !k.a(aVarArrAx) && i11 < aVarArrAx.length; i11++) {
                    n.a aVar = aVarArrAx[i11];
                    if (aVar != null && !q.a((CharSequence) aVar.c())) {
                        arrayList2.add(new a(aVarArrAx[i11].c(), b10));
                    }
                }
            }
            if (k.a((Collection) arrayList2) && ((z10 || z11) && ((sg.bigo.ads.core.a.a) bVar.f()).aR())) {
                ArrayList arrayList3 = new ArrayList();
                String strAz = ((sg.bigo.ads.core.a.a) bVar.f()).az();
                if (!q.a((CharSequence) strAz)) {
                    arrayList3.add(new a(strAz, b10));
                }
                arrayList2 = arrayList3;
            }
            if (k.a((Collection) arrayList2) && (z10 || z11)) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        d dVar2 = (!k.a((Collection) arrayList2) || z12) ? dVar : d.NONE;
        if (dVar == d.NONE && z11) {
            if (k.a((Collection) arrayList2)) {
                z13 = true;
            } else {
                arrayList = new ArrayList(arrayList2.subList(0, 1));
                z13 = z12;
            }
            return new b(bVar, mVar, dVar2, i10, cVar, z10, z13, arrayList);
        }
        z13 = z12;
        arrayList = arrayList2;
        return new b(bVar, mVar, dVar2, i10, cVar, z10, z13, arrayList);
    }

    @Nullable
    public static b b(sg.bigo.ads.ad.b.b bVar, @NonNull m mVar) {
        d dVar;
        c cVar;
        int iA;
        if (bVar == null || mVar == null) {
            return null;
        }
        int iA2 = mVar.a("video_play_page.multi_img_load");
        switch (mVar.a("video_play_page.ad_component_layout")) {
            case 13:
            case 18:
                dVar = d.TILE;
                cVar = c.FILL_MATCH_SELF;
                iA = 1;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                d dVarA = d.a(mVar.a("video_play_page.multi_img"));
                c cVarA = c.a(mVar.a("video_play_page.multi_render_way"));
                iA = mVar.a("video_play_page.multi_method");
                dVar = dVarA;
                cVar = cVarA;
                break;
            default:
                return null;
        }
        return a(bVar, mVar, iA2, dVar, cVar, iA == 1, false);
    }

    public static b c(sg.bigo.ads.ad.b.b bVar, @NonNull m mVar) {
        return a(bVar, mVar, mVar.a("video_play_page.multi_img_load", 1), d.a(mVar.a("video_play_page.multi_img")), c.FILL_MATCH_SELF, true, false);
    }

    @NonNull
    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        if (k.a((Collection) this.f68657f)) {
            return arrayList;
        }
        Iterator<a> it = this.f68657f.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f68666a);
        }
        return arrayList;
    }

    public final void a(final int i10, final int i11) {
        String str = i10 + "_" + i11;
        if (this.f68660i.contains(str)) {
            return;
        }
        this.f68660i.add(str);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.b.1
            /* JADX WARN: Type inference failed for: r5v0, types: [sg.bigo.ads.api.core.b] */
            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                int i13;
                int i14;
                String[] strArrE;
                int length = 0;
                if (k.a((Collection) b.this.f68657f)) {
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                } else {
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    for (a aVar : b.this.f68657f) {
                        String str2 = aVar.f68666a;
                        if (!sg.bigo.ads.common.p.e.a(b.this.f68659h.f67537b.f69380e, str2)) {
                            if (!h.a.f69886a.a(str2)) {
                                int i18 = aVar.f68667b;
                                if (i18 != 1) {
                                    if (i18 == 2) {
                                        i17++;
                                    }
                                }
                            }
                            i15++;
                        }
                        i16++;
                    }
                    i12 = i15;
                    i13 = i16;
                    i14 = i17;
                }
                ?? F = b.this.f68659h.f();
                int i19 = i10;
                int i20 = i11;
                sg.bigo.ads.api.core.b.d popPage = b.this.f68659h.getPopPage();
                if (popPage != null && (strArrE = popPage.e()) != null) {
                    length = strArrE.length;
                }
                sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) F, i19, i20, length, i12, i13, i14);
            }
        });
    }

    public final void a(String str, int i10) {
        if (k.a((Collection) this.f68657f) || q.a((CharSequence) str)) {
            return;
        }
        for (a aVar : this.f68657f) {
            if (str.equalsIgnoreCase(aVar.f68666a)) {
                aVar.f68667b = i10;
                return;
            }
        }
    }

    public final void b() {
        if (k.a((Collection) this.f68657f)) {
            return;
        }
        for (final a aVar : this.f68657f) {
            String str = aVar.f68666a;
            if (!sg.bigo.ads.common.p.e.a(this.f68659h.f67537b.f69380e, str)) {
                if (h.a.f69886a.a(str)) {
                    return;
                }
                sg.bigo.ads.ad.b.b bVar = this.f68659h;
                sg.bigo.ads.common.p.e.a(bVar.f67537b.f69380e, str, ((sg.bigo.ads.core.a.a) bVar.f()).al(), new g() { // from class: sg.bigo.ads.ad.interstitial.multi_img.b.2
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str2, String str3) {
                        aVar.f68667b = 2;
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        aVar.f68667b = 1;
                    }
                });
            }
        }
    }
}
