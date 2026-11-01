package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunction.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivFunction implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47233f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFunction> f47234g = new bk.p<ParsingEnvironment, JSONObject, DivFunction>() { // from class: com.yandex.div2.DivFunction$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFunction mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivFunction.f47233f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DivFunctionArgument> f47235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DivEvaluableType f47238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f47239e;

    public final boolean a(DivFunction divFunction, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divFunction == null) {
            return false;
        }
        List<DivFunctionArgument> list = this.f47235a;
        List<DivFunctionArgument> list2 = divFunction.f47235a;
        if (list.size() == list2.size()) {
            Iterator<T> it = list.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    nj.s.u();
                }
                if (!((DivFunctionArgument) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                    z10 = false;
                    break;
                }
                i10 = i11;
            }
        } else {
            z10 = false;
            break;
        }
        return z10 && ck.p.e(this.f47236b, divFunction.f47236b) && ck.p.e(this.f47237c, divFunction.f47237c) && this.f47238d == divFunction.f47238d;
    }

    /* JADX INFO: compiled from: DivFunction.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivFunction a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().I3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47239e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivFunction.class).hashCode();
        int iHash = 0;
        Iterator<T> it = this.f47235a.iterator();
        while (it.hasNext()) {
            iHash += ((DivFunctionArgument) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash + this.f47236b.hashCode() + this.f47237c.hashCode() + this.f47238d.hashCode();
        this.f47239e = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    public DivFunction(List<DivFunctionArgument> list, String str, String str2, DivEvaluableType divEvaluableType) {
        this.f47235a = list;
        this.f47236b = str;
        this.f47237c = str2;
        this.f47238d = divEvaluableType;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
