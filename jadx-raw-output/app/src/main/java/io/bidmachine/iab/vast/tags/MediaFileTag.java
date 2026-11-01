package io.bidmachine.iab.vast.tags;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes5.dex */
public class MediaFileTag extends VastXmlTag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f59671c = {"delivery", "type", "width", "height", VastAttributes.CODEC, "id", VastAttributes.BITRATE, VastAttributes.MIN_BITRATE, VastAttributes.MAX_BITRATE, VastAttributes.SCALABLE, VastAttributes.MAINTAIN_ASPECT_RATION, VastAttributes.API_FRAMEWORK};

    public MediaFileTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Nullable
    public String getApiFramework() {
        return a(VastAttributes.API_FRAMEWORK);
    }

    public int getHeight() {
        return b("height");
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f59671c;
    }

    @Nullable
    public String getType() {
        return a("type");
    }

    public int getWidth() {
        return b("width");
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    public boolean isTextSupported() {
        return true;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    public boolean isValidTag() {
        return (TextUtils.isEmpty(a("type")) || TextUtils.isEmpty(a("width")) || TextUtils.isEmpty(a("height")) || TextUtils.isEmpty(getText())) ? false : true;
    }
}
