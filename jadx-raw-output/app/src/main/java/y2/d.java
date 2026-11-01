package y2;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: MintegralConstants.java */
/* JADX INFO: loaded from: classes7.dex */
public class d {
    @NonNull
    public static AdError a(int i10, @NonNull String str) {
        return new AdError(i10, str, "com.google.ads.mediation.mintegral");
    }

    @NonNull
    public static AdError b(int i10, @NonNull String str) {
        return new AdError(i10, str, "com.mbridge.msdk");
    }
}
