package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class d23 implements bl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f76525c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f76526d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk f76527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zk f76528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zk f76529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zk f76530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f76531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c23 f76532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f76533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f76534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f76535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f76536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f76537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f76538p;

    @Override // yads.bl
    public final zk a(zk zkVar) throws al {
        if (zkVar.f85462c != 2) {
            throw new al(zkVar);
        }
        int i10 = this.f76524b;
        if (i10 == -1) {
            i10 = zkVar.f85460a;
        }
        this.f76527e = zkVar;
        zk zkVar2 = new zk(i10, zkVar.f85461b, 2);
        this.f76528f = zkVar2;
        this.f76531i = true;
        return zkVar2;
    }

    @Override // yads.bl
    public final void b() {
        int i10;
        c23 c23Var = this.f76532j;
        if (c23Var != null) {
            int i11 = c23Var.f76113k;
            float f10 = c23Var.f76105c;
            float f11 = c23Var.f76106d;
            int i12 = c23Var.f76115m + ((int) ((((i11 / (f10 / f11)) + c23Var.f76117o) / (c23Var.f76107e * f11)) + 0.5f));
            c23Var.f76112j = c23Var.b(c23Var.f76112j, i11, (c23Var.f76110h * 2) + i11);
            int i13 = 0;
            while (true) {
                i10 = c23Var.f76110h * 2;
                int i14 = c23Var.f76104b;
                if (i13 >= i10 * i14) {
                    break;
                }
                c23Var.f76112j[(i14 * i11) + i13] = 0;
                i13++;
            }
            c23Var.f76113k = i10 + c23Var.f76113k;
            c23Var.a();
            if (c23Var.f76115m > i12) {
                c23Var.f76115m = i12;
            }
            c23Var.f76113k = 0;
            c23Var.f76120r = 0;
            c23Var.f76117o = 0;
        }
        this.f76538p = true;
    }

    @Override // yads.bl
    public final boolean isActive() {
        return this.f76528f.f85460a != -1 && (Math.abs(this.f76525c - 1.0f) >= 1.0E-4f || Math.abs(this.f76526d - 1.0f) >= 1.0E-4f || this.f76528f.f85460a != this.f76527e.f85460a);
    }

    @Override // yads.bl
    public final boolean isEnded() {
        c23 c23Var;
        return this.f76538p && ((c23Var = this.f76532j) == null || (c23Var.f76115m * c23Var.f76104b) * 2 == 0);
    }

    @Override // yads.bl
    public final void reset() {
        this.f76525c = 1.0f;
        this.f76526d = 1.0f;
        zk zkVar = zk.f85459e;
        this.f76527e = zkVar;
        this.f76528f = zkVar;
        this.f76529g = zkVar;
        this.f76530h = zkVar;
        ByteBuffer byteBuffer = bl.f75859a;
        this.f76533k = byteBuffer;
        this.f76534l = byteBuffer.asShortBuffer();
        this.f76535m = byteBuffer;
        this.f76524b = -1;
        this.f76531i = false;
        this.f76532j = null;
        this.f76536n = 0L;
        this.f76537o = 0L;
        this.f76538p = false;
    }

    public d23() {
        zk zkVar = zk.f85459e;
        this.f76527e = zkVar;
        this.f76528f = zkVar;
        this.f76529g = zkVar;
        this.f76530h = zkVar;
        ByteBuffer byteBuffer = bl.f75859a;
        this.f76533k = byteBuffer;
        this.f76534l = byteBuffer.asShortBuffer();
        this.f76535m = byteBuffer;
        this.f76524b = -1;
    }

    @Override // yads.bl
    public final void flush() {
        if (isActive()) {
            zk zkVar = this.f76527e;
            this.f76529g = zkVar;
            zk zkVar2 = this.f76528f;
            this.f76530h = zkVar2;
            if (this.f76531i) {
                this.f76532j = new c23(zkVar.f85460a, zkVar.f85461b, this.f76525c, this.f76526d, zkVar2.f85460a);
            } else {
                c23 c23Var = this.f76532j;
                if (c23Var != null) {
                    c23Var.f76113k = 0;
                    c23Var.f76115m = 0;
                    c23Var.f76117o = 0;
                    c23Var.f76118p = 0;
                    c23Var.f76119q = 0;
                    c23Var.f76120r = 0;
                    c23Var.f76121s = 0;
                    c23Var.f76122t = 0;
                    c23Var.f76123u = 0;
                    c23Var.f76124v = 0;
                }
            }
        }
        this.f76535m = bl.f75859a;
        this.f76536n = 0L;
        this.f76537o = 0L;
        this.f76538p = false;
    }

    @Override // yads.bl
    public final ByteBuffer a() {
        int i10;
        c23 c23Var = this.f76532j;
        if (c23Var != null && (i10 = c23Var.f76115m * c23Var.f76104b * 2) > 0) {
            if (this.f76533k.capacity() < i10) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                this.f76533k = byteBufferOrder;
                this.f76534l = byteBufferOrder.asShortBuffer();
            } else {
                this.f76533k.clear();
                this.f76534l.clear();
            }
            ShortBuffer shortBuffer = this.f76534l;
            int iMin = Math.min(shortBuffer.remaining() / c23Var.f76104b, c23Var.f76115m);
            shortBuffer.put(c23Var.f76114l, 0, c23Var.f76104b * iMin);
            int i11 = c23Var.f76115m - iMin;
            c23Var.f76115m = i11;
            short[] sArr = c23Var.f76114l;
            int i12 = c23Var.f76104b;
            System.arraycopy(sArr, iMin * i12, sArr, 0, i11 * i12);
            this.f76537o += (long) i10;
            this.f76533k.limit(i10);
            this.f76535m = this.f76533k;
        }
        ByteBuffer byteBuffer = this.f76535m;
        this.f76535m = bl.f75859a;
        return byteBuffer;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            c23 c23Var = this.f76532j;
            c23Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f76536n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = c23Var.f76104b;
            int i11 = iRemaining2 / i10;
            short[] sArrB = c23Var.b(c23Var.f76112j, c23Var.f76113k, i11);
            c23Var.f76112j = sArrB;
            shortBufferAsShortBuffer.get(sArrB, c23Var.f76113k * c23Var.f76104b, ((i10 * i11) * 2) / 2);
            c23Var.f76113k += i11;
            c23Var.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }
}
