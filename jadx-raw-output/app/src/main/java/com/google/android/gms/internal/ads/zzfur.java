package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfur implements zzfts {
    private static final zzfur zza = new zzfur();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfun();
    private static final Runnable zzl = new zzfuo();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfuk zzh = new zzfuk();
    private final zzftu zzg = new zzftu();
    private final zzful zzi = new zzful(new zzfuu());

    public static zzfur zzb() {
        return zza;
    }

    private final void zzk(View view, zzftt zzfttVar, JSONObject jSONObject, int i10, boolean z10) {
        zzfttVar.zzb(view, jSONObject, this, i10 == 1, z10);
    }

    public final /* synthetic */ void zzf() {
        this.zze = 0;
        this.zzf.clear();
        for (zzfsn zzfsnVar : zzfth.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfuk zzfukVar = this.zzh;
        zzfukVar.zzd();
        zzftu zzftuVar = this.zzg;
        long jNanoTime = System.nanoTime();
        zzftt zzfttVarZza = zzftuVar.zza();
        if (zzfukVar.zzb().size() > 0) {
            for (String str : zzfukVar.zzb()) {
                JSONObject jSONObjectZza = zzfttVarZza.zza(null);
                View viewZzh = zzfukVar.zzh(str);
                zzftt zzfttVarZzb = zzftuVar.zzb();
                String strZzc = zzfukVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfttVarZzb.zza(viewZzh);
                    zzfud.zzd(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e10) {
                        zzfue.zza("Error with setting not visible reason", e10);
                    }
                    zzfud.zze(jSONObjectZza, jSONObjectZza2);
                }
                zzfud.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfuk zzfukVar2 = this.zzh;
        if (zzfukVar2.zza().size() > 0) {
            JSONObject jSONObjectZza3 = zzfttVarZza.zza(null);
            zzk(null, zzfttVarZza, jSONObjectZza3, 1, false);
            zzfud.zzf(jSONObjectZza3);
            this.zzi.zza(jSONObjectZza3, zzfukVar2.zza(), jNanoTime);
        } else {
            this.zzi.zzc();
        }
        zzfukVar2.zze();
        long jNanoTime2 = System.nanoTime() - this.zzj;
        List<zzfuq> list = this.zzd;
        if (list.size() > 0) {
            for (zzfuq zzfuqVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfuqVar.zzb();
                if (zzfuqVar instanceof zzfup) {
                    ((zzfup) zzfuqVar).zza();
                }
            }
        }
        zzftr.zza().zzc();
    }

    public final /* synthetic */ zzful zzh() {
        return this.zzi;
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final void zza(View view, zzftt zzfttVar, JSONObject jSONObject, boolean z10) {
        zzfuk zzfukVar;
        int iZzl;
        boolean z11;
        boolean z12;
        if (zzfui.zza(view) == null && (iZzl = (zzfukVar = this.zzh).zzl(view)) != 3) {
            JSONObject jSONObjectZza = zzfttVar.zza(view);
            zzfud.zze(jSONObject, jSONObjectZza);
            String strZzg = zzfukVar.zzg(view);
            if (strZzg != null) {
                zzfud.zzd(jSONObjectZza, strZzg);
                try {
                    jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
                } catch (JSONException e10) {
                    zzfue.zza("Error with setting has window focus", e10);
                }
                Boolean boolValueOf = Boolean.valueOf(this.zzh.zzk(strZzg));
                if (boolValueOf.booleanValue()) {
                    try {
                        jSONObjectZza.put("isPipActive", boolValueOf);
                    } catch (JSONException e11) {
                        zzfue.zza("Error with setting is picture-in-picture active", e11);
                    }
                }
                this.zzh.zzf();
            } else {
                zzfuj zzfujVarZzi = zzfukVar.zzi(view);
                if (zzfujVarZzi != null) {
                    zzftk zzftkVarZzb = zzfujVarZzi.zzb();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayListZzc = zzfujVarZzi.zzc();
                    int size = arrayListZzc.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jSONArray.put((String) arrayListZzc.get(i10));
                    }
                    try {
                        jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                        jSONObjectZza.put("friendlyObstructionClass", zzftkVarZzb.zzb());
                        jSONObjectZza.put("friendlyObstructionPurpose", zzftkVarZzb.zzc());
                        jSONObjectZza.put("friendlyObstructionReason", zzftkVarZzb.zzd());
                    } catch (JSONException e12) {
                        zzfue.zza("Error with setting friendly obstruction", e12);
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                zzk(view, zzfttVar, jSONObjectZza, iZzl, z12);
            }
            this.zze++;
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfum(this));
    }

    public final void zze() {
        zzl();
    }
}
