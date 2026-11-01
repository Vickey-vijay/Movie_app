package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.MediaLibraryInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(31)
public final class zzpm implements zzna, zzpn {
    private boolean zzA;
    private final Context zza;
    private final zzpo zzc;
    private final PlaybackSession zzd;

    @Nullable
    private String zzj;

    @Nullable
    private PlaybackMetrics.Builder zzk;
    private int zzl;

    @Nullable
    private zzau zzo;

    @Nullable
    private zzpl zzp;

    @Nullable
    private zzpl zzq;

    @Nullable
    private zzpl zzr;

    @Nullable
    private zzv zzs;

    @Nullable
    private zzv zzt;

    @Nullable
    private zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzdh.zza();
    private final zzbe zzf = new zzbe();
    private final zzbd zzg = new zzbd();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzde(zzmy zzmyVar, zzba zzbaVar, zzba zzbaVar2, int i10) {
        if (i10 == 1) {
            this.zzv = true;
            i10 = 1;
        }
        this.zzl = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzg(zzmy zzmyVar, zzau zzauVar) {
        this.zzo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzh(zzmy zzmyVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z10) {
    }

    private final void zzA(int i10, long j10, @Nullable zzv zzvVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.zze);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = zzvVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzvVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzvVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = zzvVar.zzj;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = zzvVar.zzv;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = zzvVar.zzw;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = zzvVar.zzG;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = zzvVar.zzH;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = zzvVar.zzd;
            if (str4 != null) {
                String str5 = zzfj.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzvVar.zzz;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(trackChangeEventBuild);
            }
        });
    }

    private final void zzB(zzbf zzbfVar, @Nullable zzwk zzwkVar) {
        int iZze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzwkVar == null || (iZze = zzbfVar.zze(zzwkVar.zza)) == -1) {
            return;
        }
        zzbd zzbdVar = this.zzg;
        int i10 = 0;
        zzbfVar.zzd(iZze, zzbdVar, false);
        zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int iZzF = zzfj.zzF(zzagVar.zza);
            if (iZzF == 0) {
                i10 = 3;
            } else if (iZzF != 1) {
                i10 = iZzF != 2 ? 1 : 4;
            } else {
                i10 = 5;
            }
        }
        builder.setStreamType(i10);
        long j10 = zzbeVar.zzm;
        if (j10 != -9223372036854775807L && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            builder.setMediaDurationMillis(zzfj.zzp(j10));
        }
        builder.setPlaybackType(true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l10 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.zzk.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    @Nullable
    public static zzpm zza(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzpm(context, mediaMetricsManager.createPlaybackSession());
    }

    private final boolean zzw(@Nullable zzpl zzplVar) {
        if (zzplVar != null) {
            return zzplVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j10, @Nullable zzv zzvVar, int i10) {
        if (Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i11 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j10, zzvVar, i11);
    }

    private final void zzy(long j10, @Nullable zzv zzvVar, int i10) {
        if (Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i11 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j10, zzvVar, i11);
    }

    private final void zzz(long j10, @Nullable zzv zzvVar, int i10) {
        if (Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i11 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j10, zzvVar, i11);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzc(zzmy zzmyVar, String str) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null || !zzwkVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = new PlaybackMetrics.Builder().setPlayerName(MediaLibraryInfo.TAG).setPlayerVersion("1.9.0-beta01");
            zzB(zzmyVar.zzb, zzwkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzd(zzmy zzmyVar, String str, boolean z10) {
        zzwk zzwkVar = zzmyVar.zzd;
        if ((zzwkVar == null || !zzwkVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdf(zzmy zzmyVar, zzwg zzwgVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return;
        }
        zzv zzvVar = zzwgVar.zzb;
        zzvVar.getClass();
        zzpl zzplVar = new zzpl(zzvVar, 0, this.zzc.zzb(zzmyVar.zzb, zzwkVar));
        int i10 = zzwgVar.zza;
        if (i10 != 0) {
            if (i10 == 1) {
                this.zzq = zzplVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.zzr = zzplVar;
                return;
            }
        }
        this.zzp = zzplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdg(zzmy zzmyVar, int i10, long j10, long j11) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar != null) {
            String strZzb = this.zzc.zzb(zzmyVar.zzb, zzwkVar);
            HashMap map = this.zzi;
            Long l10 = (Long) map.get(strZzb);
            HashMap map2 = this.zzh;
            Long l11 = (Long) map2.get(strZzb);
            map.put(strZzb, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            map2.put(strZzb, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdh(zzmy zzmyVar, zzin zzinVar) {
        this.zzx += zzinVar.zzg;
        this.zzy += zzinVar.zze;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:171:0x0289  */
    /* JADX WARN: Code duplicated, block: B:173:0x028e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0293  */
    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdi(zzbb zzbbVar, zzmz zzmzVar) {
        int i10;
        int i11;
        int errorCode;
        int i12;
        zzq zzqVar;
        int i13;
        int i14;
        if (zzmzVar.zzc() == 0) {
            return;
        }
        for (int i15 = 0; i15 < zzmzVar.zzc(); i15++) {
            int iZzd = zzmzVar.zzd(i15);
            zzmy zzmyVarZza = zzmzVar.zza(iZzd);
            if (iZzd == 0) {
                this.zzc.zzd(zzmyVarZza);
            } else if (iZzd == 11) {
                this.zzc.zze(zzmyVarZza, this.zzl);
            } else {
                this.zzc.zzc(zzmyVarZza);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzmzVar.zzb(0)) {
            zzmy zzmyVarZza2 = zzmzVar.zza(0);
            if (this.zzk != null) {
                zzB(zzmyVarZza2.zzb, zzmyVarZza2.zzd);
            }
        }
        if (zzmzVar.zzb(2) && this.zzk != null) {
            zzguf zzgufVarZza = zzbbVar.zzp().zza();
            int size = zzgufVarZza.size();
            int i16 = 0;
            loop1: while (true) {
                if (i16 >= size) {
                    zzqVar = null;
                    break;
                }
                zzbm zzbmVar = (zzbm) zzgufVarZza.get(i16);
                int i17 = 0;
                while (true) {
                    i14 = i16 + 1;
                    if (i17 < zzbmVar.zza) {
                        if (zzbmVar.zzc(i17) && (zzqVar = zzbmVar.zza(i17).zzs) != null) {
                            break loop1;
                        } else {
                            i17++;
                        }
                    }
                }
                i16 = i14;
            }
            if (zzqVar != null) {
                PlaybackMetrics.Builder builder = this.zzk;
                String str = zzfj.zza;
                int i18 = 0;
                while (true) {
                    if (i18 >= zzqVar.zzb) {
                        i13 = 1;
                        break;
                    }
                    UUID uuid = zzqVar.zza(i18).zza;
                    if (uuid.equals(zzg.zzd)) {
                        i13 = 3;
                        break;
                    } else if (uuid.equals(zzg.zze)) {
                        i13 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzg.zzc)) {
                            i13 = 6;
                            break;
                        }
                        i18++;
                    }
                }
                builder.setDrmType(i13);
            }
        }
        if (zzmzVar.zzb(1011)) {
            this.zzz++;
        }
        zzau zzauVar = this.zzo;
        if (zzauVar != null) {
            Context context = this.zza;
            int i19 = zzauVar.zza;
            int iZzD = 31;
            if (i19 == 1001) {
                iZzD = 20;
            } else {
                zziw zziwVar = (zziw) zzauVar;
                boolean z10 = zziwVar.zzc == 1;
                int i20 = zziwVar.zzg;
                Throwable cause = zzauVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzhs) {
                        errorCode = ((zzhs) cause).zzc;
                        i12 = 5;
                    } else if ((cause instanceof zzhr) || (cause instanceof zzat)) {
                        errorCode = 0;
                        i12 = 11;
                    } else {
                        boolean z11 = cause instanceof zzhq;
                        if (z11 || (cause instanceof zzia)) {
                            if (zzep.zza(context).zzc() == 1) {
                                errorCode = 0;
                                i12 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    errorCode = 0;
                                    i12 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    errorCode = 0;
                                    i12 = 7;
                                } else if (z11 && ((zzhq) cause).zzb == 1) {
                                    errorCode = 0;
                                    i12 = 4;
                                } else {
                                    errorCode = 0;
                                    i12 = 8;
                                }
                            }
                        } else if (i19 == 1002) {
                            iZzD = 21;
                        } else if (cause instanceof zztg) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzfj.zzQ(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzD = zzD(errorCode);
                            } else if (cause3 instanceof MediaDrmResetException) {
                                iZzD = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                iZzD = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                iZzD = 29;
                            } else if (cause3 instanceof zztq) {
                                errorCode = 0;
                                i12 = 23;
                            } else {
                                iZzD = cause3 instanceof zztf ? 28 : 30;
                            }
                            i12 = iZzD;
                        } else if ((cause instanceof zzhn) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                iZzD = 32;
                            }
                        } else {
                            errorCode = 0;
                            i12 = 9;
                        }
                    }
                } else if (z10 && (i20 == 0 || i20 == 1)) {
                    errorCode = 0;
                    i12 = 35;
                } else if (z10 && i20 == 3) {
                    iZzD = 15;
                } else if (z10 && i20 == 2) {
                    errorCode = 0;
                    i12 = 23;
                } else if (cause instanceof zzuq) {
                    errorCode = zzfj.zzQ(((zzuq) cause).zzd);
                    i12 = 13;
                } else {
                    if (cause instanceof zzum) {
                        errorCode = ((zzum) cause).zza;
                    } else if (cause instanceof OutOfMemoryError) {
                        errorCode = 0;
                    } else if (cause instanceof zzrf) {
                        iZzD = 17;
                    } else {
                        if (cause instanceof zzri) {
                            errorCode = ((zzri) cause).zza;
                            iZzD = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzD = zzD(errorCode);
                        } else {
                            iZzD = 22;
                        }
                        i12 = iZzD;
                    }
                    i12 = 14;
                }
                final PlaybackErrorEvent playbackErrorEventBuild = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i12).setSubErrorCode(errorCode).setException(zzauVar).build();
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzr(playbackErrorEventBuild);
                    }
                });
                this.zzA = true;
                this.zzo = null;
            }
            errorCode = 0;
            i12 = iZzD;
            final PlaybackErrorEvent playbackErrorEventBuild2 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i12).setSubErrorCode(errorCode).setException(zzauVar).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(playbackErrorEventBuild2);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zzmzVar.zzb(2)) {
            zzbn zzbnVarZzp = zzbbVar.zzp();
            boolean zZzb = zzbnVarZzp.zzb(2);
            boolean zZzb2 = zzbnVarZzp.zzb(1);
            boolean zZzb3 = zzbnVarZzp.zzb(3);
            if (zZzb || zZzb2) {
                if (!zZzb) {
                    zzx(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            } else if (zZzb3) {
                zZzb3 = true;
                if (!zZzb) {
                    zzx(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            }
        }
        if (zzw(this.zzp)) {
            zzv zzvVar = this.zzp.zza;
            if (zzvVar.zzw != -1) {
                zzx(jElapsedRealtime, zzvVar, 0);
                this.zzp = null;
            }
        }
        if (zzw(this.zzq)) {
            zzy(jElapsedRealtime, this.zzq.zza, 0);
            this.zzq = null;
        }
        if (zzw(this.zzr)) {
            zzz(jElapsedRealtime, this.zzr.zza, 0);
            this.zzr = null;
        }
        switch (zzep.zza(this.zza).zzc()) {
            case 0:
                i10 = 0;
                break;
            case 1:
                i10 = 9;
                break;
            case 2:
                i10 = 2;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 5;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
            case 8:
            default:
                i10 = 1;
                break;
            case 7:
                i10 = 3;
                break;
            case 9:
                i10 = 8;
                break;
            case 10:
                i10 = 7;
                break;
        }
        if (i10 != this.zzn) {
            this.zzn = i10;
            final NetworkEvent networkEventBuild = new NetworkEvent.Builder().setNetworkType(i10).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(networkEventBuild);
                }
            });
        }
        if (zzbbVar.zzh() != 2) {
            this.zzv = false;
        }
        if (((zzmv) zzbbVar).zzI() == null) {
            this.zzw = false;
        } else if (zzmzVar.zzb(10)) {
            this.zzw = true;
        }
        int iZzh = zzbbVar.zzh();
        if (this.zzv) {
            i11 = 5;
        } else if (this.zzw) {
            i11 = 13;
        } else {
            i11 = 4;
            if (iZzh == 4) {
                i11 = 11;
            } else if (iZzh == 2) {
                int i21 = this.zzm;
                if (i21 == 0 || i21 == 2 || i21 == 12) {
                    i11 = 2;
                } else if (zzbbVar.zzk()) {
                    i11 = zzbbVar.zzi() != 0 ? 10 : 6;
                } else {
                    i11 = 7;
                }
            } else if (iZzh != 3) {
                i11 = (iZzh != 1 || this.zzm == 0) ? this.zzm : 12;
            } else if (zzbbVar.zzk()) {
                i11 = zzbbVar.zzi() != 0 ? 9 : 3;
            }
        }
        if (this.zzm != i11) {
            this.zzm = i11;
            this.zzA = true;
            final PlaybackStateEvent playbackStateEventBuild = new PlaybackStateEvent.Builder().setState(this.zzm).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(playbackStateEventBuild);
                }
            });
        }
        if (zzmzVar.zzb(1028)) {
            this.zzc.zzg(zzmzVar.zza(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(zzmy zzmyVar, zzbv zzbvVar) {
        zzpl zzplVar = this.zzp;
        if (zzplVar != null) {
            zzv zzvVar = zzplVar.zza;
            if (zzvVar.zzw == -1) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzt(zzbvVar.zzb);
                zztVarZza.zzu(zzbvVar.zzc);
                this.zzp = new zzpl(zztVarZza.zzM(), 0, zzplVar.zzc);
            }
        }
    }

    public final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    public final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }

    private zzpm(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzpf zzpfVar = new zzpf(zzpf.zza);
        this.zzc = zzpfVar;
        zzpfVar.zza(this);
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzD(int i10) {
        switch (zzfj.zzE(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }
}
