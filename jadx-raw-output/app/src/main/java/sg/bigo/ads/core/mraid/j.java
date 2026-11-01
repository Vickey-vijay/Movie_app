package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Rect f71710a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Rect f71711b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Rect f71712c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Rect f71713d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Rect f71714e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Rect f71715f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Rect f71716g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Rect f71717h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final Context f71718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f71719j;

    public j(Context context, float f10) {
        this.f71718i = context.getApplicationContext();
        this.f71719j = f10;
    }

    public final void a(Rect rect, Rect rect2) {
        rect2.set(sg.bigo.ads.common.utils.e.a(this.f71718i, rect.left), sg.bigo.ads.common.utils.e.a(this.f71718i, rect.top), sg.bigo.ads.common.utils.e.a(this.f71718i, rect.right), sg.bigo.ads.common.utils.e.a(this.f71718i, rect.bottom));
    }
}
