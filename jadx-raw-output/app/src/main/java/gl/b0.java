package gl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yk.e.util.MainPreloadService;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f53451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53452b;

    public b0(Activity activity, int i10) {
        this.f53451a = activity;
        this.f53452b = i10;
    }

    @Override // gl.t1
    public final void a() {
        Intent intent = new Intent(this.f53451a, (Class<?>) MainPreloadService.class);
        intent.putExtra(TypedValues.CycleType.S_WAVE_PERIOD, this.f53452b);
        this.f53451a.startService(intent);
    }
}
