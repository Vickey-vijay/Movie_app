package k3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import java.util.ArrayList;

/* JADX INFO: compiled from: DefaultRenderersFactory.java */
/* JADX INFO: loaded from: classes8.dex */
public class j implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f62170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.a<p3.j> f62171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f62173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f62175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.exoplayer2.mediacodec.b f62176g;

    public j(Context context) {
        this.f62170a = context;
        this.f62172c = 0;
        this.f62173d = 5000L;
        this.f62176g = com.google.android.exoplayer2.mediacodec.b.f19259a;
    }

    @Override // k3.s0
    public p0[] a(Handler handler, h5.q qVar, com.google.android.exoplayer2.audio.a aVar, t4.j jVar, c4.d dVar, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar2) {
        com.google.android.exoplayer2.drm.a<p3.j> aVar3 = aVar2 == null ? this.f62171b : aVar2;
        ArrayList<p0> arrayList = new ArrayList<>();
        com.google.android.exoplayer2.drm.a<p3.j> aVar4 = aVar3;
        h(this.f62170a, this.f62172c, this.f62176g, aVar4, this.f62174e, this.f62175f, handler, qVar, this.f62173d, arrayList);
        c(this.f62170a, this.f62172c, this.f62176g, aVar4, this.f62174e, this.f62175f, b(), handler, aVar, arrayList);
        g(this.f62170a, jVar, handler.getLooper(), this.f62172c, arrayList);
        e(this.f62170a, dVar, handler.getLooper(), this.f62172c, arrayList);
        d(this.f62170a, this.f62172c, arrayList);
        f(this.f62170a, handler, this.f62172c, arrayList);
        return (p0[]) arrayList.toArray(new p0[0]);
    }

    public AudioProcessor[] b() {
        return new AudioProcessor[0];
    }

    public void f(Context context, Handler handler, int i10, ArrayList<p0> arrayList) {
    }

    public void c(Context context, int i10, com.google.android.exoplayer2.mediacodec.b bVar, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, boolean z10, boolean z11, AudioProcessor[] audioProcessorArr, Handler handler, com.google.android.exoplayer2.audio.a aVar2, ArrayList<p0> arrayList) {
        int i11;
        int i12;
        arrayList.add(new com.google.android.exoplayer2.audio.f(context, bVar, aVar, z10, z11, handler, aVar2, new DefaultAudioSink(m3.d.b(context), audioProcessorArr)));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (p0) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.a.class, AudioProcessor[].class).newInstance(handler, aVar2, audioProcessorArr));
                    g5.m.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (p0) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.a.class, AudioProcessor[].class).newInstance(handler, aVar2, audioProcessorArr));
                        g5.m.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FLAC extension", e10);
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i12, (p0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.a.class, AudioProcessor[].class).newInstance(handler, aVar2, audioProcessorArr));
                g5.m.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating Opus extension", e12);
        }
    }

    public void d(Context context, int i10, ArrayList<p0> arrayList) {
        arrayList.add(new i5.b());
    }

    public void e(Context context, c4.d dVar, Looper looper, int i10, ArrayList<p0> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.metadata.a(dVar, looper));
    }

    public void g(Context context, t4.j jVar, Looper looper, int i10, ArrayList<p0> arrayList) {
        arrayList.add(new t4.k(jVar, looper));
    }

    public void h(Context context, int i10, com.google.android.exoplayer2.mediacodec.b bVar, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, boolean z10, boolean z11, Handler handler, h5.q qVar, long j10, ArrayList<p0> arrayList) {
        int i11;
        arrayList.add(new h5.d(context, bVar, j10, aVar, z10, z11, handler, qVar, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (p0) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, h5.q.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, qVar, 50));
                    g5.m.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating VP9 extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            arrayList.add(i11, (p0) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, h5.q.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, qVar, 50));
            g5.m.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating AV1 extension", e11);
        }
    }

    public j i(long j10) {
        this.f62173d = j10;
        return this;
    }

    public j j(int i10) {
        this.f62172c = i10;
        return this;
    }

    @Deprecated
    public j(Context context, int i10) {
        this(context, i10, 5000L);
    }

    @Deprecated
    public j(Context context, int i10, long j10) {
        this(context, null, i10, j10);
    }

    @Deprecated
    public j(Context context, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, int i10, long j10) {
        this.f62170a = context;
        this.f62172c = i10;
        this.f62173d = j10;
        this.f62171b = aVar;
        this.f62176g = com.google.android.exoplayer2.mediacodec.b.f19259a;
    }
}
