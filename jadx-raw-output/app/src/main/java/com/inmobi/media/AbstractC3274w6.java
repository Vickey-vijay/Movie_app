package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3274w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f25625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2819e1 f25626b;

    public final InterfaceC3028m9 a() {
        return this.f25625a.f22583a.f25676a.f24939c;
    }

    public abstract Object a(rj.c cVar);

    public AbstractC3274w6(Ec ec2, AbstractC2819e1 abstractC2819e1) {
        ck.p.j(ec2, "nativeAdUnitComponent");
        ck.p.j(abstractC2819e1, "adSessionManager");
        this.f25625a = ec2;
        this.f25626b = abstractC2819e1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(List list, ContinuationImpl continuationImpl) throws Throwable {
        C3249v6 c3249v6;
        OmSdkInfo omSdkInfo;
        List list2;
        Map mapJ;
        String customReferenceData;
        if (continuationImpl instanceof C3249v6) {
            c3249v6 = (C3249v6) continuationImpl;
            int i10 = c3249v6.f25535e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3249v6.f25535e = i10 - Integer.MIN_VALUE;
            } else {
                c3249v6 = new C3249v6(this, continuationImpl);
            }
        } else {
            c3249v6 = new C3249v6(this, continuationImpl);
        }
        Object obj = c3249v6.f25533c;
        Object objF = sj.a.f();
        int i11 = c3249v6.f25535e;
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (list.isEmpty()) {
                InterfaceC3028m9 interfaceC3028m9A = a();
                if (interfaceC3028m9A != null) {
                    ((C3053n9) interfaceC3028m9A).a("ExperienceLoader", "OMID trackers are empty");
                }
                return mj.r.f64562a;
            }
            MetaInfo metaInfo = this.f25625a.f22583a.f25677b.f22695d;
            OmSdkInfo omsdkInfo = metaInfo != null ? metaInfo.getOmsdkInfo() : null;
            boolean z10 = omsdkInfo != null && omsdkInfo.getOmidEnabled();
            boolean omidEnabled = this.f25625a.f22583a.f25677b.f22692a.f25028b.getViewability().getOmidConfig().getOmidEnabled();
            if (z10 && omidEnabled) {
                C3109pf c3109pf = C3109pf.f25078a;
                c3249v6.f25531a = list;
                c3249v6.f25532b = omsdkInfo;
                c3249v6.f25535e = 1;
                Context context = Ji.f22951a;
                Object objG = context == null ? "" : nk.h.g(nk.w0.b(), new C3059nf(context, null), c3249v6);
                if (objG == objF) {
                    return objF;
                }
                omSdkInfo = omsdkInfo;
                obj = objG;
                list2 = list;
            } else {
                InterfaceC3028m9 interfaceC3028m9A2 = a();
                if (interfaceC3028m9A2 != null) {
                    ((C3053n9) interfaceC3028m9A2).a("ExperienceLoader", "OMID is not enabled");
                }
                return mj.r.f64562a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            omSdkInfo = c3249v6.f25532b;
            List list3 = c3249v6.f25531a;
            kotlin.c.b(obj);
            list2 = list3;
        }
        String str = (String) obj;
        String str2 = this.f25625a.f22583a.f25677b.f22692a.f25027a.f22939e;
        InterfaceC3028m9 interfaceC3028m9A3 = a();
        if (interfaceC3028m9A3 != null) {
            ((C3053n9) interfaceC3028m9A3).a("ExperienceLoader", "OM-SDK Session Initialize Called");
        }
        AbstractC2819e1 abstractC2819e1 = this.f25626b;
        if (omSdkInfo == null || (mapJ = omSdkInfo.getMacros()) == null) {
            mapJ = kotlin.collections.a.j();
        }
        abstractC2819e1.a(str, list2, mapJ, str2, (omSdkInfo == null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo != null && omSdkInfo.getIsolateVerificationScripts());
        return mj.r.f64562a;
    }
}
