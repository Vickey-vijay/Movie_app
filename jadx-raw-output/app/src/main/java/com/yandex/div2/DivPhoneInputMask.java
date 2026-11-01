package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import oe.f6;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPhoneInputMask.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivPhoneInputMask implements JSONSerializable, Hashable, f6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48376c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPhoneInputMask> f48377d = new bk.p<ParsingEnvironment, JSONObject, DivPhoneInputMask>() { // from class: com.yandex.div2.DivPhoneInputMask$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPhoneInputMask mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPhoneInputMask.f48376c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f48379b;

    /* JADX INFO: compiled from: DivPhoneInputMask.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPhoneInputMask a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().N5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // oe.f6
    public String a() {
        return this.f48378a;
    }

    public final boolean b(DivPhoneInputMask divPhoneInputMask, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPhoneInputMask == null) {
            return false;
        }
        return ck.p.e(a(), divPhoneInputMask.a());
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f48379b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivPhoneInputMask.class).hashCode() + a().hashCode();
        this.f48379b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivPhoneInputMask(String str) {
        this.f48378a = str;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
