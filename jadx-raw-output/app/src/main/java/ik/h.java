package ik;

import java.util.NoSuchElementException;
import nj.g0;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f54218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54219e;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f54218d;
    }

    @Override // nj.g0
    public int nextInt() {
        int i10 = this.f54219e;
        if (i10 != this.f54217c) {
            this.f54219e = this.f54216b + i10;
        } else {
            if (!this.f54218d) {
                throw new NoSuchElementException();
            }
            this.f54218d = false;
        }
        return i10;
    }

    public h(int i10, int i11, int i12) {
        this.f54216b = i12;
        this.f54217c = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f54218d = z10;
        this.f54219e = z10 ? i10 : i11;
    }
}
