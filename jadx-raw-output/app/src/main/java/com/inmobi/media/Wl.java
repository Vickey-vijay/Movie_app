package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Wl extends AbstractC3274w6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ec f23764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NativeVideo f23766e;

    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0220 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0168 A[SYNTHETIC] */
    @Override // com.inmobi.media.AbstractC3274w6
    public final Object a(rj.c cVar) throws Throwable {
        Tl tl2;
        C3140ql c3140ql;
        ArrayList arrayList;
        JsonAssetObject assetsObject;
        NativeMedia media;
        List<TrackingInfo> listK;
        Object objA;
        NativeVideo video;
        if (cVar instanceof Tl) {
            tl2 = (Tl) cVar;
            int i10 = tl2.f23589d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tl2.f23589d = i10 - Integer.MIN_VALUE;
            } else {
                tl2 = new Tl(this, (ContinuationImpl) cVar);
            }
        } else {
            tl2 = new Tl(this, (ContinuationImpl) cVar);
        }
        Object objA2 = tl2.f23587b;
        Object objF = sj.a.f();
        int i11 = tl2.f23589d;
        if (i11 == 0) {
            kotlin.c.b(objA2);
            InterfaceC3028m9 interfaceC3028m9A = a();
            if (interfaceC3028m9A != null) {
                ((C3053n9) interfaceC3028m9A).a("VideoExperienceLoader", "load called - mediaType: " + this.f23765d);
            }
            if (!ck.p.e(this.f23765d, "video")) {
                InterfaceC3028m9 interfaceC3028m9A2 = a();
                if (interfaceC3028m9A2 != null) {
                    ((C3053n9) interfaceC3028m9A2).b("VideoExperienceLoader", "Invalid Media Type - expected VIDEO, got: " + this.f23765d);
                }
                return new B6();
            }
            NativeVideo nativeVideo = this.f23766e;
            if (nativeVideo == null) {
                InterfaceC3028m9 interfaceC3028m9A3 = a();
                if (interfaceC3028m9A3 != null) {
                    ((C3053n9) interfaceC3028m9A3).b("VideoExperienceLoader", "Invalid Native Video - nativeVideo is null");
                }
                return new C3349z6((short) 2361);
            }
            ArrayList arrayListA = AbstractC3347z4.a("error", nativeVideo.getTrackers());
            String vastTag = this.f23766e.getVastTag();
            tl2.f23589d = 1;
            objA2 = a(vastTag, arrayListA, tl2);
            if (objA2 != objF) {
            }
            return objF;
        }
        if (i11 == 1) {
            kotlin.c.b(objA2);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objA2);
                return objA2;
            }
            c3140ql = tl2.f23586a;
            kotlin.c.b(objA2);
        }
        String str = c3140ql.f25192a;
        String str2 = c3140ql.f25193b;
        int iA = Jl.a(c3140ql.f25196e);
        ArrayList arrayList2 = c3140ql.f25194c;
        arrayList = new ArrayList();
        for (Object obj : arrayList2) {
            if (!(((C3257ve) obj) instanceof C3358zf)) {
                arrayList.add(obj);
            }
        }
        C2990kl c2990kl = new C2990kl(str, str2, iA, arrayList);
        String str3 = c3140ql.f25196e;
        ArrayList arrayList3 = c3140ql.f25197f;
        ArrayList arrayList4 = c3140ql.f25198g;
        AdConfig.VastVideoConfig vastVideo = this.f23764c.f22583a.f25677b.f22692a.f25028b.getVastVideo();
        VideoExperience experience = this.f23766e.getExperience();
        C3095p1 c3095p1 = this.f23764c.f22583a.f25677b.f22692a;
        Qm qm2 = new Qm(c3095p1.f25027a.f22940f, experience, c3095p1.f25028b.getNative());
        Ec ec2 = this.f23764c;
        ck.p.j(ec2, "<this>");
        ck.p.j(c2990kl, "vastBeaconData");
        C2767c0 c2767c0 = ec2.f22583a.f25676a.f24940d;
        ck.p.j(ec2, "<this>");
        assetsObject = ec2.f22584b.getAssetsObject();
        if (assetsObject != null) {
            media = assetsObject.getMedia();
        } else {
            media = null;
        }
        if (media != null || (video = media.getVideo()) == null || (listK = video.getTrackers()) == null) {
            listK = nj.s.k();
        }
        C3116pm c3116pm = new C3116pm(str3, arrayList3, arrayList4, vastVideo, qm2, new Ml(c2990kl, c2767c0, new C2893gn(listK)), new C3142qn(this.f23764c.f22583a.f25677b), new V3(this.f23764c.f22583a.f25677b));
        tl2.f23586a = null;
        tl2.f23589d = 3;
        objA = a(c2990kl, c3116pm, tl2);
        if (objA != objF) {
            return objF;
        }
        return objA;
        c3140ql = (C3140ql) objA2;
        if (c3140ql == null) {
            NativeVideo nativeVideo2 = this.f23766e;
            if (!(nativeVideo2 != null ? nativeVideo2.getRequired() : false)) {
                return new B6();
            }
            InterfaceC3028m9 interfaceC3028m9A4 = a();
            if (interfaceC3028m9A4 != null) {
                ((C3053n9) interfaceC3028m9A4).b("VideoExperienceLoader", "Vast Parse Failure - Video Required");
            }
            return new C3349z6((short) 2360);
        }
        Ec ec3 = this.f23764c;
        String str4 = c3140ql.f25195d;
        ArrayList arrayList5 = c3140ql.f25194c;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            if (ck.p.e(((C3257ve) obj2).f25569b, "click")) {
                arrayList6.add(obj2);
            }
        }
        ec3.f22587e = new C3015ll(str4, arrayList6);
        ArrayList arrayList7 = c3140ql.f25194c;
        ArrayList arrayList8 = new ArrayList();
        for (Object obj3 : arrayList7) {
            if (obj3 instanceof C3358zf) {
                arrayList8.add(obj3);
            }
        }
        tl2.f23586a = c3140ql;
        tl2.f23589d = 2;
        if (a(arrayList8, tl2) != objF) {
            String str5 = c3140ql.f25192a;
            String str6 = c3140ql.f25193b;
            int iA2 = Jl.a(c3140ql.f25196e);
            ArrayList arrayList9 = c3140ql.f25194c;
            arrayList = new ArrayList();
            while (r8.hasNext()) {
                if (!(((C3257ve) obj) instanceof C3358zf)) {
                    arrayList.add(obj);
                }
            }
            C2990kl c2990kl2 = new C2990kl(str5, str6, iA2, arrayList);
            String str7 = c3140ql.f25196e;
            ArrayList arrayList10 = c3140ql.f25197f;
            ArrayList arrayList11 = c3140ql.f25198g;
            AdConfig.VastVideoConfig vastVideo2 = this.f23764c.f22583a.f25677b.f22692a.f25028b.getVastVideo();
            VideoExperience experience2 = this.f23766e.getExperience();
            C3095p1 c3095p2 = this.f23764c.f22583a.f25677b.f22692a;
            Qm qm3 = new Qm(c3095p2.f25027a.f22940f, experience2, c3095p2.f25028b.getNative());
            Ec ec4 = this.f23764c;
            ck.p.j(ec4, "<this>");
            ck.p.j(c2990kl2, "vastBeaconData");
            C2767c0 c2767c1 = ec4.f22583a.f25676a.f24940d;
            ck.p.j(ec4, "<this>");
            assetsObject = ec4.f22584b.getAssetsObject();
            if (assetsObject != null) {
                media = assetsObject.getMedia();
            } else {
                media = null;
            }
            if (media != null) {
                listK = nj.s.k();
            } else {
                listK = nj.s.k();
            }
            C3116pm c3116pm2 = new C3116pm(str7, arrayList10, arrayList11, vastVideo2, qm3, new Ml(c2990kl2, c2767c1, new C2893gn(listK)), new C3142qn(this.f23764c.f22583a.f25677b), new V3(this.f23764c.f22583a.f25677b));
            tl2.f23586a = null;
            tl2.f23589d = 3;
            objA = a(c2990kl2, c3116pm2, tl2);
            if (objA != objF) {
                return objA;
            }
        }
        return objF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wl(Ec ec2, AbstractC2819e1 abstractC2819e1) {
        super(ec2, abstractC2819e1);
        ck.p.j(ec2, "nativeAdUnitComponent");
        ck.p.j(abstractC2819e1, "adSessionManager");
        this.f23764c = ec2;
        JsonAssetObject assetsObject = ec2.f22584b.getAssetsObject();
        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
        this.f23765d = media != null ? media.getType() : null;
        this.f23766e = media != null ? media.getVideo() : null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        Vl vl2;
        if (continuationImpl instanceof Vl) {
            vl2 = (Vl) continuationImpl;
            int i10 = vl2.f23715c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vl2.f23715c = i10 - Integer.MIN_VALUE;
            } else {
                vl2 = new Vl(this, continuationImpl);
            }
        } else {
            vl2 = new Vl(this, continuationImpl);
        }
        Object objA = vl2.f23713a;
        Object objF = sj.a.f();
        int i11 = vl2.f23715c;
        try {
            if (i11 == 0) {
                kotlin.c.b(objA);
                InterfaceC3028m9 interfaceC3028m9A = a();
                if (interfaceC3028m9A != null) {
                    ((C3053n9) interfaceC3028m9A).a("VideoExperienceLoader", "parseVastTag - processing VAST tag with " + arrayList.size() + " error URLs");
                }
                Il il2 = Il.f22871a;
                C3292x c3292x = this.f23764c.f22583a;
                vl2.f23715c = 1;
                objA = il2.a(str, c3292x, arrayList, vl2);
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objA);
            }
            return (C3140ql) objA;
        } catch (C3214tl e10) {
            InterfaceC3028m9 interfaceC3028m9A2 = a();
            if (interfaceC3028m9A2 == null) {
                return null;
            }
            ((C3053n9) interfaceC3028m9A2).b("VideoExperienceLoader", "parseVastTag - VAST parse exception: " + e10.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C2990kl c2990kl, C3116pm c3116pm, ContinuationImpl continuationImpl) throws Throwable {
        Ul ul2;
        if (continuationImpl instanceof Ul) {
            ul2 = (Ul) continuationImpl;
            int i10 = ul2.f23661d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ul2.f23661d = i10 - Integer.MIN_VALUE;
            } else {
                ul2 = new Ul(this, continuationImpl);
            }
        } else {
            ul2 = new Ul(this, continuationImpl);
        }
        Object objA = ul2.f23659b;
        Object objF = sj.a.f();
        int i11 = ul2.f23661d;
        try {
            if (i11 == 0) {
                kotlin.c.b(objA);
                C3006lc c3006lc = (C3006lc) this.f23764c.f22589g.getValue();
                InterfaceC3028m9 interfaceC3028m9A = a();
                if (interfaceC3028m9A != null) {
                    ((C3053n9) interfaceC3028m9A).a("VideoExperienceLoader", "onPrepareExperienceModelSuccess - loading video experience");
                }
                ul2.f23658a = c2990kl;
                ul2.f23661d = 1;
                objA = c3006lc.a(c3116pm, ul2);
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2990kl = ul2.f23658a;
                kotlin.c.b(objA);
            }
            return new A6((MediaView) objA, c2990kl);
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m9A2 = a();
            if (interfaceC3028m9A2 != null) {
                ((C3053n9) interfaceC3028m9A2).b("VideoExperienceLoader", "onPrepareExperienceModelSuccess - exception during media load: " + e10.getMessage());
            }
            return a(e10, c2990kl);
        }
    }

    public final C6 a(Exception exc, C2990kl c2990kl) {
        NativeVideo nativeVideo = this.f23766e;
        if (nativeVideo != null ? nativeVideo.getRequired() : false) {
            InterfaceC3028m9 interfaceC3028m9A = a();
            if (interfaceC3028m9A != null) {
                ((C3053n9) interfaceC3028m9A).b("VideoExperienceLoader", "Media Load Failure: " + exc);
            }
            return new C3349z6((short) 2362);
        }
        return new B6(c2990kl);
    }
}
