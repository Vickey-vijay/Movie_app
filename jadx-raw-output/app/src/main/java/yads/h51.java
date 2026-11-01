package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h51 extends i51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f78070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78072c;

    public final void a(int i10) {
        Object[] objArr = this.f78070a;
        if (objArr.length < i10) {
            this.f78070a = Arrays.copyOf(objArr, i51.a(objArr.length, i10));
            this.f78072c = false;
        } else if (this.f78072c) {
            this.f78070a = (Object[]) objArr.clone();
            this.f78072c = false;
        }
    }

    public h51() {
        kx.a(4, "initialCapacity");
        this.f78070a = new Object[4];
        this.f78071b = 0;
    }
}
