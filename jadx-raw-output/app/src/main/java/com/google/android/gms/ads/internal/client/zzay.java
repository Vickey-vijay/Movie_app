package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzay extends zzba {
    public final /* synthetic */ View zza;
    public final /* synthetic */ HashMap zzb;
    public final /* synthetic */ HashMap zzc;
    public final /* synthetic */ zzaz zzd;

    public zzay(zzaz zzazVar, View view, HashMap map, HashMap map2) {
        this.zza = view;
        this.zzb = map;
        this.zzc = map2;
        Objects.requireNonNull(zzazVar);
        this.zzd = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        View view = this.zza;
        zzbhe.zza(view.getContext());
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmf)).booleanValue()) {
            zzaz zzazVar = this.zzd;
            return zzazVar.zzs().zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzblb.zze(((zzblf) com.google.android.gms.ads.internal.util.client.zzs.zza(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzax
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final /* synthetic */ Object zza(Object obj) {
                    return zzble.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
            zzaz zzazVar2 = this.zzd;
            zzazVar2.zzu(zzbyp.zza(this.zza.getContext()));
            zzazVar2.zzt().zzh(e10, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        HashMap map = this.zzc;
        return zzcrVar.zzk(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(map));
    }
}
