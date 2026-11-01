package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public final class us {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f83589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gf f83590b;

    public /* synthetic */ us(Context context) {
        this(new Handler(Looper.getMainLooper()), ws.a(context));
    }

    public us(Handler handler, gf gfVar) {
        this.f83589a = handler;
        this.f83590b = gfVar;
    }
}
