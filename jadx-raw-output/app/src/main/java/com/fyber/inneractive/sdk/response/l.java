package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.j f18461e;

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) throws Exception {
        com.fyber.inneractive.sdk.response.nativead.j jVar;
        if (this.f18421a == null || (jVar = this.f18461e) == null) {
            throw new Exception("Missing response ".concat(this.f18421a == null ? "data" : "data native"));
        }
        if (r0Var == null) {
            jVar.f18440i = "ErrorConfigurationMismatch";
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.isNull("native")) {
            this.f18461e.f18440i = "ErrorInvalidJsonResponse";
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing native ad object", "ErrorInvalidJsonResponse");
        }
        try {
            com.fyber.inneractive.sdk.response.nativead.i iVarA = a(jSONObject.optJSONObject("native"));
            com.fyber.inneractive.sdk.response.nativead.k kVar = this.f18461e.T;
            kVar.N = iVarA;
            if (kVar.d()) {
                a(this.f18461e, r0Var);
            }
        } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
            if (e10.getCause() != null) {
                this.f18461e.f18440i = e10.getCause().getMessage();
            }
            this.f18461e.f18441j = e10.getMessage();
            throw e10;
        } catch (com.fyber.inneractive.sdk.response.nativead.a e11) {
            if (e11.getCause() != null) {
                this.f18461e.f18440i = e11.getCause().getMessage();
            }
            this.f18461e.f18441j = e11.getMessage();
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e11.getMessage());
            throw e11;
        } catch (Exception e12) {
            this.f18461e.f18441j = e12.getMessage();
            com.fyber.inneractive.sdk.response.nativead.j jVar2 = this.f18461e;
            jVar2.f18440i = "ErrorInvalidNativeOrtbObject";
            jVar2.f18457z = e12;
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e12.getMessage());
            if (IAlog.f18551a == 2) {
                e12.printStackTrace();
            }
            throw e12;
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean b() {
        return false;
    }

    public final void a(com.fyber.inneractive.sdk.response.nativead.j jVar, r0 r0Var) {
        com.fyber.inneractive.sdk.response.nativead.e eVarC = jVar.T.c();
        String str = eVarC != null ? eVarC.f18465a : null;
        if (str != null && !str.isEmpty()) {
            d dVar = new d(false);
            dVar.f18421a = new g();
            dVar.f18425e = this.f18461e;
            dVar.a(str, r0Var);
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("Missing vast content", "VastErrorInvalidFile");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    public static com.fyber.inneractive.sdk.response.nativead.i a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("assets") && !jSONObject.isNull("assets")) {
                if (jSONObject.has("link") && !jSONObject.isNull("link")) {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("assets");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        boolean z10 = false;
                        boolean z11 = false;
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                            if (jSONObjectOptJSONObject != null) {
                                com.fyber.inneractive.sdk.response.nativead.f fVar = new com.fyber.inneractive.sdk.response.nativead.f();
                                fVar.f18466a = jSONObjectOptJSONObject.optInt("id");
                                jSONObjectOptJSONObject.optInt(VastAttributes.REQUIRED);
                                fVar.f18471f = com.fyber.inneractive.sdk.response.nativead.parser.c.a(jSONObjectOptJSONObject.optJSONObject("link"));
                                if (jSONObjectOptJSONObject.has("title")) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("title");
                                    com.fyber.inneractive.sdk.response.nativead.d dVar = new com.fyber.inneractive.sdk.response.nativead.d();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        dVar.f18464a = v.a(jSONObjectOptJSONObject2, "text");
                                        jSONObjectOptJSONObject2.optInt("len");
                                    }
                                    fVar.f18467b = dVar;
                                } else if (jSONObjectOptJSONObject.has("video")) {
                                    if (z10) {
                                        fVar = null;
                                    } else {
                                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("video");
                                        com.fyber.inneractive.sdk.response.nativead.e eVar = new com.fyber.inneractive.sdk.response.nativead.e();
                                        if (jSONObjectOptJSONObject3 != null) {
                                            eVar.f18465a = v.a(jSONObjectOptJSONObject3, "vasttag");
                                        }
                                        fVar.f18468c = eVar;
                                        z10 = !TextUtils.isEmpty(eVar.f18465a);
                                    }
                                } else if (jSONObjectOptJSONObject.has(ImpressionLog.f43644t)) {
                                    int i11 = fVar.f18466a;
                                    boolean z12 = i11 == 2;
                                    if (!(z12 && z10) && (z12 || !z11)) {
                                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject(ImpressionLog.f43644t);
                                        com.fyber.inneractive.sdk.response.nativead.c cVar = new com.fyber.inneractive.sdk.response.nativead.c();
                                        if (jSONObjectOptJSONObject4 != null) {
                                            jSONObjectOptJSONObject4.optInt("width");
                                            jSONObjectOptJSONObject4.optInt("height");
                                            cVar.f18463a = v.a(jSONObjectOptJSONObject4, "url");
                                        }
                                        if (i11 == 2) {
                                            z10 = !TextUtils.isEmpty(cVar.f18463a);
                                        } else if (i11 == 4) {
                                            z11 = !TextUtils.isEmpty(cVar.f18463a);
                                        }
                                        fVar.f18469d = cVar;
                                    } else {
                                        fVar = null;
                                    }
                                } else if (jSONObjectOptJSONObject.has("data")) {
                                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject("data");
                                    com.fyber.inneractive.sdk.response.nativead.b bVar = new com.fyber.inneractive.sdk.response.nativead.b();
                                    if (jSONObjectOptJSONObject5 != null) {
                                        bVar.f18462a = v.a(jSONObjectOptJSONObject5, "value");
                                    }
                                    fVar.f18470e = bVar;
                                }
                                if (fVar != null) {
                                    arrayList.add(fVar);
                                }
                            }
                        }
                        if (!z10) {
                            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing valid main asset (video/image)", "ErrorNoMainAsset");
                        }
                    }
                    com.fyber.inneractive.sdk.response.nativead.h hVarA = com.fyber.inneractive.sdk.response.nativead.parser.c.a(jSONObject.optJSONObject("link"));
                    if (!TextUtils.isEmpty(hVarA.f18476a)) {
                        String strA = v.a(jSONObject, "jstracker");
                        v.a(jSONObject, "privacy");
                        ArrayList arrayListA = com.fyber.inneractive.sdk.response.nativead.parser.b.a(jSONObject.optJSONArray("imptrackers"));
                        ArrayList arrayListA2 = com.fyber.inneractive.sdk.response.nativead.parser.a.a(jSONObject.optJSONArray("eventtrackers"));
                        com.fyber.inneractive.sdk.response.nativead.i iVar = new com.fyber.inneractive.sdk.response.nativead.i();
                        iVar.f18479a = arrayList;
                        iVar.f18480b = hVarA;
                        iVar.f18482d = strA;
                        iVar.f18481c = arrayListA;
                        iVar.f18483e = arrayListA2;
                        return iVar;
                    }
                    throw new com.fyber.inneractive.sdk.response.nativead.a("Missing url in main link object", "ErrorNoMainLink");
                }
                throw new com.fyber.inneractive.sdk.response.nativead.a("Missing main link object", "ErrorNoMainLink");
            }
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing assets", "ErrorNoAssets");
        }
        throw new com.fyber.inneractive.sdk.response.nativead.a("Empty native body", "ErrorNoNativeBody");
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        com.fyber.inneractive.sdk.response.nativead.j jVar = new com.fyber.inneractive.sdk.response.nativead.j();
        this.f18421a = jVar;
        this.f18461e = jVar;
        return jVar;
    }
}
