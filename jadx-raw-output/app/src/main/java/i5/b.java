package i5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import g5.k0;
import g5.t;
import java.nio.ByteBuffer;
import k3.e;
import k3.q0;

/* JADX INFO: compiled from: CameraMotionRenderer.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o3.e f54059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f54060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f54061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public a f54062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f54063q;

    public b() {
        super(5);
        this.f54059m = new o3.e(1);
        this.f54060n = new t();
    }

    @Override // k3.e, k3.o0.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
        if (i10 == 7) {
            this.f54062p = (a) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // k3.p0
    public boolean isReady() {
        return true;
    }

    @Override // k3.q0
    public int a(Format format) {
        return "application/x-camera-motion".equals(format.f18970j) ? q0.create(4) : q0.create(0);
    }

    @Override // k3.e
    public void t(Format[] formatArr, long j10) throws ExoPlaybackException {
        this.f54061o = j10;
    }

    public final void y() {
        this.f54063q = 0L;
        a aVar = this.f54062p;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }

    @Override // k3.p0
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // k3.e
    public void n() {
        y();
    }

    @Override // k3.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        y();
    }

    @Override // k3.p0
    public void render(long j10, long j11) throws ExoPlaybackException {
        float[] fArrX;
        while (!hasReadStreamToEnd() && this.f54063q < 100000 + j10) {
            this.f54059m.clear();
            if (u(i(), this.f54059m, false) == -4 && !this.f54059m.isEndOfStream()) {
                this.f54059m.c();
                o3.e eVar = this.f54059m;
                this.f54063q = eVar.f64971e;
                if (this.f54062p != null && (fArrX = x((ByteBuffer) k0.i(eVar.f64969c))) != null) {
                    ((a) k0.i(this.f54062p)).onCameraMotion(this.f54063q - this.f54061o, fArrX);
                }
            } else {
                return;
            }
        }
    }

    @Nullable
    public final float[] x(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f54060n.J(byteBuffer.array(), byteBuffer.limit());
        this.f54060n.L(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f54060n.m());
        }
        return fArr;
    }
}
