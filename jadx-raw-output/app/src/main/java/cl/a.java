package cl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import dl.b1;
import dl.j0;
import dl.l0;
import dl.w0;
import dl.z0;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a implements xk.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0024a f6073d = new C0024a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f6074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final el.c f6075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.json.internal.a f6076c;

    /* JADX INFO: renamed from: cl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Json.kt */
    public static final class C0024a extends a {
        public C0024a() {
            super(new f(false, false, false, false, false, false, null, false, false, null, false, false, null, 8191, null), el.d.a(), null);
        }

        public /* synthetic */ C0024a(ck.i iVar) {
            this();
        }
    }

    public a(f fVar, el.c cVar) {
        this.f6074a = fVar;
        this.f6075b = cVar;
        this.f6076c = new kotlinx.serialization.json.internal.a();
    }

    public /* synthetic */ a(f fVar, el.c cVar, ck.i iVar) {
        this(fVar, cVar);
    }

    @Override // xk.e
    public el.c a() {
        return this.f6075b;
    }

    @Override // xk.i
    public final <T> T b(xk.a<? extends T> aVar, String str) {
        ck.p.j(aVar, "deserializer");
        ck.p.j(str, TypedValues.Custom.S_STRING);
        z0 z0Var = new z0(str);
        T t10 = (T) new w0(this, WriteMode.OBJ, z0Var, aVar.getDescriptor(), null).r(aVar);
        z0Var.w();
        return t10;
    }

    @Override // xk.i
    public final <T> String c(xk.g<? super T> gVar, T t10) {
        ck.p.j(gVar, "serializer");
        l0 l0Var = new l0();
        try {
            j0.b(this, l0Var, gVar, t10);
            return l0Var.toString();
        } finally {
            l0Var.g();
        }
    }

    public final <T> T d(xk.a<? extends T> aVar, kotlinx.serialization.json.b bVar) {
        ck.p.j(aVar, "deserializer");
        ck.p.j(bVar, "element");
        return (T) b1.a(this, bVar, aVar);
    }

    public final f e() {
        return this.f6074a;
    }

    public final kotlinx.serialization.json.internal.a f() {
        return this.f6076c;
    }
}
