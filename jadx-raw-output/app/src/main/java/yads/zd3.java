package yads;

import android.content.Context;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class zd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f85360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pp3 f85361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pp3 f85362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pl3 f85363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ee3 f85364e;

    public /* synthetic */ zd3(Context context, io2 io2Var) {
        this(new rp3(), new pp3(new h20(context, io2Var), VastTagName.CREATIVES, VastTagName.CREATIVE), new pp3(new kd3(), "AdVerifications", VastTagName.VERIFICATION), new pl3(), new ee3());
    }

    public final void a(XmlPullParser xmlPullParser, td3 td3Var, kn knVar) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (ck.p.e(VastTagName.IMPRESSION, name)) {
            this.f85360a.getClass();
            String strA = rp3.a(xmlPullParser);
            LinkedHashMap linkedHashMap = td3Var.f82996n;
            Object arrayList = linkedHashMap.get("impression");
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put("impression", arrayList);
            }
            ((List) arrayList).add(strA);
            return;
        }
        if (ck.p.e("ViewableImpression", name)) {
            td3Var.f82991i = this.f85363d.a(xmlPullParser);
            return;
        }
        if (ck.p.e(VastTagName.ERROR, name)) {
            this.f85360a.getClass();
            String strA2 = rp3.a(xmlPullParser);
            LinkedHashMap linkedHashMap2 = td3Var.f82996n;
            Object arrayList2 = linkedHashMap2.get("error");
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put("error", arrayList2);
            }
            ((List) arrayList2).add(strA2);
            return;
        }
        if (ck.p.e("Survey", name)) {
            this.f85360a.getClass();
            td3Var.f82989g = rp3.a(xmlPullParser);
            return;
        }
        if (ck.p.e("Description", name)) {
            this.f85360a.getClass();
            td3Var.f82988f = rp3.a(xmlPullParser);
            return;
        }
        if (ck.p.e("AdTitle", name)) {
            this.f85360a.getClass();
            td3Var.f82987e = rp3.a(xmlPullParser);
            return;
        }
        if (ck.p.e(VastTagName.AD_SYSTEM, name)) {
            this.f85360a.getClass();
            td3Var.f82986d = rp3.a(xmlPullParser);
            return;
        }
        if (ck.p.e(VastTagName.CREATIVES, name)) {
            td3Var.f82994l.addAll(this.f85361b.a(xmlPullParser, knVar));
            return;
        }
        if (ck.p.e("AdVerifications", name)) {
            td3Var.f82995m.addAll(this.f85362c.a(xmlPullParser, knVar));
            return;
        }
        if (ck.p.e(VastTagName.EXTENSIONS, name)) {
            ee3 ee3Var = this.f85364e;
            ee3Var.f77045a.getClass();
            xmlPullParser.require(2, null, VastTagName.EXTENSIONS);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            while (true) {
                ee3Var.f77045a.getClass();
                if (xmlPullParser.next() != 3) {
                    ee3Var.f77045a.getClass();
                    if (xmlPullParser.getEventType() == 2) {
                        if (ck.p.e(VastTagName.EXTENSION, xmlPullParser.getName())) {
                            String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                            if (ee3.f77044e.contains(attributeValue)) {
                                hq0 hq0VarA = ee3Var.f77046b.a(xmlPullParser);
                                if (hq0VarA != null) {
                                    arrayList4.add(hq0VarA);
                                }
                            } else if (ck.p.e(ee3.f77043d, attributeValue)) {
                                arrayList3.addAll(ee3Var.f77047c.a(xmlPullParser, knVar));
                            } else {
                                ee3Var.f77045a.getClass();
                                rp3.b(xmlPullParser);
                            }
                        } else {
                            ee3Var.f77045a.getClass();
                            rp3.b(xmlPullParser);
                        }
                    }
                } else {
                    td3Var.f82997o = new de3(nj.b0.O0(arrayList4), nj.b0.O0(arrayList3));
                    return;
                }
            }
        } else {
            this.f85360a.getClass();
            rp3.b(xmlPullParser);
        }
    }

    public zd3(rp3 rp3Var, pp3 pp3Var, pp3 pp3Var2, pl3 pl3Var, ee3 ee3Var) {
        this.f85360a = rp3Var;
        this.f85361b = pp3Var;
        this.f85362c = pp3Var2;
        this.f85363d = pl3Var;
        this.f85364e = ee3Var;
    }
}
