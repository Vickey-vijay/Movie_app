package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0 f23608a = new U0();

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, ContinuationImpl continuationImpl) throws Throwable {
        T0 t10;
        int i10;
        if (continuationImpl instanceof T0) {
            t10 = (T0) continuationImpl;
            int i11 = t10.f23546c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t10.f23546c = i11 - Integer.MIN_VALUE;
            } else {
                t10 = new T0(this, continuationImpl);
            }
        } else {
            t10 = new T0(this, continuationImpl);
        }
        Object objCast = t10.f23544a;
        Object objF = sj.a.f();
        int i12 = t10.f23546c;
        try {
            if (i12 == 0) {
                kotlin.c.b(objCast);
                ck.p.j(AdResponse.class, "clazz");
                ck.p.j(AdResponse.class, "type");
                t10.f23546c = 1;
                JSONObject jSONObject = new JSONObject(str);
                ck.p.j(jSONObject, "jsonObject");
                ck.p.j(AdResponse.class, "type");
                objCast = AdResponse.class.cast(AbstractC3029ma.a(jSONObject, AdResponse.class, null, null));
                if (objCast == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objCast);
            }
            AdResponse adResponse = (AdResponse) objCast;
            if (adResponse != null) {
                return adResponse;
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, tj.a.f((short) 2232)))));
        } catch (Exception e10) {
            if (e10 instanceof JSONException) {
                i10 = 2113;
            } else {
                i10 = e10 instanceof ClassCastException ? 2207 : com.ironsource.I9.a.f26816g;
            }
            e10.toString();
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, tj.a.f((short) i10)))));
        }
    }
}
