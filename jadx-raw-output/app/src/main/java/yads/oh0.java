package yads;

import android.content.Context;
import android.net.Uri;
import com.ironsource.C3426d4;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class oh0 extends DivActionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kz f81038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ph0 f81039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zh0 f81040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qi0 f81041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pi0 f81042e;

    public /* synthetic */ oh0(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var, kz kzVar, ph0 ph0Var, zh0 zh0Var) {
        this(kzVar, ph0Var, zh0Var, new qi0(new dd2(context, d4Var, lu2Var, k83.f79332d)), new pi0(v9Var, ((iu3) lu2Var).a()));
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (super.handleAction(divAction, divViewFacade, expressionResolver)) {
            return true;
        }
        Expression<Uri> expression = divAction.f46040k;
        return expression != null && a(divAction.f46035f, expression.evaluate(expressionResolver), divViewFacade);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    public final boolean a(JSONObject jSONObject, Uri uri, DivViewFacade divViewFacade) {
        Map map;
        if (ck.p.e(uri.getScheme(), "mobileads")) {
            String host = uri.getHost();
            if (host != null) {
                int iHashCode = host.hashCode();
                if (iHashCode != 94750088) {
                    if (iHashCode != 866535483) {
                        if (iHashCode != 986975867) {
                            if (iHashCode == 1270469668 && host.equals("trackUrl")) {
                                qi0 qi0Var = this.f81041d;
                                qi0Var.getClass();
                                String queryParameter = uri.getQueryParameter("trackingUrl");
                                if (queryParameter == null || queryParameter.length() <= 0) {
                                    return true;
                                }
                                qi0Var.f81860a.a(queryParameter, kotlin.collections.a.j());
                                return true;
                            }
                        } else if (host.equals("trackAnalytics")) {
                            pi0 pi0Var = this.f81042e;
                            pi0Var.getClass();
                            String queryParameter2 = uri.getQueryParameter(C3426d4.i.f28547j0);
                            if (queryParameter2 == null) {
                                return true;
                            }
                            if (queryParameter2.length() == 0) {
                                queryParameter2 = null;
                            }
                            if (queryParameter2 == null) {
                                return true;
                            }
                            if (jSONObject != null) {
                                pi0Var.f81418c.getClass();
                                map = kotlin.collections.a.B(ee1.a(jSONObject));
                                if (map == null) {
                                    map = new HashMap();
                                }
                            } else {
                                map = new HashMap();
                            }
                            pi0Var.f81417b.a(new eo2(queryParameter2, map, pi0Var.f81416a.f83817i));
                            return true;
                        }
                    } else if (host.equals("closeAd")) {
                        this.f81038a.e();
                        return true;
                    }
                } else if (host.equals("click")) {
                    this.f81040c.a(uri, divViewFacade.getView());
                    return true;
                }
            }
            return this.f81039b.a(uri);
        }
        return false;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(oe.c9 c9Var, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (super.handleAction(c9Var, divViewFacade, expressionResolver)) {
            return true;
        }
        Expression<Uri> url = c9Var.getUrl();
        return url != null && a(c9Var.getPayload(), url.evaluate(expressionResolver), divViewFacade);
    }

    public oh0(kz kzVar, ph0 ph0Var, zh0 zh0Var, qi0 qi0Var, pi0 pi0Var) {
        this.f81038a = kzVar;
        this.f81039b = ph0Var;
        this.f81040c = zh0Var;
        this.f81041d = qi0Var;
        this.f81042e = pi0Var;
    }
}
