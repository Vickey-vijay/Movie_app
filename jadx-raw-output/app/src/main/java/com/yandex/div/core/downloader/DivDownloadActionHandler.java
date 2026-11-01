package com.yandex.div.core.downloader;

import android.net.Uri;
import ck.p;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionDownload;
import com.yandex.div2.DivDownloadCallbacks;
import java.util.List;
import oe.c9;

/* JADX INFO: compiled from: DivDownloadActionHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivDownloadActionHandler {
    public static final DivDownloadActionHandler INSTANCE = new DivDownloadActionHandler();

    private DivDownloadActionHandler() {
    }

    public static final boolean canHandle(Uri uri, DivViewFacade divViewFacade) {
        String authority;
        if (uri == null || (authority = uri.getAuthority()) == null || !p.e(NativeAdPresenter.DOWNLOAD, authority)) {
            return false;
        }
        if (uri.getQueryParameter("url") == null) {
            Assert.fail("url param is required!");
            return false;
        }
        if (divViewFacade instanceof Div2View) {
            return true;
        }
        Assert.fail("Div2View should be used!");
        return false;
    }

    public static final boolean handleAction(DivAction divAction, Div2View div2View, ExpressionResolver expressionResolver) {
        Uri uriEvaluate;
        Expression<Uri> expression = divAction.f46040k;
        if (expression == null || (uriEvaluate = expression.evaluate(expressionResolver)) == null) {
            return false;
        }
        return INSTANCE.handleAction(uriEvaluate, divAction.f46030a, div2View, expressionResolver);
    }

    private final boolean executeDownload(String str, final List<DivAction> list, final List<DivAction> list2, final Div2View div2View, final ExpressionResolver expressionResolver) {
        div2View.addLoadReference(div2View.getDiv2Component$div_release().getDivDownloader().downloadPatch(div2View, str, new DivPatchDownloadCallback() { // from class: com.yandex.div.core.downloader.DivDownloadActionHandler$executeDownload$callback$1
        }), div2View);
        return true;
    }

    public static final boolean handleVisibilityAction(c9 c9Var, Div2View div2View, ExpressionResolver expressionResolver) {
        Uri uriEvaluate;
        Expression<Uri> url = c9Var.getUrl();
        if (url != null && (uriEvaluate = url.evaluate(expressionResolver)) != null) {
            return INSTANCE.handleAction(uriEvaluate, c9Var.a(), div2View, expressionResolver);
        }
        return false;
    }

    public final boolean handleAction(DivActionDownload divActionDownload, DivDownloadCallbacks divDownloadCallbacks, Div2View div2View, ExpressionResolver expressionResolver) {
        List<DivAction> list;
        List<DivAction> list2;
        Uri uriEvaluate = divActionDownload.f46152c.evaluate(expressionResolver);
        List<DivAction> list3 = divActionDownload.f46150a;
        if (list3 != null) {
            list = list3;
        } else if (divDownloadCallbacks != null) {
            list3 = divDownloadCallbacks.f47033a;
            list = list3;
        } else {
            list = null;
        }
        List<DivAction> list4 = divActionDownload.f46151b;
        if (list4 == null) {
            list2 = divDownloadCallbacks != null ? divDownloadCallbacks.f47034b : null;
        } else {
            list2 = list4;
        }
        return executeDownload(uriEvaluate.toString(), list2, list, div2View, expressionResolver);
    }

    private final boolean handleAction(Uri uri, DivDownloadCallbacks divDownloadCallbacks, Div2View div2View, ExpressionResolver expressionResolver) {
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null) {
            return false;
        }
        return executeDownload(queryParameter, divDownloadCallbacks != null ? divDownloadCallbacks.f47034b : null, divDownloadCallbacks != null ? divDownloadCallbacks.f47033a : null, div2View, expressionResolver);
    }
}
