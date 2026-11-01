package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdfw implements AppEventListener, OnAdMetadataChangedListener, zzdbf, com.google.android.gms.ads.internal.client.zza, zzddw, zzdbz, zzdde, com.google.android.gms.ads.internal.overlay.zzr, zzdbv, zzdjm {
    private final zzdev zza = new zzdev(this, null);
    private zzerp zzb;
    private zzert zzc;
    private zzfer zzd;
    private zzfhv zze;

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    public final zzdev zzn() {
        return this.zza;
    }

    public final /* synthetic */ void zzo(zzerp zzerpVar) {
        this.zzb = zzerpVar;
    }

    public final /* synthetic */ void zzp(zzert zzertVar) {
        this.zzc = zzertVar;
    }

    public final /* synthetic */ void zzq(zzfer zzferVar) {
        this.zzd = zzferVar;
    }

    public final /* synthetic */ void zzr(zzfhv zzfhvVar) {
        this.zze = zzfhvVar;
    }

    private static void zzs(Object obj, zzdfv zzdfvVar) {
        if (obj != null) {
            zzdfvVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfa
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).onAdClicked();
            }
        });
        zzs(this.zzc, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfn
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzert) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdft
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzden
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(final zzcag zzcagVar, final String str, final String str2) {
        zzs(this.zzb, new zzdfv(zzcagVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdeu
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdem
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzd(zzcagVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdex
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).zzdJ();
            }
        });
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfp
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzdJ();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfb
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).zzdQ();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfh
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfer) obj).zzdS();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(final int i10) {
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdet
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfer) obj).zzdT(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfd
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).zzdr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdew
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).zzds();
            }
        });
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfo
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzds();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfe
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).zzdt();
            }
        });
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfu
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzdt();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfc
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).zzdu();
            }
        });
        zzs(this.zzc, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfm
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzert) obj).zzdu();
            }
        });
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfs
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzdu();
            }
        });
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfl
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfer) obj).zzdu();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfi
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfer) obj).zzdv();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfj
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfk
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdey
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfq
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdez
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfr
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdfg
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfer) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzder
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzj(zzeVar);
            }
        });
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdes
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzl() {
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdff
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfer) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzs(this.zzb, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdeo
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzerp) obj).zzm(zztVar);
            }
        });
        zzs(this.zze, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdep
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhv) obj).zzm(zztVar);
            }
        });
        zzs(this.zzd, new zzdfv() { // from class: com.google.android.gms.internal.ads.zzdeq
            @Override // com.google.android.gms.internal.ads.zzdfv
            public final /* synthetic */ void zza(Object obj) {
                ((zzfer) obj).zzm(zztVar);
            }
        });
    }
}
