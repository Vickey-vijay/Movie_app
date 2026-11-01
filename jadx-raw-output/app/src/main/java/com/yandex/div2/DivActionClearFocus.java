package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionClearFocus.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionClearFocus implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46116b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionClearFocus> f46117c = new bk.p<ParsingEnvironment, JSONObject, DivActionClearFocus>() { // from class: com.yandex.div2.DivActionClearFocus$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionClearFocus mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionClearFocus.f46116b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f46118a;

    public final boolean a(DivActionClearFocus divActionClearFocus, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionClearFocus != null;
    }

    /* JADX INFO: compiled from: DivActionClearFocus.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionClearFocus a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Z().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46118a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionClearFocus.class).hashCode();
        this.f46118a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Z().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
