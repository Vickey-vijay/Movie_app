package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivExtension.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivExtension implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47093d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivExtension> f47094e = new bk.p<ParsingEnvironment, JSONObject, DivExtension>() { // from class: com.yandex.div2.DivExtension$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivExtension mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivExtension.f47093d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f47096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f47097c;

    public final boolean a(DivExtension divExtension, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divExtension != null && ck.p.e(this.f47095a, divExtension.f47095a) && ck.p.e(this.f47096b, divExtension.f47096b);
    }

    /* JADX INFO: compiled from: DivExtension.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivExtension a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().b3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f47097c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivExtension.class).hashCode() + this.f47095a.hashCode();
        JSONObject jSONObject = this.f47096b;
        int iHashCode2 = iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
        this.f47097c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    public DivExtension(String str, JSONObject jSONObject) {
        this.f47095a = str;
        this.f47096b = jSONObject;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
