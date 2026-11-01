package com.google.android.exoplayer2.source.dash;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import e5.n;
import e5.q;
import java.util.List;
import m4.h;

/* JADX INFO: compiled from: DashChunkSource.java */
/* JADX INFO: loaded from: classes9.dex */
public interface a extends h {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DashChunkSource.java */
    public interface InterfaceC0180a {
        a a(n nVar, o4.b bVar, int i10, int[] iArr, com.google.android.exoplayer2.trackselection.c cVar, int i11, long j10, boolean z10, List<Format> list, @Nullable d.c cVar2, @Nullable q qVar);
    }

    void b(com.google.android.exoplayer2.trackselection.c cVar);

    void e(o4.b bVar, int i10);
}
