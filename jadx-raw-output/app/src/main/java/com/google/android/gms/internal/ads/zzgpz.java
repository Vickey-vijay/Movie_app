package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgpz implements ServiceConnection {
    public final /* synthetic */ zzgqf zza;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Object[] objArr = {componentName};
        zzgqf zzgqfVar = this.zza;
        zzgqfVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", objArr);
        zzgqfVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgoj zzgojVarZzb = zzgoi.zzb(iBinder);
                zzgpz zzgpzVar = this.zza;
                zzgqf zzgqfVar2 = zzgpzVar.zza;
                zzgqfVar2.zzn(zzgojVarZzb);
                zzgqfVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    IInterface iInterfaceZzm = zzgqfVar2.zzm();
                    iInterfaceZzm.getClass();
                    iInterfaceZzm.asBinder().linkToDeath(zzgqfVar2.zzl(), 0);
                } catch (RemoteException e10) {
                    zzgpzVar.zza.zzi().zzd(e10, "linkToDeath failed", new Object[0]);
                }
                zzgqf zzgqfVar3 = zzgpzVar.zza;
                zzgqfVar3.zzk(false);
                synchronized (zzgqfVar3.zzj()) {
                    Iterator it = zzgqfVar3.zzj().iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zzgqfVar3.zzj().clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object[] objArr = {componentName};
        zzgqf zzgqfVar = this.zza;
        zzgqfVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", objArr);
        zzgqfVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgqf zzgqfVar2 = this.zza.zza;
                zzgqfVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface iInterfaceZzm = zzgqfVar2.zzm();
                iInterfaceZzm.getClass();
                iInterfaceZzm.asBinder().unlinkToDeath(zzgqfVar2.zzl(), 0);
                zzgqfVar2.zzn(null);
                zzgqfVar2.zzk(false);
            }
        });
    }

    public /* synthetic */ zzgpz(zzgqf zzgqfVar, byte[] bArr) {
        Objects.requireNonNull(zzgqfVar);
        this.zza = zzgqfVar;
    }
}
