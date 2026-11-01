package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes11.dex */
public class TrackingTag extends VastXmlTag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f59686c = {"event"};

    public TrackingTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f59686c;
    }
}
