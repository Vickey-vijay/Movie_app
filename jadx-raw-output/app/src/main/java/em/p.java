package em;

import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import me.goldze.mvvmhabit.R$id;
import me.goldze.mvvmhabit.R$layout;

/* JADX INFO: compiled from: ToastUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52677a = 81;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52678b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static WeakReference<View> f52683g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52679c = (int) (((double) (r.a().getResources().getDisplayMetrics().density * 64.0f)) + 0.5d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52680d = 301989888;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52681e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f52682f = 301989888;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Handler f52684h = new Handler(Looper.getMainLooper());

    public static void c(CharSequence charSequence) {
        a(charSequence, 0);
    }

    public static void a(CharSequence charSequence, int i10) {
        Toast toastMakeText;
        boolean z10;
        View view;
        WeakReference<View> weakReference = f52683g;
        if (weakReference == null || (view = weakReference.get()) == null) {
            toastMakeText = null;
            z10 = false;
        } else {
            toastMakeText = new Toast(r.a());
            toastMakeText.setView(view);
            toastMakeText.setDuration(i10);
            z10 = true;
        }
        if (!z10) {
            if (f52682f != 301989888) {
                SpannableString spannableString = new SpannableString(charSequence);
                spannableString.setSpan(new ForegroundColorSpan(f52682f), 0, spannableString.length(), 33);
                toastMakeText = Toast.makeText(r.a(), spannableString, i10);
            } else {
                toastMakeText = Toast.makeText(r.a(), charSequence, i10);
            }
        }
        View view2 = toastMakeText.getView();
        int i11 = f52681e;
        if (i11 != -1) {
            view2.setBackgroundResource(i11);
        } else {
            int i12 = f52680d;
            if (i12 != 301989888) {
                view2.setBackgroundColor(i12);
            }
        }
        toastMakeText.setGravity(f52677a, f52678b, f52679c);
        toastMakeText.show();
    }

    public static void b(CharSequence charSequence) {
        View viewInflate = LayoutInflater.from(r.a()).inflate(R$layout.toast_text_layout, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R$id.tv_message)).setText(charSequence);
        Toast toast = new Toast(r.a());
        toast.setGravity(17, 0, 0);
        toast.setDuration(0);
        toast.setView(viewInflate);
        toast.show();
    }
}
