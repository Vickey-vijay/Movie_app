package yads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public final class ol {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl f81070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f81071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f81072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f81074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ml f81075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f81076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f81077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f81078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f81079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f81081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f81082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f81083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f81084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f81085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f81086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f81087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f81088s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f81089t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f81090u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f81091v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f81092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f81093x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f81094y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f81095z;

    public final long a(long j10) {
        return (j10 * 1000000) / ((long) this.f81076g);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x021f  */
    public final long a(boolean z10) {
        boolean z11;
        long jA;
        Method method;
        AudioTrack audioTrack = this.f81072c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jA2 = a(a());
            if (jA2 == 0) {
                z11 = false;
            } else {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f81082m >= 30000) {
                    long[] jArr = this.f81071b;
                    int i10 = this.f81091v;
                    jArr[i10] = jA2 - jNanoTime;
                    this.f81091v = (i10 + 1) % 10;
                    int i11 = this.f81092w;
                    if (i11 < 10) {
                        this.f81092w = i11 + 1;
                    }
                    this.f81082m = jNanoTime;
                    this.f81081l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f81092w;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f81081l = (this.f81071b[i12] / ((long) i13)) + this.f81081l;
                        i12++;
                    }
                }
                if (this.f81077h) {
                    z11 = false;
                } else {
                    ml mlVar = this.f81075f;
                    mlVar.getClass();
                    ll llVar = mlVar.f80243a;
                    if (llVar != null && jNanoTime - mlVar.f80247e >= mlVar.f80246d) {
                        mlVar.f80247e = jNanoTime;
                        boolean zB = llVar.b();
                        int i14 = mlVar.f80244b;
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    if (i14 != 3) {
                                        if (i14 != 4) {
                                            throw new IllegalStateException();
                                        }
                                    } else if (zB) {
                                        mlVar.a();
                                    }
                                } else if (!zB) {
                                    mlVar.a();
                                }
                            } else if (!zB) {
                                mlVar.a();
                            } else if (mlVar.f80243a.f79838e > mlVar.f80248f) {
                                mlVar.a(2);
                            }
                        } else if (zB) {
                            if (mlVar.f80243a.a() >= mlVar.f80245c) {
                                mlVar.f80248f = mlVar.f80243a.f79838e;
                                mlVar.a(1);
                            }
                        } else if (jNanoTime - mlVar.f80245c > 500000) {
                            mlVar.a(3);
                        }
                        if (zB) {
                            ll llVar2 = mlVar.f80243a;
                            long jA3 = llVar2 != null ? llVar2.a() : -9223372036854775807L;
                            ll llVar3 = mlVar.f80243a;
                            long j10 = llVar3 != null ? llVar3.f79838e : -1L;
                            if (Math.abs(jA3 - jNanoTime) > 5000000) {
                                wb0 wb0Var = (wb0) this.f81070a;
                                wb0Var.getClass();
                                StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                                sb2.append(j10);
                                sb2.append(", ");
                                sb2.append(jA3);
                                sb2.append(", ");
                                sb2.append(jNanoTime);
                                sb2.append(", ");
                                sb2.append(jA2);
                                sb2.append(", ");
                                zb0 zb0Var = wb0Var.f84148a;
                                rb0 rb0Var = zb0Var.f85292t;
                                sb2.append(rb0Var.f82167c == 0 ? zb0Var.B / ((long) rb0Var.f82166b) : zb0Var.C);
                                sb2.append(", ");
                                sb2.append(wb0Var.f84148a.d());
                                ih1.d("DefaultAudioSink", sb2.toString());
                                mlVar.a(4);
                            } else if (Math.abs(a(j10) - jA2) > 5000000) {
                                wb0 wb0Var2 = (wb0) this.f81070a;
                                wb0Var2.getClass();
                                StringBuilder sb3 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                sb3.append(j10);
                                sb3.append(", ");
                                sb3.append(jA3);
                                sb3.append(", ");
                                sb3.append(jNanoTime);
                                sb3.append(", ");
                                sb3.append(jA2);
                                sb3.append(", ");
                                zb0 zb0Var2 = wb0Var2.f84148a;
                                rb0 rb0Var2 = zb0Var2.f85292t;
                                sb3.append(rb0Var2.f82167c == 0 ? zb0Var2.B / ((long) rb0Var2.f82166b) : zb0Var2.C);
                                sb3.append(", ");
                                sb3.append(wb0Var2.f84148a.d());
                                ih1.d("DefaultAudioSink", sb3.toString());
                                mlVar.a(4);
                            } else if (mlVar.f80244b == 4) {
                                mlVar.a();
                            }
                        }
                    }
                    if (!this.f81086q || (method = this.f81083n) == null || jNanoTime - this.f81087r < 500000) {
                        z11 = false;
                    } else {
                        try {
                            AudioTrack audioTrack2 = this.f81072c;
                            audioTrack2.getClass();
                            z11 = false;
                            try {
                                Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                                int i15 = ib3.f78556a;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.f81078i;
                                this.f81084o = jIntValue;
                                long jMax = Math.max(jIntValue, 0L);
                                this.f81084o = jMax;
                                if (jMax > 5000000) {
                                    ((wb0) this.f81070a).getClass();
                                    ih1.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                    this.f81084o = 0L;
                                }
                            } catch (Exception unused) {
                                this.f81083n = null;
                            }
                        } catch (Exception unused2) {
                            z11 = false;
                        }
                        this.f81087r = jNanoTime;
                    }
                }
            }
        } else {
            z11 = false;
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        ml mlVar2 = this.f81075f;
        mlVar2.getClass();
        if (mlVar2.f80244b == 2) {
            z11 = true;
        }
        if (z11) {
            ll llVar4 = mlVar2.f80243a;
            long jA4 = a(llVar4 != null ? llVar4.f79838e : -1L);
            ll llVar5 = mlVar2.f80243a;
            long jA5 = jNanoTime2 - (llVar5 != null ? llVar5.a() : -9223372036854775807L);
            float f10 = this.f81079j;
            int i16 = ib3.f78556a;
            if (f10 != 1.0f) {
                jA5 = Math.round(jA5 * ((double) f10));
            }
            jA = jA5 + jA4;
        } else {
            jA = this.f81092w == 0 ? a(a()) : this.f81081l + jNanoTime2;
            if (!z10) {
                jA = Math.max(0L, jA - this.f81084o);
            }
        }
        if (this.D != z11) {
            this.F = this.C;
            this.E = this.B;
        }
        long j11 = jNanoTime2 - this.F;
        if (j11 < 1000000) {
            long j12 = this.E;
            float f11 = this.f81079j;
            int i17 = ib3.f78556a;
            long jRound = f11 == 1.0f ? j11 : Math.round(j11 * ((double) f11));
            long j13 = (j11 * 1000) / 1000000;
            jA = (((1000 - j13) * (jRound + j12)) + (jA * j13)) / 1000;
        }
        if (!this.f81080k) {
            long j14 = this.B;
            if (jA > j14) {
                this.f81080k = true;
                long jB = ib3.b(jA - j14);
                float f12 = this.f81079j;
                if (f12 != 1.0f) {
                    jB = Math.round(jB / ((double) f12));
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - ib3.b(jB);
                gl glVar = ((wb0) this.f81070a).f84148a.f85290r;
                if (glVar != null) {
                    ((ek1) glVar).f77103a.H0.b(jCurrentTimeMillis);
                }
            }
        }
        this.C = jNanoTime2;
        this.B = jA;
        this.D = z11;
        return jA;
    }

    public ol(wb0 wb0Var) {
        this.f81070a = (nl) ni.a(wb0Var);
        if (ib3.f78556a >= 18) {
            try {
                this.f81083n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f81071b = new long[10];
    }

    public final boolean b(long j10) {
        if (j10 <= a()) {
            if (this.f81077h) {
                AudioTrack audioTrack = this.f81072c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || a() != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final long a() {
        AudioTrack audioTrack = this.f81072c;
        audioTrack.getClass();
        if (this.f81093x != -9223372036854775807L) {
            return Math.min(this.A, this.f81095z + ((((SystemClock.elapsedRealtime() * 1000) - this.f81093x) * ((long) this.f81076g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f81077h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f81090u = this.f81088s;
            }
            playbackHeadPosition += this.f81090u;
        }
        if (ib3.f78556a <= 29) {
            if (playbackHeadPosition == 0 && this.f81088s > 0 && playState == 3) {
                if (this.f81094y == -9223372036854775807L) {
                    this.f81094y = SystemClock.elapsedRealtime();
                }
                return this.f81088s;
            }
            this.f81094y = -9223372036854775807L;
        }
        if (this.f81088s > playbackHeadPosition) {
            this.f81089t++;
        }
        this.f81088s = playbackHeadPosition;
        return playbackHeadPosition + (this.f81089t << 32);
    }

    public final void a(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f81072c = audioTrack;
        this.f81073d = i11;
        this.f81074e = i12;
        this.f81075f = new ml(audioTrack);
        this.f81076g = audioTrack.getSampleRate();
        this.f81077h = z10 && ib3.f78556a < 23 && (i10 == 5 || i10 == 6);
        boolean zE = ib3.e(i10);
        this.f81086q = zE;
        this.f81078i = zE ? a(i12 / i11) : -9223372036854775807L;
        this.f81088s = 0L;
        this.f81089t = 0L;
        this.f81090u = 0L;
        this.f81085p = false;
        this.f81093x = -9223372036854775807L;
        this.f81094y = -9223372036854775807L;
        this.f81087r = 0L;
        this.f81084o = 0L;
        this.f81079j = 1.0f;
    }
}
