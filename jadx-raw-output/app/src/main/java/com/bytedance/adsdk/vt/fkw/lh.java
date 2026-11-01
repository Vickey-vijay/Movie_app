package com.bytedance.adsdk.vt.fkw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class lh {
    /* JADX WARN: Code duplicated, block: B:126:0x0228  */
    /* JADX WARN: Multi-variable type inference failed */
    public static com.bytedance.adsdk.vt.lh.ouw.ryl ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        boolean z10;
        boolean z11 = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z11) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar = null;
        com.bytedance.adsdk.vt.lh.ouw.fkw fkwVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVarVt = null;
        com.bytedance.adsdk.vt.lh.ouw.ra raVar2 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
        com.bytedance.adsdk.vt.lh.ouw.yu yuVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw3 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            fkwVarOuw = ouw.ouw(jsonReader, raVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                    break;
                case "o":
                    yuVarOuw = yu.ouw(jsonReader, raVar);
                    continue;
                    break;
                case "p":
                    mwhVarVt = ouw.vt(jsonReader, raVar);
                    continue;
                    break;
                case "r":
                    break;
                case "s":
                    raVar2 = new com.bytedance.adsdk.vt.lh.ouw.ra(yu.ouw(jsonReader, raVar, uq.ouw));
                    continue;
                    break;
                case "eo":
                    vtVarOuw4 = yu.ouw(jsonReader, raVar, false);
                    continue;
                    break;
                case "rz":
                    raVar.ouw("Lottie doesn't support 3D layers.");
                    break;
                case "sa":
                    vtVarOuw2 = yu.ouw(jsonReader, raVar, false);
                    continue;
                    break;
                case "sk":
                    vtVarOuw = yu.ouw(jsonReader, raVar, false);
                    continue;
                    break;
                case "so":
                    vtVarOuw3 = yu.ouw(jsonReader, raVar, false);
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
            com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw5 = yu.ouw(jsonReader, raVar, false);
            if (vtVarOuw5.lh().isEmpty()) {
                vtVarOuw5.lh().add(new com.bytedance.adsdk.vt.ra.ouw(raVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(raVar.f11316cf)));
            } else if (((com.bytedance.adsdk.vt.ra.ouw) vtVarOuw5.lh().get(0)).vt == 0) {
                vtVarOuw5.lh().set(0, new com.bytedance.adsdk.vt.ra.ouw(raVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(raVar.f11316cf)));
            }
            vtVar = vtVarOuw5;
        }
        if (z11) {
            jsonReader.endObject();
        }
        if (fkwVarOuw == null || (fkwVarOuw.vt() && fkwVarOuw.lh().get(0).vt.equals(0.0f, 0.0f))) {
            fkwVarOuw = null;
        }
        if (mwhVarVt == null || (!(mwhVarVt instanceof com.bytedance.adsdk.vt.lh.ouw.bly) && mwhVarVt.vt() && mwhVarVt.lh().get(0).vt.equals(0.0f, 0.0f))) {
            mwhVarVt = null;
        }
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2 = vtVar == null || (vtVar.vt() && (((Float) ((com.bytedance.adsdk.vt.ra.ouw) vtVar.lh().get(0)).vt).floatValue() > 0.0f ? 1 : (((Float) ((com.bytedance.adsdk.vt.ra.ouw) vtVar.lh().get(0)).vt).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : vtVar;
        if (raVar2 == null) {
            z10 = true;
        } else {
            if (raVar2.vt()) {
                com.bytedance.adsdk.vt.ra.lh lhVar = (com.bytedance.adsdk.vt.ra.lh) ((com.bytedance.adsdk.vt.ra.ouw) raVar2.lh().get(0)).vt;
                if (lhVar.ouw == 1.0f && lhVar.vt == 1.0f) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        return new com.bytedance.adsdk.vt.lh.ouw.ryl(fkwVarOuw, mwhVarVt, z10 ? null : raVar2, vtVar2, yuVarOuw, vtVarOuw3, vtVarOuw4, vtVarOuw == null || (vtVarOuw.vt() && (((Float) ((com.bytedance.adsdk.vt.ra.ouw) vtVarOuw.lh().get(0)).vt).floatValue() > 0.0f ? 1 : (((Float) ((com.bytedance.adsdk.vt.ra.ouw) vtVarOuw.lh().get(0)).vt).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : vtVarOuw, vtVarOuw2 == null || (vtVarOuw2.vt() && (((Float) ((com.bytedance.adsdk.vt.ra.ouw) vtVarOuw2.lh().get(0)).vt).floatValue() > 0.0f ? 1 : (((Float) ((com.bytedance.adsdk.vt.ra.ouw) vtVarOuw2.lh().get(0)).vt).floatValue() == 0.0f ? 0 : -1)) == 0) ? null : vtVarOuw2);
    }
}
