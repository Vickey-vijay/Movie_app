package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.C3232ue;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3232ue extends AbstractC3317y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3186si f25464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sg f25465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D4 f25466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC2819e1 f25467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nc f25468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ec f25469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nk.l0 f25470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mj.g f25471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mj.g f25472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mj.g f25473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mj.g f25474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mj.g f25475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mj.g f25476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final mj.g f25477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mj.g f25478p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3232ue(C3186si c3186si, Sg sg2, D4 d10, AbstractC2819e1 abstractC2819e1, Nc nc2, Ec ec2) {
        super(ec2.f22583a);
        ck.p.j(c3186si, "renderedStateCache");
        ck.p.j(sg2, "publisherNativeViewData");
        ck.p.j(d10, "contextualDataHandler");
        ck.p.j(abstractC2819e1, "adSessionManager");
        ck.p.j(nc2, "nativeBeaconProcessor");
        ck.p.j(ec2, "nativeAdUnitComponent");
        this.f25464b = c3186si;
        this.f25465c = sg2;
        this.f25466d = d10;
        this.f25467e = abstractC2819e1;
        this.f25468f = nc2;
        this.f25469g = ec2;
        this.f25470h = P4.a(k());
        this.f25471i = kotlin.b.a(new bk.a() { // from class: b7.na
            @Override // bk.a
            public final Object invoke() {
                return C3232ue.g(this.f5084b);
            }
        });
        this.f25472j = kotlin.b.a(new bk.a() { // from class: b7.oa
            @Override // bk.a
            public final Object invoke() {
                return C3232ue.c(this.f5106b);
            }
        });
        this.f25473k = kotlin.b.a(new bk.a() { // from class: b7.pa
            @Override // bk.a
            public final Object invoke() {
                return C3232ue.e(this.f5130b);
            }
        });
        this.f25474l = kotlin.b.a(new bk.a() { // from class: b7.qa
            @Override // bk.a
            public final Object invoke() {
                return C3232ue.h(this.f5148b);
            }
        });
        this.f25475m = kotlin.b.a(new bk.a() { // from class: b7.ra
            @Override // bk.a
            public final Object invoke() {
                return C3232ue.b(this.f5160b);
            }
        });
        this.f25476n = kotlin.b.a(new bk.a() { // from class: b7.sa
            @Override // bk.a
            public final Object invoke() {
                return C3232ue.a(this.f5173b);
            }
        });
        this.f25477o = kotlin.b.a(new bk.a() { // from class: b7.ta
            @Override // bk.a
            public final Object invoke() {
                return C3232ue.f(this.f5188b);
            }
        });
        this.f25478p = kotlin.b.a(new bk.a() { // from class: b7.ua
            @Override // bk.a
            public final Object invoke() {
                return C3232ue.d(this.f5206b);
            }
        });
    }

    public static final C3062ni a(C3232ue c3232ue) {
        return new C3062ni(c3232ue.f25466d, c3232ue.f25467e, c3232ue.f25469g);
    }

    public static final Sc b(C3232ue c3232ue) {
        Ec ec2 = c3232ue.f25469g;
        AbstractC2819e1 abstractC2819e1 = c3232ue.f25467e;
        D4 d10 = c3232ue.f25466d;
        Nc nc2 = c3232ue.f25468f;
        C2957jd c2957jd = (C2957jd) c3232ue.f25478p.getValue();
        InterfaceC3028m9 interfaceC3028m9L = c3232ue.l();
        ck.p.j(ec2, "<this>");
        ck.p.j(abstractC2819e1, "clickSession");
        ck.p.j(d10, "contextualDataHandler");
        ck.p.j(nc2, "nativeBeaconProcessor");
        ck.p.j(c2957jd, "nativeLandingPageHandler");
        ck.p.j(ec2, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonAssetObject assetsObject = ec2.f22584b.getAssetsObject();
        if (assetsObject != null) {
            Title title = assetsObject.getTitle();
            if (title != null) {
                Link link = title.getLink();
                linkedHashMap.put((short) 3, new Kc(link != null ? link.getUrl() : null, title.getTrackers()));
            }
            Description description = assetsObject.getDescription();
            if (description != null) {
                Link link2 = description.getLink();
                linkedHashMap.put((short) 4, new Kc(link2 != null ? link2.getUrl() : null, description.getTrackers()));
            }
            Icon icon = assetsObject.getIcon();
            if (icon != null) {
                Link link3 = icon.getLink();
                linkedHashMap.put((short) 5, new Kc(link3 != null ? link3.getUrl() : null, icon.getTrackers()));
            }
            CTA cta = assetsObject.getCta();
            if (cta != null) {
                Link link4 = cta.getLink();
                linkedHashMap.put((short) 6, new Kc(link4 != null ? link4.getUrl() : null, cta.getTrackers()));
            }
            Image adChoice = assetsObject.getAdChoice();
            if (adChoice != null) {
                Link link5 = adChoice.getLink();
                linkedHashMap.put((short) 7, new Kc(link5 != null ? link5.getUrl() : null, adChoice.getTrackers()));
            } else {
                linkedHashMap.put((short) 7, new Kc(ec2.f22583a.f25677b.f22692a.f25028b.getNative().getAdChoiceConfig().getLink(), nj.s.k()));
            }
        }
        return new Sc(c2957jd, abstractC2819e1, d10, nc2, new Rc(ec2.f22587e, new C3311xi(linkedHashMap, ec2.f22584b.getMainLink(), ec2.f22583a.f25677b.f22698g)), interfaceC3028m9L);
    }

    public static final C2857fd c(C3232ue c3232ue) {
        nk.l0 l0Var = c3232ue.f25470h;
        C3241un c3241un = (C3241un) c3232ue.f25471i.getValue();
        Ec ec2 = c3232ue.f25469g;
        ck.p.j(ec2, "<this>");
        AdConfig.NativeViewabilityConfig viewabilityConfig = ec2.f22583a.f25677b.f22692a.f25028b.getNative().getViewabilityConfig();
        F f10 = ec2.f22583a.f25677b.f22704m;
        C3316xn c3316xn = new C3316xn(viewabilityConfig.getImpressionConfig().getPollInterval(), f10.f22614d, AbstractC2916hl.a(viewabilityConfig.getParentMinDimension().getDimensions()), f10.f22613c);
        qk.l lVar = ((yo) c3232ue.f25474l.getValue()).f25818b;
        c3232ue.l();
        return new C2857fd(l0Var, c3241un, c3316xn, lVar);
    }

    public static final C2957jd d(C3232ue c3232ue) {
        String creativeType;
        String openMode;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam2;
        Context context = c3232ue.f25469g.f22583a.f25676a.f24938b;
        G g10 = c3232ue.f25754a.f25677b;
        MetaInfo metaInfo = g10.f22695d;
        boolean z10 = (metaInfo == null || (landingPageParams2 = metaInfo.getLandingPageParams()) == null || (landingPageParam2 = (LandingPageParam) nj.b0.i0(landingPageParams2, 0)) == null || !landingPageParam2.getSupportLockScreen()) ? false : true;
        G g11 = c3232ue.f25754a.f25677b;
        Jg jg2 = g11.f22692a.f25027a;
        long j10 = jg2.f22935a;
        String str = g11.f22704m.f22612b;
        String str2 = jg2.f22941g;
        String str3 = g11.f22694c;
        MetaInfo metaInfo2 = g11.f22695d;
        if (metaInfo2 == null || (creativeType = metaInfo2.getCreativeType()) == null) {
            creativeType = "unknown";
        }
        String str4 = creativeType;
        String str5 = c3232ue.f25469g.f22583a.f25677b.f22700i;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        G g12 = c3232ue.f25754a.f25677b;
        boolean z11 = g12.f22693b.f22485a;
        MetaInfo metaInfo3 = g12.f22695d;
        if (metaInfo3 == null || (landingPageParams = metaInfo3.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) nj.b0.i0(landingPageParams, 0)) == null || (openMode = landingPageParam.getOpenMode()) == null) {
            openMode = "DEFAULT";
        }
        return new C2957jd(new C2982kd(context, g10, z10, new Za(j10, str, str2, "native", str3, str4, str6, z11, openMode), (Dc) c3232ue.f25469g.f22588f.getValue(), c3232ue.f25469g.f22585c, c3232ue.l()));
    }

    public static final Fd e(C3232ue c3232ue) {
        Vb k10;
        NativeMedia media;
        NativeVideo video;
        nk.l0 l0Var = c3232ue.f25470h;
        Ec ec2 = c3232ue.f25469g;
        C3241un c3241un = (C3241un) c3232ue.f25471i.getValue();
        ck.p.j(ec2, "<this>");
        ck.p.j(c3241un, "viewHolderConfig");
        E e10 = ec2.f22583a.f25677b.f22705n;
        InMobiJsonResponse inMobiJsonResponse = ec2.f22584b;
        ck.p.j(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject = inMobiJsonResponse.getAssetsObject();
        if ((assetsObject == null || (media = assetsObject.getMedia()) == null || (video = media.getVideo()) == null) ? false : video.getRequired()) {
            k10 = new Nm(((C3006lc) ec2.f22589g.getValue()).f24768e, e10.f22554a);
        } else {
            AdConfig.NativeViewabilityConfig viewabilityConfig = ec2.f22583a.f25677b.f22692a.f25028b.getNative().getViewabilityConfig();
            k10 = new K5(c3241un, new C3316xn(viewabilityConfig.getImpressionConfig().getPollInterval(), e10.f22555b, AbstractC2916hl.a(viewabilityConfig.getParentMinDimension().getDimensions()), e10.f22554a));
        }
        return new Fd(l0Var, k10, ((yo) c3232ue.f25474l.getValue()).f25818b);
    }

    public static final C3241un g(C3232ue c3232ue) {
        NativeMedia media;
        NativeImage image;
        Icon icon;
        NativeMedia media2;
        NativeVideo video;
        NativeMedia media3;
        NativeMedia media4;
        Ec ec2 = c3232ue.f25469g;
        Sg sg2 = c3232ue.f25465c;
        ck.p.j(ec2, "<this>");
        ck.p.j(sg2, "publisherNativeViewData");
        AdConfig.NativeConfig nativeConfig = ec2.f22583a.f25677b.f22692a.f25028b.getNative();
        JsonAssetObject assetsObject = ec2.f22584b.getAssetsObject();
        Boolean boolValueOf = null;
        String type = (assetsObject == null || (media4 = assetsObject.getMedia()) == null) ? null : media4.getType();
        InMobiJsonResponse inMobiJsonResponse = ec2.f22584b;
        ck.p.j(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject2 = inMobiJsonResponse.getAssetsObject();
        if (ck.p.e((assetsObject2 == null || (media3 = assetsObject2.getMedia()) == null) ? null : media3.getType(), "video")) {
            JsonAssetObject assetsObject3 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject3 != null && (media2 = assetsObject3.getMedia()) != null && (video = media2.getVideo()) != null) {
                boolValueOf = Boolean.valueOf(video.getRequired());
            }
        } else {
            JsonAssetObject assetsObject4 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject4 != null && (media = assetsObject4.getMedia()) != null && (image = media.getImage()) != null) {
                boolValueOf = Boolean.valueOf(image.getRequired());
            }
        }
        boolean required = false;
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        if (ck.p.e(type, "video")) {
            if (!zBooleanValue) {
                required = true;
            }
        } else if (assetsObject != null && (icon = assetsObject.getIcon()) != null) {
            required = icon.getRequired();
        }
        return new C3241un(required, zBooleanValue, AbstractC2916hl.a(nativeConfig.getViewabilityConfig().getIconMinDimension().getDimensions()), AbstractC2916hl.a(nativeConfig.getViewabilityConfig().getMediaMinDimension().getDimensions()), sg2);
    }

    public static final yo h(C3232ue c3232ue) {
        return new yo(c3232ue.f25754a.f25677b.f22692a.f25028b.getViewability().getWindowPollingInterval(), c3232ue.f25470h, c3232ue.f25465c.f23523a.getParentView$media_release(), c3232ue.l());
    }

    public static final Ug f(C3232ue c3232ue) {
        c3232ue.getClass();
        return new Ug();
    }
}
