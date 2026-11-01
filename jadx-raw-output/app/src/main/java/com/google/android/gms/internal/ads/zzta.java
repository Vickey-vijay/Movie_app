package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzta extends zzuu implements zzlm {
    private final Context zzb;
    private final zzrb zzc;
    private final zzrj zzd;

    @Nullable
    private final zzug zze;
    private final Set zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;

    @Nullable
    private zzv zzj;
    private final zzil zzk;
    private zzil zzl;

    @Nullable
    private zzv zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private boolean zzs;
    private long zzt;

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzD() {
        this.zzp = true;
        this.zzj = null;
        this.zzt = -9223372036854775807L;
        try {
            this.zzd.zzA();
            super.zzD();
        } catch (Throwable th2) {
            super.zzD();
            throw th2;
        } finally {
            this.zzc.zzg(((zzuu) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzE() {
        this.zzq = false;
        this.zzt = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzp) {
            }
        } finally {
            if (this.zzp) {
                this.zzp = false;
                this.zzd.zzB();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml, com.google.android.gms.internal.ads.zzmn
    public final String zzS() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final float zzai(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        int iMax = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i10 = zzvVar2.zzH;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @CallSuper
    public final void zzao() {
        this.zzo = true;
    }

    public final /* synthetic */ zzrb zzaw() {
        return this.zzc;
    }

    public final /* synthetic */ zzug zzax() {
        return this.zze;
    }

    public final /* synthetic */ void zzay(boolean z10) {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    @Nullable
    public final zzlm zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final boolean zzh() {
        boolean z10 = this.zzq;
        this.zzq = false;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final zzav zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public final void zzx(int i10, @Nullable Object obj) throws zziw {
        zzug zzugVar;
        if (i10 == 2) {
            zzrj zzrjVar = this.zzd;
            obj.getClass();
            zzrjVar.zzy(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            zzd zzdVar = (zzd) obj;
            zzrj zzrjVar2 = this.zzd;
            zzdVar.getClass();
            zzrjVar2.zzr(zzdVar);
            return;
        }
        if (i10 == 6) {
            zze zzeVar = (zze) obj;
            zzrj zzrjVar3 = this.zzd;
            zzeVar.getClass();
            zzrjVar3.zzt(zzeVar);
            return;
        }
        if (i10 == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.zzr = ((Integer) obj).intValue();
            zzuk zzukVarZzaE = zzaE();
            if (zzukVarZzaE == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzr));
            zzukVarZzaE.zzp(bundle);
            return;
        }
        if (i10 == 19) {
            zzrj zzrjVar4 = this.zzd;
            obj.getClass();
            zzrjVar4.zzv(((Integer) obj).intValue());
            return;
        }
        if (i10 == 9) {
            zzrj zzrjVar5 = this.zzd;
            obj.getClass();
            zzrjVar5.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i10 != 10) {
                super.zzx(i10, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzs(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zzugVar = this.zze) == null) {
                return;
            }
            zzugVar.zza(iIntValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzta(Context context, zzui zzuiVar, zzuw zzuwVar, boolean z10, @Nullable Handler handler, @Nullable zzrc zzrcVar, zzrj zzrjVar) {
        super(1, zzuiVar, zzuwVar, false, 44100.0f);
        zzug zzugVar = Build.VERSION.SDK_INT >= 35 ? new zzug(zzuf.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzrjVar;
        this.zze = zzugVar;
        this.zzr = -1000;
        this.zzc = new zzrb(handler, zzrcVar);
        this.zzt = -9223372036854775807L;
        zzrjVar.zza(new zzsz(this, null));
        this.zzf = new HashSet();
        zzil zzilVar = zzil.zza;
        this.zzk = zzilVar;
        this.zzl = zzilVar;
    }

    private static List zzbg(zzuw zzuwVar, zzv zzvVar, boolean z10, zzrj zzrjVar) throws zzuy {
        zzun zzunVarZza;
        if (zzvVar.zzo == null) {
            return zzguf.zzi();
        }
        return (!zzrjVar.zzd(zzvVar) || (zzunVarZza = zzvg.zza()) == null) ? zzvg.zzc(zzuwVar, zzvVar, false, false) : zzguf.zzj(zzunVarZza);
    }

    private final int zzbh(zzun zzunVar, zzv zzvVar) {
        "OMX.google.raw.decoder".equals(zzunVar.zza);
        return zzvVar.zzp;
    }

    private final void zzbi() {
        long jZzg = this.zzd.zzg(zzZ());
        if (jZzg != Long.MIN_VALUE) {
            if (!this.zzo) {
                jZzg = Math.max(this.zzn, jZzg);
            }
            this.zzn = jZzg;
            this.zzo = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzB() {
        this.zzd.zzi();
        this.zzs = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzF() {
        zzug zzugVar;
        this.zzd.zzC();
        if (Build.VERSION.SDK_INT < 35 || (zzugVar = this.zze) == null) {
            return;
        }
        zzugVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzY() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy {
        int i10;
        boolean z10;
        String str = zzvVar.zzo;
        if (!zzas.zza(str)) {
            return 128;
        }
        int i11 = zzvVar.zzN;
        boolean zZzbd = zzuu.zzbd(zzvVar);
        int i12 = 1;
        if (!zZzbd || (i11 != 0 && zzvg.zza() == null)) {
            i10 = 0;
        } else {
            zzrj zzrjVar = this.zzd;
            zzpz zzpzVarZzf = zzrjVar.zzf(zzvVar);
            if (zzpzVarZzf.zzb) {
                i10 = true != zzpzVarZzf.zzc ? 512 : 1536;
                if (zzpzVarZzf.zzd) {
                    i10 |= 2048;
                }
            } else {
                i10 = 0;
            }
            if (zzrjVar.zzd(zzvVar)) {
                return i10 | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            zzrj zzrjVar2 = this.zzd;
            if (zzrjVar2.zzd(zzfj.zzy(2, zzvVar.zzG, zzvVar.zzH))) {
                List listZzbg = zzbg(zzuwVar, zzvVar, false, zzrjVar2);
                if (!listZzbg.isEmpty()) {
                    if (zZzbd) {
                        zzun zzunVar = (zzun) listZzbg.get(0);
                        boolean zZzc = zzunVar.zzc(zzvVar);
                        if (!zZzc) {
                            int i13 = 1;
                            while (true) {
                                if (i13 >= listZzbg.size()) {
                                    z10 = true;
                                    break;
                                }
                                zzun zzunVar2 = (zzun) listZzbg.get(i13);
                                if (zzunVar2.zzc(zzvVar)) {
                                    z10 = false;
                                    zZzc = true;
                                    zzunVar = zzunVar2;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                        int i14 = true != zZzc ? 3 : 4;
                        int i15 = 8;
                        if (zZzc && zzunVar.zze(zzvVar)) {
                            i15 = 16;
                        }
                        return i14 | i15 | 32 | (true != zzunVar.zzg ? 0 : 64) | (true != z10 ? 0 : 128) | i10;
                    }
                    i12 = 2;
                }
            }
        }
        return i12 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final List zzad(zzuw zzuwVar, zzv zzvVar, boolean z10) throws zzuy {
        return zzvg.zze(zzbg(zzuwVar, zzvVar, false, this.zzd), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final long zzah(long j10, long j11, boolean z10) {
        zzrj zzrjVar = this.zzd;
        boolean z11 = false;
        if (zzrjVar.zzn() && this.zzt != -9223372036854775807L) {
            z11 = true;
        }
        if (!this.zzs) {
            return (z11 || super.zzZ()) ? 1000000L : 10000L;
        }
        long jZzw = zzrjVar.zzw();
        if (!z11 || jZzw == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(jZzw, this.zzt - j10) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f)) - (zzfj.zzq(zzL().zzb()) - j11));
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzaj(String str, zzuh zzuhVar, long j10, long j11) {
        this.zzc.zzb(str, j10, j11);
        if (Build.VERSION.SDK_INT >= 31) {
            Set set = this.zzf;
            if (set.isEmpty()) {
                return;
            }
            zzuk zzukVarZzaE = zzaE();
            zzukVarZzaE.getClass();
            zzukVarZzaE.zzr(new ArrayList(set));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzak(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzal(Exception exc) {
        zzee.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @Nullable
    public final zzio zzam(zzlh zzlhVar) throws zziw {
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        this.zzj = zzvVar;
        zzio zzioVarZzam = super.zzam(zzlhVar);
        this.zzc.zzc(zzvVar, zzioVarZzam);
        return zzioVarZzam;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzan(zzv zzvVar, @Nullable MediaFormat mediaFormat) throws zziw {
        int[] iArr;
        int i10;
        int iZzz = 2;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT >= 29 && mediaFormat != null) {
            Set<String> set = this.zzf;
            if (!set.isEmpty()) {
                zzil zzilVar = zzil.zza;
                zzik zzikVar = new zzik();
                for (String str : set) {
                    if (mediaFormat.containsKey(str)) {
                        int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                        if (valueTypeForKey == 1) {
                            zzikVar.zza(str, mediaFormat.getInteger(str));
                        } else if (valueTypeForKey == 2) {
                            zzikVar.zzb(str, mediaFormat.getLong(str));
                        } else if (valueTypeForKey == 3) {
                            zzikVar.zzc(str, mediaFormat.getFloat(str));
                        } else if (valueTypeForKey == 4) {
                            zzikVar.zzd(str, mediaFormat.getString(str));
                        } else if (valueTypeForKey == 5) {
                            zzikVar.zze(str, mediaFormat.getByteBuffer(str));
                        }
                    }
                }
                zzil zzilVarZzg = zzikVar.zzg();
                if (!zzilVarZzg.equals(this.zzl)) {
                    this.zzl = zzilVarZzg;
                    this.zzc.zzn(zzilVarZzg);
                }
            }
        }
        zzv zzvVar2 = this.zzm;
        int[] iArr2 = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaE() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzvVar.zzo)) {
                iZzz = zzvVar.zzI;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iZzz = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                iZzz = zzfj.zzz(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            }
            zzt zztVar = new zzt();
            zztVar.zzm("audio/raw");
            zztVar.zzG(iZzz);
            zztVar.zzH(zzvVar.zzJ);
            zztVar.zzI(zzvVar.zzK);
            zztVar.zzk(zzvVar.zzl);
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzE(mediaFormat.getInteger("channel-count"));
            zztVar.zzF(mediaFormat.getInteger("sample-rate"));
            zzv zzvVarZzM = zztVar.zzM();
            if (this.zzh && zzvVarZzM.zzG == 6 && (i10 = zzvVar.zzG) < 6) {
                iArr2 = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr2[i11] = i11;
                }
            } else if (this.zzi) {
                int i12 = zzvVarZzM.zzG;
                if (i12 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i12 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i12 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i12 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i12 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzvVar = zzvVarZzM;
        }
        try {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 29) {
                if (zzaD()) {
                    zzJ();
                }
                if (i13 < 29) {
                    z10 = false;
                }
                zzgrc.zzi(z10);
            }
            this.zzd.zzh(zzvVar, 0, iArr2);
        } catch (zzre e10) {
            throw zzN(e10, e10.zza, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzap() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzar() throws zziw {
        try {
            this.zzd.zzl();
            if (zzba() != -9223372036854775807L) {
                this.zzt = zzba();
            }
        } catch (zzri e10) {
            throw zzN(e10, e10.zzc, e10.zzb, true != zzaD() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzas(zzih zzihVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zzihVar.zza) == null || !Objects.equals(zzvVar.zzo, "audio/opus") || !zzaD()) {
            return;
        }
        ByteBuffer byteBuffer = zzihVar.zzf;
        byteBuffer.getClass();
        zzv zzvVar2 = zzihVar.zza;
        zzvVar2.getClass();
        int i10 = zzvVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzx(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzi(zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzA(long j10, boolean z10, boolean z11) throws zziw {
        super.zzA(j10, z10, z11);
        this.zzd.zzA();
        this.zzn = j10;
        this.zzt = -9223372036854775807L;
        this.zzq = false;
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzC() {
        zzbi();
        this.zzs = false;
        this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzZ() {
        if (super.zzZ() && this.zzd.zzm()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final boolean zzae(zzv zzvVar) {
        zzJ();
        return this.zzd.zzd(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final zzuh zzaf(zzun zzunVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f10) {
        boolean z10;
        zzv zzvVar2;
        zzv[] zzvVarArrZzI = zzI();
        int length = zzvVarArrZzI.length;
        int iZzbh = zzbh(zzunVar, zzvVar);
        if (length != 1) {
            for (zzv zzvVar3 : zzvVarArrZzI) {
                if (zzunVar.zzf(zzvVar, zzvVar3).zzd != 0) {
                    iZzbh = Math.max(iZzbh, zzbh(zzunVar, zzvVar3));
                }
            }
        }
        this.zzg = iZzbh;
        String str = zzunVar.zza;
        int i10 = Build.VERSION.SDK_INT;
        this.zzh = false;
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.zzi = z10;
        String str2 = zzunVar.zzc;
        int i11 = this.zzg;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i12 = zzvVar.zzG;
        mediaFormat.setInteger("channel-count", i12);
        int i13 = zzvVar.zzH;
        mediaFormat.setInteger("sample-rate", i13);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        zzeh.zzb(mediaFormat, "max-input-size", i11);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        String str3 = zzvVar.zzo;
        if ("audio/ac4".equals(str3)) {
            Pair pairZzd = zzdo.zzd(zzvVar);
            if (pairZzd != null) {
                zzeh.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZzd.first).intValue());
                zzeh.zzb(mediaFormat, AppLovinEventTypes.USER_COMPLETED_LEVEL, ((Integer) pairZzd.second).intValue());
            }
            if (i10 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzfj.zzy(4, i12, i13)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i10 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzr));
        }
        if (i10 >= 29) {
            this.zzk.zzb(mediaFormat);
        }
        if ("audio/raw".equals(zzunVar.zzb) && !"audio/raw".equals(str3)) {
            zzvVar2 = zzvVar;
        } else {
            zzvVar2 = null;
        }
        this.zzm = zzvVar2;
        return zzuh.zza(zzunVar, mediaFormat, zzvVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        int i10;
        int i11;
        zzio zzioVarZzf = zzunVar.zzf(zzvVar, zzvVar2);
        int i12 = zzioVarZzf.zze;
        if (zzaB(zzvVar2)) {
            i12 |= 32768;
        }
        if (zzbh(zzunVar, zzvVar2) > this.zzg) {
            i12 |= 64;
        }
        String str = zzunVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzioVarZzf.zzd;
            i11 = 0;
        }
        return new zzio(str, zzvVar, zzvVar2, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final boolean zzaq(long j10, long j11, @Nullable zzuk zzukVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) throws zziw {
        byteBuffer.getClass();
        this.zzt = -9223372036854775807L;
        if (this.zzm != null && (i11 & 2) != 0) {
            zzukVar.getClass();
            zzukVar.zzc(i10, false);
            return true;
        }
        if (z10) {
            if (zzukVar != null) {
                zzukVar.zzc(i10, false);
            }
            ((zzuu) this).zza.zzf += i12;
            this.zzd.zzj();
            return true;
        }
        try {
            if (this.zzd.zzk(byteBuffer, j12, i12)) {
                if (zzukVar != null) {
                    zzukVar.zzc(i10, false);
                }
                ((zzuu) this).zza.zze += i12;
                return true;
            }
            this.zzt = j12;
            return false;
        } catch (zzrf e10) {
            zzv zzvVar2 = this.zzj;
            if (zzaD()) {
                zzJ();
            }
            throw zzN(e10, zzvVar2, false, 5001);
        } catch (zzri e11) {
            if (zzaD()) {
                zzJ();
            }
            throw zzN(e11, zzvVar, e11.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final long zzg() {
        if (zze() == 2) {
            zzbi();
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzy(boolean z10, boolean z11) throws zziw {
        super.zzy(z10, z11);
        this.zzc.zza(((zzuu) this).zza);
        zzJ();
        zzrj zzrjVar = this.zzd;
        zzrjVar.zzb(zzK());
        zzrjVar.zzc(zzL());
    }
}
