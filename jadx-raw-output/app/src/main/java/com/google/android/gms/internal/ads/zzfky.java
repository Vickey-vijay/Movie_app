package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.LinkedList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfky {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzflx zzd = new zzflx();

    public final long zzd() {
        return this.zzd.zzd();
    }

    public final long zze() {
        return this.zzd.zze();
    }

    public final int zzf() {
        return this.zzd.zzf();
    }

    private final void zzi() {
        while (true) {
            LinkedList linkedList = this.zza;
            if (linkedList.isEmpty()) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((zzfli) linkedList.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzc();
            linkedList.remove();
        }
    }

    public final boolean zza(zzfli zzfliVar) {
        this.zzd.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.size() == this.zzb) {
            return false;
        }
        linkedList.add(zzfliVar);
        return true;
    }

    @Nullable
    public final zzfli zzb() {
        zzflx zzflxVar = this.zzd;
        zzflxVar.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.isEmpty()) {
            return null;
        }
        zzfli zzfliVar = (zzfli) linkedList.remove();
        if (zzfliVar != null) {
            zzflxVar.zzb();
        }
        return zzfliVar;
    }

    public final String zzg() {
        return this.zzd.zzh();
    }

    public final zzflw zzh() {
        return this.zzd.zzg();
    }

    public zzfky(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
    }

    public final int zzc() {
        zzi();
        return this.zza.size();
    }
}
