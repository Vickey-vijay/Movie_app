package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzdxh;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbj {
    public final String zza;
    public String zzb;

    @Nullable
    public zzbzu zzd;

    @Nullable
    public Bundle zze;
    private long zzg;
    private long zzh;

    @Nullable
    public String zzc = null;
    public Bundle zzf = new Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public zzbj(JsonReader jsonReader, @Nullable zzbzu zzbzuVar) throws IOException {
        Bundle bundle;
        byte b10;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzd = zzbzuVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName == null ? "" : strNextName) {
                case "start_time":
                    b10 = 2;
                    break;
                case "params":
                    b10 = 0;
                    break;
                case "signal_dictionary":
                    b10 = 1;
                    break;
                case "end_time":
                    b10 = 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            jsonReader.skipValue();
                        } else {
                            this.zzh = jsonReader.nextLong();
                        }
                    } else {
                        this.zzg = jsonReader.nextLong();
                    }
                } else {
                    map = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        map.put(jsonReader.nextName(), jsonReader.nextString());
                    }
                    jsonReader.endObject();
                }
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzf.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && zzbzuVar != null && (bundle = zzbzuVar.zzm) != null) {
            bundle.putLong(zzdxh.GET_SIGNALS_SDKCORE_START.zza(), this.zzg);
            zzbzuVar.zzm.putLong(zzdxh.GET_SIGNALS_SDKCORE_END.zza(), this.zzh);
        }
    }
}
