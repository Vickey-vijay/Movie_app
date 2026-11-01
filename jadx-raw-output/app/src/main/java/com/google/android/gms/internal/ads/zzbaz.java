package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbaz extends zzbby {
    public zzbaz(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11) {
        super(zzbakVar, "1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", zzawgVar, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzawg zzawgVar = this.zzd;
        zzawgVar.zzd(-1L);
        zzawgVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzawgVar) {
            zzawgVar.zzd(iArr[0]);
            zzawgVar.zze(iArr[1]);
            int i10 = iArr[2];
            if (i10 != Integer.MIN_VALUE) {
                zzawgVar.zzO(i10);
            }
        }
    }
}
