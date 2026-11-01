package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.Nullable;
import e5.n;
import e5.q;
import m4.h;

/* JADX INFO: compiled from: SsChunkSource.java */
/* JADX INFO: loaded from: classes6.dex */
public interface b extends h {

    /* JADX INFO: compiled from: SsChunkSource.java */
    public interface a {
        b a(n nVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i10, com.google.android.exoplayer2.trackselection.c cVar, @Nullable q qVar);
    }

    void b(com.google.android.exoplayer2.trackselection.c cVar);

    void d(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar);
}
