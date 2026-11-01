package vf;

import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastXmlTag;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f73160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f73161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f73162c;

    public a() {
        this(true, true, true);
    }

    public boolean a() {
        return this.f73161b;
    }

    public boolean b() {
        return this.f73162c;
    }

    public boolean c() {
        return this.f73160a;
    }

    public a(VastXmlTag vastXmlTag) {
        this(vastXmlTag.getBooleanAttributeValueByName(VastAttributes.FOLLOW_ADDITIONAL_WRAPPERS, true), vastXmlTag.getBooleanAttributeValueByName(VastAttributes.ALLOW_MULTIPLE_ADS, true), vastXmlTag.getBooleanAttributeValueByName(VastAttributes.FALLBACK_ON_NO_AD, true));
    }

    private a(boolean z10, boolean z11, boolean z12) {
        this.f73160a = z10;
        this.f73161b = z11;
        this.f73162c = z12;
    }
}
