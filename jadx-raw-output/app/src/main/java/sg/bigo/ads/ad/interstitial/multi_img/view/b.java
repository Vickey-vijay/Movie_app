package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Button;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends d<MediaView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Button f68717a;

    public b(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, boolean z10, int i10, int i11) {
        super(context, cVar, z10, i10, i11, R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_media_layout, R.id.inter_media_layout, R.id.inter_media, R.id.inter_media_main_background);
        this.f68717a = (Button) this.f68733j.findViewById(R.id.inter_btn_mute);
    }

    public final void a(final Bitmap bitmap) {
        ((MediaView) this.f68735l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(bitmap);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d
    public final boolean a() {
        if (super.a()) {
            return true;
        }
        sg.bigo.ads.ad.interstitial.multi_img.c cVar = this.f68730g;
        return cVar != null && cVar.f68672d == 3;
    }

    public final boolean b() {
        int i10;
        int i11 = this.f68732i;
        return i11 == 4 || i11 == 3 || (i10 = this.f68731h) == 4 || i10 == 3;
    }

    public final boolean c() {
        int i10;
        int i11 = this.f68732i;
        return i11 == 5 || i11 == 4 || (i10 = this.f68731h) == 5 || i10 == 4;
    }
}
