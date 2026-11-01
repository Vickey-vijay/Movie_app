package sg.bigo.ads.ad.interstitial.d.a.a;

import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.b.b;
import sg.bigo.ads.api.MediaView;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends sg.bigo.ads.ad.interstitial.d.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MediaView f68149x;

    public a(@NonNull b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final ViewGroup k() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final MediaView l() {
        return this.f68149x;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final Button m() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void t() {
        super.t();
        ViewGroup viewGroup = this.f68118q;
        if (viewGroup != null) {
            this.f68149x = (MediaView) viewGroup.findViewById(R.id.inter_media);
        }
    }
}
