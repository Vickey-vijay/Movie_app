package sg.bigo.ads.ad.c.a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.vungle.ads.internal.protos.Sdk;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MaxWidthMediaView;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {
    public c(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull Context context) {
        super(bVar, context);
        sg.bigo.ads.api.c.b.a(20);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int a() {
        return R.layout.bigo_ad_native_banner_small;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int b() {
        return e.a(this.f67582c, 6);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int[] c() {
        return new int[]{e.a(this.f67582c, -24), e.a(this.f67582c, 236)};
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final void d() {
        this.f67581b = new FrameLayout(this.f67582c);
        int iA = e.a(this.f67582c, 38);
        int iA2 = e.a(this.f67582c, 60);
        MaxWidthMediaView maxWidthMediaView = new MaxWidthMediaView(this.f67582c);
        this.f67583d = maxWidthMediaView;
        maxWidthMediaView.setLayoutParams(new ViewGroup.LayoutParams(-2, iA));
        this.f67583d.setMinimumWidth(iA);
        ((MaxWidthMediaView) this.f67583d).setMaxWidth(iA2);
        this.f67583d.setImageBlurBorder(true);
        this.f67583d.setVisibility(8);
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int i() {
        return Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
    }

    @Override // sg.bigo.ads.ad.c.a.a
    public final int j() {
        return 50;
    }
}
