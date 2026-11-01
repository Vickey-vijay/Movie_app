package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import mj.r;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(final Activity activity, View view, rj.c<? super r> cVar) {
        Object objCollect = qk.e.e(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new qk.d() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            @Override // qk.d
            public /* bridge */ /* synthetic */ Object emit(Object obj, rj.c cVar2) {
                return emit((Rect) obj, (rj.c<? super r>) cVar2);
            }

            public final Object emit(Rect rect, rj.c<? super r> cVar2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return r.f64562a;
            }
        }, cVar);
        return objCollect == sj.a.f() ? objCollect : r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
