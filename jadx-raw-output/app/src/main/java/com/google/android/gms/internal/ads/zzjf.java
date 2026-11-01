package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzjf {
    public final Context zza;
    public zzdn zzb;
    public zzgru zzc;
    public zzgru zzd;
    public zzgru zze;
    public zzgru zzf;
    public zzgru zzg;
    public zzgqt zzh;
    public Looper zzi;
    public int zzj;
    public zzd zzk;
    public int zzl;
    public boolean zzm;
    public zzmt zzn;
    public zzms zzo;
    public long zzp;
    public long zzq;
    public int zzr;
    public int zzs;
    public int zzt;
    public int zzu;
    public boolean zzv;
    public boolean zzw;
    public String zzx;
    public zzip zzy;

    public zzjf(final Context context, final zzmq zzmqVar) {
        zzgru zzgruVar = new zzgru() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return zzmqVar;
            }
        };
        zzgru zzgruVar2 = new zzgru() { // from class: com.google.android.gms.internal.ads.zziz
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new zzvx(context, new zzaeq());
            }
        };
        zzgru zzgruVar3 = new zzgru() { // from class: com.google.android.gms.internal.ads.zzja
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new zzaaa(context);
            }
        };
        zziy zziyVar = new zzgru() { // from class: com.google.android.gms.internal.ads.zziy
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new zzis();
            }
        };
        zzgru zzgruVar4 = new zzgru() { // from class: com.google.android.gms.internal.ads.zzjb
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return zzaav.zzh(context);
            }
        };
        zzix zzixVar = new zzgqt() { // from class: com.google.android.gms.internal.ads.zzix
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return new zzpc((zzdn) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzgruVar;
        this.zzd = zzgruVar2;
        this.zze = zzgruVar3;
        this.zzf = zziyVar;
        this.zzg = zzgruVar4;
        this.zzh = zzixVar;
        this.zzi = zzfj.zze();
        this.zzk = zzd.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzmt.zzc;
        this.zzo = zzms.zza;
        this.zzy = new zzip(0.97f, 1.03f, 1000L, 1.0E-7f, zzfj.zzq(20L), zzfj.zzq(500L), 0.999f, null);
        this.zzb = zzdn.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = 600000;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        this.zzu = 600000;
        this.zzv = true;
        this.zzx = "";
        this.zzj = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i10 = zziv.zza;
        }
    }
}
