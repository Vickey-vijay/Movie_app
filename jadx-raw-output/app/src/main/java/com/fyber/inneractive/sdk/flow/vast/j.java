package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.Q6;
import io.bidmachine.ads.networks.adaptiverendering.measurer.AdMeasurerFactory;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j {
    /* JADX WARN: Code duplicated, block: B:7:0x0027 A[PHI: r0 r3
  0x0027: PHI (r0v8 com.fyber.inneractive.sdk.external.InneractiveErrorCode) = 
  (r0v3 com.fyber.inneractive.sdk.external.InneractiveErrorCode)
  (r0v4 com.fyber.inneractive.sdk.external.InneractiveErrorCode)
  (r0v5 com.fyber.inneractive.sdk.external.InneractiveErrorCode)
  (r0v7 com.fyber.inneractive.sdk.external.InneractiveErrorCode)
  (r0v7 com.fyber.inneractive.sdk.external.InneractiveErrorCode)
  (r0v7 com.fyber.inneractive.sdk.external.InneractiveErrorCode)
  (r0v7 com.fyber.inneractive.sdk.external.InneractiveErrorCode)
  (r0v38 com.fyber.inneractive.sdk.external.InneractiveErrorCode)
 binds: [B:44:0x0105, B:41:0x00f7, B:38:0x00e9, B:12:0x003d, B:14:0x0043, B:16:0x0049, B:31:0x00ad, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
  0x0027: PHI (r3v17 com.fyber.inneractive.sdk.network.t) = 
  (r3v12 com.fyber.inneractive.sdk.network.t)
  (r3v13 com.fyber.inneractive.sdk.network.t)
  (r3v14 com.fyber.inneractive.sdk.network.t)
  (r3v16 com.fyber.inneractive.sdk.network.t)
  (r3v16 com.fyber.inneractive.sdk.network.t)
  (r3v16 com.fyber.inneractive.sdk.network.t)
  (r3v16 com.fyber.inneractive.sdk.network.t)
  (r3v21 com.fyber.inneractive.sdk.network.t)
 binds: [B:44:0x0105, B:41:0x00f7, B:38:0x00e9, B:12:0x003d, B:14:0x0043, B:16:0x0049, B:31:0x00ad, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public static InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.g gVar, r rVar) {
        t tVar;
        InneractiveErrorCode inneractiveErrorCode;
        x xVarA;
        InneractiveErrorCode inneractiveErrorCode2;
        t tVar2;
        Set<com.fyber.inneractive.sdk.model.vast.r> setKeySet;
        String str;
        String str2 = gVar.f18440i;
        if ("VastErrorInvalidFile".equals(str2)) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            tVar2 = t.VAST_ERROR_INVALID_RESPONSE;
            if (gVar.f18441j != null) {
                xVarA = new x().a(gVar.f18441j, "exception");
            } else {
                xVarA = null;
            }
            t tVar3 = tVar2;
            inneractiveErrorCode = inneractiveErrorCode2;
            tVar = tVar3;
        } else if ("ErrorNoCompatibleMediaFile".equals(str2)) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            tVar2 = t.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE;
            LinkedHashMap linkedHashMap = gVar.P;
            if (linkedHashMap == null || (setKeySet = linkedHashMap.keySet()) == null || setKeySet.size() <= 0) {
                xVarA = null;
            } else {
                x xVar = new x();
                JSONArray jSONArray = new JSONArray();
                for (com.fyber.inneractive.sdk.model.vast.r rVar2 : setKeySet) {
                    try {
                        f fVar = (f) linkedHashMap.get(rVar2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", rVar2.f15943g);
                        jSONObject.put(VastAttributes.BITRATE, rVar2.f15941e);
                        jSONObject.put("mime", TextUtils.isEmpty(rVar2.f15940d) ? "na" : rVar2.f15940d);
                        jSONObject.put("delivery", rVar2.f15937a);
                        e eVar = fVar.f15721a;
                        jSONObject.put("reason", eVar != null ? eVar.value : 0);
                        jSONObject.put("required_value", fVar.f15722b);
                        jSONArray.put(jSONObject);
                    } catch (JSONException unused) {
                        IAlog.a("VastResponseValidator: Failed converting media file data to Extra data json!", new Object[0]);
                    }
                }
                xVar.a(jSONArray, "media_files");
                xVarA = xVar;
            }
            t tVar4 = tVar2;
            inneractiveErrorCode = inneractiveErrorCode2;
            tVar = tVar4;
        } else if ("VastErrorTooManyWrappers".equals(str2)) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            tVar2 = t.VAST_ERROR_TOO_MANY_WRAPPERS;
            xVarA = new x().a(Integer.valueOf(IAConfigManager.O.f15014i.f15123b), "max");
            t tVar5 = tVar2;
            inneractiveErrorCode = inneractiveErrorCode2;
            tVar = tVar5;
        } else {
            if ("ErrorNoMediaFiles".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_NO_MEDIA_FILES;
            } else if ("ErrorConfigurationMismatch".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
                tVar2 = t.INTERNAL_CONFIG_MISMATCH;
            } else if ("VastErrorUnsecure".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = t.VAST_ERROR_UNSECURE_URL;
            } else {
                tVar = null;
                inneractiveErrorCode = null;
                xVarA = null;
            }
            xVarA = null;
            t tVar6 = tVar2;
            inneractiveErrorCode = inneractiveErrorCode2;
            tVar = tVar6;
        }
        if (tVar != null) {
            JSONArray jSONArrayB = rVar == null ? null : rVar.b();
            w wVar = new w(gVar);
            wVar.f16128b = tVar;
            wVar.f16127a = inneractiveAdRequest;
            wVar.f16130d = jSONArrayB;
            if (xVarA != null) {
                wVar.f16132f.put(xVarA.f16134a);
            }
            wVar.a((String) null);
        }
        if (gVar.f18447p != UnitDisplayType.NATIVE) {
            ArrayList<com.fyber.inneractive.sdk.model.vast.h> arrayList = gVar.Q;
            if (arrayList != null && arrayList.size() > 0) {
                u uVar = u.VAST_EVENT_COMPANION_FILTERED;
                JSONArray jSONArrayB2 = rVar == null ? null : rVar.b();
                w wVar2 = new w(gVar);
                wVar2.f16129c = uVar;
                wVar2.f16127a = inneractiveAdRequest;
                wVar2.f16130d = jSONArrayB2;
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                for (com.fyber.inneractive.sdk.model.vast.h hVar : arrayList) {
                    hVar.getClass();
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("w", hVar.f15912a);
                        jSONObject3.put("h", hVar.f15913b);
                        jSONObject3.put(Q6.J0, hVar.f15918g);
                        jSONObject3.put("clt", hVar.f15919h);
                        String str3 = hVar.f15917f;
                        if (str3 != null) {
                            jSONObject3.put("content", str3);
                            str = VastTagName.HTML_RESOURCE;
                        } else {
                            str = null;
                        }
                        l lVar = hVar.f15915d;
                        if (lVar != null) {
                            jSONObject3.put("content", lVar.f15924b);
                            jSONObject3.put("creativeType", hVar.f15915d.f15923a);
                            str = VastTagName.STATIC_RESOURCE;
                        }
                        if (!TextUtils.isEmpty(hVar.f15916e)) {
                            jSONObject3.put("content", hVar.f15916e);
                            str = "iFrameResource";
                        }
                        if (str != null) {
                            jSONObject3.put("type", str);
                        }
                        b bVar = hVar.f15920i;
                        if (bVar != null) {
                            jSONObject3.put("reason", bVar.f15707a);
                            jSONObject3.put("exception", hVar.f15920i.getMessage());
                        }
                    } catch (JSONException e10) {
                        IAlog.a("Failed creating Companion json object: %s", e10.getMessage());
                        jSONObject3 = null;
                    }
                    jSONArray2.put(jSONObject3);
                }
                try {
                    jSONObject2.put("companion_data", jSONArray2);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONArray2);
                }
                wVar2.f16132f.put(jSONObject2);
                wVar2.a((String) null);
            }
            com.fyber.inneractive.sdk.model.vast.b bVar2 = gVar.O;
            int size = bVar2 != null ? bVar2.f15878g.size() : 0;
            ArrayList arrayList2 = gVar.Q;
            int size2 = arrayList2 != null ? arrayList2.size() : 0;
            u uVar2 = u.NUMBER_OF_COMPANIONS;
            JSONArray jSONArrayB3 = rVar == null ? null : rVar.b();
            w wVar3 = new w(gVar);
            wVar3.f16129c = uVar2;
            wVar3.f16127a = inneractiveAdRequest;
            wVar3.f16130d = jSONArrayB3;
            JSONObject jSONObject4 = new JSONObject();
            Integer numValueOf = Integer.valueOf(size + size2);
            try {
                jSONObject4.put("number_of_endcards", numValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "number_of_endcards", numValueOf);
            }
            wVar3.f16132f.put(jSONObject4);
            wVar3.a((String) null);
        }
        if (gVar.O != null) {
            i<com.fyber.inneractive.sdk.measurement.h> iVar = new i(gVar);
            if (iVar.size() > 0) {
                JSONObject jSONObject5 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                u uVar3 = u.OMID_VAST_DETECTION;
                JSONArray jSONArrayB4 = rVar == null ? null : rVar.b();
                w wVar4 = new w(gVar);
                wVar4.f16129c = uVar3;
                wVar4.f16127a = inneractiveAdRequest;
                wVar4.f16130d = jSONArrayB4;
                for (com.fyber.inneractive.sdk.measurement.h hVar2 : iVar) {
                    hVar2.getClass();
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("success", String.valueOf(hVar2.b()));
                        if (!hVar2.b()) {
                            jSONObject6.put("error_reason", hVar2.a());
                        }
                    } catch (JSONException unused4) {
                        jSONObject6 = null;
                    }
                    if (jSONObject6 != null) {
                        jSONArray3.put(jSONObject6);
                    }
                }
                try {
                    jSONObject5.put(AdMeasurerFactory.VERIFICATIONS, jSONArray3);
                } catch (Exception unused5) {
                    IAlog.f("Got exception adding param to json object: %s, %s", AdMeasurerFactory.VERIFICATIONS, jSONArray3);
                }
                wVar4.f16132f.put(jSONObject5);
                wVar4.a((String) null);
            }
        }
        return inneractiveErrorCode;
    }
}
