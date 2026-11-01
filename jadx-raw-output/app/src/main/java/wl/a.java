package wl;

import android.text.TextUtils;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import em.h;

/* JADX INFO: compiled from: ViewAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    @BindingAdapter(requireAll = false, value = {"url", "placeholderRes"})
    public static void a(ImageView imageView, String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            imageView.setImageResource(i10);
        } else if (str.startsWith("http")) {
            Glide.with(imageView.getContext()).load(str).apply((BaseRequestOptions<?>) new RequestOptions().placeholder(i10).error(i10)).listener(new h()).into(imageView);
        } else {
            imageView.setImageResource(i10);
        }
    }
}
