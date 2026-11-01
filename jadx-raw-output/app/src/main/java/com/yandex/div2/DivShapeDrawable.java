package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeDrawable.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivShapeDrawable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48786e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivShapeDrawable> f48787f = new bk.p<ParsingEnvironment, JSONObject, DivShapeDrawable>() { // from class: com.yandex.div2.DivShapeDrawable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivShapeDrawable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivShapeDrawable.f48786e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Integer> f48788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DivShape f48789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivStroke f48790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f48791d;

    public final boolean a(DivShapeDrawable divShapeDrawable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        if (divShapeDrawable == null || this.f48788a.evaluate(expressionResolver).intValue() != divShapeDrawable.f48788a.evaluate(expressionResolver2).intValue() || !this.f48789b.a(divShapeDrawable.f48789b, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivStroke divStroke = this.f48790c;
        DivStroke divStroke2 = divShapeDrawable.f48790c;
        if (divStroke != null) {
            zA = divStroke.a(divStroke2, expressionResolver, expressionResolver2);
        } else {
            zA = divStroke2 == null;
        }
        return zA;
    }

    /* JADX INFO: compiled from: DivShapeDrawable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivShapeDrawable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().S6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48791d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivShapeDrawable.class).hashCode() + this.f48788a.hashCode() + this.f48789b.hash();
        DivStroke divStroke = this.f48790c;
        int iHash = iHashCode + (divStroke != null ? divStroke.hash() : 0);
        this.f48791d = Integer.valueOf(iHash);
        return iHash;
    }

    public DivShapeDrawable(Expression<Integer> expression, DivShape divShape, DivStroke divStroke) {
        this.f48788a = expression;
        this.f48789b = divShape;
        this.f48790c = divStroke;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
