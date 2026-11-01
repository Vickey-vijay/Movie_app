package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: yads.do, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Cdo implements bl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zk f76740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zk f76741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zk f76742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk f76743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f76744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f76745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f76746h;

    @Override // yads.bl
    public final zk a(zk zkVar) {
        this.f76742d = zkVar;
        this.f76743e = b(zkVar);
        return isActive() ? this.f76743e : zk.f85459e;
    }

    public abstract zk b(zk zkVar);

    @Override // yads.bl
    public final void b() {
        this.f76746h = true;
        d();
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    @Override // yads.bl
    public final void flush() {
        this.f76745g = bl.f75859a;
        this.f76746h = false;
        this.f76740b = this.f76742d;
        this.f76741c = this.f76743e;
        c();
    }

    @Override // yads.bl
    public boolean isActive() {
        return this.f76743e != zk.f85459e;
    }

    @Override // yads.bl
    public boolean isEnded() {
        return this.f76746h && this.f76745g == bl.f75859a;
    }

    public Cdo() {
        ByteBuffer byteBuffer = bl.f75859a;
        this.f76744f = byteBuffer;
        this.f76745g = byteBuffer;
        zk zkVar = zk.f85459e;
        this.f76742d = zkVar;
        this.f76743e = zkVar;
        this.f76740b = zkVar;
        this.f76741c = zkVar;
    }

    @Override // yads.bl
    public final void reset() {
        flush();
        this.f76744f = bl.f75859a;
        zk zkVar = zk.f85459e;
        this.f76742d = zkVar;
        this.f76743e = zkVar;
        this.f76740b = zkVar;
        this.f76741c = zkVar;
        e();
    }

    @Override // yads.bl
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f76745g;
        this.f76745g = bl.f75859a;
        return byteBuffer;
    }

    public final ByteBuffer a(int i10) {
        if (this.f76744f.capacity() < i10) {
            this.f76744f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f76744f.clear();
        }
        ByteBuffer byteBuffer = this.f76744f;
        this.f76745g = byteBuffer;
        return byteBuffer;
    }
}
