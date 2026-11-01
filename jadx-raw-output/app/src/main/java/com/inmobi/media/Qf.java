package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes8.dex */
public final class Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Picasso f23387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wk.a f23388b = wk.g.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f23389c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pf f23390d = new Pf();

    public static final Picasso a(Context context) {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        Picasso picassoBuild = new Picasso.Builder(context).downloader(new OkHttp3Downloader(new OkHttpClient.Builder().addInterceptor(new B8(((long) ((AdConfig) Y3.f23815a.a(AdConfig.class)).getNative().getAssetConfig().getMaxImageSize()) * 1024 * ((long) 1024))).build())).build();
        ck.p.i(picassoBuild, "build(...)");
        return picassoBuild;
    }

    public static Picasso b(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return (Picasso) nk.i.b(null, new Mf(context, null), 1, null);
    }
}
