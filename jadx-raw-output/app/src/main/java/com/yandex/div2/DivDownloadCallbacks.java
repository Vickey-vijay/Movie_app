package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDownloadCallbacks.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivDownloadCallbacks implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47031d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDownloadCallbacks> f47032e = new bk.p<ParsingEnvironment, JSONObject, DivDownloadCallbacks>() { // from class: com.yandex.div2.DivDownloadCallbacks$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDownloadCallbacks mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivDownloadCallbacks.f47031d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DivAction> f47033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<DivAction> f47034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f47035c;

    /* JADX WARN: Multi-variable type inference failed */
    public DivDownloadCallbacks() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DivDownloadCallbacks(List<DivAction> list, List<DivAction> list2) {
        this.f47033a = list;
        this.f47034b = list2;
    }

    public final boolean a(DivDownloadCallbacks divDownloadCallbacks, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        if (divDownloadCallbacks == null) {
            return false;
        }
        List<DivAction> list = this.f47033a;
        if (list != null) {
            List<DivAction> list2 = divDownloadCallbacks.f47033a;
            if (list2 == null) {
                return false;
            }
            if (list.size() == list2.size()) {
                Iterator<T> it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divDownloadCallbacks.f47033a == null;
        }
        if (!z10) {
            return false;
        }
        List<DivAction> list3 = this.f47034b;
        List<DivAction> list4 = divDownloadCallbacks.f47034b;
        if (list3 == null) {
            z11 = list4 == null;
        } else {
            if (list4 == null) {
                return false;
            }
            if (list3.size() == list4.size()) {
                Iterator<T> it2 = list3.iterator();
                int i12 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            nj.s.u();
                        }
                        if (((DivAction) next2).a(list4.get(i12), expressionResolver, expressionResolver2)) {
                            i12 = i13;
                        }
                    }
                }
            }
        }
        return z11;
    }

    /* JADX INFO: compiled from: DivDownloadCallbacks.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivDownloadCallbacks a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().S2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f47035c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivDownloadCallbacks.class).hashCode();
        List<DivAction> list = this.f47033a;
        int iHash2 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        List<DivAction> list2 = this.f47034b;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        }
        int i11 = i10 + iHash2;
        this.f47035c = Integer.valueOf(i11);
        return i11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivDownloadCallbacks(List list, List list2, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }
}
