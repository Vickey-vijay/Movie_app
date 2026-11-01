package io.bidmachine.iab.vast.tags;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.vast.VastLog;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
public class PostBannerTag extends VastXmlTag {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f59676g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IabElementStyle f59672c = new IabElementStyle();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IabElementStyle f59673d = new IabElementStyle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IabElementStyle f59674e = new IabElementStyle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IabElementStyle f59675f = new IabElementStyle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f59677h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f59678i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f59679j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f59680k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f59681l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f59682m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f59683n = false;

    @Override // io.bidmachine.iab.vast.tags.VastXmlTag
    public void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        IabElementStyle iabElementStyle;
        xmlPullParser.require(2, null, VastTagName.POSTBANNER);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                try {
                    String name = xmlPullParser.getName();
                    if (VastXmlTag.a(name, VastTagName.CLOSE_TIME)) {
                        String strC = VastXmlTag.c(xmlPullParser);
                        if (!TextUtils.isEmpty(strC)) {
                            this.f59677h = Float.parseFloat(strC);
                        }
                    } else if (VastXmlTag.a(name, VastTagName.DURATION)) {
                        String strC2 = VastXmlTag.c(xmlPullParser);
                        if (!TextUtils.isEmpty(strC2)) {
                            this.f59678i = Float.parseFloat(strC2);
                        }
                    } else {
                        if (VastXmlTag.a(name, VastTagName.CLOSEABLE_VIEW)) {
                            iabElementStyle = this.f59672c;
                        } else if (VastXmlTag.a(name, VastTagName.COUNTDOWN)) {
                            iabElementStyle = this.f59673d;
                        } else if (VastXmlTag.a(name, VastTagName.LOADING_VIEW)) {
                            iabElementStyle = this.f59674e;
                        } else if (VastXmlTag.a(name, VastTagName.PROGRESS)) {
                            iabElementStyle = this.f59675f;
                        } else if (VastXmlTag.a(name, VastTagName.USE_NATIVE_CLOSE)) {
                            this.f59681l = VastXmlTag.b(xmlPullParser);
                        } else if (VastXmlTag.a(name, VastTagName.IGNORE_SAFE_AREA)) {
                            this.f59680k = VastXmlTag.b(xmlPullParser);
                        } else if (VastXmlTag.a(name, VastTagName.PRODUCT_LINK)) {
                            this.f59676g = VastXmlTag.c(xmlPullParser);
                        } else if (VastXmlTag.a(name, VastTagName.R1)) {
                            this.f59682m = VastXmlTag.b(xmlPullParser);
                        } else if (VastXmlTag.a(name, VastTagName.R2)) {
                            this.f59683n = VastXmlTag.b(xmlPullParser);
                        } else {
                            VastXmlTag.d(xmlPullParser);
                        }
                        VastXmlTag.a(xmlPullParser, iabElementStyle);
                    }
                } catch (Throwable th2) {
                    VastLog.e("VastXmlTag", th2);
                }
            }
        }
        xmlPullParser.require(3, null, VastTagName.POSTBANNER);
    }

    @NonNull
    public IabElementStyle getCloseStyle() {
        return this.f59672c;
    }

    public float getCloseTimeSec() {
        return this.f59677h;
    }

    @NonNull
    public IabElementStyle getCountDownStyle() {
        return this.f59673d;
    }

    public float getDurationSec() {
        return this.f59678i;
    }

    @NonNull
    public IabElementStyle getLoadingStyle() {
        return this.f59674e;
    }

    @Nullable
    public String getProductLink() {
        return this.f59676g;
    }

    @NonNull
    public IabElementStyle getProgressStyle() {
        return this.f59675f;
    }

    public boolean isForceUseNativeClose() {
        return this.f59681l;
    }

    public boolean isIgnoreSafeArea() {
        return this.f59680k;
    }

    public boolean isR1() {
        return this.f59682m;
    }

    public boolean isR2() {
        return this.f59683n;
    }

    public boolean isVisible() {
        return this.f59679j;
    }

    public void setCloseTimeSec(int i10) {
        this.f59677h = i10;
    }

    public void setVisible(boolean z10) {
        this.f59679j = z10;
    }
}
