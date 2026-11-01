package yads;

import android.app.ActivityManager;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class zh extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ei f85394b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(ei eiVar) {
        super(0);
        this.f85394b = eiVar;
    }

    @Override // bk.a
    public final Object invoke() {
        try {
            Object systemService = this.f85394b.f77078a.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (systemService instanceof ActivityManager) {
                return (ActivityManager) systemService;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
