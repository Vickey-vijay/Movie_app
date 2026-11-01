package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDownload.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionDownload implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46148e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionDownload> f46149f = new bk.p<ParsingEnvironment, JSONObject, DivActionDownload>() { // from class: com.yandex.div2.DivActionDownload$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionDownload mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionDownload.f46148e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DivAction> f46150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<DivAction> f46151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<Uri> f46152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f46153d;

    public final boolean a(DivActionDownload divActionDownload, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        if (divActionDownload == null) {
            return false;
        }
        List<DivAction> list = this.f46150a;
        if (list != null) {
            List<DivAction> list2 = divActionDownload.f46150a;
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
            z10 = divActionDownload.f46150a == null;
        }
        if (!z10) {
            return false;
        }
        List<DivAction> list3 = this.f46151b;
        if (list3 != null) {
            List<DivAction> list4 = divActionDownload.f46151b;
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
        } else {
            z11 = divActionDownload.f46151b == null;
        }
        return z11 && ck.p.e(this.f46152c.evaluate(expressionResolver), divActionDownload.f46152c.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DivActionDownload.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionDownload a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().l0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f46153d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionDownload.class).hashCode();
        List<DivAction> list = this.f46150a;
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
        List<DivAction> list2 = this.f46151b;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                iHash2 += ((DivAction) it2.next()).hash();
            }
        }
        int iHashCode2 = i10 + iHash2 + this.f46152c.hashCode();
        this.f46153d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    public DivActionDownload(List<DivAction> list, List<DivAction> list2, Expression<Uri> expression) {
        this.f46150a = list;
        this.f46151b = list2;
        this.f46152c = expression;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().l0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
