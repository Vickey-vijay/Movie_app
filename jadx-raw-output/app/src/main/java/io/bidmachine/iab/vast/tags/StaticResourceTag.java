package io.bidmachine.iab.vast.tags;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes5.dex */
public class StaticResourceTag extends VastXmlTag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f59684c = {"creativeType"};

    public StaticResourceTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f59684c;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    public boolean isTextSupported() {
        return true;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    public boolean isValidTag() {
        String strA = a("creativeType");
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        return strA.matches("image/.*(?i)(gif|jpeg|jpg|bmp|png)");
    }
}
