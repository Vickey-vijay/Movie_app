package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3003l9 implements Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InMobiJsonResponse f24756b;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.inmobi.media.Gg
    public final Object a(rj.c cVar) throws Throwable {
        C2978k9 c2978k9;
        int i10;
        C3003l9 c3003l9;
        if (cVar instanceof C2978k9) {
            c2978k9 = (C2978k9) cVar;
            int i11 = c2978k9.f24664d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2978k9.f24664d = i11 - Integer.MIN_VALUE;
            } else {
                c2978k9 = new C2978k9(this, (ContinuationImpl) cVar);
            }
        } else {
            c2978k9 = new C2978k9(this, (ContinuationImpl) cVar);
        }
        Object objCast = c2978k9.f24662b;
        Object objF = sj.a.f();
        int i12 = c2978k9.f24664d;
        try {
            if (i12 == 0) {
                kotlin.c.b(objCast);
                ck.p.j(InMobiJsonResponse.class, "clazz");
                ck.p.j(InMobiJsonResponse.class, "type");
                String str = this.f24755a;
                c2978k9.f24661a = this;
                c2978k9.f24664d = 1;
                JSONObject jSONObject = new JSONObject(str);
                ck.p.j(jSONObject, "jsonObject");
                ck.p.j(InMobiJsonResponse.class, "type");
                objCast = InMobiJsonResponse.class.cast(AbstractC3029ma.a(jSONObject, InMobiJsonResponse.class, null, null));
                if (objCast == objF) {
                    return objF;
                }
                c3003l9 = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3003l9 = c2978k9.f24661a;
                kotlin.c.b(objCast);
            }
            c3003l9.f24756b = (InMobiJsonResponse) objCast;
            return mj.r.f64562a;
        } catch (Throwable th2) {
            mj.d.b(th2);
            if (th2 instanceof JSONException) {
                i10 = 2309;
            } else {
                i10 = th2 instanceof ClassCastException ? 2310 : 2311;
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, tj.a.f((short) i10)))));
        }
    }

    public C3003l9(String str) {
        ck.p.j(str, "content");
        this.f24755a = str;
    }

    @Override // com.inmobi.media.Gg
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InMobiJsonResponse b() {
        Objects.toString(this.f24756b);
        return this.f24756b;
    }

    @Override // com.inmobi.media.Gg
    public final void a() {
        if (this.f24756b == null || this.f24755a.length() == 0) {
            throw new Ig(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 3))));
        }
    }
}
