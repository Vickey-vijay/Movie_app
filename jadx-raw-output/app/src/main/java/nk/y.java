package nk;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class y<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R f64838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.b f64839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk.q<Throwable, R, kotlin.coroutines.d, mj.r> f64840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f64841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f64842e;

    /* JADX WARN: Multi-variable type inference failed */
    public y(R r10, kotlinx.coroutines.b bVar, bk.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, mj.r> qVar, Object obj, Throwable th2) {
        this.f64838a = r10;
        this.f64839b = bVar;
        this.f64840c = qVar;
        this.f64841d = obj;
        this.f64842e = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y b(y yVar, Object obj, kotlinx.coroutines.b bVar, bk.q qVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = yVar.f64838a;
        }
        if ((i10 & 2) != 0) {
            bVar = yVar.f64839b;
        }
        kotlinx.coroutines.b bVar2 = bVar;
        if ((i10 & 4) != 0) {
            qVar = yVar.f64840c;
        }
        bk.q qVar2 = qVar;
        if ((i10 & 8) != 0) {
            obj2 = yVar.f64841d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = yVar.f64842e;
        }
        return yVar.a(obj, bVar2, qVar2, obj4, th2);
    }

    public final y<R> a(R r10, kotlinx.coroutines.b bVar, bk.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, mj.r> qVar, Object obj, Throwable th2) {
        return new y<>(r10, bVar, qVar, obj, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return ck.p.e(this.f64838a, yVar.f64838a) && ck.p.e(this.f64839b, yVar.f64839b) && ck.p.e(this.f64840c, yVar.f64840c) && ck.p.e(this.f64841d, yVar.f64841d) && ck.p.e(this.f64842e, yVar.f64842e);
    }

    public int hashCode() {
        R r10 = this.f64838a;
        int iHashCode = (r10 == null ? 0 : r10.hashCode()) * 31;
        kotlinx.coroutines.b bVar = this.f64839b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        bk.q<Throwable, R, kotlin.coroutines.d, mj.r> qVar = this.f64840c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.f64841d;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.f64842e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f64838a + ", cancelHandler=" + this.f64839b + ", onCancellation=" + this.f64840c + ", idempotentResume=" + this.f64841d + ", cancelCause=" + this.f64842e + ')';
    }

    public final boolean c() {
        return this.f64842e != null;
    }

    public final void d(kotlinx.coroutines.c<?> cVar, Throwable th2) {
        kotlinx.coroutines.b bVar = this.f64839b;
        if (bVar != null) {
            cVar.m(bVar, th2);
        }
        bk.q<Throwable, R, kotlin.coroutines.d, mj.r> qVar = this.f64840c;
        if (qVar != null) {
            cVar.n(qVar, th2, this.f64838a);
        }
    }

    public /* synthetic */ y(Object obj, kotlinx.coroutines.b bVar, bk.q qVar, Object obj2, Throwable th2, int i10, ck.i iVar) {
        this(obj, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
