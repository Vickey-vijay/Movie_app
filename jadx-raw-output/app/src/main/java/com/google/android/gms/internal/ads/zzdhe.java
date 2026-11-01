package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdhe {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzfgg zzo;

    public final /* synthetic */ Set zzA() {
        return this.zzm;
    }

    public final /* synthetic */ Set zzB() {
        return this.zzn;
    }

    public final /* synthetic */ zzfgg zzC() {
        return this.zzo;
    }

    public final zzdhe zzl(zzfgg zzfggVar) {
        this.zzo = zzfggVar;
        return this;
    }

    public final zzdhf zzn() {
        return new zzdhf(this, null);
    }

    public final /* synthetic */ Set zzo() {
        return this.zza;
    }

    public final /* synthetic */ Set zzp() {
        return this.zzb;
    }

    public final /* synthetic */ Set zzq() {
        return this.zzc;
    }

    public final /* synthetic */ Set zzr() {
        return this.zzd;
    }

    public final /* synthetic */ Set zzs() {
        return this.zze;
    }

    public final /* synthetic */ Set zzt() {
        return this.zzf;
    }

    public final /* synthetic */ Set zzu() {
        return this.zzg;
    }

    public final /* synthetic */ Set zzv() {
        return this.zzh;
    }

    public final /* synthetic */ Set zzw() {
        return this.zzi;
    }

    public final /* synthetic */ Set zzx() {
        return this.zzj;
    }

    public final /* synthetic */ Set zzy() {
        return this.zzk;
    }

    public final /* synthetic */ Set zzz() {
        return this.zzl;
    }

    public final zzdhe zza(zzdbf zzdbfVar, Executor executor) {
        this.zze.add(new zzdje(zzdbfVar, executor));
        return this;
    }

    public final zzdhe zzb(zzdct zzdctVar, Executor executor) {
        this.zzh.add(new zzdje(zzdctVar, executor));
        return this;
    }

    public final zzdhe zzc(zzdbi zzdbiVar, Executor executor) {
        this.zzi.add(new zzdje(zzdbiVar, executor));
        return this;
    }

    public final zzdhe zzd(zzdbv zzdbvVar, Executor executor) {
        this.zzl.add(new zzdje(zzdbvVar, executor));
        return this;
    }

    public final zzdhe zze(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdje(appEventListener, executor));
        return this;
    }

    public final zzdhe zzf(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdje(zzaVar, executor));
        return this;
    }

    public final zzdhe zzg(zzdjm zzdjmVar, Executor executor) {
        this.zzd.add(new zzdje(zzdjmVar, executor));
        return this;
    }

    public final zzdhe zzh(zzdbz zzdbzVar, Executor executor) {
        this.zzf.add(new zzdje(zzdbzVar, executor));
        return this;
    }

    public final zzdhe zzi(zzdde zzddeVar, Executor executor) {
        this.zzg.add(new zzdje(zzddeVar, executor));
        return this;
    }

    public final zzdhe zzj(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.zzn.add(new zzdje(zzrVar, executor));
        return this;
    }

    public final zzdhe zzk(zzddw zzddwVar, Executor executor) {
        this.zzm.add(new zzdje(zzddwVar, executor));
        return this;
    }

    public final zzdhe zzm(zzdel zzdelVar, Executor executor) {
        this.zzb.add(new zzdje(zzdelVar, executor));
        return this;
    }
}
