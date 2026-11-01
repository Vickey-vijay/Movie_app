package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import io.bidmachine.iab.vast.VastLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class CompanionAdsCreativeTag extends CreativeContentTag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f59651c;

    public CompanionAdsCreativeTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f59651c = new ArrayList();
        xmlPullParser.require(2, null, VastTagName.COMPANION_ADS);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), VastTagName.COMPANION)) {
                    CompanionTag companionTag = new CompanionTag(xmlPullParser);
                    if (companionTag.isValidTag()) {
                        this.f59651c.add(companionTag);
                    } else {
                        VastLog.d("VastXmlTag", "Creative Companion: is not valid. Skipping it.", new Object[0]);
                    }
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.COMPANION_ADS);
    }

    @NonNull
    public List<CompanionTag> getCompanionTagList() {
        return this.f59651c;
    }
}
