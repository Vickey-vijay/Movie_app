package io.bidmachine.rendering.internal.adform.html;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ck.i;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.IabSettings;
import io.bidmachine.iab.mraid.MraidAdView;
import io.bidmachine.iab.mraid.MraidPlacementType;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.measurer.HtmlMeasurer;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.HtmlResourceSource;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.Resource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.UrlResourceSource;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Utils;
import java.util.List;
import lk.a0;
import mj.r;
import nj.b0;
import nj.s;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f60020t = new b(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final HtmlMeasurer f60021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MraidAdView f60022s;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.html.a$a, reason: collision with other inner class name */
    public final class C0514a implements io.bidmachine.rendering.internal.repository.a.InterfaceC0533a {
        public C0514a() {
        }

        @Override // io.bidmachine.rendering.internal.repository.a.InterfaceC0533a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            p.j(str, "result");
            a.this.c(str);
        }

        @Override // io.bidmachine.rendering.internal.repository.a.InterfaceC0533a
        public void onError(Error error) {
            p.j(error, "error");
            a.this.a(error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, c cVar, io.bidmachine.rendering.internal.event.b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2, HtmlMeasurer htmlMeasurer) {
        super(context, aVar, adElementParams, cVar, bVar, aVar2);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(aVar, "repository");
        p.j(adElementParams, "adElementParams");
        p.j(cVar, "adFormListener");
        p.j(bVar, "eventCallback");
        this.f60021r = htmlMeasurer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar) {
        p.j(aVar, "this$0");
        aVar.E();
    }

    private final void d(String str) {
        MediaSource mediaSourceFromUrl = MediaSource.INSTANCE.fromUrl(str);
        if (mediaSourceFromUrl != null) {
            w().a(mediaSourceFromUrl, new C0514a());
            return;
        }
        a(new Error("Invalid adm url (" + str + ')'));
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void B() {
        super.B();
        HtmlMeasurer htmlMeasurer = this.f60021r;
        if (htmlMeasurer != null) {
            htmlMeasurer.onShown();
        }
    }

    public final void E() {
        UiUtils.onUiThread(new n() { // from class: wh.e
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.html.a.a(this.f74128b);
            }
        });
    }

    public final List F() {
        try {
            String customParam = h().getCustomParam("features");
            if (customParam != null && customParam.length() > 0) {
                List listR0 = b0.R0(a0.N0(customParam, new String[]{StringUtils.COMMA}, false, 0, 6, null));
                int size = listR0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = (String) listR0.get(i10);
                    int length = str.length() - 1;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length) {
                        boolean z11 = p.l(str.charAt(!z10 ? i11 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    }
                    listR0.set(i10, str.subSequence(i11, length + 1).toString());
                }
                return listR0;
            }
        } catch (Exception unused) {
        }
        return s.k();
    }

    public final String G() {
        if (!h().getCustomParams().containsKey("base_url")) {
            return IabSettings.DEF_BASE_URL;
        }
        String customParam = h().getCustomParam("base_url");
        if (Utils.isUrlValid(customParam)) {
            return customParam;
        }
        return null;
    }

    public final MraidPlacementType H() {
        String customParam = h().getCustomParam("placement_type");
        if (p.e(customParam, Constants.TEMPLATE_TYPE_FULLSCREEN)) {
            return MraidPlacementType.INTERSTITIAL;
        }
        if (p.e(customParam, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
            return MraidPlacementType.INLINE;
        }
        return null;
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void c() {
        String source;
        Resource resource = h().getResource();
        ResourceSource source2 = resource != null ? resource.getSource() : null;
        if (source2 == null) {
            source = h().getSource();
        } else {
            if (!(source2 instanceof HtmlResourceSource)) {
                if (source2 instanceof UrlResourceSource) {
                    d(((UrlResourceSource) source2).getUrl());
                    return;
                }
                a(new Error("Invalid resource type (" + source2.getClass().getSimpleName() + "), it should be HtmlResourceSource or UrlResourceSource"));
                return;
            }
            source = ((HtmlResourceSource) source2).getCom.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo.al java.lang.String();
        }
        c(source);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void o() {
        r rVar;
        MraidAdView mraidAdView = this.f60022s;
        if (mraidAdView != null) {
            mraidAdView.handleRedirectView();
            rVar = r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            super.o();
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View x() {
        return this.f60022s;
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void z() {
        r rVar;
        HtmlMeasurer htmlMeasurer = this.f60021r;
        if (htmlMeasurer != null) {
            htmlMeasurer.destroy(new n() { // from class: wh.a
                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    io.bidmachine.rendering.internal.adform.html.a.b(this.f74120b);
                }
            });
            rVar = r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            E();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar) {
        p.j(aVar, "this$0");
        MraidAdView mraidAdView = aVar.f60022s;
        if (mraidAdView != null) {
            mraidAdView.destroy();
        }
        aVar.f60022s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(final String str) {
        String strPrepareCreativeForMeasure;
        if (str == null || str.length() == 0) {
            a(new Error("Adm is null or empty"));
            return;
        }
        HtmlMeasurer htmlMeasurer = this.f60021r;
        if (htmlMeasurer != null && (strPrepareCreativeForMeasure = htmlMeasurer.prepareCreativeForMeasure(str)) != null) {
            str = strPrepareCreativeForMeasure;
        }
        p.i(str, "htmlMeasurer?.prepareCre…iveForMeasure(adm) ?: adm");
        final MraidPlacementType mraidPlacementTypeH = H();
        final String strG = G();
        UiUtils.onUiThread(new Runnable() { // from class: wh.c
            @Override // java.lang.Runnable
            public final void run() {
                io.bidmachine.rendering.internal.adform.html.a.a(this.f74123b, mraidPlacementTypeH, strG, str);
            }
        });
    }

    public final void b(Error error) {
        p.j(error, "error");
        HtmlMeasurer htmlMeasurer = this.f60021r;
        if (htmlMeasurer != null) {
            htmlMeasurer.onError(error);
        }
        t().a(this, error);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void d() {
        UiUtils.onUiThread(new n() { // from class: wh.d
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.html.a.c(this.f74127b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, MraidPlacementType mraidPlacementType, String str, String str2) {
        p.j(aVar, "this$0");
        p.j(str2, "$preparedSource");
        try {
            Context contextV = aVar.v();
            List listF = aVar.F();
            c cVarT = aVar.t();
            io.bidmachine.rendering.internal.event.b bVarQ = aVar.q();
            p.i(bVarQ, "eventCallback");
            MraidAdView mraidAdView = new MraidAdView(contextV, mraidPlacementType, str, null, listF, null, new io.bidmachine.rendering.internal.adform.html.b(aVar, cVarT, bVarQ, aVar.f60021r));
            mraidAdView.load(str2);
            HtmlMeasurer htmlMeasurer = aVar.f60021r;
            if (htmlMeasurer != null) {
                htmlMeasurer.onViewCreated(mraidAdView.getWebView());
            }
            aVar.f60022s = mraidAdView;
        } catch (Throwable th2) {
            o.b(th2);
            aVar.a(Error.INSTANCE.create(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar) {
        p.j(aVar, "this$0");
        MraidAdView mraidAdView = aVar.f60022s;
        if (mraidAdView != null) {
            mraidAdView.show();
            aVar.B();
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void a(final ViewGroup viewGroup) {
        p.j(viewGroup, "viewGroup");
        UiUtils.onUiThread(new n() { // from class: wh.b
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.adform.html.a.a(this.f74121b, viewGroup);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, ViewGroup viewGroup) {
        p.j(aVar, "this$0");
        p.j(viewGroup, "$viewGroup");
        MraidAdView mraidAdView = aVar.f60022s;
        HtmlMeasurer htmlMeasurer = aVar.f60021r;
        if (htmlMeasurer == null || mraidAdView == null) {
            return;
        }
        htmlMeasurer.onViewAddedToContainer(mraidAdView.getWebView(), viewGroup);
    }

    public final void a(Error error) {
        p.j(error, "error");
        HtmlMeasurer htmlMeasurer = this.f60021r;
        if (htmlMeasurer != null) {
            htmlMeasurer.onError(error);
        }
        t().c(this, error);
    }
}
