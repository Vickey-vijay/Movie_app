package com.yandex.div.core.view2.divs;

import android.net.Uri;
import ck.i;
import ck.p;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivAction;
import java.util.LinkedHashMap;
import java.util.Map;
import oe.c9;

/* JADX INFO: compiled from: DivActionBeaconSender.kt */
/* JADX INFO: loaded from: classes6.dex */
public class DivActionBeaconSender {
    private static final Companion Companion = new Companion(null);
    private final boolean isSwipeOutBeaconsEnabled;
    private final boolean isTapBeaconsEnabled;
    private final boolean isVisibilityBeaconsEnabled;
    private final qe.a<ld.b> sendBeaconManagerLazy;

    /* JADX INFO: compiled from: DivActionBeaconSender.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private Map<String, String> toHttpHeaders(DivAction divAction, ExpressionResolver expressionResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression<Uri> expression = divAction.f46036g;
        if (expression != null) {
            linkedHashMap.put("Referer", expression.evaluate(expressionResolver).toString());
        }
        return linkedHashMap;
    }

    private boolean isHttpScheme(String str) {
        return p.e(str, "http") || p.e(str, "https");
    }

    public void sendSwipeOutActionBeacon(DivAction divAction, ExpressionResolver expressionResolver) {
        Uri uriEvaluate;
        Expression<Uri> expression = divAction.f46033d;
        if (expression == null || (uriEvaluate = expression.evaluate(expressionResolver)) == null) {
            return;
        }
        if (!isHttpScheme(uriEvaluate.getScheme())) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uriEvaluate + '\'');
                return;
            }
            return;
        }
        if (this.isSwipeOutBeaconsEnabled) {
            ld.b bVar = this.sendBeaconManagerLazy.get();
            if (bVar != null) {
                bVar.a(uriEvaluate, toHttpHeaders(divAction, expressionResolver), divAction.f46035f);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("SendBeaconManager was not configured");
            }
        }
    }

    public void sendTapActionBeacon(DivAction divAction, ExpressionResolver expressionResolver) {
        Uri uriEvaluate;
        Expression<Uri> expression = divAction.f46033d;
        if (expression == null || (uriEvaluate = expression.evaluate(expressionResolver)) == null) {
            return;
        }
        if (!isHttpScheme(uriEvaluate.getScheme())) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uriEvaluate + '\'');
                return;
            }
            return;
        }
        if (this.isTapBeaconsEnabled) {
            ld.b bVar = this.sendBeaconManagerLazy.get();
            if (bVar != null) {
                bVar.a(uriEvaluate, toHttpHeaders(divAction, expressionResolver), divAction.f46035f);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("SendBeaconManager was not configured");
            }
        }
    }

    public DivActionBeaconSender(qe.a<ld.b> aVar, boolean z10, boolean z11, boolean z12) {
        this.sendBeaconManagerLazy = aVar;
        this.isTapBeaconsEnabled = z10;
        this.isVisibilityBeaconsEnabled = z11;
        this.isSwipeOutBeaconsEnabled = z12;
    }

    public void sendVisibilityActionBeacon(c9 c9Var, ExpressionResolver expressionResolver) {
        Uri uriEvaluate;
        Expression<Uri> url = c9Var.getUrl();
        if (url != null && (uriEvaluate = url.evaluate(expressionResolver)) != null) {
            if (!isHttpScheme(uriEvaluate.getScheme())) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.WARNING)) {
                    kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uriEvaluate + '\'');
                    return;
                }
                return;
            }
            if (this.isVisibilityBeaconsEnabled) {
                ld.b bVar = this.sendBeaconManagerLazy.get();
                if (bVar == null) {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("SendBeaconManager was not configured");
                        return;
                    }
                    return;
                }
                bVar.a(uriEvaluate, toHttpHeaders(c9Var, expressionResolver), c9Var.getPayload());
            }
        }
    }

    private Map<String, String> toHttpHeaders(c9 c9Var, ExpressionResolver expressionResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression<Uri> expressionF = c9Var.f();
        if (expressionF != null) {
            linkedHashMap.put("Referer", expressionF.evaluate(expressionResolver).toString());
        }
        return linkedHashMap;
    }
}
