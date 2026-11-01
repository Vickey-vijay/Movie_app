package t2;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: InMobiConstants.java */
/* JADX INFO: loaded from: classes10.dex */
public class g {
    @NonNull
    public static AdError a(int i10, @NonNull String str) {
        return new AdError(i10, str, "com.google.ads.mediation.inmobi");
    }

    @NonNull
    public static AdError b(int i10, @NonNull String str) {
        return new AdError(i10, str, "com.inmobi.sdk");
    }
}
