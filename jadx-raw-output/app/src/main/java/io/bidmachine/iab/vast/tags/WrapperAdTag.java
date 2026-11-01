package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
public class WrapperAdTag extends AdContentTag {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f59697i = {VastAttributes.FOLLOW_ADDITIONAL_WRAPPERS, VastAttributes.ALLOW_MULTIPLE_ADS, VastAttributes.FALLBACK_ON_NO_AD};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f59698h;

    public WrapperAdTag(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, VastTagName.WRAPPER);
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
                } else if (VastXmlTag.a(name, VastTagName.VAST_AD_TAG_URI)) {
                    n(VastXmlTag.c(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.WRAPPER);
    }

    private void n(String str) {
        this.f59698h = str;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f59697i;
    }

    @Nullable
    public String getVastAdTagUri() {
        return this.f59698h;
    }
}
