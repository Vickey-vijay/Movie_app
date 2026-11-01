package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class cf {
    private com.bytedance.adsdk.vt.lh.ouw.vt fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.adsdk.vt.lh.ouw.vt f11096lh;
    private com.bytedance.adsdk.vt.lh.ouw.ouw ouw;
    private com.bytedance.adsdk.vt.lh.ouw.vt vt;
    private com.bytedance.adsdk.vt.lh.ouw.vt yu;

    public final tlj ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar3;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (!strNextName.equals("ef")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = "";
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (!strNextName2.equals("v")) {
                            if (!strNextName2.equals("nm")) {
                                jsonReader.skipValue();
                            } else {
                                strNextString = jsonReader.nextString();
                            }
                        } else {
                            strNextString.hashCode();
                            switch (strNextString) {
                                case "Distance":
                                    this.yu = yu.ouw(jsonReader, raVar, true);
                                    break;
                                case "Opacity":
                                    this.vt = yu.ouw(jsonReader, raVar, false);
                                    break;
                                case "Direction":
                                    this.f11096lh = yu.ouw(jsonReader, raVar, false);
                                    break;
                                case "Shadow Color":
                                    this.ouw = yu.yu(jsonReader, raVar);
                                    break;
                                case "Softness":
                                    this.fkw = yu.ouw(jsonReader, raVar, true);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar = this.ouw;
        if (ouwVar != null && (vtVar = this.vt) != null && (vtVar2 = this.f11096lh) != null && (vtVar3 = this.yu) != null && (vtVar4 = this.fkw) != null) {
            return new tlj(ouwVar, vtVar, vtVar2, vtVar3, vtVar4);
        }
        return null;
    }
}
