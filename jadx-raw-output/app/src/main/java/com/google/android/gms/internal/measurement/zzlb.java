package com.google.android.gms.internal.measurement;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes8.dex */
final class zzlb implements zzlv {
    private static final zzlh zza = new zzkz();
    private final zzlh zzb;

    public zzlb() {
        zzlh zzlhVar;
        zzlh[] zzlhVarArr = new zzlh[2];
        zzlhVarArr[0] = zzjx.zza();
        try {
            zzlhVar = (zzlh) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzlhVar = zza;
        }
        zzlhVarArr[1] = zzlhVar;
        zzla zzlaVar = new zzla(zzlhVarArr);
        zzkk.zzf(zzlaVar, "messageInfoFactory");
        this.zzb = zzlaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlv
    public final zzlu zza(Class cls) {
        zzlw.zzG(cls);
        zzlg zzlgVarZzb = this.zzb.zzb(cls);
        if (zzlgVarZzb.zzb()) {
            return zzkc.class.isAssignableFrom(cls) ? zzln.zzc(zzlw.zzB(), zzjr.zzb(), zzlgVarZzb.zza()) : zzln.zzc(zzlw.zzz(), zzjr.zza(), zzlgVarZzb.zza());
        }
        if (zzkc.class.isAssignableFrom(cls)) {
            return zzb(zzlgVarZzb) ? zzlm.zzl(cls, zzlgVarZzb, zzlp.zzb(), zzkx.zzd(), zzlw.zzB(), zzjr.zzb(), zzlf.zzb()) : zzlm.zzl(cls, zzlgVarZzb, zzlp.zzb(), zzkx.zzd(), zzlw.zzB(), null, zzlf.zzb());
        }
        return zzb(zzlgVarZzb) ? zzlm.zzl(cls, zzlgVarZzb, zzlp.zza(), zzkx.zzc(), zzlw.zzz(), zzjr.zza(), zzlf.zza()) : zzlm.zzl(cls, zzlgVarZzb, zzlp.zza(), zzkx.zzc(), zzlw.zzA(), null, zzlf.zza());
    }

    private static boolean zzb(zzlg zzlgVar) {
        if (zzlgVar.zzc() == 1) {
            return true;
        }
        return false;
    }
}
