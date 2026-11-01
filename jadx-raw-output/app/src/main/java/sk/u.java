package sk;

import kotlin.KotlinNothingValueException;
import nk.r0;
import nk.y0;
import nk.y1;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class u extends y1 implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f71989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71990c;

    @Override // nk.y1
    public y1 n() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    public final Void r() {
        String str;
        if (this.f71989b == null) {
            t.d();
            throw new KotlinNothingValueException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Module with the Main dispatcher had failed to initialize");
        String str2 = this.f71990c;
        if (str2 != null) {
            str = ". " + str2;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString(), this.f71989b);
    }

    @Override // nk.y1, nk.h0
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f71989b != null) {
            str = ", cause=" + this.f71989b;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }

    public u(Throwable th2, String str) {
        this.f71989b = th2;
        this.f71990c = str;
    }

    @Override // nk.h0
    public boolean isDispatchNeeded(kotlin.coroutines.d dVar) {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // nk.r0
    public y0 j(long j10, Runnable runnable, kotlin.coroutines.d dVar) {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // nk.y1, nk.h0
    public nk.h0 limitedParallelism(int i10, String str) {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // nk.h0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        r();
        throw new KotlinNothingValueException();
    }

    @Override // nk.r0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Void e(long j10, nk.l<? super mj.r> lVar) {
        r();
        throw new KotlinNothingValueException();
    }
}
