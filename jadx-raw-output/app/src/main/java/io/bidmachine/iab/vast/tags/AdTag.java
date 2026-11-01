package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public class AdTag extends VastXmlTag {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f59629d = {"id"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdContentTag f59630c;

    public AdTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        AdContentTag inLineAdTag;
        super(xmlPullParser);
        xmlPullParser.require(2, null, VastTagName.AD);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, VastTagName.IN_LINE)) {
                    inLineAdTag = new InLineAdTag(xmlPullParser);
                } else if (VastXmlTag.a(name, VastTagName.WRAPPER)) {
                    inLineAdTag = new WrapperAdTag(xmlPullParser);
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
                this.f59630c = inLineAdTag;
            }
        }
        xmlPullParser.require(3, null, VastTagName.AD);
    }

    @Nullable
    public AdContentTag getAdContentTag() {
        return this.f59630c;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f59629d;
    }
}
