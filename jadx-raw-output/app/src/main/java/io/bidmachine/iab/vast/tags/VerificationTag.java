package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
public class VerificationTag extends VastXmlTag {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f59691e = {"vendor"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JavaScriptResourceTag f59692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f59693d;

    public VerificationTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, VastTagName.VERIFICATION);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, VastTagName.JAVA_SCRIPT_RESOURCE)) {
                    this.f59692c = new JavaScriptResourceTag(xmlPullParser);
                } else if (VastXmlTag.a(name, VastTagName.VERIFICATION_PARAMETERS)) {
                    this.f59693d = VastXmlTag.c(xmlPullParser);
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.VERIFICATION);
    }

    @Nullable
    public JavaScriptResourceTag getJavaScriptResourceTag() {
        return this.f59692c;
    }

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    @NonNull
    public String[] getSupportedAttributes() {
        return f59691e;
    }

    @Nullable
    public String getVendor() {
        return a("vendor");
    }

    @Nullable
    public String getVerificationParameters() {
        return this.f59693d;
    }
}
