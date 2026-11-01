package io.bidmachine.rendering.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.impl.A2;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.BackgroundSource;
import io.bidmachine.rendering.model.Base64ResourceSource;
import io.bidmachine.rendering.model.Border;
import io.bidmachine.rendering.model.Color;
import io.bidmachine.rendering.model.ColorBackgroundSource;
import io.bidmachine.rendering.model.ColorPlaceholderSource;
import io.bidmachine.rendering.model.ColorSource;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.Gradient;
import io.bidmachine.rendering.model.GradientColorSource;
import io.bidmachine.rendering.model.GradientType;
import io.bidmachine.rendering.model.HtmlResourceSource;
import io.bidmachine.rendering.model.Image;
import io.bidmachine.rendering.model.ImageBackgroundSource;
import io.bidmachine.rendering.model.ImagePlaceholderSource;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.NamePlaceholderSource;
import io.bidmachine.rendering.model.OneColorSource;
import io.bidmachine.rendering.model.Placeholder;
import io.bidmachine.rendering.model.PlaceholderSource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.ScaleType;
import io.bidmachine.rendering.model.ScaleTypeKt;
import io.bidmachine.rendering.model.UrlResourceSource;
import io.bidmachine.rendering.model.XmlResourceSource;
import io.bidmachine.util.UtilsKt;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.repository.a f60654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Background f60655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f60656d;

    public final class a implements io.bidmachine.rendering.internal.repository.a.InterfaceC0533a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f60657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ScaleType f60658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Integer f60659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Border f60660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final WeakReference f60661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ z f60662f;

        public a(z zVar, View view, boolean z10, ScaleType scaleType, Integer num, Border border) {
            ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            this.f60662f = zVar;
            this.f60657a = z10;
            this.f60658b = scaleType;
            this.f60659c = num;
            this.f60660d = border;
            this.f60661e = new WeakReference(view);
        }

        @Override // io.bidmachine.rendering.internal.repository.a.InterfaceC0533a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap bitmap) {
            ck.p.j(bitmap, "successType");
            z zVar = this.f60662f;
            try {
                View view = (View) this.f60661e.get();
                if (view == null) {
                    return;
                }
                ck.p.i(view, "weakView.get() ?: return");
                zVar.a(view, this.f60657a, bitmap, this.f60658b, this.f60659c, this.f60660d);
                mj.r rVar = mj.r.f64562a;
            } catch (Throwable unused) {
            }
        }

        @Override // io.bidmachine.rendering.internal.repository.a.InterfaceC0533a
        public void onError(Error error) {
            ck.p.j(error, "error");
        }
    }

    public z(Context context, io.bidmachine.rendering.internal.repository.a aVar, Background background) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(aVar, "repository");
        ck.p.j(background, A2.f54950g);
        this.f60653a = context;
        this.f60654b = aVar;
        this.f60655c = background;
        this.f60656d = new AtomicBoolean(false);
    }

    public final void a(View view, Integer num, Border border) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        Placeholder placeholder = this.f60655c.getPlaceholder();
        if (placeholder != null) {
            try {
                PlaceholderSource source = placeholder.getSource();
                if (source instanceof NamePlaceholderSource) {
                    a(this, view, false, i.f60426a.c(((NamePlaceholderSource) source).getName()), null, num, border, 8, null);
                } else if (source instanceof ColorPlaceholderSource) {
                    a(view, false, ((ColorPlaceholderSource) source).getColor(), num, border);
                } else if (source instanceof ImagePlaceholderSource) {
                    a(view, false, ((ImagePlaceholderSource) source).getImage(), num, border);
                }
                mj.r rVar = mj.r.f64562a;
            } catch (Throwable unused) {
            }
        }
        BackgroundSource source2 = this.f60655c.getSource();
        if (source2 != null) {
            try {
                if (source2 instanceof ColorBackgroundSource) {
                    a(view, true, ((ColorBackgroundSource) source2).getColor(), num, border);
                } else if (source2 instanceof ImageBackgroundSource) {
                    a(view, true, ((ImageBackgroundSource) source2).getImage(), num, border);
                }
                mj.r rVar2 = mj.r.f64562a;
            } catch (Throwable unused2) {
            }
        }
    }

    public static /* synthetic */ void a(z zVar, View view, Integer num, Border border, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            border = null;
        }
        zVar.a(view, num, border);
    }

    public final void a(View view, boolean z10, Bitmap bitmap, ScaleType scaleType, Integer num, Border border) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (bitmap == null) {
            return;
        }
        ImageView.ScaleType imageViewScaleType = ScaleTypeKt.toImageViewScaleType(scaleType);
        u uVar = new u(bitmap);
        uVar.a(imageViewScaleType);
        if (num != null && num.intValue() > 0) {
            uVar.b(num.intValue());
        }
        if (border != null) {
            uVar.a(border.getStrokeWidthPx());
            uVar.a(border.getStrokeColor());
            view.setPadding(border.getStrokeWidthPx(), border.getStrokeWidthPx() - UtilsKt.dpToPx(this.f60653a, 2.0f), border.getStrokeWidthPx(), border.getStrokeWidthPx() + UtilsKt.dpToPx(this.f60653a, 2.0f));
        }
        a(view, z10, uVar);
    }

    public static /* synthetic */ void a(z zVar, View view, boolean z10, Bitmap bitmap, ScaleType scaleType, Integer num, Border border, int i10, Object obj) {
        zVar.a(view, z10, bitmap, (i10 & 8) != 0 ? null : scaleType, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : border);
    }

    public final void a(View view, boolean z10, int i10, Integer num, Border border) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        j jVar = new j();
        jVar.b(i10);
        if (num != null) {
            jVar.a(num.intValue());
        }
        if (border != null) {
            j.a(jVar, border.getStrokeWidthPx(), border.getStrokeColor(), 0.0f, 0.0f, 12, null);
            view.setPadding(border.getStrokeWidthPx(), border.getStrokeWidthPx() - UtilsKt.dpToPx(this.f60653a, 2.0f), border.getStrokeWidthPx(), border.getStrokeWidthPx() + UtilsKt.dpToPx(this.f60653a, 2.0f));
        }
        a(view, z10, jVar);
    }

    public final void a(View view, boolean z10, Color color, Integer num, Border border) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(color, "color");
        ColorSource source = color.getSource();
        if (source instanceof OneColorSource) {
            a(view, z10, ((OneColorSource) source).getColor(), num, border);
        } else if (source instanceof GradientColorSource) {
            a(view, z10, ((GradientColorSource) source).getGradient(), num, border);
        }
    }

    public final void a(View view, boolean z10, Drawable drawable) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(drawable, "drawable");
        if (this.f60656d.compareAndSet(false, z10)) {
            drawable.setAlpha((int) UtilsKt.fromRatio(Float.valueOf(this.f60655c.getIo.bidmachine.iab.vast.tags.VastAttributes.OPACITY java.lang.String()), 255.0f));
            drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
            view.setBackground(drawable);
        }
    }

    public final void a(View view, boolean z10, Gradient gradient, Integer num, Border border) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(gradient, "gradient");
        int drawableGradientType = gradient.getType().toDrawableGradientType();
        j jVar = new j(gradient.getDirection().toDrawableGradientOrientation(), nj.b0.N0(gradient.getColors()));
        jVar.c(drawableGradientType);
        if (gradient.getType() == GradientType.Radial) {
            j.a(jVar, 0.0f, 2, 1, null);
        }
        if (num != null) {
            jVar.a(num.intValue());
        }
        if (border != null) {
            j.a(jVar, border.getStrokeWidthPx(), border.getStrokeColor(), 0.0f, 0.0f, 12, null);
            view.setPadding(border.getStrokeWidthPx(), border.getStrokeWidthPx() - UtilsKt.dpToPx(this.f60653a, 2.0f), border.getStrokeWidthPx(), border.getStrokeWidthPx() + UtilsKt.dpToPx(this.f60653a, 2.0f));
        }
        a(view, z10, jVar);
    }

    public final void a(View view, boolean z10, Image image, Integer num, Border border) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(image, "image");
        ResourceSource source = image.getResource().getSource();
        if (source instanceof Base64ResourceSource) {
            a(view, z10, i.b(((Base64ResourceSource) source).getBase64()), image.getScaleType(), num, border);
            return;
        }
        if (!(source instanceof UrlResourceSource)) {
            if (source instanceof HtmlResourceSource) {
                return;
            }
            boolean z11 = source instanceof XmlResourceSource;
        } else {
            MediaSource mediaSourceFromUrl = MediaSource.INSTANCE.fromUrl(((UrlResourceSource) source).getUrl());
            if (mediaSourceFromUrl != null) {
                this.f60654b.b(mediaSourceFromUrl, new a(this, view, z10, image.getScaleType(), num, border));
            }
        }
    }
}
