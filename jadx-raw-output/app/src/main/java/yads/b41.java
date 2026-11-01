package yads;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class b41 implements d51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nk.l f75721a;

    @Override // yads.d51
    public final void a(String str, Bitmap bitmap) {
    }

    public b41(kotlinx.coroutines.c cVar) {
        this.f75721a = cVar;
    }

    @Override // yads.d51
    public final void a(Map map) {
        nk.l lVar = this.f75721a;
        Result.a aVar = Result.Companion;
        lVar.resumeWith(Result.m3458constructorimpl(new e51(map)));
    }
}
