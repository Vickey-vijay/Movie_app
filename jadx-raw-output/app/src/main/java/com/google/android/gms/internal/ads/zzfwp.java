package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.ironsource.C3784xa;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfwp implements zzfvk {
    private final Object zza;
    private final zzfwq zzb;
    private final zzfxb zzc;
    private final zzfvh zzd;
    private final boolean zze;

    public zzfwp(@NonNull Object obj, @NonNull zzfwq zzfwqVar, @NonNull zzfxb zzfxbVar, @NonNull zzfvh zzfvhVar, boolean z10) {
        this.zza = obj;
        this.zzb = zzfwqVar;
        this.zzc = zzfxbVar;
        this.zzd = zzfvhVar;
        this.zze = z10;
    }

    @Nullable
    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e10) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    @Nullable
    public final synchronized String zza(Context context, String str) {
        byte[] bArrZzj;
        Map mapZzb = this.zzc.zzb();
        mapZzb.put(InneractiveMediationDefs.GENDER_FEMALE, "q");
        mapZzb.put("ctx", context);
        mapZzb.put(C3784xa.f31580b, null);
        bArrZzj = zzj(null, mapZzb);
        if (this.zze) {
            mapZzb.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    @Nullable
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] bArrZzj;
        Map mapZzc = this.zzc.zzc();
        mapZzc.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        mapZzc.put("ctx", context);
        mapZzc.put(C3784xa.f31580b, null);
        mapZzc.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        mapZzc.put("act", activity);
        bArrZzj = zzj(null, mapZzc);
        if (this.zze) {
            mapZzc.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    @Nullable
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] bArrZzj;
        Map mapZzd = this.zzc.zzd();
        mapZzd.put(InneractiveMediationDefs.GENDER_FEMALE, "c");
        mapZzd.put("ctx", context);
        mapZzd.put("cs", str2);
        mapZzd.put(C3784xa.f31580b, null);
        mapZzd.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        mapZzd.put("act", activity);
        bArrZzj = zzj(null, mapZzd);
        if (this.zze) {
            mapZzd.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfwz {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapZze = this.zzc.zze();
            mapZze.put(C3784xa.f31580b, null);
            mapZze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapZze);
            this.zzd.zzb(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzfwz(2005, e10);
        }
    }

    public final zzfwq zze() {
        return this.zzb;
    }

    public final synchronized boolean zzf() throws zzfwz {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e10) {
            throw new zzfwz(2001, e10);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod(C3426d4.a.f28413f, new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzfwz {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", new Class[0]).invoke(obj, new Object[0]);
            this.zzd.zzb(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzfwz(2003, e10);
        }
    }

    public final synchronized int zzh() throws zzfwz {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e10) {
            throw new zzfwz(2006, e10);
        }
        return ((Integer) obj.getClass().getDeclaredMethod(CampaignEx.KEY_LOCAL_CHECK_STATE, new Class[0]).invoke(obj, new Object[0])).intValue();
    }

    @Nullable
    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaxw zzaxwVarZza = zzaxx.zza();
        zzaxwVarZza.zzd(5);
        zzaxwVarZza.zza(zzian.zzs(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzaxx) zzaxwVarZza.zzbu()).zzaN(), 11);
    }
}
