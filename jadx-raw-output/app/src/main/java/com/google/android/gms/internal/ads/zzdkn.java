package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdkn extends zzcwf {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdiq zze;
    private final zzdmc zzf;
    private final zzcxa zzg;
    private final zzfvr zzh;
    private final zzdbs zzi;
    private final zzcdz zzj;
    private final zzdxz zzk;
    private boolean zzl;

    public final void finalize() throws Throwable {
        try {
            final zzcjl zzcjlVar = (zzcjl) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhE)).booleanValue()) {
                if (!this.zzl && zzcjlVar != null) {
                    zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkm
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcjlVar.destroy();
                        }
                    });
                }
            } else if (zzcjlVar != null) {
                zzcjlVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00df  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zza(boolean z10, Activity activity) {
        Context context;
        zzfir zzfirVarZzC;
        zzdiq zzdiqVar = this.zze;
        zzdiqVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdmc zzdmcVar = this.zzf;
        if (com.google.android.gms.ads.internal.util.zzs.zzT(zzdmcVar.zzb())) {
            zzcjl zzcjlVar = (zzcjl) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue()) {
                if (this.zzl) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                    this.zzi.zzc(zzfkm.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzl) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    zzdmcVar.zza(z10, context, this.zzi);
                    zzdiqVar.zzb();
                    this.zzl = true;
                    return true;
                }
            } else {
                if (this.zzl) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                    this.zzi.zzc(zzfkm.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzl) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    zzdmcVar.zza(z10, context, this.zzi);
                    zzdiqVar.zzb();
                    this.zzl = true;
                    return true;
                }
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzS(this.zzc, this.zzb, this.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbi)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc)) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbj)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                } else {
                    zzcjl zzcjlVar2 = (zzcjl) this.zzd.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue() || zzcjlVar2 == null || (zzfirVarZzC = zzcjlVar2.zzC()) == null || !zzfirVarZzC.zzar || zzfirVarZzC.zzas == this.zzj.zzj()) {
                        if (this.zzl) {
                            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                            this.zzi.zzc(zzfkm.zzd(10, null, null));
                        }
                        context = activity;
                        if (!this.zzl) {
                            if (activity == null) {
                                context = this.zzc;
                            }
                            try {
                                zzdmcVar.zza(z10, context, this.zzi);
                                zzdiqVar.zzb();
                                this.zzl = true;
                                return true;
                            } catch (zzdmb e10) {
                                this.zzi.zzd(e10);
                            }
                        }
                    } else {
                        int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial consent form has been shown.");
                        this.zzi.zzc(zzfkm.zzd(12, "The consent form has already been shown.", null));
                    }
                }
            } else {
                zzcjl zzcjlVar3 = (zzcjl) this.zzd.get();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue()) {
                    if (this.zzl) {
                        int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                        this.zzi.zzc(zzfkm.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzl) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        zzdmcVar.zza(z10, context, this.zzi);
                        zzdiqVar.zzb();
                        this.zzl = true;
                        return true;
                    }
                } else {
                    if (this.zzl) {
                        int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                        this.zzi.zzc(zzfkm.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzl) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        zzdmcVar.zza(z10, context, this.zzi);
                        zzdiqVar.zzb();
                        this.zzl = true;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }

    public zzdkn(zzcwe zzcweVar, Context context, zzcjl zzcjlVar, zzdiq zzdiqVar, zzdmc zzdmcVar, zzcxa zzcxaVar, zzfvr zzfvrVar, zzdbs zzdbsVar, zzcdz zzcdzVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcjlVar);
        this.zze = zzdiqVar;
        this.zzf = zzdmcVar;
        this.zzg = zzcxaVar;
        this.zzh = zzfvrVar;
        this.zzi = zzdbsVar;
        this.zzj = zzcdzVar;
        this.zzk = zzdxzVar;
    }
}
