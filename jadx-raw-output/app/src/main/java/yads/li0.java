package yads;

import com.yandex.div.DivDataTag;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div2.DivData;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class li0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f79791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh0 f79792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jh0 f79793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ii0 f79794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hn f79795e;

    public /* synthetic */ li0(io2 io2Var) {
        this(io2Var, new hh0(io2Var), new jh0(), new ii0(), new hn());
    }

    public final gi0 a(xf0 xf0Var, boolean z10) {
        DivData divDataA;
        eg0[] eg0VarArr = eg0.f77061b;
        if (ck.p.e("divkit", xf0Var.f84571a)) {
            try {
                String str = xf0Var.f84572b;
                String strA = xf0Var.f84573c;
                if (z10) {
                    this.f79795e.getClass();
                    strA = hn.a(strA);
                }
                JSONObject jSONObject = new JSONObject(strA);
                JSONObject jSONObject2 = jSONObject.getJSONObject("card");
                JSONObject jSONObject3 = jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null;
                List list = xf0Var.f84574d;
                hh0 hh0Var = this.f79792b;
                hh0Var.getClass();
                try {
                    si0 si0Var = hh0Var.f78233b;
                    ParsingErrorLogger parsingErrorLogger = ParsingErrorLogger.LOG;
                    si0Var.getClass();
                    DivParsingEnvironment divParsingEnvironment = new DivParsingEnvironment(parsingErrorLogger, null, 2, null);
                    if (jSONObject3 != null) {
                        divParsingEnvironment.parseTemplates(jSONObject3);
                    }
                    hh0Var.f78234c.getClass();
                    divDataA = DivData.f46932j.a(divParsingEnvironment, jSONObject2);
                } catch (Throwable th2) {
                    hh0Var.f78232a.reportError("Failed to create DivData", th2);
                    divDataA = null;
                }
                this.f79793c.getClass();
                DivDataTag divDataTag = new DivDataTag(UUID.randomUUID().toString());
                Set setA = this.f79794d.a(jSONObject2);
                if (divDataA != null) {
                    return new gi0(str, jSONObject2, jSONObject3, list, divDataA, divDataTag, setA, new yf0(xf0Var.f84575e));
                }
            } catch (Throwable th3) {
                this.f79791a.reportError("Failed to parse DivKit design", th3);
            }
        }
        return null;
    }

    public li0(io2 io2Var, hh0 hh0Var, jh0 jh0Var, ii0 ii0Var, hn hnVar) {
        this.f79791a = io2Var;
        this.f79792b = hh0Var;
        this.f79793c = jh0Var;
        this.f79794d = ii0Var;
        this.f79795e = hnVar;
    }
}
