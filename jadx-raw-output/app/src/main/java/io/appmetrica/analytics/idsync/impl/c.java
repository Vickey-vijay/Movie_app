package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import nj.b0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f54858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54859b = "id_sync";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54860c = "id_sync";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54861d = "launch_delay_seconds";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54862e = "requests";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f54863f = "type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f54864g = "url";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f54865h = "headers";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f54866i = "resend_interval_for_valid_response";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f54867j = "resend_interval_for_invalid_response";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f54868k = "valid_response_codes";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f54869l = "preconditions";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f54870m = "network";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f54871n = "cell";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(JSONObject jSONObject) {
        m[] mVarArr;
        JSONArray jSONArray;
        int i10;
        k[] kVarArr;
        int i11;
        JSONObject jSONObject2;
        byte[][] bArr;
        int[] iArr;
        int[] iArrN0;
        int i12;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(this.f54860c);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        o oVar = new o();
        oVar.f54904a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.f54859b, oVar.f54904a);
        n nVar = new n();
        nVar.f54899a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject, this.f54861d, nVar.f54899a);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(this.f54862e);
        int i13 = 0;
        if (jSONArrayOptJSONArray == null) {
            mVarArr = new m[0];
        } else {
            int length = jSONArrayOptJSONArray.length();
            m[] mVarArr2 = new m[length];
            int i14 = 0;
            while (i14 < length) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i14);
                m mVar = new m();
                if (jSONObjectOptJSONObject2 == null) {
                    jSONArray = jSONArrayOptJSONArray;
                    i10 = length;
                    i12 = i13;
                } else {
                    String strOptString = jSONObjectOptJSONObject2.optString(this.f54863f);
                    Charset charset = lk.c.f63591b;
                    mVar.f54891a = strOptString.getBytes(charset);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(this.f54869l);
                    l lVar = new l();
                    if (jSONObjectOptJSONObject3 != null && ck.p.e(jSONObjectOptJSONObject3.optString(this.f54870m), this.f54871n)) {
                        lVar.f54889a = 1;
                    }
                    mVar.f54892b = lVar;
                    mVar.f54893c = jSONObjectOptJSONObject2.optString(this.f54864g).getBytes(charset);
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject(this.f54865h);
                    if (jSONObjectOptJSONObject4 == null) {
                        kVarArr = new k[i13];
                        jSONArray = jSONArrayOptJSONArray;
                        i10 = length;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> itKeys = jSONObjectOptJSONObject4.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            k kVar = new k();
                            kVar.f54886a = next.getBytes(lk.c.f63591b);
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray(next);
                            if (jSONArrayOptJSONArray2 == null) {
                                bArr = new byte[i13][];
                                i11 = length;
                                jSONObject2 = jSONObjectOptJSONObject4;
                            } else {
                                int length2 = jSONArrayOptJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                int i15 = 0;
                                while (i15 < length2) {
                                    bArr2[i15] = jSONArrayOptJSONArray2.optString(i15).getBytes(lk.c.f63591b);
                                    i15++;
                                    length = length;
                                    jSONObjectOptJSONObject4 = jSONObjectOptJSONObject4;
                                }
                                i11 = length;
                                jSONObject2 = jSONObjectOptJSONObject4;
                                bArr = bArr2;
                            }
                            kVar.f54887b = bArr;
                            arrayList.add(kVar);
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            length = i11;
                            jSONObjectOptJSONObject4 = jSONObject2;
                            i13 = 0;
                        }
                        jSONArray = jSONArrayOptJSONArray;
                        i10 = length;
                        Object[] array = arrayList.toArray(new k[i13]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        kVarArr = (k[]) array;
                    }
                    mVar.f54894d = kVarArr;
                    mVar.f54895e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject2, this.f54866i, mVar.f54895e);
                    mVar.f54896f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject2, this.f54867j, mVar.f54896f);
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray(this.f54868k);
                    if (jSONArrayOptJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = jSONArrayOptJSONArray3.length();
                        int[] iArr2 = new int[length3];
                        for (int i16 = 0; i16 < length3; i16++) {
                            iArr2[i16] = jSONArrayOptJSONArray3.optInt(i16);
                        }
                        iArr = iArr2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i17 : iArr) {
                        if (i17 != 0) {
                            arrayList2.add(Integer.valueOf(i17));
                        }
                    }
                    if (!(!arrayList2.isEmpty())) {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null || (iArrN0 = b0.N0(arrayList2)) == null) {
                        i12 = 0;
                        iArrN0 = new int[]{200};
                    } else {
                        i12 = 0;
                    }
                    mVar.f54897g = iArrN0;
                }
                mVarArr2[i14] = mVar;
                i14++;
                i13 = i12;
                jSONArrayOptJSONArray = jSONArray;
                length = i10;
            }
            mVarArr = mVarArr2;
        }
        nVar.f54900b = mVarArr;
        oVar.f54905b = nVar;
        return this.f54858a.toModel(oVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public c(e eVar) {
        this.f54858a = eVar;
    }

    public final IdSyncConfig b(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
