package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: PropertyVariable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PropertyVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f50490g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f50491h = "new_value";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, PropertyVariable> f50492i = new bk.p<ParsingEnvironment, JSONObject, PropertyVariable>() { // from class: com.yandex.div2.PropertyVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final PropertyVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return PropertyVariable.f50490g.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<String> f50493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f50496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression<DivEvaluableType> f50497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f50498f;

    public final boolean a(PropertyVariable propertyVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        if (propertyVariable == null || !ck.p.e(this.f50493a.evaluate(expressionResolver), propertyVariable.f50493a.evaluate(expressionResolver2)) || !ck.p.e(this.f50494b, propertyVariable.f50494b) || !ck.p.e(this.f50495c, propertyVariable.f50495c)) {
            return false;
        }
        List<DivAction> list = this.f50496d;
        if (list != null) {
            List<DivAction> list2 = propertyVariable.f50496d;
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
            z10 = propertyVariable.f50496d == null;
        }
        return z10 && this.f50497e.evaluate(expressionResolver) == propertyVariable.f50497e.evaluate(expressionResolver2);
    }

    /* JADX INFO: compiled from: PropertyVariable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final PropertyVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().X9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f50498f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(PropertyVariable.class).hashCode() + this.f50493a.hashCode() + this.f50494b.hashCode() + this.f50495c.hashCode();
        List<DivAction> list = this.f50496d;
        int iHash = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                iHash += ((DivAction) it.next()).hash();
            }
        }
        int iHashCode2 = iHashCode + iHash + this.f50497e.hashCode();
        this.f50498f = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    public PropertyVariable(Expression<String> expression, String str, String str2, List<DivAction> list, Expression<DivEvaluableType> expression2) {
        this.f50493a = expression;
        this.f50494b = str;
        this.f50495c = str2;
        this.f50496d = list;
        this.f50497e = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().X9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
