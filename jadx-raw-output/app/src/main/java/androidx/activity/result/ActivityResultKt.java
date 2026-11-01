package androidx.activity.result;

import android.content.Intent;
import ck.p;

/* JADX INFO: compiled from: ActivityResult.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ActivityResultKt {
    public static final int component1(ActivityResult activityResult) {
        p.j(activityResult, "<this>");
        return activityResult.getResultCode();
    }

    public static final Intent component2(ActivityResult activityResult) {
        p.j(activityResult, "<this>");
        return activityResult.getData();
    }
}
