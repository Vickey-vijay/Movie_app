package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbyr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzk extends RemoteCreator {
    private zzbyr zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzby(iBinder);
    }

    @Nullable
    public final zzbx zza(Context context, zzr zzrVar, String str, zzbtt zzbttVar, int i10) {
        zzbx zzbvVar;
        zzbx zzbvVar2;
        zzbhe.zza(context);
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmf)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzby) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzj
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final /* synthetic */ Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzby(iBinder);
                    }
                })).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbttVar, ModuleDescriptor.MODULE_VERSION, i10);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (iInterfaceQueryLocalInterface instanceof zzbx) {
                    zzbvVar = (zzbx) iInterfaceQueryLocalInterface;
                } else {
                    zzbvVar = new zzbv(iBinderZze);
                }
                return zzbvVar;
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
                zzbyr zzbyrVarZza = zzbyp.zza(context);
                this.zza = zzbyrVarZza;
                zzbyrVarZza.zzh(e10, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((zzby) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbttVar, ModuleDescriptor.MODULE_VERSION, i10);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface2 instanceof zzbx) {
                zzbvVar2 = (zzbx) iInterfaceQueryLocalInterface2;
            } else {
                zzbvVar2 = new zzbv(iBinderZze2);
            }
            return zzbvVar2;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e11);
            return null;
        }
    }
}
