package ib;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;

/* JADX INFO: compiled from: ImageLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static boolean a(Context context) {
        if (context != null) {
            return ((context instanceof Activity) && ((Activity) context).isFinishing()) ? false : true;
        }
        return false;
    }

    public static void b(Context context, int i10, ImageView imageView, boolean z10) {
        RequestOptions requestOptions = new RequestOptions();
        if (a(context)) {
            if (z10) {
                Glide.with(context).asGif().apply((BaseRequestOptions<?>) requestOptions).load(Integer.valueOf(i10)).into(imageView);
            } else {
                Glide.with(context).load(Integer.valueOf(i10)).apply((BaseRequestOptions<?>) requestOptions).into(imageView);
            }
        }
    }

    public static void c(Context context, String str, int i10, int i11, ImageView imageView, boolean z10) {
        if (a(context) && !TextUtils.isEmpty(str)) {
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.placeholder(i10).error(i11).centerCrop().dontAnimate();
            if (z10) {
                Glide.with(context).asGif().load(str).apply((BaseRequestOptions<?>) requestOptions).into(imageView);
            } else {
                Glide.with(context).load(str).apply((BaseRequestOptions<?>) requestOptions).into(imageView);
            }
        }
    }

    public static void d(Context context, String str, ImageView imageView, boolean z10) {
        if (a(context) && !TextUtils.isEmpty(str)) {
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.centerCrop().dontAnimate();
            if (z10) {
                requestOptions.fitCenter();
                Glide.with(context).asGif().load(str).apply((BaseRequestOptions<?>) requestOptions).into(imageView);
            } else {
                Glide.with(context).load(str).apply((BaseRequestOptions<?>) requestOptions).into(imageView);
            }
        }
    }
}
