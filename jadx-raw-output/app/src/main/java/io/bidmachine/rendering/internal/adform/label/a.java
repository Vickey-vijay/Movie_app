package io.bidmachine.rendering.internal.adform.label;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import ck.i;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.event.b;
import io.bidmachine.rendering.internal.j;
import io.bidmachine.rendering.internal.z;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.Border;
import io.bidmachine.rendering.model.FontStyleType;
import io.bidmachine.util.UtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0516a f60030s = new C0516a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TextView f60031r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, c cVar, b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2) {
        super(context, aVar, adElementParams, cVar, bVar, aVar2);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(aVar, "repository");
        p.j(adElementParams, "adElementParams");
        p.j(cVar, "adFormListener");
        p.j(bVar, "eventCallback");
        this.f60031r = new TextView(context);
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void a(View view, z zVar) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        int cornerRadiusPxOrDefault$default = AppearanceParams.getCornerRadiusPxOrDefault$default(u(), v(), 0, 2, null);
        Border border = u().getBorder(v());
        if (zVar != null) {
            zVar.a(this.f60031r, Integer.valueOf(cornerRadiusPxOrDefault$default), border);
            return;
        }
        TextView textView = this.f60031r;
        j jVar = new j();
        jVar.b(AppearanceParams.getBackgroundOrDefault$default(u(), 0, 1, null));
        jVar.a(cornerRadiusPxOrDefault$default);
        if (border != null) {
            j.a(jVar, border.getStrokeWidthPx(), border.getStrokeColor(), 0.0f, 0.0f, 12, null);
            this.f60031r.setPadding(border.getStrokeWidthPx(), border.getStrokeWidthPx() - UtilsKt.dpToPx(v(), 2.0f), border.getStrokeWidthPx(), border.getStrokeWidthPx() + UtilsKt.dpToPx(v(), 2.0f));
        }
        textView.setBackground(jVar);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void c() {
        this.f60031r.setText(h().getText());
        Integer strokeColor = u().getStrokeColor();
        if (strokeColor != null) {
            this.f60031r.setTextColor(strokeColor.intValue());
        }
        Float fontSize = u().getFontSize();
        if (fontSize != null && fontSize.floatValue() > 0.0f) {
            this.f60031r.setTextSize(1, fontSize.floatValue());
        }
        FontStyleType fontStyleType = u().getFontStyleType();
        if (fontStyleType != null) {
            this.f60031r.setTypeface(Typeface.create(Typeface.DEFAULT, fontStyleType.getTypeface()));
        }
        Integer textMaxLines = u().getTextMaxLines();
        if (textMaxLines != null && textMaxLines.intValue() > 0) {
            this.f60031r.setMaxLines(textMaxLines.intValue());
        }
        Integer textLineSpacingPx = u().getTextLineSpacingPx(v());
        if (textLineSpacingPx != null) {
            this.f60031r.setLineSpacing(textLineSpacingPx.intValue(), 1.0f);
        }
        this.f60031r.setGravity(u().getTextHorizontalGravity().getValue() | 16);
        Integer shadowColor = u().getShadowColor();
        if (shadowColor != null) {
            int iIntValue = shadowColor.intValue();
            float fDpToPx = UtilsKt.dpToPx(v(), 1.0f);
            this.f60031r.setShadowLayer(UtilsKt.dpToPx(v(), 1.0f), fDpToPx, fDpToPx, iIntValue);
        }
        this.f60031r.setIncludeFontPadding(false);
        t().b(this);
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View x() {
        return this.f60031r;
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.label.a$a, reason: collision with other inner class name */
    public static final class C0516a {
        private C0516a() {
        }

        public /* synthetic */ C0516a(i iVar) {
            this();
        }
    }
}
