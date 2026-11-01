package sg.bigo.ads.controller.loader;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractAdLoader<U extends Ad, T extends sg.bigo.ads.api.b> implements AdLoader<T>, d.a<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Long> f71021a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, List<a>> f71022b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final e<U> f71023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f71024d;

    public abstract class a implements sg.bigo.ads.controller.d<U> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public sg.bigo.ads.api.core.b[] f71070e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public sg.bigo.ads.api.core.b[] f71071f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f71073h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> f71075j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public sg.bigo.ads.api.b f71076k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AbstractAdLoader f71077l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f71068c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f71069d = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f71072g = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f71067a = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Runnable f71078m = new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int i10;
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The request is timeout.");
                a aVar = a.this;
                sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a = aVar.f71075j;
                if (c0725a == null || aVar.f71072g) {
                    return;
                }
                aVar.f71068c = true;
                c0725a.f70792c = true;
                if (c0725a.f70795f == 0) {
                    c0725a.f70795f = c0725a.f70794e;
                }
                if (k.a(aVar.f71070e)) {
                    a aVar2 = a.this;
                    sg.bigo.ads.controller.loader.a.a(aVar2.f71070e, aVar2.f71075j.f70795f);
                    a aVar3 = a.this;
                    if (aVar3.f71068c) {
                        i10 = 2;
                    } else {
                        i10 = aVar3.f71069d ? 4 : 1;
                    }
                    sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a2 = aVar3.f71075j;
                    sg.bigo.ads.controller.loader.a.a(aVar3.f71070e, i10, c0725a2 == null ? 1 : c0725a2.f70795f, true);
                }
                AbstractAdLoader<U, T>.a aVar4 = a.this;
                AbstractAdLoader.this.a(aVar4, 1011, 10206, "Ad request is timeout due to bad network.", new Pair<>(aVar4.f71075j.f70790a, null));
            }
        };

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f71074i = SystemClock.elapsedRealtime();

        public a(AbstractAdLoader abstractAdLoader, sg.bigo.ads.api.b bVar, String str) {
            this.f71073h = str;
            this.f71077l = abstractAdLoader;
            this.f71076k = bVar;
        }

        public final void a() {
            sg.bigo.ads.common.n.d.a(this.f71078m);
            if (this.f71067a) {
                return;
            }
            this.f71067a = true;
            StringBuilder sb2 = new StringBuilder("Remove timeout task for session id: ");
            sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a = this.f71075j;
            sb2.append(c0725a == null ? "unknown" : c0725a.f70790a.f69326h.f69328b);
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", sb2.toString());
        }

        public final String b() {
            sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a = this.f71075j;
            String str = c0725a == null ? null : c0725a.f70790a.f69319a;
            return TextUtils.isEmpty(str) ? this.f71073h : str;
        }
    }

    public interface b<U extends Ad, T extends sg.bigo.ads.api.b> extends d.a<U> {
        AbstractAdLoader<U, T> a();
    }

    public AbstractAdLoader(AdLoadListener<U> adLoadListener, String str) {
        if (adLoadListener == null) {
            this.f71023c = new e<>();
        } else {
            this.f71023c = new e<>(adLoadListener);
        }
        this.f71024d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, AbstractAdLoader<U, T>.a aVar, U u10, int i10, int i11, String str2) {
        if (!TextUtils.isEmpty(str)) {
            f71021a.remove(str);
        }
        aVar.a();
        aVar.f71072g = true;
        b(aVar.b(), aVar);
        if (aVar.f71068c || aVar.f71069d) {
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The error ad has been timeout or assign");
        } else {
            a(str, aVar, sg.bigo.ads.controller.loader.a.a(u10), 0, i10, i11, str2, false, u10);
            a(u10, i10, i11, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final AbstractAdLoader<U, T>.a aVar, final sg.bigo.ads.api.core.b[] bVarArr, final int i10, final int i11, final int i12, final String str2, final boolean z10, final Ad ad2) {
        final boolean z11;
        final String strD;
        h hVar;
        final String strB = TextUtils.isEmpty(str) ? aVar.b() : str;
        if (TextUtils.isEmpty(strB) || (hVar = i.f69318a) == null) {
            z11 = false;
            strD = null;
        } else {
            sg.bigo.ads.api.a.b bVarQ = hVar.q();
            boolean zC = bVarQ.c(strB);
            strD = bVarQ.d(strB);
            z11 = zC;
        }
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.7
            /* JADX WARN: Code duplicated, block: B:100:0x013c  */
            /* JADX WARN: Code duplicated, block: B:103:0x014a  */
            /* JADX WARN: Code duplicated, block: B:106:0x014e  */
            /* JADX WARN: Code duplicated, block: B:112:0x016b  */
            /* JADX WARN: Code duplicated, block: B:117:0x0175  */
            /* JADX WARN: Code duplicated, block: B:119:0x0179  */
            /* JADX WARN: Code duplicated, block: B:122:0x017f  */
            /* JADX WARN: Code duplicated, block: B:123:0x0184  */
            /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
            /* JADX WARN: Code duplicated, block: B:70:0x00da  */
            /* JADX WARN: Code duplicated, block: B:72:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
            /* JADX WARN: Code duplicated, block: B:79:0x00fc  */
            /* JADX WARN: Code duplicated, block: B:81:0x0100  */
            /* JADX WARN: Code duplicated, block: B:82:0x0102  */
            /* JADX WARN: Code duplicated, block: B:87:0x0115  */
            /* JADX WARN: Code duplicated, block: B:88:0x0117  */
            /* JADX WARN: Code duplicated, block: B:90:0x011d  */
            /* JADX WARN: Code duplicated, block: B:92:0x0123  */
            /* JADX WARN: Code duplicated, block: B:93:0x0125  */
            /* JADX WARN: Code duplicated, block: B:96:0x012d  */
            /* JADX WARN: Code duplicated, block: B:97:0x0136  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i13;
                int i14;
                int i15;
                String str3;
                boolean z12;
                int i16;
                int iA;
                sg.bigo.ads.api.core.b bVar;
                g gVarAa;
                a aVar2;
                sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a;
                sg.bigo.ads.api.b bVar2;
                String strC;
                String str4;
                sg.bigo.ads.api.core.b bVar3;
                p pVarY;
                Ad ad3;
                o oVarB_;
                boolean z13;
                boolean z14;
                String str5;
                sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a2;
                sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a3;
                Object[] objArr = !z10 && i12 == 10206;
                if ((i12 == 10213) == true) {
                    i13 = 3;
                } else {
                    a aVar3 = aVar;
                    if (aVar3.f71068c) {
                        i13 = 2;
                    } else {
                        i13 = aVar3.f71069d ? 4 : 1;
                    }
                }
                a aVar4 = aVar;
                sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a4 = aVar4.f71075j;
                int i17 = c0725a4 == null ? 0 : c0725a4.f70795f;
                sg.bigo.ads.api.core.b[] bVarArr2 = bVarArr;
                if (bVarArr2 == null) {
                    bVarArr2 = aVar4.f71070e;
                }
                if (bVarArr2 != null) {
                    sg.bigo.ads.controller.loader.a.a(bVarArr2, i13, i17, false);
                    sg.bigo.ads.api.core.b bVar4 = (sg.bigo.ads.api.core.b) k.b(bVarArr2);
                    boolean zU = bVar4 != null ? bVar4.U() : false;
                    sg.bigo.ads.api.core.b bVar5 = (sg.bigo.ads.api.core.b) k.b(bVarArr2);
                    int iR = bVar5 != null ? bVar5.R() : 0;
                    sg.bigo.ads.api.core.b bVar6 = (sg.bigo.ads.api.core.b) k.b(bVarArr2);
                    String strValueOf = String.valueOf(bVar6 != null ? bVar6.V() : 0);
                    if (zU && i13 == 1) {
                        i15 = 4;
                    } else if (zU && iR == 0) {
                        i14 = 1;
                        i15 = i13;
                        str3 = strValueOf;
                        z12 = zU;
                    } else {
                        i15 = i13;
                    }
                    str3 = strValueOf;
                    z12 = zU;
                    i14 = iR;
                } else {
                    i14 = 0;
                    i15 = i13;
                    str3 = "0";
                    z12 = false;
                }
                if (k.a(aVar.f71071f)) {
                    if (k.a(aVar.f71070e)) {
                        i16 = 0;
                    } else {
                        iA = sg.bigo.ads.controller.loader.a.a(aVar.f71070e);
                    }
                    if (!z11 || z12 || objArr == true) {
                        bVar = (sg.bigo.ads.api.core.b) k.b(bVarArr);
                        if (bVar != null) {
                            gVarAa = bVar.aa();
                        } else {
                            gVarAa = null;
                        }
                        if (gVarAa != null) {
                            strC = gVarAa.c();
                            c0725a3 = aVar.f71075j;
                            if (c0725a3 == null) {
                                str4 = "0";
                            } else {
                                str4 = c0725a3.f70790a.f69326h.f69328b;
                            }
                            if (TextUtils.equals(strC, str4)) {
                                str4 = "0";
                            }
                        } else {
                            aVar2 = aVar;
                            c0725a = aVar2.f71075j;
                            if (c0725a == null) {
                                bVar2 = aVar2.f71076k;
                                if (bVar2 == null) {
                                    strC = "0";
                                }
                                str4 = null;
                            } else {
                                bVar2 = c0725a.f70790a;
                            }
                            strC = bVar2.f69326h.f69328b;
                            str4 = null;
                        }
                        bVar3 = (sg.bigo.ads.api.core.b) k.b(bVarArr);
                        if (bVar3 == null) {
                            pVarY = null;
                        } else {
                            pVarY = bVar3.Y();
                        }
                        if (pVarY == null) {
                            c0725a2 = aVar.f71075j;
                            if (c0725a2 == null) {
                                pVarY = null;
                            } else {
                                pVarY = c0725a2.f70796g;
                            }
                        }
                        ad3 = ad2;
                        if (ad3 instanceof sg.bigo.ads.api.b.a) {
                            oVarB_ = ((sg.bigo.ads.api.b.a) ad3).b_();
                        } else {
                            oVarB_ = null;
                        }
                        String str6 = strB;
                        if (bVar3 == null) {
                            bVar3 = (sg.bigo.ads.api.core.b) k.b(aVar.f71070e);
                        }
                        String str7 = strD;
                        if (strC == null) {
                            strC = "0";
                        }
                        String str8 = str4 != null ? str4 : "0";
                        int i18 = i10;
                        int i19 = i11;
                        int i20 = i12;
                        String str9 = str2;
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - aVar.f71074i;
                        if (pVarY == null && pVarY.f69415a) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (pVarY == null && pVarY.f69416b) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        int i21 = pVarY != null ? pVarY.f69417c : 4;
                        if (pVarY != null) {
                            str5 = pVarY.f69418d;
                        } else {
                            str5 = null;
                        }
                        sg.bigo.ads.core.d.b.a(str6, bVar3, str7, strC, str8, i18, i19, i20, str9, jElapsedRealtime, z12 ? 1 : 0, str3, i14, i15, i17, i16, z13, z14, i21, str5, oVarB_);
                    }
                    return;
                }
                iA = sg.bigo.ads.controller.loader.a.a(aVar.f71071f);
                i16 = iA;
                if (z11) {
                }
                bVar = (sg.bigo.ads.api.core.b) k.b(bVarArr);
                if (bVar != null) {
                    gVarAa = bVar.aa();
                } else {
                    gVarAa = null;
                }
                if (gVarAa != null) {
                    strC = gVarAa.c();
                    c0725a3 = aVar.f71075j;
                    if (c0725a3 == null) {
                        str4 = "0";
                    } else {
                        str4 = c0725a3.f70790a.f69326h.f69328b;
                    }
                    if (TextUtils.equals(strC, str4)) {
                        str4 = "0";
                    }
                } else {
                    aVar2 = aVar;
                    c0725a = aVar2.f71075j;
                    if (c0725a == null) {
                        bVar2 = aVar2.f71076k;
                        if (bVar2 == null) {
                            strC = "0";
                        }
                        str4 = null;
                    } else {
                        bVar2 = c0725a.f70790a;
                    }
                    strC = bVar2.f69326h.f69328b;
                    str4 = null;
                }
                bVar3 = (sg.bigo.ads.api.core.b) k.b(bVarArr);
                if (bVar3 == null) {
                    pVarY = null;
                } else {
                    pVarY = bVar3.Y();
                }
                if (pVarY == null) {
                    c0725a2 = aVar.f71075j;
                    if (c0725a2 == null) {
                        pVarY = null;
                    } else {
                        pVarY = c0725a2.f70796g;
                    }
                }
                ad3 = ad2;
                if (ad3 instanceof sg.bigo.ads.api.b.a) {
                    oVarB_ = ((sg.bigo.ads.api.b.a) ad3).b_();
                } else {
                    oVarB_ = null;
                }
                String str10 = strB;
                if (bVar3 == null) {
                    bVar3 = (sg.bigo.ads.api.core.b) k.b(aVar.f71070e);
                }
                String str11 = strD;
                if (strC == null) {
                    strC = "0";
                }
                if (str4 != null) {
                }
                int i110 = i10;
                int i111 = i11;
                int i22 = i12;
                String str12 = str2;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - aVar.f71074i;
                if (pVarY == null) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (pVarY == null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                int i23 = pVarY != null ? pVarY.f69417c : 4;
                if (pVarY != null) {
                    str5 = pVarY.f69418d;
                } else {
                    str5 = null;
                }
                sg.bigo.ads.core.d.b.a(str10, bVar3, str11, strC, str8, i110, i111, i22, str12, jElapsedRealtime2, z12 ? 1 : 0, str3, i14, i15, i17, i16, z13, z14, i23, str5, oVarB_);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Ad ad2, boolean z10) {
        boolean z11 = ad2 instanceof sg.bigo.ads.api.b.a;
        if (z11) {
            ((sg.bigo.ads.api.b.a) ad2).b();
        }
        if (z10) {
            if (z11) {
                ((sg.bigo.ads.api.b.a) ad2).c();
            }
            this.f71023c.onAdLoaded(ad2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final l lVar, final String str, @NonNull final AbstractAdLoader<U, T>.a aVar, final Ad ad2) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.4
            @Override // java.lang.Runnable
            public final void run() {
                if (aVar.f71068c) {
                    sg.bigo.ads.ad.b.a.f67352a.a(lVar, ad2);
                    sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a = aVar.f71075j;
                    sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The request has been timeout before get ad from cache for session id: " + (c0725a == null ? "unknown" : c0725a.f70790a.f69326h.f69328b) + ", ad: " + String.valueOf(ad2));
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    AbstractAdLoader.f71021a.remove(str);
                }
                sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a2 = aVar.f71075j;
                sg.bigo.ads.controller.loader.a.a(ad2, c0725a2 == null ? "0" : c0725a2.f70790a.f69326h.f69328b);
                a aVar2 = aVar;
                sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a3 = aVar2.f71075j;
                if (c0725a3 != null) {
                    c0725a3.f70793d = true;
                    if (c0725a3.f70795f == 0) {
                        c0725a3.f70795f = c0725a3.f70794e;
                    }
                }
                aVar2.f71072g = true;
                AbstractAdLoader.b(str, aVar2);
                aVar.a();
                aVar.f71069d = true;
                sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(ad2);
                a aVar3 = aVar;
                aVar3.f71071f = bVarArrA;
                sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a4 = aVar3.f71075j;
                sg.bigo.ads.controller.loader.a.a(bVarArrA, 4, c0725a4 == null ? 1 : c0725a4.f70795f, true);
                AbstractAdLoader.this.a(str, aVar, bVarArrA, 1, 0, 0, null, true, ad2);
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        aVar.f71077l.a(ad2, true);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(T t10) {
        long jE;
        h hVar;
        t10.f69321c = 0;
        t10.a(this.f71024d);
        final String str = t10.f69319a;
        AbstractAdLoader<U, T>.a aVar = new AbstractAdLoader<U, T>.a(this, t10, str) { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.1
            @Override // sg.bigo.ads.controller.e
            public final /* synthetic */ void a(final int i10, final int i11, final int i12, @NonNull final String str2, @Nullable Pair<sg.bigo.ads.api.b, l> pair) {
                final Pair<sg.bigo.ads.api.b, l> pair2 = pair;
                sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h hVar2;
                        h hVar3;
                        int i13 = i12;
                        if (AnonymousClass1.this.f71068c && (hVar3 = i.f69318a) != null) {
                            boolean zB = hVar3.q().b(str);
                            int iF = hVar3.q().f(str);
                            if (!zB || iF > 2) {
                                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Ad data request stop due to tmax strategy.");
                                if (i13 != 10207 && i13 != 10208) {
                                    i13 = 10211;
                                }
                                int i14 = i13;
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                AbstractAdLoader.this.a(this, 1011, i14, str2, anonymousClass1.f71075j == null ? null : new Pair<>(AnonymousClass1.this.f71075j.f70790a, null));
                                return;
                            }
                        }
                        if (AnonymousClass1.this.f71069d && (hVar2 = i.f69318a) != null) {
                            boolean zB2 = hVar2.q().b(str);
                            int iG = hVar2.q().g(str);
                            if (!zB2 || iG > 2) {
                                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Ad data request stop due to assign strategy.");
                                if (i13 != 10207 && i13 != 10208) {
                                    i13 = 10212;
                                }
                                int i15 = i13;
                                AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                AbstractAdLoader.this.a(this, 1011, i15, str2, anonymousClass2.f71075j == null ? null : new Pair<>(AnonymousClass1.this.f71075j.f70790a, null));
                                return;
                            }
                        }
                        AbstractAdLoader.this.a(this, i11, i13, str2, pair2);
                    }
                });
            }

            @Override // sg.bigo.ads.controller.e
            public final /* synthetic */ void a(int i10, @NonNull sg.bigo.ads.api.b bVar, @NonNull f[] fVarArr) {
                p pVar;
                p pVar2;
                p pVar3;
                p pVar4;
                f fVar;
                h hVar2;
                h hVar3;
                sg.bigo.ads.api.b bVar2 = bVar;
                f[] fVarArr2 = fVarArr;
                sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(fVarArr2);
                this.f71070e = bVarArrA;
                sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a = this.f71075j;
                boolean z10 = false;
                if (c0725a != null) {
                    sg.bigo.ads.controller.loader.a.a(bVarArrA, c0725a.f70795f);
                    sg.bigo.ads.api.core.b[] bVarArr = this.f71070e;
                    p pVar5 = this.f71075j.f70796g;
                    if (!k.a(bVarArr)) {
                        for (sg.bigo.ads.api.core.b bVar3 : bVarArr) {
                            if (bVar3 != null) {
                                bVar3.a(pVar5);
                            }
                        }
                    }
                }
                bVar2.f69326h.a();
                if (this.f71068c && (hVar3 = i.f69318a) != null) {
                    boolean zB = hVar3.q().b(str);
                    int iF = hVar3.q().f(str);
                    if (!zB || iF > 2) {
                        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Ad data request stop due to tmax strategy.");
                        AbstractAdLoader.this.a(this, 1011, 10209, "no fill", this.f71075j == null ? null : new Pair<>(this.f71075j.f70790a, null));
                        return;
                    }
                }
                if (this.f71069d && (hVar2 = i.f69318a) != null) {
                    boolean zB2 = hVar2.q().b(str);
                    int iG = hVar2.q().g(str);
                    if (!zB2 || iG > 2) {
                        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Ad data request stop due to assign strateg   y.");
                        AbstractAdLoader.this.a(this, 1011, 10210, "no fill", this.f71075j == null ? null : new Pair<>(this.f71075j.f70790a, null));
                        return;
                    }
                }
                l lVarH = bVar2.h();
                if (lVarH == null && (fVar = (f) k.b(fVarArr2)) != null) {
                    lVarH = fVar.f69377b;
                }
                l lVar = lVarH;
                sg.bigo.ads.api.core.b[] bVarArrA2 = sg.bigo.ads.controller.loader.a.a(fVarArr2);
                sg.bigo.ads.api.core.b bVar4 = (sg.bigo.ads.api.core.b) k.b(bVarArrA2);
                if (lVar != null && bVar4 != null) {
                    boolean z11 = lVar.s() && bVar4.ac();
                    int i11 = this.f71068c ? 2 : this.f71069d ? 4 : 1;
                    sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a2 = this.f71075j;
                    int i12 = c0725a2 != null ? c0725a2.f70795f : 0;
                    int i13 = (c0725a2 == null || (pVar4 = c0725a2.f70796g) == null) ? 3 : pVar4.f69415a ? 1 : 0;
                    if (c0725a2 != null && (pVar3 = c0725a2.f70796g) != null && pVar3.f69416b) {
                        z10 = true;
                    }
                    sg.bigo.ads.core.d.b.a(bVarArrA2, bVar2, z11, i11, i12, i13, z10, (c0725a2 == null || (pVar2 = c0725a2.f70796g) == null) ? 4 : pVar2.f69417c, (c0725a2 == null || (pVar = c0725a2.f70796g) == null) ? null : pVar.f69418d);
                }
                AbstractAdLoader.this.a(this, i10, lVar, bVar2, fVarArr2);
            }

            @Override // sg.bigo.ads.controller.d
            public final void a(@NonNull l lVar, @NonNull U u10) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Get ad from cache.");
                AbstractAdLoader.this.a(lVar, str, this, u10);
            }
        };
        if (a(str)) {
            a((AbstractAdLoader<U, T>.a) aVar, 1012, 10213, "The ad is loading", (Pair<sg.bigo.ads.api.b, l>) new Pair(t10, null));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            f71021a.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        if (TextUtils.isEmpty(str) || (hVar = i.f69318a) == null) {
            jE = -1;
        } else {
            sg.bigo.ads.api.a.b bVarQ = hVar.q();
            if (bVarQ.b(str)) {
                ConcurrentHashMap<String, List<a>> concurrentHashMap = f71022b;
                List<a> copyOnWriteArrayList = concurrentHashMap.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    concurrentHashMap.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(0, aVar);
                jE = bVarQ.e(str);
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Prepare for ad load, the tmax switch is on.");
            } else {
                jE = -1;
            }
        }
        sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725aA = BigoAdSdk.a(t10, aVar);
        if (c0725aA != null) {
            aVar.f71075j = c0725aA;
            if (jE > -1) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Start timeout task for " + jE + "s");
                a(aVar, jE);
            }
        }
    }

    private static void a(AbstractAdLoader<U, T>.a aVar, long j10) {
        sg.bigo.ads.common.n.d.a(3, aVar.f71078m, j10 * 1000);
    }

    private static boolean a(String str) {
        h hVar;
        if (!TextUtils.isEmpty(str) && (hVar = i.f69318a) != null && hVar.q().i(str)) {
            long j10 = i.f69318a.q().j(str);
            if (j10 < 0) {
                return false;
            }
            if (j10 == 0 && f71021a.containsKey(str)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The slot request stop due to single ad mode.");
                return true;
            }
            long j11 = j10 * 1000;
            Long l10 = f71021a.get(str);
            if (l10 != null && SystemClock.elapsedRealtime() - l10.longValue() < j11) {
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The slot request stop due to single ad mode.");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, AbstractAdLoader<U, T>.a aVar) {
        List<a> list;
        if (TextUtils.isEmpty(str) || (list = f71022b.get(str)) == null || list.size() <= 0) {
            return;
        }
        list.remove(aVar);
    }

    private boolean b(final T t10) {
        String[] strArrSplit;
        String str;
        boolean z10 = !BigoAdSdk.isInitialized();
        String str2 = "";
        Context applicationContext = null;
        if (z10) {
            Activity activityB = sg.bigo.ads.common.f.b.b();
            applicationContext = activityB != null ? activityB.getApplicationContext() : null;
            if (applicationContext == null) {
                applicationContext = sg.bigo.ads.common.f.b.a();
            }
            z10 = applicationContext != null;
        }
        if (z10) {
            String str3 = t10.f69319a;
            if (str3 != null && !str3.isEmpty() && (strArrSplit = str3.split("-")) != null && strArrSplit.length >= 2 && (str = strArrSplit[0]) != null && !str.isEmpty()) {
                str2 = strArrSplit[0];
            }
            z10 = (str2 == null || str2.isEmpty()) ? false : true;
        }
        if (z10) {
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Initialize bigo sdk before requesting ad.");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        AbstractAdLoader.this.a(t10);
                    }
                }
            }, 1000L);
            try {
                AdConfig.Builder builder = new AdConfig.Builder();
                builder.setAppId(str2);
                BigoAdSdk.initialize(applicationContext.getApplicationContext(), builder.build(), new BigoAdSdk.InitListener() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.3
                    @Override // sg.bigo.ads.BigoAdSdk.InitListener
                    public final void onInitialized() {
                        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "Bigo ads sdk initialized before ad load.");
                        if (atomicBoolean.compareAndSet(false, true)) {
                            AbstractAdLoader.this.a(t10);
                        }
                    }
                });
            } catch (Exception unused) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    a(t10);
                }
            }
        }
        return z10;
    }

    public U a(@NonNull sg.bigo.ads.api.b bVar, f... fVarArr) {
        return null;
    }

    public U a(f fVar) {
        return null;
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u10) {
        a((Ad) u10, true);
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u10, int i10, int i11, String str) {
        if (u10 instanceof sg.bigo.ads.api.b.a) {
            ((sg.bigo.ads.api.b.a) u10).a(i10, i11, str);
        }
        sg.bigo.ads.common.t.a.a(2, 5, "", "Failed to load ads: (" + i10 + ") " + str);
        this.f71023c.onError(new AdError(i10, str));
    }

    @Override // sg.bigo.ads.api.b.d.a
    public final void a(U u10, boolean z10, int i10, int i11, String str, boolean z11) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(AbstractAdLoader<U, T>.a aVar, int i10, int i11, @NonNull String str, @Nullable Pair<sg.bigo.ads.api.b, l> pair) {
        l lVar;
        sg.bigo.ads.api.b bVar;
        int i12;
        int i13;
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        String str2 = null;
        if (pair != null) {
            bVar = (sg.bigo.ads.api.b) pair.first;
            lVar = (l) pair.second;
        } else {
            lVar = null;
            bVar = null;
        }
        if (bVar != null) {
            bVar.f69326h.a();
        }
        String strL = lVar != null ? lVar.l() : null;
        if (TextUtils.isEmpty(strL) && bVar != null) {
            strL = bVar.f69319a;
        }
        if (TextUtils.isEmpty(strL)) {
            strL = aVar.f71073h;
        }
        boolean z10 = i11 == 10213;
        if (!z10 && !TextUtils.isEmpty(strL)) {
            f71021a.remove(strL);
        }
        boolean z11 = i10 == 1011;
        boolean z12 = i11 == 10206;
        if (!z12) {
            int i14 = 4;
            if (z10) {
                i12 = 3;
            } else if (aVar.f71068c) {
                i12 = 2;
            } else {
                i12 = aVar.f71069d ? 4 : 1;
            }
            sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a = aVar.f71075j;
            int i15 = c0725a != null ? c0725a.f70795f : 0;
            if (c0725a == null || (pVar4 = c0725a.f70796g) == null) {
                i13 = 3;
            } else {
                i13 = pVar4.f69415a ? 1 : 0;
            }
            boolean z13 = (c0725a == null || (pVar3 = c0725a.f70796g) == null || !pVar3.f69416b) ? false : true;
            if (c0725a != null && (pVar2 = c0725a.f70796g) != null) {
                i14 = pVar2.f69417c;
            }
            int i16 = i14;
            if (c0725a != null && (pVar = c0725a.f70796g) != null) {
                str2 = pVar.f69418d;
            }
            sg.bigo.ads.core.d.b.a(lVar, bVar, i10, i11, str, i12, i15, i13, z13, i16, str2);
        }
        aVar.a();
        aVar.f71072g = 1;
        b(aVar.b(), aVar);
        if (!z12 && (aVar.f71068c || aVar.f71069d || z11)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The error ad has been timeout or assign");
        } else {
            a(strL, aVar, null, 0, i10, i11, str, false, null);
            this.f71023c.onError(new AdError(i10, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public final void a(final AbstractAdLoader<U, T>.a aVar, final int i10, final l lVar, @NonNull sg.bigo.ads.api.b bVar, @NonNull f... fVarArr) {
        int i11;
        Ad adA = bVar.e() ? a(bVar, fVarArr) : a((f) k.b(fVarArr));
        if (adA == null) {
            a(aVar.b(), (AbstractAdLoader<U, T>.a) aVar, (Ad) null, 1005, 1009, "Unmatched ad type.");
            return;
        }
        if (!(adA instanceof d)) {
            a(lVar == null ? null : lVar.l(), (AbstractAdLoader<U, T>.a) aVar, adA, 1024, 1010, "Unknown ad.");
            return;
        }
        sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a = aVar.f71075j;
        if (c0725a != null) {
            c0725a.f70794e = 3;
        }
        sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(adA);
        if (aVar.f71068c) {
            i11 = 2;
        } else {
            i11 = aVar.f71069d ? 4 : 1;
        }
        sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a2 = aVar.f71075j;
        sg.bigo.ads.controller.loader.a.a(bVarArrA, i11, c0725a2 == null ? 0 : c0725a2.f70795f, false);
        ((d) adA).a(new b<U, T>() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.5
            @Override // sg.bigo.ads.controller.loader.AbstractAdLoader.b
            public final AbstractAdLoader<U, T> a() {
                return AbstractAdLoader.this;
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(final U u10) {
                final AbstractAdLoader abstractAdLoader = AbstractAdLoader.this;
                final a aVar2 = aVar;
                final int i12 = i10;
                final l lVar2 = lVar;
                sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar3 = lVar2;
                        String strL = lVar3 == null ? null : lVar3.l();
                        if (!TextUtils.isEmpty(strL)) {
                            AbstractAdLoader.f71021a.remove(strL);
                        }
                        a aVar3 = aVar2;
                        aVar3.f71072g = true;
                        AbstractAdLoader.b(strL, aVar3);
                        aVar2.a();
                        AbstractAdLoader<U, T>.a aVar4 = aVar2;
                        if (aVar4.f71068c) {
                            AbstractAdLoader.this.a(aVar4, lVar2, u10, 1);
                        } else if (aVar4.f71069d) {
                            AbstractAdLoader.this.a(aVar4, lVar2, u10, 2);
                        } else {
                            AbstractAdLoader.this.a(strL, aVar4, sg.bigo.ads.controller.loader.a.a(u10), 1, 0, 0, null, true, u10);
                            AbstractAdLoader.this.a(u10);
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(U u10, int i12, int i13, String str) {
                AbstractAdLoader abstractAdLoader = AbstractAdLoader.this;
                l lVar2 = lVar;
                abstractAdLoader.a(lVar2 == null ? null : lVar2.l(), aVar, u10, i12, i13, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final void a(U u10, boolean z10, int i12, int i13, String str, boolean z11) {
            }
        });
    }

    @CallSuper
    public final void a(AbstractAdLoader<U, T>.a aVar, l lVar, @NonNull Ad ad2, int i10) {
        List<a> list;
        sg.bigo.ads.controller.e.a.C0725a<sg.bigo.ads.api.b> c0725a = aVar.f71075j;
        String str = c0725a == null ? "unknown" : c0725a.f70790a.f69326h.f69328b;
        sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The ad timeout for session id: ".concat(String.valueOf(str)));
        if (lVar != null) {
            String strL = lVar.l();
            if (TextUtils.isEmpty(strL)) {
                strL = aVar.b();
            }
            if (TextUtils.isEmpty(strL)) {
                return;
            }
            sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(ad2);
            for (int i11 = 0; bVarArrA != null && i11 < bVarArrA.length; i11++) {
                sg.bigo.ads.api.core.b bVar = bVarArrA[i11];
                bVar.T();
                bVar.c(i10);
                bVar.S();
            }
            a aVarRemove = (TextUtils.isEmpty(strL) || (list = f71022b.get(strL)) == null || list.size() <= 0) ? null : list.remove(0);
            if (aVarRemove != null) {
                a(lVar, strL, aVarRemove, ad2);
                sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The timeout ad fill to another request for session id: ".concat(String.valueOf(str)));
                return;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "AbstractAdLoader", "The timeout ad put in cache for session id: " + str + ", ad: " + String.valueOf(ad2));
            a(ad2, false);
            sg.bigo.ads.ad.b.a.f67352a.a(lVar, ad2);
        }
    }

    @Keep
    @CallSuper
    public void loadAd(T t10) {
        if (b(t10)) {
            return;
        }
        a(t10);
    }
}
