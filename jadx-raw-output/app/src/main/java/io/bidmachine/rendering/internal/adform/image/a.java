package io.bidmachine.rendering.internal.adform.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.event.b;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.Base64ResourceSource;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.Resource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.UrlResourceSource;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ImageView f60028r;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.image.a$a, reason: collision with other inner class name */
    public final class C0515a implements io.bidmachine.rendering.internal.repository.a.InterfaceC0533a {
        public C0515a() {
        }

        @Override // io.bidmachine.rendering.internal.repository.a.InterfaceC0533a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap bitmap) {
            p.j(bitmap, "bitmap");
            a.this.f60028r.setImageBitmap(bitmap);
        }

        @Override // io.bidmachine.rendering.internal.repository.a.InterfaceC0533a
        public void onError(Error error) {
            p.j(error, "error");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, c cVar, b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2) {
        super(context, aVar, adElementParams, cVar, bVar, aVar2);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(aVar, "repository");
        p.j(adElementParams, "adElementParams");
        p.j(cVar, "adFormListener");
        p.j(bVar, "eventCallback");
        this.f60028r = new ImageView(context);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void c() {
        MediaSource mediaSourceFrom;
        MediaSource.Companion companion = MediaSource.INSTANCE;
        a(companion.fromDefaultSettings(h().getPlaceholder()));
        t().b(this);
        Resource resource = h().getResource();
        ResourceSource source = resource != null ? resource.getSource() : null;
        if (source == null) {
            mediaSourceFrom = companion.from(h().getSource());
        } else if (source instanceof Base64ResourceSource) {
            mediaSourceFrom = companion.fromBase64(((Base64ResourceSource) source).getBase64());
        } else {
            if (!(source instanceof UrlResourceSource)) {
                b("Invalid resource type (" + source.getClass().getSimpleName() + "), it should be Base64ResourceSource or UrlResourceSource");
                return;
            }
            mediaSourceFrom = companion.fromUrl(((UrlResourceSource) source).getUrl());
        }
        a(mediaSourceFrom);
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View x() {
        return this.f60028r;
    }

    private final void a(MediaSource mediaSource) {
        if (mediaSource != null) {
            w().b(mediaSource, new C0515a());
        }
    }
}
