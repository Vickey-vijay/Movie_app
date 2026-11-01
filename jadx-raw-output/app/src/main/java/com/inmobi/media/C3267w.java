package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: renamed from: com.inmobi.media.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3267w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f25602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig.AdChoiceConfig f25603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3053n9 f25604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25605e;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C3267w c3267w, Cj cj2, String str, int i10, ContinuationImpl continuationImpl) {
        C3167s c3167s;
        c3267w.getClass();
        if (continuationImpl instanceof C3167s) {
            c3167s = (C3167s) continuationImpl;
            int i11 = c3167s.f25286c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3167s.f25286c = i11 - Integer.MIN_VALUE;
            } else {
                c3167s = new C3167s(c3267w, continuationImpl);
            }
        } else {
            c3167s = new C3167s(c3267w, continuationImpl);
        }
        Object objD = c3167s.f25284a;
        Object objF = sj.a.f();
        int i12 = c3167s.f25286c;
        if (i12 == 0) {
            kotlin.c.b(objD);
            C3242v c3242v = new C3242v(c3267w, str, cj2, null);
            c3167s.f25286c = 1;
            objD = TimeoutKt.d(i10, c3242v, c3167s);
            if (objD == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objD);
        }
        Boolean bool = (Boolean) objD;
        return tj.a.a(bool != null ? bool.booleanValue() : false);
    }

    public C3267w(Context context, Image image, AdConfig.AdChoiceConfig adChoiceConfig, C3053n9 c3053n9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(adChoiceConfig, "adChoiceConfig");
        this.f25601a = context;
        this.f25602b = image;
        this.f25603c = adChoiceConfig;
        this.f25604d = c3053n9;
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "toString(...)");
        this.f25605e = "AdChoice-Image-" + string;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    public final Object a(C3331yd c3331yd) {
        String url;
        int width;
        int height;
        Image image = this.f25602b;
        if (image == null || (url = image.getUrl()) == null) {
            url = this.f25603c.getUrl();
        } else {
            if (!URLUtil.isNetworkUrl(url)) {
                url = null;
            }
            if (url == null) {
                url = this.f25603c.getUrl();
            }
        }
        String str = url;
        Image image2 = this.f25602b;
        if (image2 != null) {
            int width2 = image2.getWidth();
            Integer numValueOf = Integer.valueOf(width2);
            if (width2 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                width = numValueOf.intValue();
            } else {
                width = this.f25603c.getWidth();
            }
        } else {
            width = this.f25603c.getWidth();
        }
        int i10 = width;
        Image image3 = this.f25602b;
        if (image3 != null) {
            int height2 = image3.getHeight();
            Integer numValueOf2 = height2 > 0 ? Integer.valueOf(height2) : null;
            if (numValueOf2 != null) {
                height = numValueOf2.intValue();
            } else {
                height = this.f25603c.getHeight();
            }
        } else {
            height = this.f25603c.getHeight();
        }
        int i11 = height;
        int loadTimeout = this.f25603c.getLoadTimeout();
        if (!URLUtil.isNetworkUrl(str)) {
            C3053n9 c3053n9 = this.f25604d;
            if (c3053n9 != null) {
                c3053n9.b("AdChoiceViewManager", "Invalid URL: " + str);
            }
            throw new C2805dc();
        }
        return nk.h.g(nk.w0.c(), new r(this, str, loadTimeout, i10, i11, null), c3331yd);
    }
}
