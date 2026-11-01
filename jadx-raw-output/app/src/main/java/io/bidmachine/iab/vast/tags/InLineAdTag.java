package io.bidmachine.iab.vast.tags;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
public class InLineAdTag extends AdContentTag {
    public InLineAdTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, VastTagName.IN_LINE);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, VastTagName.CREATIVES)) {
                    a(e(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.EXTENSIONS)) {
                    b(g(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.IMPRESSION)) {
                    m(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.ERROR)) {
                    l(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.AD_SYSTEM)) {
                    a(new AdSystemTag(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.IN_LINE);
    }
}
