package yads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public final class xd1 extends ja3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f84537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84538c;

    public xd1(Object obj) {
        this.f84538c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f84537b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f84537b) {
            throw new NoSuchElementException();
        }
        this.f84537b = true;
        return this.f84538c;
    }
}
