package io.bidmachine.rendering.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.Border;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.ViewUtils;
import io.bidmachine.util.ViewUtilsKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdPhaseParams f60341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f60342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f60343c;

    public d(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdPhaseParams adPhaseParams) {
        z zVarA;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(aVar, "repository");
        ck.p.j(adPhaseParams, "adPhaseParams");
        this.f60341a = adPhaseParams;
        Background background = adPhaseParams.getBackground();
        if (background != null) {
            Context applicationContext = context.getApplicationContext();
            ck.p.i(applicationContext, "context.applicationContext");
            zVarA = a0.a(background, applicationContext, aVar);
        } else {
            zVarA = null;
        }
        this.f60342b = zVarA;
    }

    public final void a(Context context, ViewGroup viewGroup, io.bidmachine.rendering.internal.view.e eVar, List list, c cVar) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(viewGroup, "rootContainer");
        ck.p.j(eVar, "elementsContainer");
        ck.p.j(list, "adElements");
        ck.p.j(cVar, "adElement");
        View viewK = cVar.k();
        if (viewK == null) {
            return;
        }
        ElementLayoutParams elementLayoutParams = cVar.h().getElementLayoutParams();
        int widthPx = elementLayoutParams.getWidthPx(context);
        int heightPx = elementLayoutParams.getHeightPx(context);
        if (widthPx <= 0) {
            widthPx = -1;
        }
        if (heightPx <= 0) {
            heightPx = -1;
        }
        io.bidmachine.rendering.internal.view.e.a aVar = new io.bidmachine.rendering.internal.view.e.a(widthPx, heightPx);
        aVar.a(context, elementLayoutParams, list);
        eVar.addView(viewK, aVar);
        try {
            cVar.a(viewGroup);
        } catch (Throwable th2) {
            o.b(th2);
        }
    }

    public final AdPhaseParams b() {
        return this.f60341a;
    }

    public final ViewGroup c() {
        return this.f60343c;
    }

    public final void a() {
        ViewGroup viewGroup = this.f60343c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ViewUtilsKt.removeFromParent(viewGroup);
        }
        this.f60343c = null;
    }

    public final boolean a(ViewGroup viewGroup, List list, List list2) {
        ck.p.j(viewGroup, "rootContainer");
        ck.p.j(list, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        ck.p.j(list2, "controls");
        Context context = viewGroup.getContext();
        a();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(UiUtils.generateViewId());
        z zVar = this.f60342b;
        if (zVar != null) {
            z.a(zVar, frameLayout, (Integer) null, (Border) null, 6, (Object) null);
        } else {
            ViewUtilsKt.setBackgroundColorSafely(frameLayout, this.f60341a.getBackgroundColor());
        }
        this.f60343c = frameLayout;
        io.bidmachine.rendering.internal.view.e eVar = new io.bidmachine.rendering.internal.view.e(context);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            ck.p.i(context, GAMConfig.KEY_CONTEXT);
            a(context, viewGroup, eVar, list, cVar);
        }
        ViewGroup viewGroup2 = this.f60343c;
        if (viewGroup2 != null) {
            viewGroup2.addView(eVar, ViewUtils.createMatchParentParams());
        }
        io.bidmachine.rendering.internal.view.e eVar2 = new io.bidmachine.rendering.internal.view.e(context);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c cVar2 = (c) it2.next();
            ck.p.i(context, GAMConfig.KEY_CONTEXT);
            a(context, viewGroup, eVar2, list2, cVar2);
        }
        ViewGroup viewGroup3 = this.f60343c;
        if (viewGroup3 != null) {
            viewGroup3.addView(eVar2, ViewUtils.createMatchParentParams());
        }
        viewGroup.addView(this.f60343c, 0, ViewUtils.createMatchParentParams());
        return true;
    }
}
