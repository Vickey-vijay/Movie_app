package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskBase.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTextRangeMaskBase implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49660c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression<Boolean> f49661d = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskBase> f49662e = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskBase>() { // from class: com.yandex.div2.DivTextRangeMaskBase$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMaskBase mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTextRangeMaskBase.f49660c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Boolean> f49663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f49664b;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTextRangeMaskBase() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DivTextRangeMaskBase(Expression<Boolean> expression) {
        this.f49663a = expression;
    }

    /* JADX INFO: compiled from: DivTextRangeMaskBase.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTextRangeMaskBase a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().B8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49664b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivTextRangeMaskBase.class).hashCode() + this.f49663a.hashCode();
        this.f49664b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public /* synthetic */ DivTextRangeMaskBase(Expression expression, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? f49661d : expression);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
