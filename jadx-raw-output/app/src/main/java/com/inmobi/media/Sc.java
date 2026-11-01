package com.inmobi.media;

import android.webkit.URLUtil;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2957jd f23499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X2 f23500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D4 f23501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Nc f23502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rc f23503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3028m9 f23504f;

    public final void a(short s10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23504f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("NativeClickProcessor", "onAssetClickEvent: assetType=" + ((int) s10));
        }
        if (s10 == 7) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23504f;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("NativeClickProcessor", "Processing AD_CHOICE asset click");
            }
            a();
            return;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f23504f;
        if (interfaceC3028m11 != null) {
            ((C3053n9) interfaceC3028m11).a("NativeClickProcessor", "Processing native asset click, tracking user interaction");
        }
        this.f23501c.f();
        ((AbstractC2819e1) this.f23500b).a(InteractionType.CLICK);
        b(s10);
    }

    public final void b(short s10) {
        List list;
        Rc rc2 = this.f23503e;
        C3015ll c3015ll = rc2.f23449a;
        ArrayList arrayListA = null;
        String str = c3015ll != null ? c3015ll.f24787a : null;
        List listA = Qc.a(rc2);
        InterfaceC3028m9 interfaceC3028m9 = this.f23504f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("NativeClickProcessor", "processNativeAssetClick: assetId=" + ((int) s10) + ", VAST clickThroughUrl=" + str + ", VAST trackers count=" + listA.size());
        }
        if (!G3.a(str)) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23504f;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("NativeClickProcessor", "VAST URL is not a network URL, using response asset click URL");
            }
            Rc rc3 = this.f23503e;
            ck.p.j(rc3, "<this>");
            Kc kc2 = (Kc) rc3.f23450b.f25733a.get(Short.valueOf(s10));
            String str2 = kc2 != null ? kc2.f23012a : null;
            Rc rc4 = this.f23503e;
            ck.p.j(rc4, "<this>");
            Kc kc3 = (Kc) rc4.f23450b.f25733a.get(Short.valueOf(s10));
            if (kc3 != null && (list = kc3.f23013b) != null) {
                arrayListA = AbstractC3347z4.a("click", list);
            }
            List listK = arrayListA == null ? nj.s.k() : arrayListA;
            InterfaceC3028m9 interfaceC3028m11 = this.f23504f;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).a("NativeClickProcessor", "Response asset URL=" + str2 + ", trackers count=" + listK.size());
            }
            str = str2;
            listA = listK;
        }
        a((short) 0, str, listA);
    }

    public Sc(C2957jd c2957jd, X2 x10, D4 d10, Nc nc2, Rc rc2, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(c2957jd, "nativeLandingPageHandler");
        ck.p.j(x10, "clickSession");
        ck.p.j(d10, "contextualDataHandler");
        ck.p.j(nc2, "nativeBeaconProcessor");
        ck.p.j(rc2, "nativeClickModel");
        this.f23499a = c2957jd;
        this.f23500b = x10;
        this.f23501c = d10;
        this.f23502d = nc2;
        this.f23503e = rc2;
        this.f23504f = interfaceC3028m9;
    }

    public final void a(AbstractC2753bc abstractC2753bc) {
        ck.p.j(abstractC2753bc, "mediaEvent");
        InterfaceC3028m9 interfaceC3028m9 = this.f23504f;
        if (interfaceC3028m9 != null) {
            String strI = ck.s.b(abstractC2753bc.getClass()).i();
            ck.p.j(abstractC2753bc, "<this>");
            ((C3053n9) interfaceC3028m9).a("NativeClickProcessor", "processIfMediaClickEvent: mediaEvent type=" + strI + ", isClickEvent=" + ((abstractC2753bc instanceof C2938ij) || (abstractC2753bc instanceof Ol) || (abstractC2753bc instanceof Q3)));
        }
        ck.p.j(abstractC2753bc, "<this>");
        boolean z10 = abstractC2753bc instanceof C2938ij;
        if (z10 || (abstractC2753bc instanceof Ol) || (abstractC2753bc instanceof Q3)) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23504f;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("NativeClickProcessor", "Media click event detected, tracking user interaction");
            }
            this.f23501c.f();
            ((AbstractC2819e1) this.f23500b).a(InteractionType.CLICK);
            if (z10) {
                InterfaceC3028m9 interfaceC3028m11 = this.f23504f;
                if (interfaceC3028m11 != null) {
                    ((C3053n9) interfaceC3028m11).a("NativeClickProcessor", "Processing StaticClick event");
                }
                a((C2938ij) abstractC2753bc);
                return;
            }
            if (abstractC2753bc instanceof Ol) {
                InterfaceC3028m9 interfaceC3028m12 = this.f23504f;
                if (interfaceC3028m12 != null) {
                    ((C3053n9) interfaceC3028m12).a("NativeClickProcessor", "Processing VideoClick event");
                }
                b();
                return;
            }
            if (abstractC2753bc instanceof Q3) {
                InterfaceC3028m9 interfaceC3028m13 = this.f23504f;
                if (interfaceC3028m13 != null) {
                    ((C3053n9) interfaceC3028m13).a("NativeClickProcessor", "Processing CompanionClick event");
                }
                a((Q3) abstractC2753bc);
                return;
            }
            InterfaceC3028m9 interfaceC3028m14 = this.f23504f;
            if (interfaceC3028m14 != null) {
                ((C3053n9) interfaceC3028m14).a("NativeClickProcessor", "Unknown media event type, ignoring");
            }
        }
    }

    public final void b() {
        Rc rc2 = this.f23503e;
        C3015ll c3015ll = rc2.f23449a;
        String str = c3015ll != null ? c3015ll.f24787a : null;
        List listA = Qc.a(rc2);
        InterfaceC3028m9 interfaceC3028m9 = this.f23504f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("NativeClickProcessor", "processVideoClickEvent: VAST clickThroughUrl=" + str + ", trackers count=" + listA.size());
        }
        a((short) 0, str, listA);
    }

    public final void a() {
        Rc rc2 = this.f23503e;
        ck.p.j(rc2, "<this>");
        Kc kc2 = (Kc) rc2.f23450b.f25733a.get((short) 7);
        String str = kc2 != null ? kc2.f23012a : null;
        InterfaceC3028m9 interfaceC3028m9 = this.f23504f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("NativeClickProcessor", "processAdChoiceAssetClick: url=" + str + ", isNetworkUrl=" + (str != null ? Boolean.valueOf(URLUtil.isNetworkUrl(str)) : null));
        }
        if (str != null && URLUtil.isNetworkUrl(str)) {
            this.f23499a.b(str, null);
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f23504f;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a("NativeClickProcessor", "AdChoice URL is null or not a network URL, skipping");
        }
    }

    public final void a(C2938ij c2938ij) {
        Rc rc2 = this.f23503e;
        C3015ll c3015ll = rc2.f23449a;
        String str = c3015ll != null ? c3015ll.f24787a : null;
        List listA = Qc.a(rc2);
        InterfaceC3028m9 interfaceC3028m9 = this.f23504f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("NativeClickProcessor", "processStaticClickEvent: VAST clickThroughUrl=" + str);
        }
        List list = listA;
        if (!G3.a(str)) {
            InterfaceC3028m9 interfaceC3028m10 = this.f23504f;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("NativeClickProcessor", "VAST URL is not a network URL, using static click URL");
            }
            str = c2938ij.f24563a;
            ArrayList arrayList = c2938ij.f24564b;
            InterfaceC3028m9 interfaceC3028m11 = this.f23504f;
            list = arrayList;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).a("NativeClickProcessor", "Static click URL=" + str + ", trackers count=" + arrayList.size());
                list = arrayList;
            }
        }
        a((short) 0, str, list);
    }

    public final void a(Q3 q10) {
        C3015ll c3015ll = this.f23503e.f23449a;
        String str = c3015ll != null ? c3015ll.f24787a : null;
        ArrayList arrayList = q10.f23366a;
        boolean zIsEmpty = arrayList.isEmpty();
        List listA = arrayList;
        if (zIsEmpty) {
            listA = Qc.a(this.f23503e);
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f23504f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("NativeClickProcessor", "processCompanionClick: VAST clickThroughUrl=" + str + ", companion trackers count=" + q10.f23366a.size() + ", using VAST trackers=" + q10.f23366a.isEmpty());
        }
        a((short) 1, str, listA);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(short s10, String str, List list) {
        List list2;
        InterfaceC3028m9 interfaceC3028m9 = this.f23504f;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("NativeClickProcessor", "processAssetData: assetType=" + ((int) s10) + ", url=" + str + ", assetTrackers count=" + list.size());
        }
        Rc rc2 = this.f23503e;
        ck.p.j(rc2, "<this>");
        ArrayList arrayListA = AbstractC3347z4.a("click", rc2.f23450b.f25735c);
        List listY0 = nj.b0.y0(list, arrayListA);
        InterfaceC3028m9 interfaceC3028m10 = this.f23504f;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a("NativeClickProcessor", "Response click trackers count=" + arrayListA.size() + ", combined trackers count=" + listY0.size());
        }
        String fallbackUrl = null;
        if (G3.a(str)) {
            list2 = listY0;
        } else {
            InterfaceC3028m9 interfaceC3028m11 = this.f23504f;
            if (interfaceC3028m11 != null) {
                ((C3053n9) interfaceC3028m11).a("NativeClickProcessor", "URL is not a network URL, using main link from response");
            }
            MainLink mainLink = this.f23503e.f23450b.f25734b;
            str = mainLink != null ? mainLink.getUrl() : null;
            MainLink mainLink2 = this.f23503e.f23450b.f25734b;
            fallbackUrl = mainLink2 != null ? mainLink2.getFallbackUrl() : null;
            InterfaceC3028m9 interfaceC3028m12 = this.f23504f;
            list2 = arrayListA;
            if (interfaceC3028m12 != null) {
                ((C3053n9) interfaceC3028m12).a("NativeClickProcessor", "Main link URL=" + str + ", fallbackUrl=" + fallbackUrl);
            }
        }
        if (str == null) {
            InterfaceC3028m9 interfaceC3028m13 = this.f23504f;
            if (interfaceC3028m13 == null) {
                list2 = arrayListA;
                return;
            } else {
                list2 = arrayListA;
                ((C3053n9) interfaceC3028m13).a("NativeClickProcessor", "Final URL is null, skipping click processing");
                return;
            }
        }
        InterfaceC3028m9 interfaceC3028m14 = this.f23504f;
        if (interfaceC3028m14 != null) {
            list2 = arrayListA;
            ((C3053n9) interfaceC3028m14).a("NativeClickProcessor", "Handling click: finalUrl=" + str + ", fallbackUrl=" + fallbackUrl + ", firing " + list2.size() + " beacons");
        }
        list2 = arrayListA;
        this.f23499a.b(str, fallbackUrl);
        this.f23502d.a(s10, list2);
    }
}
