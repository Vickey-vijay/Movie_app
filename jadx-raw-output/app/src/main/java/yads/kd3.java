package yads;

import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
public final class kd3 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f79394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be1 f79395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jd3 f79396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z73 f79397d;

    public /* synthetic */ kd3() {
        this(new rp3(), new be1(), new jd3(), new z73());
    }

    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        this.f79394a.getClass();
        xmlPullParser.require(2, null, VastTagName.VERIFICATION);
        this.f79394a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        HashMap map = new HashMap();
        ae1 ae1Var = null;
        String strA = null;
        while (true) {
            this.f79394a.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f79394a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (ck.p.e(VastTagName.JAVA_SCRIPT_RESOURCE, name)) {
                    be1 be1Var = this.f79395b;
                    be1Var.f75791a.getClass();
                    xmlPullParser.require(2, null, VastTagName.JAVA_SCRIPT_RESOURCE);
                    be1Var.f75791a.getClass();
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, VastAttributes.API_FRAMEWORK);
                    be1Var.f75791a.getClass();
                    String attributeValue3 = xmlPullParser.getAttributeValue(null, "browserOptional");
                    Boolean boolValueOf = attributeValue3 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue3)) : null;
                    be1Var.f75791a.getClass();
                    String strA2 = rp3.a(xmlPullParser);
                    ae1Var = (attributeValue2 == null || attributeValue2.length() == 0 || boolValueOf == null || strA2.length() <= 0) ? null : new ae1(attributeValue2, strA2, boolValueOf.booleanValue());
                } else if (ck.p.e(VastTagName.VERIFICATION_PARAMETERS, name)) {
                    jd3 jd3Var = this.f79396c;
                    jd3Var.f79004a.getClass();
                    xmlPullParser.require(2, null, VastTagName.VERIFICATION_PARAMETERS);
                    jd3Var.f79004a.getClass();
                    strA = rp3.a(xmlPullParser);
                    if (strA.length() == 0) {
                        strA = null;
                    }
                } else if (ck.p.e(VastTagName.TRACKING_EVENTS, name)) {
                    map = this.f79397d.a(xmlPullParser);
                } else {
                    this.f79394a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new gd3(attributeValue, ae1Var, strA, map);
    }

    public kd3(rp3 rp3Var, be1 be1Var, jd3 jd3Var, z73 z73Var) {
        this.f79394a = rp3Var;
        this.f79395b = be1Var;
        this.f79396c = jd3Var;
        this.f79397d = z73Var;
    }
}
