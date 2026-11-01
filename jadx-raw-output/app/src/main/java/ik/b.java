package ik;

import ck.p;
import java.util.NoSuchElementException;
import nj.q;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f54206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54207e;

    @Override // nj.q
    public char a() {
        int i10 = this.f54207e;
        if (i10 != this.f54205c) {
            this.f54207e = this.f54204b + i10;
        } else {
            if (!this.f54206d) {
                throw new NoSuchElementException();
            }
            this.f54206d = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f54206d;
    }

    public b(char c10, char c11, int i10) {
        this.f54204b = i10;
        this.f54205c = c11;
        boolean z10 = true;
        if (i10 <= 0 ? p.l(c10, c11) < 0 : p.l(c10, c11) > 0) {
            z10 = false;
        }
        this.f54206d = z10;
        this.f54207e = z10 ? c10 : c11;
    }
}
