package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;

/* JADX INFO: renamed from: com.inmobi.media.pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3113pj extends AbstractC3274w6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ec f25086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NativeImage f25088e;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (r11 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // com.inmobi.media.AbstractC3274w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(rj.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3113pj.a(rj.c):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3113pj(Ec ec2, AbstractC2819e1 abstractC2819e1) {
        NativeMedia media;
        NativeMedia media2;
        super(ec2, abstractC2819e1);
        ck.p.j(ec2, "nativeAdUnitComponent");
        ck.p.j(abstractC2819e1, "adSessionManager");
        this.f25086c = ec2;
        JsonAssetObject assetsObject = ec2.f22584b.getAssetsObject();
        NativeImage image = null;
        this.f25087d = (assetsObject == null || (media2 = assetsObject.getMedia()) == null) ? null : media2.getType();
        JsonAssetObject assetsObject2 = ec2.f22584b.getAssetsObject();
        if (assetsObject2 != null && (media = assetsObject2.getMedia()) != null) {
            image = media.getImage();
        }
        this.f25088e = image;
    }

    public final C6 a(Exception exc) {
        NativeImage nativeImage = this.f25088e;
        if (nativeImage != null && nativeImage.getRequired()) {
            InterfaceC3028m9 interfaceC3028m9A = a();
            if (interfaceC3028m9A != null) {
                ((C3053n9) interfaceC3028m9A).b("StaticExperienceLoader", "Static Load Failure: " + exc);
            }
            return new C3349z6((short) 2362);
        }
        return new B6();
    }
}
