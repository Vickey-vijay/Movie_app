package q3;

import java.lang.reflect.Constructor;
import z3.g0;
import z3.y;

/* JADX INFO: compiled from: DefaultExtractorsFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Constructor<? extends g> f66445j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f66446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f66453h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f66454i;

    static {
        Constructor<? extends g> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(g.class).getConstructor(new Class[0]);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f66445j = constructor;
    }

    public synchronized e a(int i10) {
        this.f66450e = i10;
        return this;
    }

    @Override // q3.k
    public synchronized g[] createExtractors() {
        g[] gVarArr;
        gVarArr = new g[14];
        gVarArr[0] = new u3.e(this.f66449d);
        int i10 = 1;
        gVarArr[1] = new w3.f(this.f66451f);
        gVarArr[2] = new w3.i(this.f66450e);
        gVarArr[3] = new v3.e(this.f66452g | (this.f66446a ? 1 : 0));
        gVarArr[4] = new z3.h(this.f66447b | (this.f66446a ? 1 : 0));
        gVarArr[5] = new z3.b();
        gVarArr[6] = new g0(this.f66453h, this.f66454i);
        gVarArr[7] = new t3.b();
        gVarArr[8] = new x3.d();
        gVarArr[9] = new y();
        gVarArr[10] = new a4.b();
        int i11 = this.f66448c;
        if (!this.f66446a) {
            i10 = 0;
        }
        gVarArr[11] = new r3.b(i10 | i11);
        gVarArr[12] = new z3.e();
        Constructor<? extends g> constructor = f66445j;
        if (constructor != null) {
            try {
                gVarArr[13] = constructor.newInstance(new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
            }
        } else {
            gVarArr[13] = new s3.d();
        }
        return gVarArr;
    }
}
