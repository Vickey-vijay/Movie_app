package s;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;

/* JADX INFO: compiled from: ToastUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f66966a = (int) (((double) (f.getContext().getResources().getDisplayMetrics().density * 64.0f)) + 0.5d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f66967b = 301989888;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f66968c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f66969d = 301989888;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Handler f66970e = new Handler(Looper.getMainLooper());

    public static void a(CharSequence charSequence) {
        View viewInflate = LayoutInflater.from(f.getContext()).inflate(R$layout.toast_text_layout, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R$id.tv_message)).setText(charSequence);
        Toast toast = new Toast(f.getContext());
        toast.setGravity(17, 0, 0);
        toast.setDuration(0);
        toast.setView(viewInflate);
        toast.show();
    }
}
