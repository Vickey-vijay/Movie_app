package yads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.C3426d4;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class uk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uk f83512c = new uk(8, new int[]{2});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uk f83513d = new uk(8, new int[]{2, 5, 6});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xm2 f83514e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f83515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83516b;

    public static uk a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i10 = ib3.f78556a;
        if (i10 >= 17) {
            byte[] bArrDecode = Base64.decode("QW1hem9u", 0);
            Charset charset = lk.c.f63591b;
            String str = new String(bArrDecode, charset);
            String str2 = ib3.f78558c;
            if ((str.equals(str2) || new String(Base64.decode("WGlhb21p", 0), charset).equals(str2)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return f83513d;
            }
        }
        if (i10 >= 29 && (ib3.d(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return new uk(8, tk.a());
        }
        if (intentRegisterReceiver == null || intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f83512c;
        }
        return new uk(intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8), intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk)) {
            return false;
        }
        uk ukVar = (uk) obj;
        return Arrays.equals(this.f83515a, ukVar.f83515a) && this.f83516b == ukVar.f83516b;
    }

    static {
        q51 q51VarA = new q51(4).a(5, 6).a(17, 6).a(7, 6).a(18, 6).a(6, 8).a(8, 8).a(14, 8);
        f83514e = xm2.a(q51VarA.f81713b, q51VarA.f81712a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f83515a) * 31) + this.f83516b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f83516b + ", supportedEncodings=" + Arrays.toString(this.f83515a) + C3426d4.j.f28588e;
    }

    public uk(int i10, int[] iArr) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f83515a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f83515a = new int[0];
        }
        this.f83516b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    public final Pair a(mx0 mx0Var) {
        String str = mx0Var.f80429m;
        str.getClass();
        int iB = ht1.b(str, mx0Var.f80426j);
        xm2 xm2Var = f83514e;
        if (!xm2Var.containsKey(Integer.valueOf(iB))) {
            return null;
        }
        int i10 = 6;
        if (iB == 18 && Arrays.binarySearch(this.f83515a, 18) < 0) {
            iB = 6;
        } else if (iB == 8 && Arrays.binarySearch(this.f83515a, 8) < 0) {
            iB = 7;
        }
        if (Arrays.binarySearch(this.f83515a, iB) < 0) {
            return null;
        }
        int iIntValue = mx0Var.f80442z;
        if (iIntValue != -1 && iB != 18) {
            if (iIntValue > this.f83516b) {
                return null;
            }
        } else {
            int i11 = mx0Var.A;
            if (i11 == -1) {
                i11 = 48000;
            }
            if (ib3.f78556a >= 29) {
                iIntValue = tk.a(iB, i11);
            } else {
                Object obj = xm2Var.get(Integer.valueOf(iB));
                iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
            }
        }
        int i12 = ib3.f78556a;
        if (i12 > 28) {
            i10 = iIntValue;
        } else if (iIntValue == 7) {
            i10 = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i10 = iIntValue;
        }
        if (i12 <= 26 && pk2.f81441d.a().equals(ib3.f78557b) && i10 == 1) {
            i10 = 2;
        }
        int iA = ib3.a(i10);
        if (iA == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iA));
    }
}
