package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class VastTag extends VastXmlTag {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f59687d = {"version"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f59688c;

    public VastTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f59688c = new ArrayList();
        xmlPullParser.require(2, null, VastTagName.VAST);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), VastTagName.AD)) {
                    this.f59688c.add(new AdTag(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.VAST);
    }

    @NonNull
    public List<AdTag> getAdTagList() {
        return this.f59688c;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f59687d;
    }

    public boolean hasAd() {
        return !this.f59688c.isEmpty();
    }
}
