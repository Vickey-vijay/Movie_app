package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcbl {
    @Nullable
    public static final zzcaz zza(Context context, String str, zzbtt zzbttVar) {
        zzcaz zzcaxVar;
        try {
            IBinder iBinderZze = ((zzcbd) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzcbk
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final /* synthetic */ Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof zzcbd ? (zzcbd) iInterfaceQueryLocalInterface : new zzcbd(iBinder);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbttVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (iInterfaceQueryLocalInterface instanceof zzcaz) {
                zzcaxVar = (zzcaz) iInterfaceQueryLocalInterface;
            } else {
                zzcaxVar = new zzcax(iBinderZze);
            }
            return zzcaxVar;
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }
}
