package r1;

import androidx.annotation.RestrictTo;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import lk.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: MetadataRule.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0003B'\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8F¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lr1/d;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "name", "b", "d", "valRule", "", "Ljava/util/List;", "()Ljava/util/List;", "keyRules", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<d> f66644e = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String valRule;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final List<String> keyRules;

    /* JADX INFO: renamed from: r1.d$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MetadataRule.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lr1/d$a;", "", "", "Lr1/d;", "c", "", "rulesFromServer", "Lmj/r;", "d", "b", "Lorg/json/JSONObject;", "jsonObject", "a", "FIELD_K", "Ljava/lang/String;", "FIELD_K_DELIMITER", "FIELD_V", "", "rules", "Ljava/util/Set;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Set<String> b() {
            HashSet hashSet = new HashSet();
            Iterator it = d.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((d) it.next()).c());
            }
            return hashSet;
        }

        public final Set<d> c() {
            return new HashSet(d.a());
        }

        public final void d(String str) {
            p.j(str, "rulesFromServer");
            try {
                d.a().clear();
                a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }

        public final void a(JSONObject jSONObject) {
            boolean z10;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(CampaignEx.JSON_KEY_AD_K);
                    String strOptString2 = jSONObjectOptJSONObject.optString("v");
                    p.i(strOptString, CampaignEx.JSON_KEY_AD_K);
                    if (strOptString.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        Set setA = d.a();
                        p.i(next, C3426d4.i.W);
                        List listN0 = a0.N0(strOptString, new String[]{StringUtils.COMMA}, false, 0, 6, null);
                        p.i(strOptString2, "v");
                        setA.add(new d(next, listN0, strOptString2, null));
                    }
                }
            }
        }
    }

    public d(String str, List<String> list, String str2) {
        this.name = str;
        this.valRule = str2;
        this.keyRules = list;
    }

    public /* synthetic */ d(String str, List list, String str2, i iVar) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        if (i2.a.d(d.class)) {
            return null;
        }
        try {
            return f66644e;
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return null;
        }
    }

    public final List<String> b() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.keyRules);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final String c() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            return this.name;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final String d() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            return this.valRule;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }
}
