package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzeba {
    private final zzeak zza;
    private final zzdvm zzb;
    private final Object zzc = new Object();

    @GuardedBy("lock")
    private final List zzd = new ArrayList();

    @GuardedBy("lock")
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzdvl zzdvlVarZzc;
        zzdvl zzdvlVarZzc2;
        zzbwh zzbwhVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbqg zzbqgVar = (zzbqg) it.next();
                String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkM)).booleanValue() || (zzdvlVarZzc2 = this.zzb.zzc(zzbqgVar.zza)) == null || (zzbwhVar = zzdvlVarZzc2.zzc) == null) ? "" : zzbwhVar.toString();
                String str = string;
                boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue() && (zzdvlVarZzc = this.zzb.zzc(zzbqgVar.zza)) != null && zzdvlVarZzc.zzd;
                List list2 = this.zzd;
                String str2 = zzbqgVar.zza;
                list2.add(new zzeaz(str2, str, this.zzb.zzd(str2), zzbqgVar.zzb ? 1 : 0, zzbqgVar.zzd, zzbqgVar.zzc, z10));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzb(new zzeay(this));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: all -> 0x003d, LOOP:0: B:13:0x0027->B:15:0x002d, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:9:0x001c, B:10:0x001f, B:12:0x0021, B:13:0x0027, B:15:0x002d, B:16:0x003b), top: B:21:0x0008 }] */
    public final JSONArray zzb() throws JSONException {
        Iterator it;
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (this.zze) {
                it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzeaz) it.next()).zza());
                }
            } else {
                zzeak zzeakVar = this.zza;
                if (zzeakVar.zze()) {
                    zzc(zzeakVar.zzd());
                    it = this.zzd.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((zzeaz) it.next()).zza());
                    }
                } else {
                    zza();
                }
            }
        }
        return jSONArray;
    }

    public zzeba(zzeak zzeakVar, zzdvm zzdvmVar) {
        this.zza = zzeakVar;
        this.zzb = zzdvmVar;
    }
}
