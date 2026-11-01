package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzacz {
    private final Context zzb;

    @Nullable
    private zzacv zzc;
    private boolean zzd;

    @Nullable
    private Surface zze;
    private float zzg;
    private float zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private final zzabv zza = new zzabv();
    private float zzf = -1.0f;
    private float zzi = 1.0f;
    private int zzj = 0;

    public zzacz(Context context) {
        this.zzb = context;
    }

    private final void zzj() {
        this.zzm = 0L;
        this.zzq = -1L;
        this.zzn = -1L;
        this.zzk = 0L;
        this.zzl = 0L;
    }

    public final void zzb() {
        this.zzd = true;
        zzj();
        DisplayManager displayManager = (DisplayManager) this.zzb.getSystemService("display");
        zzacv zzacyVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzacyVar = Build.VERSION.SDK_INT >= 33 ? new zzacy(choreographer, displayManager, null) : new zzacw(choreographer, displayManager, null);
            } catch (RuntimeException e10) {
                zzee.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        this.zzc = zzacyVar;
        if (zzacyVar != null) {
            zzacyVar.zza();
        }
        zzl(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            zzacvVar.zzb();
        }
        zzm();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    private final void zzk() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzabv zzabvVar = this.zza;
        float fZzg = zzabvVar.zzc() ? zzabvVar.zzg() : this.zzf;
        float f10 = this.zzg;
        if (fZzg != f10) {
            boolean z10 = true;
            if (fZzg != -1.0f && f10 != -1.0f) {
                float f11 = 1.0f;
                if (zzabvVar.zzc() && zzabvVar.zze() >= 5000000000L) {
                    f11 = 0.1f;
                }
                if (Math.abs(fZzg - this.zzg) < f11) {
                    z10 = false;
                }
                if (!z10) {
                    return;
                }
            } else if (fZzg == -1.0f) {
                if (zzabvVar.zzd() < 30) {
                    z10 = false;
                }
                if (!z10) {
                    return;
                }
            }
            this.zzg = fZzg;
            zzl(false);
        }
    }

    private final void zzl(boolean z10) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f10 = 0.0f;
        if (this.zzd) {
            float f11 = this.zzg;
            if (f11 != -1.0f) {
                f10 = this.zzi * f11;
            }
        }
        if (z10 || this.zzh != f10) {
            this.zzh = f10;
            zzacu.zza(this.zze, f10);
        }
    }

    private final void zzm() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzh = 0.0f;
        zzacu.zza(this.zze, 0.0f);
    }

    public final void zza(int i10) {
        if (this.zzj == i10) {
            return;
        }
        this.zzj = i10;
        zzl(true);
    }

    public final void zzc(@Nullable Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzm();
        this.zze = surface;
        zzl(true);
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzl(false);
    }

    public final void zzf(float f10) {
        this.zzf = f10;
        this.zza.zza();
        zzk();
    }

    public final void zzg(long j10) {
        long j11 = this.zzn;
        if (j11 != -1) {
            this.zzq = j11;
            this.zzr = this.zzo;
            this.zzs = this.zzp;
            this.zzk = this.zzl;
        }
        this.zzm++;
        this.zza.zzb(j10 * 1000);
        zzk();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    public final long zzi(long j10, long j11) {
        long j12;
        long j13;
        long j14;
        float f10;
        long jZzf;
        if (this.zzq != -1) {
            zzabv zzabvVar = this.zza;
            if (zzabvVar.zzc()) {
                jZzf = zzabvVar.zzf() * (this.zzm - this.zzq);
                f10 = this.zzi;
            } else {
                long j15 = j11 - this.zzs;
                f10 = this.zzi;
                jZzf = j15 * 1000;
            }
            j12 = this.zzr + ((long) (jZzf / f10));
            if (Math.abs(j10 - j12) > 20000000) {
                zzj();
                j12 = j10;
            }
        } else {
            j12 = j10;
        }
        this.zzn = this.zzm;
        this.zzo = j12;
        this.zzp = j11;
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            long j16 = zzacvVar.zzc;
            long j17 = this.zzc.zzd;
            if (j16 != -9223372036854775807L && j17 != -9223372036854775807L) {
                long j18 = j16 + (((j12 - j16) / j17) * j17);
                if (j12 <= j18) {
                    j13 = j18 - j17;
                } else {
                    j18 += j17;
                    j13 = j18;
                }
                long j19 = j17 / 2;
                long j20 = j18 - j12;
                long j21 = j12 - j13;
                long jAbs = Math.abs(j20 - j21);
                long j22 = j18;
                long j23 = 0;
                if (jAbs < j19) {
                    long j24 = j17 / 4;
                    if (jAbs < j24) {
                        long j25 = this.zzk;
                        if (j25 != 0) {
                            this.zzl = j25;
                            j23 = j25;
                        } else {
                            j23 = j20 < j21 ? -j24 : j24;
                        }
                    }
                    if (j20 + j23 < j21) {
                        j14 = j22;
                    } else {
                        j14 = j13;
                    }
                    return j14 - ((j17 * 80) / 100);
                }
                j23 = this.zzk;
                this.zzl = j23;
                if (j20 + j23 < j21) {
                    j14 = j22;
                } else {
                    j14 = j13;
                }
                return j14 - ((j17 * 80) / 100);
            }
        }
        return j12;
    }

    public final void zzd() {
        zzj();
    }
}
