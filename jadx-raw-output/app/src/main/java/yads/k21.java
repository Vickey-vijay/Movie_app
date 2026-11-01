package yads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public final class k21 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f79285a;

    public /* synthetic */ k21() {
        this(new rp3());
    }

    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        int i10;
        f21 f21Var;
        this.f79285a.getClass();
        int i11 = 2;
        i21 i21Var = null;
        xmlPullParser.require(2, null, "Icon");
        this.f79285a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "program");
        this.f79285a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        this.f79285a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
        this.f79285a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f79285a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f79285a.getClass();
        xmlPullParser.getAttributeValue(null, VastAttributes.API_FRAMEWORK);
        this.f79285a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, TypedValues.CycleType.S_WAVE_OFFSET);
        this.f79285a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "duration");
        while (true) {
            this.f79285a.getClass();
            i10 = 0;
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f79285a.getClass();
            if (xmlPullParser.getEventType() == i11) {
                String name = xmlPullParser.getName();
                h21.f78020c.getClass();
                h21[] h21VarArrValues = h21.values();
                int length = h21VarArrValues.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        this.f79285a.getClass();
                        rp3.b(xmlPullParser);
                        break;
                    }
                    if (ck.p.e(h21VarArrValues[i12].f78022b, name)) {
                        this.f79285a.getClass();
                        rp3.a(xmlPullParser);
                        h21[] h21VarArrValues2 = h21.values();
                        int length2 = h21VarArrValues2.length;
                        while (i10 < length2 && !ck.p.e(h21VarArrValues2[i10].f78022b, name)) {
                            i10++;
                        }
                        break;
                    }
                    i12++;
                }
                i11 = 2;
            }
        }
        xg3.b(attributeValue2);
        xg3.b(attributeValue3);
        f21[] f21VarArrValues = f21.values();
        int length3 = f21VarArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length3) {
                f21Var = null;
                break;
            }
            f21Var = f21VarArrValues[i13];
            if (ck.p.e(f21Var.f77277b, attributeValue4)) {
                break;
            }
            i13++;
        }
        if (f21Var == null) {
            f21Var = f21.f77275c;
        }
        if (f21Var == f21.f77275c) {
            xg3.b(attributeValue4);
        }
        i21[] i21VarArrValues = i21.values();
        int length4 = i21VarArrValues.length;
        while (i10 < length4) {
            i21 i21Var2 = i21VarArrValues[i10];
            if (ck.p.e(i21Var2.f78457b, attributeValue5)) {
                i21Var = i21Var2;
                break;
            }
            i10++;
        }
        if (i21Var == null) {
            i21Var = i21.f78455c;
        }
        if (i21Var == i21.f78455c) {
            xg3.b(attributeValue5);
        }
        xg3.a(attributeValue6);
        xg3.a(attributeValue7);
        return new j21(attributeValue);
    }

    public k21(rp3 rp3Var) {
        this.f79285a = rp3Var;
    }
}
