package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActivityChooserModel;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(26)
public final class Api26Impl {
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.PictureInPictureParams$Builder] */
    public final void setPipParamsSourceRectHint(Activity activity, Rect rect) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(rect, "hint");
        activity.setPictureInPictureParams(new Object() { // from class: android.app.PictureInPictureParams$Builder
            static {
                throw new NoClassDefFoundError();
            }

            public native /* synthetic */ PictureInPictureParams build();

            public native /* synthetic */ PictureInPictureParams$Builder setSourceRectHint(Rect rect2);
        }.setSourceRectHint(rect).build());
    }
}
