package yads;

import kotlin.Result;

/* JADX INFO: loaded from: classes8.dex */
public final class jw0 implements up2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nk.l f79215a;

    public jw0(kotlinx.coroutines.c cVar) {
        this.f79215a = cVar;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        this.f79215a.resumeWith(Result.m3458constructorimpl((byte[]) obj));
    }
}
