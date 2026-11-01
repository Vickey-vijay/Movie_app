package io.bidmachine.iab.vast.tags;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.vast.VastExtension;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class AppodealExtensionTag extends ExtensionTag implements VastExtension {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IabElementStyle f59632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IabElementStyle f59633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IabElementStyle f59634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final IabElementStyle f59635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final IabElementStyle f59636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IabElementStyle f59637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IabElementStyle f59638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IabElementStyle f59639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PostBannerTag f59640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f59641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f59642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CompanionTag f59643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f59644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Float f59645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f59646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f59647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f59648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f59649u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f59650v;

    public AppodealExtensionTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        IabElementStyle iabElementStyle;
        IabElementStyle iabElementStyle2;
        IabElementStyle iabElementStyle3;
        IabElementStyle iabElementStyle4;
        super(xmlPullParser);
        this.f59632d = new IabElementStyle();
        this.f59633e = new IabElementStyle();
        this.f59634f = new IabElementStyle();
        this.f59635g = new IabElementStyle();
        this.f59636h = new IabElementStyle();
        this.f59637i = new IabElementStyle();
        this.f59638j = new IabElementStyle();
        this.f59639k = new IabElementStyle();
        this.f59640l = new PostBannerTag();
        this.f59646r = false;
        this.f59647s = false;
        this.f59648t = false;
        this.f59649u = false;
        xmlPullParser.require(2, null, VastTagName.EXTENSION);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, VastTagName.VIDEO)) {
                    iabElementStyle = this.f59632d;
                } else if (VastXmlTag.a(name, VastTagName.LOADING_VIEW)) {
                    iabElementStyle = this.f59638j;
                } else if (VastXmlTag.a(name, VastTagName.COUNTDOWN)) {
                    iabElementStyle = this.f59639k;
                } else if (VastXmlTag.a(name, VastTagName.PROGRESS)) {
                    iabElementStyle = this.f59636h;
                } else if (VastXmlTag.a(name, VastTagName.CLOSEABLE_VIEW)) {
                    iabElementStyle = this.f59635g;
                } else if (VastXmlTag.a(name, VastTagName.MUTE)) {
                    iabElementStyle = this.f59634f;
                } else if (VastXmlTag.a(name, "CTA")) {
                    iabElementStyle = this.f59633e;
                } else if (VastXmlTag.a(name, VastTagName.REPEAT_VIEW)) {
                    iabElementStyle = this.f59637i;
                } else if (VastXmlTag.a(name, VastTagName.POSTBANNER)) {
                    this.f59640l.parse(xmlPullParser);
                } else if (VastXmlTag.a(name, VastTagName.AUTO_ROTATE)) {
                    this.f59644p = Boolean.valueOf(VastXmlTag.b(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.R1)) {
                    this.f59648t = VastXmlTag.b(xmlPullParser);
                } else if (VastXmlTag.a(name, VastTagName.R2)) {
                    this.f59649u = VastXmlTag.b(xmlPullParser);
                } else if (VastXmlTag.a(name, VastTagName.FORCE_ORIENTATION)) {
                    this.f59650v = VastXmlTag.g(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, VastTagName.CTA_TEXT)) {
                    this.f59633e.setContent(VastXmlTag.c(xmlPullParser));
                } else {
                    if (VastXmlTag.a(name, VastTagName.SHOW_CTA)) {
                        iabElementStyle2 = this.f59633e;
                    } else if (VastXmlTag.a(name, VastTagName.SHOW_MUTE)) {
                        iabElementStyle2 = this.f59634f;
                    } else if (VastXmlTag.a(name, VastTagName.SHOW_COMPANION)) {
                        this.f59640l.setVisible(VastXmlTag.b(xmlPullParser));
                    } else if (VastXmlTag.a(name, VastTagName.COMPANION_CLOSE_TIME)) {
                        int iF = VastXmlTag.f(VastXmlTag.c(xmlPullParser));
                        if (iF > -1) {
                            this.f59640l.setCloseTimeSec(iF);
                        }
                    } else if (VastXmlTag.a(name, VastTagName.MUTED)) {
                        this.f59646r = VastXmlTag.b(xmlPullParser);
                    } else if (VastXmlTag.a(name, VastTagName.VIDEO_CLICKABLE)) {
                        this.f59647s = VastXmlTag.b(xmlPullParser);
                    } else {
                        if (VastXmlTag.a(name, VastTagName.CTA_X_POSITION)) {
                            iabElementStyle3 = this.f59633e;
                        } else {
                            if (VastXmlTag.a(name, VastTagName.CTA_Y_POSITION)) {
                                iabElementStyle4 = this.f59633e;
                            } else if (VastXmlTag.a(name, VastTagName.CLOSE_X_POSITION)) {
                                iabElementStyle3 = this.f59635g;
                            } else if (VastXmlTag.a(name, VastTagName.CLOSE_Y_POSITION)) {
                                iabElementStyle4 = this.f59635g;
                            } else if (VastXmlTag.a(name, VastTagName.MUTE_X_POSITION)) {
                                iabElementStyle3 = this.f59634f;
                            } else if (VastXmlTag.a(name, VastTagName.MUTE_Y_POSITION)) {
                                iabElementStyle4 = this.f59634f;
                            } else if (VastXmlTag.a(name, VastTagName.ASSETS_COLOR)) {
                                Integer numC = VastXmlTag.c(VastXmlTag.c(xmlPullParser));
                                if (numC != null) {
                                    this.f59641m = numC;
                                }
                            } else if (VastXmlTag.a(name, VastTagName.ASSETS_BACKGROUND_COLOR)) {
                                Integer numC2 = VastXmlTag.c(VastXmlTag.c(xmlPullParser));
                                if (numC2 != null) {
                                    this.f59642n = numC2;
                                }
                            } else if (VastXmlTag.a(name, VastTagName.COMPANION)) {
                                CompanionTag companionTag = new CompanionTag(xmlPullParser);
                                if (companionTag.isValidTag() && companionTag.hasCreative()) {
                                    this.f59643o = companionTag;
                                }
                            } else if (VastXmlTag.a(name, VastTagName.CLOSE_TIME)) {
                                String strC = VastXmlTag.c(xmlPullParser);
                                if (strC != null) {
                                    this.f59645q = Float.valueOf(Float.parseFloat(strC));
                                }
                            } else if (VastXmlTag.a(name, VastTagName.SHOW_PROGRESS)) {
                                iabElementStyle2 = this.f59636h;
                            } else {
                                VastXmlTag.d(xmlPullParser);
                            }
                            iabElementStyle4.setVerticalPosition(VastXmlTag.i(VastXmlTag.c(xmlPullParser)));
                        }
                        iabElementStyle3.setHorizontalPosition(VastXmlTag.h(VastXmlTag.c(xmlPullParser)));
                    }
                    iabElementStyle2.setVisible(Boolean.valueOf(VastXmlTag.b(xmlPullParser)));
                }
                VastXmlTag.a(xmlPullParser, iabElementStyle);
            }
        }
        xmlPullParser.require(3, null, VastTagName.EXTENSION);
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public Integer getAssetsBackgroundColor() {
        return this.f59642n;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public Integer getAssetsColor() {
        return this.f59641m;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getCloseStyle() {
        return this.f59635g;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public Float getCloseTimeSec() {
        return this.f59645q;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public CompanionTag getCompanionTag() {
        return this.f59643o;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getCountDownStyle() {
        return this.f59639k;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getCtaStyle() {
        return this.f59633e;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public Integer getForceOrientation() {
        return this.f59650v;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getLoadingStyle() {
        return this.f59638j;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getMuteStyle() {
        return this.f59634f;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public PostBannerTag getPostBannerTag() {
        return this.f59640l;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getProgressStyle() {
        return this.f59636h;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getRepeatStyle() {
        return this.f59637i;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @NonNull
    public IabElementStyle getVideoStyle() {
        return this.f59632d;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    @Nullable
    public Boolean isAutoRotate() {
        return this.f59644p;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    public boolean isMuted() {
        return this.f59646r;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    public boolean isR1() {
        return this.f59648t;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    public boolean isR2() {
        return this.f59649u;
    }

    @Override // io.bidmachine.iab.vast.VastExtension
    public boolean isVideoClickable() {
        return this.f59647s;
    }
}
