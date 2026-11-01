package qk;

import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<T> f66596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BufferOverflow f66598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.coroutines.d f66599d;

    /* JADX WARN: Multi-variable type inference failed */
    public s(c<? extends T> cVar, int i10, BufferOverflow bufferOverflow, kotlin.coroutines.d dVar) {
        this.f66596a = cVar;
        this.f66597b = i10;
        this.f66598c = bufferOverflow;
        this.f66599d = dVar;
    }
}
