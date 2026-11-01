package yads;

import android.util.Base64;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
public final class sc1 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f82597a;

    public /* synthetic */ sc1() {
        this(new rp3());
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final rc1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Integer numR;
        Integer numR2;
        this.f82597a.getClass();
        xmlPullParser.require(2, null, "InteractiveCreativeFile");
        this.f82597a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        if (attributeValue == null) {
            return null;
        }
        this.f82597a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        if (attributeValue2 != null && (numR = lk.w.r(attributeValue2)) != null) {
            int iIntValue = numR.intValue();
            this.f82597a.getClass();
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
            if (attributeValue3 != null && (numR2 = lk.w.r(attributeValue3)) != null) {
                int iIntValue2 = numR2.intValue();
                this.f82597a.getClass();
                String strA = rp3.a(xmlPullParser);
                if (lk.a0.X(attributeValue, CreativeInfo.f44315al, false, 2, null) != ((strA.length() > 0) & true)) {
                    strA = null;
                }
                String str = strA != null ? new String(Base64.decode(strA, 0), StandardCharsets.UTF_8) : null;
                if (str == null) {
                    return null;
                }
                return new rc1(iIntValue, iIntValue2, str, attributeValue);
            }
        }
        return null;
    }

    public sc1(rp3 rp3Var) {
        this.f82597a = rp3Var;
    }
}
