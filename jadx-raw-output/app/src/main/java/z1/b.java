package z1;

import androidx.annotation.RestrictTo;
import ck.p;
import com.facebook.appevents.ml.ModelManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import nj.q0;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\nB\u001d\b\u0002\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020$¢\u0006\u0004\b&\u0010'J-\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006)"}, d2 = {"Lz1/b;", "", "Lz1/a;", "dense", "", "", "texts", "task", "b", "(Lz1/a;[Ljava/lang/String;Ljava/lang/String;)Lz1/a;", "a", "Lz1/a;", "embedding", "convs0Weight", "c", "convs1Weight", "d", "convs2Weight", "e", "convs0Bias", InneractiveMediationDefs.GENDER_FEMALE, "convs1Bias", "g", "convs2Bias", "h", "fc1Weight", "i", "fc2Weight", "j", "fc1Bias", CampaignEx.JSON_KEY_AD_K, "fc2Bias", "", "l", "Ljava/util/Map;", "finalWeights", "", "weights", "<init>", "(Ljava/util/Map;)V", InneractiveMediationDefs.GENDER_MALE, "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Map<String, String> f85877n = kotlin.collections.a.l(mj.h.a("embedding.weight", "embed.weight"), mj.h.a("dense1.weight", "fc1.weight"), mj.h.a("dense2.weight", "fc2.weight"), mj.h.a("dense3.weight", "fc3.weight"), mj.h.a("dense1.bias", "fc1.bias"), mj.h.a("dense2.bias", "fc2.bias"), mj.h.a("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final a embedding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final a convs0Weight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final a convs1Weight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final a convs2Weight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final a convs0Bias;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final a convs1Bias;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final a convs2Bias;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final a fc1Weight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final a fc2Weight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final a fc1Bias;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final a fc2Bias;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Map<String, a> finalWeights;

    /* JADX INFO: renamed from: z1.b$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Model.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lz1/b$a;", "", "Ljava/io/File;", C3426d4.i.f28530b, "Lz1/b;", "a", "", "", "Lz1/a;", "b", "", "SEQ_LEN", "I", "mapping", "Ljava/util/Map;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final b a(File file) {
            p.j(file, C3426d4.i.f28530b);
            Map<String, a> mapB = b(file);
            ck.i iVar = null;
            if (mapB == null) {
                return null;
            }
            try {
                return new b(mapB, iVar);
            } catch (Exception unused) {
                return null;
            }
        }

        public final Map<String, a> b(File file) {
            Map<String, a> mapC = i.c(file);
            if (mapC == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapA = b.a();
            for (Map.Entry<String, a> entry : mapC.entrySet()) {
                String key = entry.getKey();
                if (mapA.containsKey(entry.getKey()) && (key = (String) mapA.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(key, entry.getValue());
            }
            return map;
        }
    }

    public b(Map<String, a> map) {
        a aVar = map.get("embed.weight");
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.embedding = aVar;
        h hVar = h.f85893a;
        a aVar2 = map.get("convs.0.weight");
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs0Weight = h.l(aVar2);
        a aVar3 = map.get("convs.1.weight");
        if (aVar3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs1Weight = h.l(aVar3);
        a aVar4 = map.get("convs.2.weight");
        if (aVar4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs2Weight = h.l(aVar4);
        a aVar5 = map.get("convs.0.bias");
        if (aVar5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs0Bias = aVar5;
        a aVar6 = map.get("convs.1.bias");
        if (aVar6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs1Bias = aVar6;
        a aVar7 = map.get("convs.2.bias");
        if (aVar7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.convs2Bias = aVar7;
        a aVar8 = map.get("fc1.weight");
        if (aVar8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.fc1Weight = h.k(aVar8);
        a aVar9 = map.get("fc2.weight");
        if (aVar9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.fc2Weight = h.k(aVar9);
        a aVar10 = map.get("fc1.bias");
        if (aVar10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.fc1Bias = aVar10;
        a aVar11 = map.get("fc2.bias");
        if (aVar11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.fc2Bias = aVar11;
        this.finalWeights = new HashMap();
        for (String str : q0.j(ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey())) {
            String strS = p.s(str, ".weight");
            String strS2 = p.s(str, ".bias");
            a aVar12 = map.get(strS);
            a aVar13 = map.get(strS2);
            if (aVar12 != null) {
                this.finalWeights.put(strS, h.k(aVar12));
            }
            if (aVar13 != null) {
                this.finalWeights.put(strS2, aVar13);
            }
        }
    }

    public /* synthetic */ b(Map map, ck.i iVar) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (i2.a.d(b.class)) {
            return null;
        }
        try {
            return f85877n;
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
            return null;
        }
    }

    public final a b(a dense, String[] texts, String task) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            p.j(dense, "dense");
            p.j(texts, "texts");
            p.j(task, "task");
            h hVar = h.f85893a;
            a aVarC = h.c(h.e(texts, 128, this.embedding), this.convs0Weight);
            h.a(aVarC, this.convs0Bias);
            h.i(aVarC);
            a aVarC2 = h.c(aVarC, this.convs1Weight);
            h.a(aVarC2, this.convs1Bias);
            h.i(aVarC2);
            a aVarG = h.g(aVarC2, 2);
            a aVarC3 = h.c(aVarG, this.convs2Weight);
            h.a(aVarC3, this.convs2Bias);
            h.i(aVarC3);
            a aVarG2 = h.g(aVarC, aVarC.b(1));
            a aVarG3 = h.g(aVarG, aVarG.b(1));
            a aVarG4 = h.g(aVarC3, aVarC3.b(1));
            h.f(aVarG2, 1);
            h.f(aVarG3, 1);
            h.f(aVarG4, 1);
            a aVarD = h.d(h.b(new a[]{aVarG2, aVarG3, aVarG4, dense}), this.fc1Weight, this.fc1Bias);
            h.i(aVarD);
            a aVarD2 = h.d(aVarD, this.fc2Weight, this.fc2Bias);
            h.i(aVarD2);
            a aVar = this.finalWeights.get(p.s(task, ".weight"));
            a aVar2 = this.finalWeights.get(p.s(task, ".bias"));
            if (aVar != null && aVar2 != null) {
                a aVarD3 = h.d(aVarD2, aVar, aVar2);
                h.j(aVarD3);
                return aVarD3;
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }
}
