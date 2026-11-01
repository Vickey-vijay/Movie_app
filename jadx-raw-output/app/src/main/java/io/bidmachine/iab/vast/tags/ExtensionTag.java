package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes10.dex */
public class ExtensionTag extends VastXmlTag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f59662c = {"type"};

    public ExtensionTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f59662c;
    }
}
