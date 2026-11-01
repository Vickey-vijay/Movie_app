package yads;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class pe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f81381a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81384d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0 f81382b = new ee0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81383c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ok1 f81385e = ok1.f81065a;

    public final ro[] a(Handler handler, wn0 wn0Var, wn0 wn0Var2, wn0 wn0Var3, wn0 wn0Var4) {
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        Context context = this.f81381a;
        int i14 = this.f81383c;
        arrayList.add(new bl1(context, this.f81382b, this.f81385e, this.f81384d, handler, wn0Var));
        if (i14 != 0) {
            int size = arrayList.size();
            if (i14 == 2) {
                size--;
            }
            try {
                try {
                    i13 = size + 1;
                    try {
                        arrayList.add(size, (ro) Class.forName("com.monetization.ads.exo.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, dj3.class, Integer.TYPE).newInstance(5000L, handler, wn0Var, 50));
                        ih1.c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i13;
                        i13 = size;
                    }
                } catch (ClassNotFoundException unused2) {
                }
                try {
                    arrayList.add(i13, (ro) Class.forName("com.monetization.ads.exo.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, dj3.class, Integer.TYPE).newInstance(5000L, handler, wn0Var, 50));
                    ih1.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating AV1 extension", e10);
                }
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating VP9 extension", e11);
            }
        }
        Context context2 = this.f81381a;
        qb0 qb0Var = new qb0();
        uk ukVarA = uk.a(context2);
        ukVarA.getClass();
        qb0Var.f81786a = ukVarA;
        qb0Var.f81788c = false;
        qb0Var.f81789d = false;
        qb0Var.f81790e = 0;
        if (qb0Var.f81787b == null) {
            qb0Var.f81787b = new sb0(new bl[0], new ty2(0), new d23());
        }
        zb0 zb0Var = new zb0(qb0Var);
        Context context3 = this.f81381a;
        int i15 = this.f81383c;
        arrayList.add(new fk1(context3, this.f81382b, this.f81385e, this.f81384d, handler, wn0Var2, zb0Var));
        if (i15 != 0) {
            int size2 = arrayList.size();
            if (i15 == 2) {
                size2--;
            }
            try {
                try {
                    i10 = size2 + 1;
                    try {
                        arrayList.add(size2, (ro) Class.forName("com.monetization.ads.exo.decoder.midi.MidiRenderer").getConstructor(new Class[0]).newInstance(new Object[0]));
                        ih1.c("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused4) {
                        size2 = i10;
                        i10 = size2;
                    }
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    try {
                        i11 = i10 + 1;
                        try {
                            arrayList.add(i10, (ro) Class.forName("com.monetization.ads.exo.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, dl.class, jl.class).newInstance(handler, wn0Var2, zb0Var));
                            ih1.c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused6) {
                            i10 = i11;
                            i11 = i10;
                        }
                    } catch (ClassNotFoundException unused7) {
                    }
                    try {
                        try {
                            i12 = i11 + 1;
                            try {
                                arrayList.add(i11, (ro) Class.forName("com.monetization.ads.exo.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, dl.class, jl.class).newInstance(handler, wn0Var2, zb0Var));
                                ih1.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused8) {
                                i11 = i12;
                                i12 = i11;
                            }
                        } catch (ClassNotFoundException unused9) {
                        }
                        try {
                            arrayList.add(i12, (ro) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, dl.class, jl.class).newInstance(handler, wn0Var2, zb0Var));
                            ih1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused10) {
                        } catch (Exception e12) {
                            throw new RuntimeException("Error instantiating FFmpeg extension", e12);
                        }
                    } catch (Exception e13) {
                        throw new RuntimeException("Error instantiating FLAC extension", e13);
                    }
                } catch (Exception e14) {
                    throw new RuntimeException("Error instantiating Opus extension", e14);
                }
            } catch (Exception e15) {
                throw new RuntimeException("Error instantiating MIDI extension", e15);
            }
        }
        arrayList.add(new a63(wn0Var3, handler.getLooper()));
        arrayList.add(new ys1(wn0Var4, handler.getLooper()));
        arrayList.add(new bt());
        return (ro[]) arrayList.toArray(new ro[0]);
    }

    public pe0(Context context) {
        this.f81381a = context;
    }
}
