package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.p.f;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends d<AdImageView> implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sg.bigo.ads.ad.interstitial.multi_img.b f68709a;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ValueCallback<a> f68710t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f68711u;

    public a(Context context, sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i10, int i11, String str, boolean z10, ValueCallback<a> valueCallback) {
        super(context, cVar, false, i10, i11, R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_item_layout, R.id.inter_media_item_layout, R.id.inter_media_item, R.id.inter_media_item_background);
        this.f68709a = bVar;
        this.f68711u = str;
        this.f68710t = valueCallback;
        if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
            ((AdImageView) this.f68735l).a(this);
            ((AdImageView) this.f68735l).a(str, z10);
            if (bVar != null) {
                bVar.a(str, 0);
            }
        }
        ((AdImageView) this.f68735l).setFadeEnable(true);
        this.f68733j.setStrokeWidth(e.a(context, 1));
        this.f68733j.setStrokeColor(q.b("#08000000", -7829368));
        ((AdImageView) this.f68735l).setBackgroundColor(q.b("#FFE1E1E6", -7829368));
        ((AdImageView) this.f68735l).setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
    }

    public static /* synthetic */ void a(a aVar, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            ViewGroup.LayoutParams layoutParams = aVar.f68733j.getLayoutParams();
            if (layoutParams instanceof ViewFlow.b) {
                ViewFlow.b bVar = (ViewFlow.b) layoutParams;
                bVar.f70196a = width;
                bVar.f70197b = height;
            }
            aVar.f68733j.setLayoutParams(layoutParams);
            aVar.a(width, height);
        }
        aVar.b(bitmap);
    }

    @Override // sg.bigo.ads.common.p.g
    public final void a(int i10, @NonNull String str, String str2) {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f68709a;
        if (bVar != null) {
            bVar.a(this.f68711u, 2);
        }
        ((AdImageView) this.f68735l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.a.3
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f68710t != null) {
                    a.this.f68710t.onReceiveValue(a.this);
                }
            }
        });
    }

    public final void a(final Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((AdImageView) this.f68735l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, bitmap);
                ((AdImageView) a.this.f68735l).setImageBitmap(bitmap);
            }
        });
    }

    @Override // sg.bigo.ads.common.p.g
    public final void a(@NonNull final Bitmap bitmap, @NonNull f fVar) {
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f68709a;
        if (bVar != null) {
            bVar.a(this.f68711u, 1);
        }
        ((AdImageView) this.f68735l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, bitmap);
                ((AdImageView) a.this.f68735l).setBackground(null);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d
    public final boolean a() {
        if (super.a()) {
            return true;
        }
        sg.bigo.ads.ad.interstitial.multi_img.c cVar = this.f68730g;
        if (cVar == null) {
            return false;
        }
        int i10 = cVar.f68672d;
        return i10 == 3 || i10 == 2;
    }
}
