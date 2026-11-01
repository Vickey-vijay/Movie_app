package com.inmobi.media;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.inmobi.media.Fl;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class Fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f22667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3065nl f22668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3053n9 f22669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f22672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f22673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f22674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f22675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f22676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f22677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f22678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f22679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f22680n;

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object a(Fl fl2, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) throws Throwable {
        C3289wl c3289wl;
        String string;
        Ref$BooleanRef ref$BooleanRef;
        fl2.getClass();
        if (continuationImpl instanceof C3289wl) {
            c3289wl = (C3289wl) continuationImpl;
            int i10 = c3289wl.f25671d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3289wl.f25671d = i10 - Integer.MIN_VALUE;
            } else {
                c3289wl = new C3289wl(fl2, continuationImpl);
            }
        } else {
            c3289wl = new C3289wl(fl2, continuationImpl);
        }
        Object obj = c3289wl.f25669b;
        Object objF = sj.a.f();
        int i11 = c3289wl.f25671d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            try {
                string = xmlPullParser.getAttributeValue(null, "adType").toString();
            } catch (Exception unused) {
                string = "video";
            }
            if (!ck.p.e(string, "video")) {
                throw new C3214tl((short) 1125);
            }
            bk.l c3314xl = new C3314xl(fl2, null, ref$BooleanRef2, xmlPullParser);
            c3289wl.f25668a = ref$BooleanRef2;
            c3289wl.f25671d = 1;
            if (fl2.a(xmlPullParser, VastTagName.AD, c3314xl, c3289wl) == objF) {
                return objF;
            }
            ref$BooleanRef = ref$BooleanRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = c3289wl.f25668a;
            kotlin.c.b(obj);
        }
        if (ref$BooleanRef.element) {
            return mj.r.f64562a;
        }
        throw new C3214tl((short) 1101);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(Fl fl2, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) throws Throwable {
        Al al2;
        Ref$BooleanRef ref$BooleanRef;
        Ref$BooleanRef ref$BooleanRef2;
        fl2.getClass();
        if (continuationImpl instanceof Al) {
            al2 = (Al) continuationImpl;
            int i10 = al2.f22381e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                al2.f22381e = i10 - Integer.MIN_VALUE;
            } else {
                al2 = new Al(fl2, continuationImpl);
            }
        } else {
            al2 = new Al(fl2, continuationImpl);
        }
        Object obj = al2.f22379c;
        Object objF = sj.a.f();
        int i11 = al2.f22381e;
        if (i11 == 0) {
            kotlin.c.b(obj);
            Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
            Ref$BooleanRef ref$BooleanRef4 = new Ref$BooleanRef();
            bk.l bl2 = new Bl(xmlPullParser, fl2, ref$BooleanRef4, ref$BooleanRef3, null);
            al2.f22377a = ref$BooleanRef3;
            al2.f22378b = ref$BooleanRef4;
            al2.f22381e = 1;
            if (fl2.a(xmlPullParser, VastTagName.VAST, bl2, al2) == objF) {
                return objF;
            }
            ref$BooleanRef = ref$BooleanRef3;
            ref$BooleanRef2 = ref$BooleanRef4;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef2 = al2.f22378b;
            ref$BooleanRef = al2.f22377a;
            kotlin.c.b(obj);
        }
        if (ref$BooleanRef.element) {
            return mj.r.f64562a;
        }
        if (ref$BooleanRef2.element) {
            throw new C3214tl((short) 1124);
        }
        throw new C3214tl((short) 1102);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(Fl fl2, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) throws Throwable {
        Dl dl2;
        Ref$BooleanRef ref$BooleanRef;
        fl2.getClass();
        if (continuationImpl instanceof Dl) {
            dl2 = (Dl) continuationImpl;
            int i10 = dl2.f22547d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dl2.f22547d = i10 - Integer.MIN_VALUE;
            } else {
                dl2 = new Dl(fl2, continuationImpl);
            }
        } else {
            dl2 = new Dl(fl2, continuationImpl);
        }
        Object obj = dl2.f22545b;
        Object objF = sj.a.f();
        int i11 = dl2.f22547d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            int i12 = fl2.f22670d + 1;
            fl2.f22670d = i12;
            if (i12 > fl2.f22667a.getMaxWrapperLimit()) {
                throw new C3214tl((short) 1107);
            }
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            bk.l el2 = new El(fl2, null, ref$BooleanRef2, xmlPullParser);
            dl2.f22544a = ref$BooleanRef2;
            dl2.f22547d = 1;
            if (fl2.a(xmlPullParser, VastTagName.WRAPPER, el2, dl2) == objF) {
                return objF;
            }
            ref$BooleanRef = ref$BooleanRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = dl2.f22544a;
            kotlin.c.b(obj);
        }
        if (ref$BooleanRef.element) {
            return mj.r.f64562a;
        }
        throw new C3214tl((short) 1121);
    }

    public static final mj.r d(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (ck.p.e(name, VastTagName.COMPANION_CLICK_TRACKING)) {
            String strB = AbstractC3090ol.b(fl2.v(xmlPullParser));
            if (!AbstractC3090ol.a(strB)) {
                strB = null;
            }
            C3257ve c3257ve = strB != null ? new C3257ve(strB, "click") : null;
            if (c3257ve != null) {
                fl2.f22679m.add(c3257ve);
            }
        } else if (ck.p.e(name, VastTagName.TRACKING_EVENTS)) {
            fl2.f22679m.addAll(fl2.o(xmlPullParser));
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    public static final mj.r e(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        if (ck.p.e(xmlPullParser.getName(), VastTagName.COMPANION)) {
            fl2.q(xmlPullParser);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    public static final mj.r h(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (ck.p.e(name, VastTagName.TRACKING_EVENTS)) {
            fl2.f22675i.addAll(fl2.o(xmlPullParser));
        } else if (ck.p.e(name, VastTagName.VIDEO_CLICKS)) {
            fl2.a(xmlPullParser, false);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    public final void f(XmlPullParser xmlPullParser) {
        String strB = AbstractC3090ol.b(v(xmlPullParser));
        if (strB.length() != 0) {
            if (!AbstractC3090ol.a(strB)) {
                strB = null;
            }
            if (strB == null) {
                return;
            }
            this.f22675i.add(new C3257ve(strB, VastTagName.IMPRESSION));
            return;
        }
        C3053n9 c3053n9 = this.f22669c;
        if (c3053n9 != null) {
            c3053n9.b("VastParser", "Vast Tracker Error: " + VastTagName.IMPRESSION);
        }
    }

    public final void g(final XmlPullParser xmlPullParser) throws C3214tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        a(xmlPullParser, VastTagName.IN_LINE, new bk.a() { // from class: b7.s0
            @Override // bk.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new C3214tl((short) 1122);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(final XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        if (attributeValue == null) {
            C3053n9 c3053n9 = this.f22669c;
            if (c3053n9 != null) {
                c3053n9.b("VastParser", "VAST Schema Validation Error: Vendor not found");
                return;
            }
            return;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, VastTagName.VERIFICATION, new bk.a() { // from class: b7.o0
            @Override // bk.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, ref$BooleanRef, this, ref$ObjectRef, ref$ObjectRef2, arrayList);
            }
        });
        if (!ref$BooleanRef.element) {
            HashMap map = new HashMap();
            map.put("[REASON]", String.valueOf(2));
            map.put("[ADSERVINGID]", this.f22673g);
            map.put("[UNIVERSALADID]", this.f22672f);
            C3065nl.a(map, arrayList, this.f22669c);
            return;
        }
        if (!AbstractC3090ol.a((String) ref$ObjectRef.element)) {
            HashMap map2 = new HashMap();
            map2.put("[REASON]", String.valueOf(3));
            map2.put("[ADSERVINGID]", this.f22673g);
            map2.put("[UNIVERSALADID]", this.f22672f);
            C3065nl.a(map2, arrayList, this.f22669c);
            return;
        }
        this.f22675i.add(new C3358zf(attributeValue, (String) ref$ObjectRef2.element, (String) ref$ObjectRef.element));
        C3053n9 c3053n10 = this.f22669c;
        if (c3053n10 != null) {
            c3053n10.a("VastParser", "OMID ADVerification URL : " + ref$ObjectRef.element);
        }
    }

    public Fl(AdConfig.VastVideoConfig vastVideoConfig, C3065nl c3065nl, C3053n9 c3053n9) {
        ck.p.j(vastVideoConfig, "vastVideoConfig");
        ck.p.j(c3065nl, "vastEventProcessor");
        this.f22667a = vastVideoConfig;
        this.f22668b = c3065nl;
        this.f22669c = c3053n9;
        this.f22672f = "";
        this.f22673g = "";
        this.f22674h = new ArrayList();
        this.f22675i = new ArrayList();
        this.f22676j = "";
        this.f22677k = "";
        this.f22678l = new ArrayList();
        this.f22679m = new ArrayList();
        this.f22680n = new ArrayList();
    }

    public final void i(final XmlPullParser xmlPullParser) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        a(xmlPullParser, VastTagName.COMPANION_ADS, new bk.a() { // from class: b7.m0
            @Override // bk.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$IntRef);
            }
        });
        if (this.f22680n.size() != 0) {
            if (this.f22671e) {
                C3053n9 c3053n9 = this.f22669c;
                if (c3053n9 != null) {
                    c3053n9.a("VastParser", "VAST Companion Error: Format not supported");
                }
                Map mapA = AbstractC2939ik.a(this.f22668b.f24911a);
                mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1152);
                Wj wj2 = Wj.f23753a;
                Wj.b("VastParseEvent", mapA, EnumC2735ak.SDK);
                return;
            }
            return;
        }
        if (this.f22671e) {
            HashMap map = new HashMap();
            map.put("[ERRORCODE]", String.valueOf(604));
            map.put("[ADSERVINGID]", this.f22673g);
            map.put("[UNIVERSALADID]", this.f22672f);
            C3065nl.a(map, this.f22675i, this.f22669c);
            Map mapA2 = AbstractC2939ik.a(this.f22668b.f24911a);
            mapA2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1150);
            Wj wj3 = Wj.f23753a;
            Wj.b("VastParseEvent", mapA2, EnumC2735ak.SDK);
            return;
        }
        if (ref$IntRef.element > 0) {
            HashMap map2 = new HashMap();
            map2.put("[ERRORCODE]", String.valueOf(600));
            map2.put("[ADSERVINGID]", this.f22673g);
            map2.put("[UNIVERSALADID]", this.f22672f);
            C3065nl.a(map2, this.f22675i, this.f22669c);
            Map mapA3 = AbstractC2939ik.a(this.f22668b.f24911a);
            mapA3.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1151);
            Wj wj4 = Wj.f23753a;
            Wj.b("VastParseEvent", mapA3, EnumC2735ak.SDK);
        }
    }

    public final boolean j(final XmlPullParser xmlPullParser) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        a(xmlPullParser, VastTagName.CREATIVE, new bk.a() { // from class: b7.t0
            @Override // bk.a
            public final Object invoke() {
                return Fl.b(xmlPullParser, this, ref$BooleanRef);
            }
        });
        return ref$BooleanRef.element;
    }

    public final void k(final XmlPullParser xmlPullParser) throws C3214tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, VastTagName.CREATIVES, new bk.a() { // from class: b7.n0
            @Override // bk.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, ref$BooleanRef, this, ref$BooleanRef2);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new C3214tl((short) 1112);
        }
        if (!ref$BooleanRef2.element) {
            throw new C3214tl((short) 1111);
        }
    }

    public final void l(final XmlPullParser xmlPullParser) throws C3214tl {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, VastTagName.LINEAR, new bk.a() { // from class: b7.h0
            @Override // bk.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef, ref$BooleanRef2);
            }
        });
        if (!ref$BooleanRef.element) {
            throw new C3214tl((short) 1116);
        }
        if (!ref$BooleanRef2.element) {
            throw new C3214tl((short) 1117);
        }
    }

    public final ArrayList m(final XmlPullParser xmlPullParser) throws C3214tl {
        final ArrayList arrayList = new ArrayList();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        a(xmlPullParser, VastTagName.MEDIA_FILES, new bk.a() { // from class: b7.g0
            @Override // bk.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, ref$BooleanRef2, ref$BooleanRef, arrayList);
            }
        });
        if (!ref$BooleanRef2.element) {
            throw new C3214tl((short) 1118);
        }
        if (arrayList.isEmpty()) {
            throw new C3214tl((short) 1119);
        }
        if (ref$BooleanRef.element) {
            Map mapA = AbstractC2939ik.a(this.f22668b.f24911a);
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1153);
            Wj wj2 = Wj.f23753a;
            Wj.b("VastParseEvent", mapA, EnumC2735ak.SDK);
        }
        return arrayList;
    }

    public final int n(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            C3053n9 c3053n9 = this.f22669c;
            if (c3053n9 == null) {
                return -1;
            }
            c3053n9.b("VastParser", "Parsing failed.");
            return -1;
        } catch (XmlPullParserException unused2) {
            C3053n9 c3053n10 = this.f22669c;
            if (c3053n10 == null) {
                return -1;
            }
            c3053n10.b("VastParser", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final ArrayList o(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, VastTagName.TRACKING_EVENTS, new bk.a() { // from class: b7.u0
            @Override // bk.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, arrayList);
            }
        });
        return arrayList;
    }

    public final void q(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.COMPANION, new bk.a() { // from class: b7.r0
            @Override // bk.a
            public final Object invoke() {
                return Fl.d(xmlPullParser, this);
            }
        });
    }

    public final void r(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.COMPANION_ADS, new bk.a() { // from class: b7.v0
            @Override // bk.a
            public final Object invoke() {
                return Fl.e(xmlPullParser, this);
            }
        });
    }

    public final void s(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.CREATIVE, new bk.a() { // from class: b7.q0
            @Override // bk.a
            public final Object invoke() {
                return Fl.f(xmlPullParser, this);
            }
        });
    }

    public final void t(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.CREATIVES, new bk.a() { // from class: b7.i0
            @Override // bk.a
            public final Object invoke() {
                return Fl.g(xmlPullParser, this);
            }
        });
    }

    public final void u(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.LINEAR, new bk.a() { // from class: b7.e0
            @Override // bk.a
            public final Object invoke() {
                return Fl.h(xmlPullParser, this);
            }
        });
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                int next = xmlPullParser.next();
                if (next != 1) {
                    if (next != 2) {
                        if (next == 3) {
                            i10--;
                        }
                    } else {
                        i10++;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String v(XmlPullParser xmlPullParser) {
        String text;
        int iN = n(xmlPullParser);
        if ((iN != 4 && iN != 5) || (text = xmlPullParser.getText()) == null || !F3.a(text)) {
            return null;
        }
        return text;
    }

    public static final mj.r g(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        if (ck.p.e(xmlPullParser.getName(), VastTagName.CREATIVE)) {
            fl2.s(xmlPullParser);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    public static final mj.r f(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (ck.p.e(name, VastTagName.LINEAR)) {
            fl2.u(xmlPullParser);
        } else if (ck.p.e(name, VastTagName.COMPANION_ADS)) {
            fl2.r(xmlPullParser);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    public final void e(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.EXTENSIONS, new bk.a() { // from class: b7.l0
            @Override // bk.a
            public final Object invoke() {
                return Fl.c(xmlPullParser, this);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        a(xmlPullParser, VastTagName.COMPANION, new bk.a() { // from class: b7.p0
            @Override // bk.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this, arrayList, ref$ObjectRef, arrayList2);
            }
        });
        if (arrayList.isEmpty()) {
            C3053n9 c3053n9 = this.f22669c;
            if (c3053n9 != null) {
                c3053n9.b("VastParser", "VAST Companion Error: No Companion resources found");
                return;
            }
            return;
        }
        this.f22680n.add(new C3040ml(arrayList, arrayList2, this.f22679m));
    }

    public final void d(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, VastTagName.EXTENSION, new bk.a() { // from class: b7.j0
            @Override // bk.a
            public final Object invoke() {
                return Fl.b(xmlPullParser, this);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    public static final mj.r b(XmlPullParser xmlPullParser, Fl fl2, Ref$BooleanRef ref$BooleanRef) throws XmlPullParserException, C3214tl, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            fl2.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != -2018804923) {
                if (iHashCode != 1150879268) {
                    if (iHashCode == 1539775849 && name.equals("UniversalAdId")) {
                        String strV = fl2.v(xmlPullParser);
                        if (strV == null) {
                            strV = "";
                        }
                        fl2.f22672f = strV;
                    } else {
                        fl2.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals(VastTagName.COMPANION_ADS)) {
                    fl2.i(xmlPullParser);
                } else {
                    fl2.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals(VastTagName.LINEAR)) {
                ref$BooleanRef.element = true;
                fl2.l(xmlPullParser);
            } else {
                fl2.getClass();
                w(xmlPullParser);
            }
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.inmobi.media.Fl] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    public final Object a(String str, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        C3264vl c3264vl;
        int i10;
        if (continuationImpl instanceof C3264vl) {
            c3264vl = (C3264vl) continuationImpl;
            int i11 = c3264vl.f25591d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3264vl.f25591d = i11 - Integer.MIN_VALUE;
            } else {
                c3264vl = new C3264vl(this, continuationImpl);
            }
        } else {
            c3264vl = new C3264vl(this, continuationImpl);
        }
        Object obj = c3264vl.f25589b;
        Object objF = sj.a.f();
        int i12 = c3264vl.f25591d;
        ?? r10 = 1;
        try {
            if (i12 == 0) {
                kotlin.c.b(obj);
                c3264vl.f25588a = arrayList;
                c3264vl.f25591d = 1;
                arrayList = arrayList;
                if (a(str, c3264vl) == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = c3264vl.f25588a;
                kotlin.c.b(obj);
                arrayList = list;
            }
            r10 = this.f22672f;
            return new C3140ql(r10, this.f22673g, this.f22675i, this.f22676j, this.f22677k, this.f22680n, this.f22678l);
        } catch (C3214tl e10) {
            short s10 = e10.f25404a;
            if (s10 == 1100 || s10 == 1102) {
                i10 = 303;
            } else if (s10 == 1101 || s10 == 1124 || s10 == 1125 || s10 == 1103 || s10 == 1120 || s10 == 1121 || s10 == 1123 || s10 == 1122 || s10 == 1112 || s10 == 1109 || s10 == 1115 || s10 == 1116 || s10 == 1117) {
                i10 = 101;
            } else if (s10 == 1104) {
                i10 = 100;
            } else if (s10 == 1105 || s10 == 1106) {
                i10 = TypedValues.Custom.TYPE_INT;
            } else if (s10 == 1107) {
                i10 = 302;
            } else if (s10 == 1108 || s10 == 1114) {
                i10 = com.safedk.android.internal.d.f44769a;
            } else if (s10 == 1111) {
                i10 = 201;
            } else if (s10 == 1113) {
                i10 = 301;
            } else if (s10 == 1118) {
                i10 = 401;
            } else {
                i10 = s10 == 1119 ? 403 : 0;
            }
            Pair pairA = mj.h.a("[ERRORCODE]", String.valueOf(i10));
            Pair pairA2 = mj.h.a("[ADSERVINGID]", this.f22673g);
            Pair pairA3 = mj.h.a("[UNIVERSALADID]", this.f22672f);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = pairA;
            pairArr[r10] = pairA2;
            pairArr[2] = pairA3;
            HashMap mapL = kotlin.collections.a.l(pairArr);
            short s11 = e10.f25404a;
            if (s11 != 1102 && s11 != 1124) {
                C3065nl.a(mapL, this.f22675i, this.f22669c);
            } else {
                C3065nl.a(mapL, nj.b0.y0(this.f22674h, this.f22675i), this.f22669c);
            }
            C3053n9 c3053n9 = this.f22669c;
            ck.p.j(mapL, "macros");
            ck.p.j(arrayList, "urls");
            ArrayList<String> arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
            for (String str2 : arrayList) {
                ck.p.j(str2, "<this>");
                ck.p.j(mapL, "macros");
                String strN = str2;
                for (Map.Entry entry : mapL.entrySet()) {
                    strN = lk.x.N(strN, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                }
                arrayList2.add(strN);
            }
            for (String str3 : arrayList2) {
                C3271w3 c3271w3 = C3271w3.f25610a;
                Ag ag2 = Ag.REGULAR;
                ck.p.j(str3, "url");
                ck.p.j(ag2, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                Dg.a(ag2, new C3047n3(str3, c3053n9, null));
            }
            throw e10;
        }
    }

    public final void c(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "AdVerifications", new bk.a() { // from class: b7.k0
            @Override // bk.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, this);
            }
        });
    }

    public static final mj.r c(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        String attributeValue;
        if (ck.p.e(xmlPullParser.getName(), VastTagName.EXTENSION)) {
            try {
                attributeValue = xmlPullParser.getAttributeValue(null, "type");
            } catch (Exception unused) {
                attributeValue = "";
            }
            if (ck.p.e(attributeValue, "AdVerifications")) {
                fl2.d(xmlPullParser);
            }
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    public final C3257ve b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, TypedValues.CycleType.S_WAVE_OFFSET);
        String strB = AbstractC3090ol.b(v(xmlPullParser));
        if (!AbstractC3090ol.a(strB)) {
            return null;
        }
        if (ck.p.e(attributeValue, "progress")) {
            if (attributeValue2 == null || attributeValue2.length() == 0) {
                return null;
            }
            if (!new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(attributeValue2) && !new Regex("^0?[0-9]%$|^100%$|^[1-9][0-9]%$").matches(attributeValue2)) {
                C3053n9 c3053n9 = this.f22669c;
                if (c3053n9 != null) {
                    c3053n9.b("VastParser", "VAST Schema Validation Error: " + attributeValue2 + " is not a valid offset");
                }
            } else {
                return new O5(strB, attributeValue2);
            }
        } else {
            if (Gl.f22754a.contains(attributeValue)) {
                ck.p.g(attributeValue);
                return new C3257ve(strB, attributeValue);
            }
            C3053n9 c3053n10 = this.f22669c;
            if (c3053n10 != null) {
                c3053n10.a("VastParser", "VAST Schema Validation Error: UnKnown Event: " + attributeValue);
            }
        }
        return null;
    }

    public static final mj.r b(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        if (ck.p.e(xmlPullParser.getName(), "AdVerifications")) {
            fl2.c(xmlPullParser);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) throws Throwable {
        Cl cl2;
        if (continuationImpl instanceof Cl) {
            cl2 = (Cl) continuationImpl;
            int i10 = cl2.f22479c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cl2.f22479c = i10 - Integer.MIN_VALUE;
            } else {
                cl2 = new Cl(this, continuationImpl);
            }
        } else {
            cl2 = new Cl(this, continuationImpl);
        }
        Object obj = cl2.f22477a;
        Object objF = sj.a.f();
        int i11 = cl2.f22479c;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                if (TextUtils.isEmpty(str)) {
                    C3053n9 c3053n9 = this.f22669c;
                    if (c3053n9 != null) {
                        c3053n9.b("VastParser", "VAST Schema validation error: Empty VastXML");
                    }
                    throw new C3214tl((short) 1100);
                }
                try {
                    XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                    C3298x5.f25687a.getClass();
                    if (!C3298x5.q()) {
                        xmlPullParserFactoryNewInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                    }
                    XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                    xmlPullParserNewPullParser.setInput(new StringReader(str));
                    ck.p.i(xmlPullParserNewPullParser, "apply(...)");
                    cl2.f22479c = 1;
                    if (a(xmlPullParserNewPullParser, cl2) == objF) {
                        return objF;
                    }
                } catch (XmlPullParserException unused) {
                    C3053n9 c3053n10 = this.f22669c;
                    if (c3053n10 != null) {
                        c3053n10.b("VastParser", "VAST Schema validation error: (XmlPullParserException)");
                    }
                    throw new C3214tl((short) 1104);
                } catch (Exception unused2) {
                    C3053n9 c3053n11 = this.f22669c;
                    if (c3053n11 != null) {
                        c3053n11.b("VastParser", "VAST Schema validation error: (Exception)");
                    }
                    throw new C3214tl((short) 1105);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return mj.r.f64562a;
        } catch (C3214tl e10) {
            C3053n9 c3053n12 = this.f22669c;
            if (c3053n12 != null) {
                c3053n12.b("VastParser", "VAST Schema validation error: " + ((int) e10.f25404a));
            }
            throw e10;
        } catch (Exception e11) {
            C3053n9 c3053n13 = this.f22669c;
            if (c3053n13 != null) {
                String string = Arrays.toString(e11.getStackTrace());
                ck.p.i(string, "toString(...)");
                c3053n13.b("VastParser", "VAST Schema validation error: (Exception) " + string);
            }
            throw new C3214tl((short) 1106);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) throws Throwable {
        C3339yl c3339yl;
        Ref$BooleanRef ref$BooleanRef;
        if (continuationImpl instanceof C3339yl) {
            c3339yl = (C3339yl) continuationImpl;
            int i10 = c3339yl.f25813d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3339yl.f25813d = i10 - Integer.MIN_VALUE;
            } else {
                c3339yl = new C3339yl(this, continuationImpl);
            }
        } else {
            c3339yl = new C3339yl(this, continuationImpl);
        }
        Object obj = c3339yl.f25811b;
        Object objF = sj.a.f();
        int i11 = c3339yl.f25813d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            bk.l c3364zl = new C3364zl(this, null, ref$BooleanRef2, xmlPullParser);
            c3339yl.f25810a = ref$BooleanRef2;
            c3339yl.f25813d = 1;
            if (a(xmlPullParser, VastTagName.VAST, c3364zl, c3339yl) == objF) {
                return objF;
            }
            ref$BooleanRef = ref$BooleanRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$BooleanRef = c3339yl.f25810a;
            kotlin.c.b(obj);
        }
        if (ref$BooleanRef.element) {
            return mj.r.f64562a;
        }
        throw new C3214tl((short) 1103);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    public static final mj.r a(XmlPullParser xmlPullParser, Fl fl2, Ref$BooleanRef ref$BooleanRef) throws XmlPullParserException, C3214tl, IOException {
        String name = xmlPullParser.getName();
        if (name != null) {
            switch (name) {
                case "AdVerifications":
                    fl2.c(xmlPullParser);
                    break;
                case "Creatives":
                    ref$BooleanRef.element = true;
                    fl2.k(xmlPullParser);
                    break;
                case "AdServingId":
                    String strV = fl2.v(xmlPullParser);
                    if (strV == null) {
                        strV = "";
                    }
                    fl2.f22673g = strV;
                    break;
                case "Error":
                    C3257ve c3257veA = fl2.a("error", xmlPullParser);
                    if (c3257veA != null) {
                        fl2.f22675i.add(c3257veA);
                    }
                    break;
                case "Extensions":
                    fl2.e(xmlPullParser);
                    break;
                case "Impression":
                    fl2.f(xmlPullParser);
                    break;
                default:
                    fl2.getClass();
                    w(xmlPullParser);
                    break;
            }
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    public static final mj.r a(XmlPullParser xmlPullParser, Ref$BooleanRef ref$BooleanRef, Fl fl2, Ref$BooleanRef ref$BooleanRef2) throws XmlPullParserException, IOException {
        if (ck.p.e(xmlPullParser.getName(), VastTagName.CREATIVE)) {
            ref$BooleanRef.element = true;
            if (fl2.j(xmlPullParser)) {
                ref$BooleanRef2.element = true;
            }
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    public static final mj.r a(XmlPullParser xmlPullParser, Fl fl2, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            fl2.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != -2049897434) {
                if (iHashCode != -1927368268) {
                    if (iHashCode != -385055469) {
                        if (iHashCode == 611554000 && name.equals(VastTagName.TRACKING_EVENTS)) {
                            fl2.f22675i.addAll(fl2.o(xmlPullParser));
                        } else {
                            fl2.getClass();
                            w(xmlPullParser);
                        }
                    } else if (name.equals(VastTagName.MEDIA_FILES)) {
                        ref$BooleanRef2.element = true;
                        fl2.f22678l.addAll(fl2.m(xmlPullParser));
                    } else {
                        fl2.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals(VastTagName.DURATION)) {
                    fl2.f22677k = fl2.a(xmlPullParser);
                    ref$BooleanRef.element = true;
                } else {
                    fl2.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals(VastTagName.VIDEO_CLICKS)) {
                fl2.a(xmlPullParser, true);
            } else {
                fl2.getClass();
                w(xmlPullParser);
            }
        }
        return mj.r.f64562a;
    }

    public final String a(XmlPullParser xmlPullParser) throws XmlPullParserException, C3214tl {
        String strV = v(xmlPullParser);
        if (strV != null) {
            if (TextUtils.isEmpty(strV) ? false : new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(strV)) {
                return strV;
            }
        }
        C3053n9 c3053n9 = this.f22669c;
        if (c3053n9 != null) {
            c3053n9.b("VastParser", "VAST Schema Validation Error: Invalid Duration " + xmlPullParser.getEventType());
        }
        throw new C3214tl((short) 1115);
    }

    public static final mj.r a(XmlPullParser xmlPullParser, Fl fl2, Ref$IntRef ref$IntRef) throws XmlPullParserException, IOException {
        int i10;
        if (!ck.p.e(xmlPullParser.getName(), VastTagName.COMPANION)) {
            fl2.getClass();
            w(xmlPullParser);
            return mj.r.f64562a;
        }
        ref$IntRef.element++;
        int i11 = 0;
        try {
            String attributeValue = xmlPullParser.getAttributeValue(null, "width");
            ck.p.i(attributeValue, "getAttributeValue(...)");
            i10 = Integer.parseInt(attributeValue);
        } catch (Exception unused) {
            C3053n9 c3053n9 = fl2.f22669c;
            if (c3053n9 != null) {
                c3053n9.b("VastParser", "Invalid width encountered for a companion and ignoring that.");
            }
            i10 = 0;
        }
        try {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            ck.p.i(attributeValue2, "getAttributeValue(...)");
            i11 = Integer.parseInt(attributeValue2);
        } catch (Exception unused2) {
            C3053n9 c3053n10 = fl2.f22669c;
            if (c3053n10 != null) {
                c3053n10.b("VastParser", "Invalid height encountered for a companion and ignoring that.");
            }
        }
        if (i10 > 0 && i11 > 0) {
            fl2.h(xmlPullParser);
            return mj.r.f64562a;
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final mj.r a(XmlPullParser xmlPullParser, Fl fl2, List list, Ref$ObjectRef ref$ObjectRef, List list2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            fl2.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != -348198615) {
                if (iHashCode != 611554000) {
                    if (iHashCode != 676623548) {
                        if (iHashCode == 1877773523 && name.equals(VastTagName.COMPANION_CLICK_TRACKING)) {
                            String strB = AbstractC3090ol.b(fl2.v(xmlPullParser));
                            if (!AbstractC3090ol.a(strB)) {
                                strB = null;
                            }
                            C3257ve c3257ve = strB != null ? new C3257ve(strB, "click") : null;
                            if (c3257ve != null) {
                                list2.add(c3257ve);
                            }
                        } else {
                            fl2.getClass();
                            w(xmlPullParser);
                        }
                    } else if (name.equals(VastTagName.STATIC_RESOURCE)) {
                        fl2.a(xmlPullParser, list);
                    } else {
                        fl2.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals(VastTagName.TRACKING_EVENTS)) {
                    list2.addAll(fl2.o(xmlPullParser));
                } else {
                    fl2.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals(VastTagName.COMPANION_CLICK_THROUGH)) {
                ?? B = AbstractC3090ol.b(fl2.v(xmlPullParser));
                if (AbstractC3090ol.a(B)) {
                    ref$ObjectRef.element = B;
                } else {
                    C3053n9 c3053n9 = fl2.f22669c;
                    if (c3053n9 != null) {
                        c3053n9.b("VastParser", "Invalid ClickThrough URL: " + xmlPullParser.getText());
                    }
                }
            } else {
                fl2.getClass();
                w(xmlPullParser);
            }
        }
        return mj.r.f64562a;
    }

    public final void a(XmlPullParser xmlPullParser, List list) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "creativeType");
        String strB = AbstractC3090ol.b(v(xmlPullParser));
        if (!AbstractC3090ol.a(strB)) {
            C3053n9 c3053n9 = this.f22669c;
            if (c3053n9 != null) {
                c3053n9.a("VastParser", "VAST Companion Error: StaticResource URL is null or empty");
                return;
            }
            return;
        }
        if (attributeValue == null || lk.a0.n0(attributeValue)) {
            return;
        }
        List<String> allowedCompanionType = this.f22667a.getAllowedCompanionType();
        if (!(allowedCompanionType instanceof Collection) || !allowedCompanionType.isEmpty()) {
            Iterator<T> it = allowedCompanionType.iterator();
            while (it.hasNext()) {
                if (lk.x.E((String) it.next(), attributeValue, true)) {
                    list.add(new C3261vi(strB));
                    return;
                }
            }
        }
        C3053n9 c3053n10 = this.f22669c;
        if (c3053n10 != null) {
            c3053n10.a("VastParser", "VAST Companion Error: Format not supported - " + attributeValue);
        }
        this.f22671e = true;
    }

    public static final mj.r a(XmlPullParser xmlPullParser, Fl fl2, List list) throws XmlPullParserException, IOException {
        if (ck.p.e(xmlPullParser.getName(), VastTagName.TRACKING)) {
            C3257ve c3257veB = fl2.b(xmlPullParser);
            if (c3257veB != null) {
                list.add(c3257veB);
            }
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    public final void a(final XmlPullParser xmlPullParser, final boolean z10) {
        a(xmlPullParser, VastTagName.VIDEO_CLICKS, new bk.a() { // from class: b7.f0
            @Override // bk.a
            public final Object invoke() {
                return Fl.a(xmlPullParser, z10, this);
            }
        });
    }

    public static final mj.r a(XmlPullParser xmlPullParser, boolean z10, Fl fl2) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (ck.p.e(name, VastTagName.CLICK_THROUGH)) {
            if (z10) {
                String strB = AbstractC3090ol.b(fl2.v(xmlPullParser));
                if (AbstractC3090ol.a(strB)) {
                    fl2.f22676j = strB;
                }
            }
        } else if (ck.p.e(name, VastTagName.CLICK_TRACKING)) {
            C3257ve c3257veA = fl2.a("click", xmlPullParser);
            if (c3257veA != null) {
                fl2.f22675i.add(c3257veA);
            }
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    public final boolean a(int i10, int i11, String str, String str2, int i12) {
        if (AbstractC3090ol.a(str) && i10 > 0 && i11 > 0) {
            if (this.f22667a.getBitRate().getBitrate_mandatory() && i12 <= 0) {
                C3053n9 c3053n9 = this.f22669c;
                if (c3053n9 != null) {
                    c3053n9.b("VastParser", "VAST Schema Validation Error: Bitrate not found or invalid - " + i12);
                }
                return false;
            }
            if (lk.x.E(str2, "Progressive", true)) {
                return true;
            }
            C3053n9 c3053n10 = this.f22669c;
            if (c3053n10 != null) {
                c3053n10.b("VastParser", "VAST Schema Validation Error: Delivery type NULL or invalid - " + str2);
            }
            return false;
        }
        C3053n9 c3053n11 = this.f22669c;
        if (c3053n11 != null) {
            c3053n11.b("VastParser", "VAST Schema Validation Error: Invalid Media - " + str + com.ironsource.Z7.f27998r + i10 + ", " + i11);
        }
        return false;
    }

    public static final mj.r a(XmlPullParser xmlPullParser, Fl fl2, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, List list) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        int i12;
        if (!ck.p.e(xmlPullParser.getName(), VastTagName.MEDIA_FILE)) {
            fl2.getClass();
            w(xmlPullParser);
            return mj.r.f64562a;
        }
        ref$BooleanRef.element = true;
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        try {
            String attributeValue3 = xmlPullParser.getAttributeValue(null, VastAttributes.BITRATE);
            ck.p.i(attributeValue3, "getAttributeValue(...)");
            i10 = Integer.parseInt(attributeValue3);
        } catch (Exception unused) {
            C3053n9 c3053n9 = fl2.f22669c;
            if (c3053n9 != null) {
                c3053n9.b("VastParser", "Invalid Value for BitRate.");
            }
            i10 = 0;
        }
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
            ck.p.i(attributeValue4, "getAttributeValue(...)");
            i11 = Integer.parseInt(attributeValue4);
        } catch (Exception unused2) {
            C3053n9 c3053n10 = fl2.f22669c;
            if (c3053n10 != null) {
                c3053n10.b("VastParser", "Invalid Value for Media Width.");
            }
            i11 = 0;
        }
        try {
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "height");
            ck.p.i(attributeValue5, "getAttributeValue(...)");
            i12 = Integer.parseInt(attributeValue5);
        } catch (Exception unused3) {
            C3053n9 c3053n11 = fl2.f22669c;
            if (c3053n11 != null) {
                c3053n11.b("VastParser", "Invalid Value for Media Height.");
            }
            i12 = 0;
        }
        String strB = AbstractC3090ol.b(fl2.v(xmlPullParser));
        if (!fl2.a(i11, i12, strB, attributeValue, i10)) {
            return mj.r.f64562a;
        }
        if (attributeValue2 != null) {
            List<String> allowedContentType = fl2.f22667a.getAllowedContentType();
            if (!(allowedContentType instanceof Collection) || !allowedContentType.isEmpty()) {
                Iterator<T> it = allowedContentType.iterator();
                while (it.hasNext()) {
                    if (lk.x.E((String) it.next(), attributeValue2, true)) {
                        ck.p.g(attributeValue);
                        ck.p.g(attributeValue2);
                        list.add(new C3115pl(i11, i12, strB, attributeValue, attributeValue2, i10));
                        return mj.r.f64562a;
                    }
                }
            }
        }
        C3053n9 c3053n12 = fl2.f22669c;
        if (c3053n12 != null) {
            c3053n12.b("VastParser", "VAST Schema Validation Error: Media type Invalid - " + attributeValue2);
        }
        if (F3.a(attributeValue2)) {
            ref$BooleanRef2.element = true;
        }
        return mj.r.f64562a;
    }

    public static final mj.r a(XmlPullParser xmlPullParser, Fl fl2) throws XmlPullParserException, IOException {
        if (ck.p.e(xmlPullParser.getName(), VastTagName.VERIFICATION)) {
            fl2.p(xmlPullParser);
        } else {
            fl2.getClass();
            w(xmlPullParser);
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
    public static final mj.r a(XmlPullParser xmlPullParser, Ref$BooleanRef ref$BooleanRef, Fl fl2, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, List list) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name == null) {
            fl2.getClass();
            w(xmlPullParser);
        } else {
            int iHashCode = name.hashCode();
            if (iHashCode != 611554000) {
                if (iHashCode != 1561251035) {
                    if (iHashCode == 1749252741 && name.equals(VastTagName.VERIFICATION_PARAMETERS)) {
                        ref$ObjectRef2.element = AbstractC3090ol.b(fl2.v(xmlPullParser));
                    } else {
                        fl2.getClass();
                        w(xmlPullParser);
                    }
                } else if (name.equals(VastTagName.JAVA_SCRIPT_RESOURCE)) {
                    if (ref$BooleanRef.element) {
                        fl2.getClass();
                        w(xmlPullParser);
                        return mj.r.f64562a;
                    }
                    String attributeValue = xmlPullParser.getAttributeValue(null, VastAttributes.API_FRAMEWORK);
                    if (attributeValue != null && lk.x.R(attributeValue, CampaignEx.KEY_OMID, false, 2, null)) {
                        ref$BooleanRef.element = true;
                        ref$ObjectRef.element = AbstractC3090ol.b(fl2.v(xmlPullParser));
                    }
                } else {
                    fl2.getClass();
                    w(xmlPullParser);
                }
            } else if (name.equals(VastTagName.TRACKING_EVENTS)) {
                list.addAll(fl2.o(xmlPullParser));
            } else {
                fl2.getClass();
                w(xmlPullParser);
            }
        }
        return mj.r.f64562a;
    }

    public final C3257ve a(String str, XmlPullParser xmlPullParser) {
        String strB = AbstractC3090ol.b(v(xmlPullParser));
        if (!AbstractC3090ol.a(strB)) {
            C3053n9 c3053n9 = this.f22669c;
            if (c3053n9 == null) {
                return null;
            }
            c3053n9.b("VastParser", "Vast Tracker Error: " + str + com.ironsource.Z7.f27998r + strB);
            return null;
        }
        return new C3257ve(strB, str);
    }

    public final void a(XmlPullParser xmlPullParser, String str, bk.a aVar) {
        n(xmlPullParser);
        while (xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getName() != null && ck.p.e(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                aVar.invoke();
            }
            n(xmlPullParser);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0068 -> B:31:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0076 -> B:31:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(org.xmlpull.v1.XmlPullParser r7, java.lang.String r8, bk.l r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.inmobi.media.C3239ul
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.ul r0 = (com.inmobi.media.C3239ul) r0
            int r1 = r0.f25495f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25495f = r1
            goto L18
        L13:
            com.inmobi.media.ul r0 = new com.inmobi.media.ul
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f25493d
            java.lang.Object r1 = sj.a.f()
            int r2 = r0.f25495f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            bk.l r7 = r0.f25492c
            java.lang.String r8 = r0.f25491b
            org.xmlpull.v1.XmlPullParser r9 = r0.f25490a
            kotlin.c.b(r10)
            r10 = r6
            r5 = r9
            r9 = r7
            r7 = r5
            goto L79
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.c.b(r10)
            r6.n(r7)
            r10 = r6
        L42:
            int r2 = r7.getEventType()
            if (r2 != r3) goto L49
            goto L60
        L49:
            java.lang.String r2 = r7.getName()
            if (r2 == 0) goto L63
            java.lang.String r2 = r7.getName()
            boolean r2 = ck.p.e(r2, r8)
            if (r2 == 0) goto L63
            int r2 = r7.getEventType()
            r4 = 3
            if (r2 != r4) goto L63
        L60:
            mj.r r7 = mj.r.f64562a
            return r7
        L63:
            int r2 = r7.getEventType()
            r4 = 2
            if (r2 != r4) goto L79
            r0.f25490a = r7
            r0.f25491b = r8
            r0.f25492c = r9
            r0.f25495f = r3
            java.lang.Object r2 = r9.invoke(r0)
            if (r2 != r1) goto L79
            return r1
        L79:
            r10.n(r7)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fl.a(org.xmlpull.v1.XmlPullParser, java.lang.String, bk.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
