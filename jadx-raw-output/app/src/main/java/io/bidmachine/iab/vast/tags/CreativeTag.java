package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class CreativeTag extends VastXmlTag {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f59660d = {"id", VastAttributes.AD_ID};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CreativeContentTag f59661c;

    public CreativeTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        CreativeContentTag linearCreativeTag;
        super(xmlPullParser);
        xmlPullParser.require(2, null, VastTagName.CREATIVE);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, VastTagName.LINEAR)) {
                    linearCreativeTag = new LinearCreativeTag(xmlPullParser);
                } else if (VastXmlTag.a(name, VastTagName.COMPANION_ADS)) {
                    linearCreativeTag = new CompanionAdsCreativeTag(xmlPullParser);
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
                this.f59661c = linearCreativeTag;
            }
        }
        xmlPullParser.require(3, null, VastTagName.CREATIVE);
    }

    @Nullable
    public CreativeContentTag getCreativeContentTag() {
        return this.f59661c;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f59660d;
    }
}
