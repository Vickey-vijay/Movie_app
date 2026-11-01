package yads;

import android.content.Context;
import android.util.Xml;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public final class ed3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f77036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dc3 f77037b;

    public /* synthetic */ ed3(Context context, io2 io2Var) {
        this(new rp3(), new dc3(context, io2Var));
    }

    public final zb3 a(String str, kn knVar) throws XmlPullParserException, IOException {
        ud3 ud3VarA;
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        boolean z10 = false;
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.nextTag();
        this.f77036a.getClass();
        xmlPullParserNewPullParser.require(2, null, VastTagName.VAST);
        dc3 dc3Var = this.f77037b;
        dc3Var.f76634a.getClass();
        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            dc3Var.f76634a.getClass();
            int i10 = 3;
            if (xmlPullParserNewPullParser.next() == 3) {
                break;
            }
            dc3Var.f76634a.getClass();
            if (xmlPullParserNewPullParser.getEventType() == 2) {
                if (ck.p.e(VastTagName.AD, xmlPullParserNewPullParser.getName())) {
                    xe3 xe3Var = dc3Var.f76635b;
                    xe3Var.f84569e.f79306a.getClass();
                    xmlPullParserNewPullParser.require(2, null, VastTagName.AD);
                    String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, "id");
                    if (attributeValue2 == null || attributeValue2.length() == 0) {
                        attributeValue2 = null;
                    }
                    xe3Var.f84568d.f81643a.getClass();
                    xmlPullParserNewPullParser.require(2, null, VastTagName.AD);
                    Integer numB = xg3.b(xmlPullParserNewPullParser.getAttributeValue(null, "sequence"));
                    if (numB != null && numB.intValue() < 0) {
                        numB = null;
                    }
                    xe3Var.f84565a.getClass();
                    xmlPullParserNewPullParser.require(2, null, VastTagName.AD);
                    while (true) {
                        ud3VarA = null;
                        while (true) {
                            xe3Var.f84565a.getClass();
                            if (xmlPullParserNewPullParser.next() == i10) {
                                break;
                            }
                            xe3Var.f84565a.getClass();
                            if (xmlPullParserNewPullParser.getEventType() == 2) {
                                String name = xmlPullParserNewPullParser.getName();
                                if (ck.p.e(VastTagName.IN_LINE, name)) {
                                    td3 td3Var = new td3(z10, new kg3(xe3Var.f84570f));
                                    td3Var.f82993k = attributeValue2;
                                    td3Var.f82992j = numB;
                                    h61 h61Var = xe3Var.f84566b;
                                    h61Var.f78076b.getClass();
                                    xmlPullParserNewPullParser.require(2, null, VastTagName.IN_LINE);
                                    while (true) {
                                        h61Var.f78076b.getClass();
                                        if (xmlPullParserNewPullParser.next() == 3) {
                                            break;
                                        }
                                        h61Var.f78076b.getClass();
                                        if (xmlPullParserNewPullParser.getEventType() == 2) {
                                            h61Var.f78075a.a(xmlPullParserNewPullParser, td3Var, knVar);
                                        }
                                    }
                                    ud3VarA = td3Var.a();
                                    if (ud3VarA.f83422b.isEmpty()) {
                                        i10 = 3;
                                    } else {
                                        i10 = 3;
                                    }
                                } else if (ck.p.e(VastTagName.WRAPPER, name)) {
                                    td3 td3Var2 = new td3(true, new kg3(xe3Var.f84570f));
                                    td3Var2.f82993k = attributeValue2;
                                    td3Var2.f82992j = numB;
                                    lp3 lp3Var = xe3Var.f84567c;
                                    lp3Var.f79877a.getClass();
                                    xmlPullParserNewPullParser.require(2, null, VastTagName.WRAPPER);
                                    lp3Var.f79879c.getClass();
                                    td3Var2.f82985c = new ip3(jp3.a(xmlPullParserNewPullParser, VastAttributes.ALLOW_MULTIPLE_ADS, z10), jp3.a(xmlPullParserNewPullParser, VastAttributes.FOLLOW_ADDITIONAL_WRAPPERS, true));
                                    while (true) {
                                        lp3Var.f79877a.getClass();
                                        i10 = 3;
                                        if (xmlPullParserNewPullParser.next() == 3) {
                                            break;
                                        }
                                        lp3Var.f79877a.getClass();
                                        if (xmlPullParserNewPullParser.getEventType() == 2) {
                                            if (ck.p.e(VastTagName.VAST_AD_TAG_URI, xmlPullParserNewPullParser.getName())) {
                                                lp3Var.f79877a.getClass();
                                                td3Var2.f82990h = rp3.a(xmlPullParserNewPullParser);
                                            } else {
                                                lp3Var.f79878b.a(xmlPullParserNewPullParser, td3Var2, knVar);
                                            }
                                        }
                                    }
                                    ud3VarA = td3Var2.a();
                                } else {
                                    i10 = 3;
                                    xe3Var.f84565a.getClass();
                                    rp3.b(xmlPullParserNewPullParser);
                                }
                            }
                            z10 = false;
                        }
                    }
                    if (ud3VarA != null) {
                        arrayList.add(ud3VarA);
                    }
                } else {
                    dc3Var.f76634a.getClass();
                    rp3.b(xmlPullParserNewPullParser);
                }
                z10 = false;
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new zb3(attributeValue, arrayList);
    }

    public ed3(rp3 rp3Var, dc3 dc3Var) {
        this.f77036a = rp3Var;
        this.f77037b = dc3Var;
    }
}
