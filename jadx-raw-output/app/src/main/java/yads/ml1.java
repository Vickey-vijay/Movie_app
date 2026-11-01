package yads;

import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class ml1 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f80258a;

    public /* synthetic */ ml1() {
        this(new rp3());
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final kl1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        jl1 jl1Var;
        Integer numR;
        Integer numR2;
        Integer numR3;
        this.f80258a.getClass();
        xmlPullParser.require(2, null, VastTagName.MEDIA_FILE);
        this.f80258a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        this.f80258a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        this.f80258a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "height");
        this.f80258a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
        this.f80258a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, VastAttributes.BITRATE);
        this.f80258a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, VastAttributes.API_FRAMEWORK);
        this.f80258a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "id");
        this.f80258a.getClass();
        String attributeValue8 = xmlPullParser.getAttributeValue(null, VastAttributes.CODEC);
        this.f80258a.getClass();
        String attributeValue9 = xmlPullParser.getAttributeValue(null, "vmaf");
        this.f80258a.getClass();
        String strA = rp3.a(xmlPullParser);
        jl1[] jl1VarArrValues = jl1.values();
        int length = jl1VarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                jl1Var = null;
                break;
            }
            jl1Var = jl1VarArrValues[i10];
            if (ck.p.e(jl1Var.f79089b, attributeValue)) {
                break;
            }
            i10++;
        }
        return new kl1(strA, attributeValue7, jl1Var, attributeValue2, attributeValue8, attributeValue9 != null ? lk.v.p(attributeValue9) : null, (attributeValue3 == null || (numR3 = lk.w.r(attributeValue3)) == null) ? 0 : numR3.intValue(), (attributeValue4 == null || (numR2 = lk.w.r(attributeValue4)) == null) ? 0 : numR2.intValue(), (attributeValue5 == null || (numR = lk.w.r(attributeValue5)) == null) ? 0 : numR.intValue(), attributeValue6);
    }

    public ml1(rp3 rp3Var) {
        this.f80258a = rp3Var;
    }
}
