package yads;

import android.content.Context;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
public final class h20 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f78017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff1 f78018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f20 f78019c;

    public /* synthetic */ h20(Context context, io2 io2Var) {
        this(new rp3(), new ff1(), new f20(context, io2Var));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, JSONException, IOException {
        String str;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        this.f78017a.getClass();
        int i10 = 2;
        String str2 = null;
        xmlPullParser2.require(2, null, VastTagName.CREATIVE);
        this.f78017a.getClass();
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        e20 e20Var = null;
        String str3 = null;
        n03 n03Var = 0;
        String strA = null;
        boolean z10 = false;
        int iLongValue = 0;
        while (true) {
            this.f78017a.getClass();
            if (xmlPullParser.next() == 3) {
                String str4 = attributeValue;
                int i11 = iLongValue;
                if (!z10) {
                    return null;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof kl1) {
                        arrayList4.add(obj);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof rc1) {
                        arrayList5.add(obj2);
                    }
                }
                return new b20(arrayList4, arrayList5, arrayList2, arrayList3, e20Var, str3, n03Var, str4, i11, strA);
            }
            this.f78017a.getClass();
            if (xmlPullParser.getEventType() == i10) {
                String name = xmlPullParser.getName();
                if (ck.p.e(VastTagName.LINEAR, name)) {
                    ff1 ff1Var = this.f78018b;
                    ff1Var.f77372a.getClass();
                    xmlPullParser2.require(i10, str2, VastTagName.LINEAR);
                    ff1Var.f77375d.getClass();
                    String attributeValue2 = xmlPullParser2.getAttributeValue(str2, VastAttributes.SKIP_OFFSET);
                    if (attributeValue2 == null) {
                        attributeValue2 = "";
                    }
                    Object n03Var2 = attributeValue2.length() > 0 ? new n03(attributeValue2) : str2;
                    while (true) {
                        ff1Var.f77372a.getClass();
                        if (xmlPullParser.next() != 3) {
                            ff1Var.f77372a.getClass();
                            if (xmlPullParser.getEventType() == i10) {
                                String name2 = xmlPullParser.getName();
                                if (name2 != null) {
                                    switch (name2.hashCode()) {
                                        case -2049897434:
                                            if (name2.equals(VastTagName.VIDEO_CLICKS)) {
                                                ch3 ch3VarA = ff1Var.f77373b.a(xmlPullParser2);
                                                str3 = ch3VarA.f76283b;
                                                for (Iterator it = ch3VarA.f76282a.iterator(); it.hasNext(); it = it) {
                                                    arrayList3.add(new x73("clickTracking", (String) it.next(), null));
                                                }
                                                break;
                                            }
                                            break;
                                        case -1927368268:
                                            if (name2.equals(VastTagName.DURATION)) {
                                                dl0 dl0Var = ff1Var.f77374c;
                                                dl0Var.f76718a.getClass();
                                                xmlPullParser2.require(i10, str2, VastTagName.DURATION);
                                                dl0Var.f76718a.getClass();
                                                Long lA = xg3.a(rp3.a(xmlPullParser));
                                                if (lA != null) {
                                                    iLongValue = (int) lA.longValue();
                                                } else {
                                                    iLongValue = 0;
                                                }
                                            }
                                            break;
                                        case -1348833651:
                                            if (name2.equals(VastTagName.AD_PARAMETERS)) {
                                                ff1Var.f77372a.getClass();
                                                strA = rp3.a(xmlPullParser);
                                            }
                                            break;
                                        case -385055469:
                                            if (name2.equals(VastTagName.MEDIA_FILES)) {
                                                arrayList.addAll(ff1Var.f77376e.a(xmlPullParser2, knVar));
                                                break;
                                            }
                                            break;
                                        case 70476538:
                                            if (name2.equals("Icons")) {
                                                arrayList2.addAll(ff1Var.f77377f.a(xmlPullParser2, knVar));
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name2.equals(VastTagName.TRACKING_EVENTS)) {
                                                Iterator it2 = ff1Var.f77378g.a(xmlPullParser2, knVar).iterator();
                                                while (it2.hasNext()) {
                                                    arrayList3.add((x73) it2.next());
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                ff1Var.f77372a.getClass();
                                rp3.b(xmlPullParser);
                            }
                            i10 = 2;
                            str2 = null;
                        } else {
                            z10 = true;
                            n03Var = n03Var2;
                            i10 = 2;
                            str2 = null;
                        }
                    }
                } else if (ck.p.e("CreativeExtensions", name)) {
                    f20 f20Var = this.f78019c;
                    f20Var.f77271a.getClass();
                    xmlPullParser2.require(2, null, "CreativeExtensions");
                    dr0 dr0Var = null;
                    ArrayList arrayListA = null;
                    df1 df1Var = null;
                    while (true) {
                        f20Var.f77271a.getClass();
                        iLongValue = iLongValue;
                        if (xmlPullParser.next() != 3) {
                            f20Var.f77271a.getClass();
                            if (xmlPullParser.getEventType() != 2) {
                                str = attributeValue;
                            } else if (ck.p.e("CreativeExtension", xmlPullParser.getName())) {
                                String attributeValue3 = xmlPullParser2.getAttributeValue(null, "type");
                                if (ck.p.e("false_click", attributeValue3)) {
                                    dr0Var = (dr0) f20Var.f77273c.a(xmlPullParser2, knVar);
                                } else if (ck.p.e(f20.f77269e, attributeValue3)) {
                                    arrayListA = f20Var.f77274d.a(xmlPullParser2, knVar);
                                } else if (ck.p.e(f20.f77270f, attributeValue3)) {
                                    ef1 ef1Var = f20Var.f77272b;
                                    ef1Var.getClass();
                                    try {
                                        ef1Var.f77058b.getClass();
                                        JSONObject jSONObject = new JSONObject(rp3.a(xmlPullParser));
                                        Iterator<String> itKeys = jSONObject.keys();
                                        List listK = nj.s.k();
                                        while (itKeys.hasNext()) {
                                            Iterator<String> it3 = itKeys;
                                            String next = itKeys.next();
                                            String str5 = attributeValue;
                                            if (ck.p.e("assets", next)) {
                                                listK = ef1Var.f77057a.a(jSONObject, knVar);
                                            } else if (ck.p.e("link", next)) {
                                                ef1Var.f77059c.a(jSONObject.getJSONObject(next), knVar);
                                            }
                                            attributeValue = str5;
                                            itKeys = it3;
                                        }
                                        str = attributeValue;
                                        df1Var = new df1(listK);
                                    } catch (Exception e10) {
                                        throw new JSONException(e10.getMessage());
                                    }
                                } else {
                                    str = attributeValue;
                                    f20Var.f77271a.getClass();
                                    rp3.b(xmlPullParser);
                                }
                            } else {
                                str = attributeValue;
                                f20Var.f77271a.getClass();
                                rp3.b(xmlPullParser);
                            }
                            xmlPullParser2 = xmlPullParser;
                            attributeValue = str;
                        } else {
                            e20Var = new e20(dr0Var, arrayListA, df1Var);
                            iLongValue = iLongValue;
                            i10 = 2;
                            str2 = null;
                            xmlPullParser2 = xmlPullParser;
                        }
                    }
                } else {
                    this.f78017a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
            xmlPullParser2 = xmlPullParser;
            iLongValue = iLongValue;
            attributeValue = attributeValue;
            n03Var = n03Var;
            i10 = 2;
            str2 = null;
        }
    }

    public h20(rp3 rp3Var, ff1 ff1Var, f20 f20Var) {
        this.f78017a = rp3Var;
        this.f78018b = ff1Var;
        this.f78019c = f20Var;
    }
}
