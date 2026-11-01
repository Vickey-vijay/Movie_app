package a8;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Crop.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    @Nullable
    public static Throwable a(@NonNull Intent intent) {
        return (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
    }

    @Nullable
    public static Uri b(@NonNull Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("output");
        return uri == null ? (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri") : uri;
    }

    public static float c(@NonNull Intent intent) {
        return intent.getFloatExtra("com.yalantis.ucrop.CropAspectRatio", 0.0f);
    }

    public static String d(@NonNull Intent intent) {
        return intent.getStringExtra("customExtraData");
    }

    public static int e(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1);
    }

    public static int f(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.OffsetX", 0);
    }

    public static int g(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.OffsetY", 0);
    }

    public static int h(@NonNull Intent intent) {
        return intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1);
    }
}
