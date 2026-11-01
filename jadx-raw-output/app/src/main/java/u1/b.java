package u1;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: compiled from: SensitiveUserDataUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¨\u0006\u000f"}, d2 = {"Lu1/b;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "g", "Landroid/widget/TextView;", "c", "b", "d", InneractiveMediationDefs.GENDER_FEMALE, "e", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f72514a = new b();

    public static final boolean g(View view) {
        if (i2.a.d(b.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            b bVar = f72514a;
            return bVar.c((TextView) view) || bVar.a((TextView) view) || bVar.d((TextView) view) || bVar.f((TextView) view) || bVar.e((TextView) view) || bVar.b((TextView) view);
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
            return false;
        }
    }

    public final boolean a(TextView view) {
        int i10;
        if (i2.a.d(this)) {
            return false;
        }
        try {
            String strReplace = new Regex("\\s").replace(d.k(view), "");
            int length = strReplace.length();
            if (length >= 12 && length <= 19) {
                int i11 = length - 1;
                if (i11 >= 0) {
                    boolean z10 = false;
                    i10 = 0;
                    while (true) {
                        int i12 = i11 - 1;
                        char cCharAt = strReplace.charAt(i11);
                        if (!Character.isDigit(cCharAt)) {
                            return false;
                        }
                        int iG = lk.b.g(cCharAt);
                        if (z10 && (iG = iG * 2) > 9) {
                            iG = (iG % 10) + 1;
                        }
                        i10 += iG;
                        z10 = !z10;
                        if (i12 < 0) {
                            break;
                        }
                        i11 = i12;
                    }
                } else {
                    i10 = 0;
                }
                if (i10 % 10 != 0) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }

    public final boolean b(TextView view) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            boolean z10 = true;
            if (view.getInputType() == 32) {
                return true;
            }
            String strK = d.k(view);
            if (strK == null) {
                return false;
            }
            if (strK.length() != 0) {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(strK).matches();
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }

    public final boolean c(TextView view) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 128) {
                return true;
            }
            return view.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }

    public final boolean d(TextView view) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            if (view.getInputType() != 96) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }

    public final boolean e(TextView view) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            if (view.getInputType() != 3) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }

    public final boolean f(TextView view) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            if (view.getInputType() != 112) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }
}
