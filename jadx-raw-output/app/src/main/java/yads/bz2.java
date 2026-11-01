package yads;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public final class bz2 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f76070a;

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final hq0 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f76070a.getClass();
        xmlPullParser.require(2, null, VastTagName.EXTENSION);
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        this.f76070a.getClass();
        String strA = rp3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || strA.length() <= 0) {
            return null;
        }
        return new hq0(attributeValue, strA);
    }

    public bz2(rp3 rp3Var) {
        this.f76070a = rp3Var;
    }
}
