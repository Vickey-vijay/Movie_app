package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.Result;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: renamed from: com.inmobi.media.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2814dl implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c f24259a;

    public C2814dl(kotlinx.coroutines.c cVar) {
        this.f24259a = cVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        ck.p.j(call, NotificationCompat.CATEGORY_CALL);
        ck.p.j(iOException, "e");
        kotlinx.coroutines.c cVar = this.f24259a;
        ck.p.j(cVar, "<this>");
        ck.p.j(iOException, "t");
        if (cVar.isActive()) {
            try {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(iOException)));
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        ck.p.j(call, NotificationCompat.CATEGORY_CALL);
        ck.p.j(response, "response");
        P4.a(this.f24259a, response);
    }
}
