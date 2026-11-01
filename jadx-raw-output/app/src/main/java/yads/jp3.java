package yads;

import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes9.dex */
public final class jp3 {
    public static boolean a(XmlPullParser xmlPullParser, String str, boolean z10) {
        Boolean boolJ1;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return z10;
        }
        String lowerCase = attributeValue.toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "toLowerCase(...)");
        return (lowerCase == null || (boolJ1 = lk.a0.j1(lowerCase)) == null) ? z10 : boolJ1.booleanValue();
    }
}
