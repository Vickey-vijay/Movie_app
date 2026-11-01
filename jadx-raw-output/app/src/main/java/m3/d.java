package m3;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import g5.k0;
import java.util.Arrays;

/* JADX INFO: compiled from: AudioCapabilities.java */
/* JADX INFO: loaded from: classes9.dex */
@TargetApi(21)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f63974c = new d(new int[]{2}, 8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f63975d = new d(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f63976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63977b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Arrays.equals(this.f63976a, dVar.f63976a) && this.f63977b == dVar.f63977b;
    }

    public static boolean a() {
        return k0.f53108a >= 17 && "Amazon".equals(k0.f53110c);
    }

    public static d b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public int d() {
        return this.f63977b;
    }

    public boolean e(int i10) {
        return Arrays.binarySearch(this.f63976a, i10) >= 0;
    }

    public int hashCode() {
        return this.f63977b + (Arrays.hashCode(this.f63976a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f63977b + ", supportedEncodings=" + Arrays.toString(this.f63976a) + C3426d4.j.f28588e;
    }

    public d(@Nullable int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f63976a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f63976a = new int[0];
        }
        this.f63977b = i10;
    }

    @SuppressLint({"InlinedApi"})
    public static d c(Context context, @Nullable Intent intent) {
        if (a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f63975d;
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new d(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f63974c;
    }
}
