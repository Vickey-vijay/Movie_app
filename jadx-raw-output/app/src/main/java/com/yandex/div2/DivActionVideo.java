package com.yandex.div2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionVideo.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionVideo implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46412d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionVideo> f46413e = new bk.p<ParsingEnvironment, JSONObject, DivActionVideo>() { // from class: com.yandex.div2.DivActionVideo$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionVideo mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionVideo.f46412d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Action> f46414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f46415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f46416c;

    /* JADX INFO: compiled from: DivActionVideo.kt */
    public enum Action {
        START("start"),
        PAUSE(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Action, String> TO_STRING = new bk.l<Action, String>() { // from class: com.yandex.div2.DivActionVideo$Action$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivActionVideo.Action action) {
                return DivActionVideo.Action.Converter.b(action);
            }
        };
        public static final bk.l<String, Action> FROM_STRING = new bk.l<String, Action>() { // from class: com.yandex.div2.DivActionVideo$Action$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivActionVideo.Action invoke(String str) {
                return DivActionVideo.Action.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivActionVideo.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Action a(String str) {
                Action action = Action.START;
                if (ck.p.e(str, action.value)) {
                    return action;
                }
                Action action2 = Action.PAUSE;
                if (ck.p.e(str, action2.value)) {
                    return action2;
                }
                return null;
            }

            public final String b(Action action) {
                return action.value;
            }
        }

        Action(String str) {
            this.value = str;
        }
    }

    public final boolean a(DivActionVideo divActionVideo, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionVideo != null && this.f46414a.evaluate(expressionResolver) == divActionVideo.f46414a.evaluate(expressionResolver2) && ck.p.e(this.f46415b.evaluate(expressionResolver), divActionVideo.f46415b.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DivActionVideo.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionVideo a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().n1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46416c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionVideo.class).hashCode() + this.f46414a.hashCode() + this.f46415b.hashCode();
        this.f46416c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionVideo(Expression<Action> expression, Expression<String> expression2) {
        this.f46414a = expression;
        this.f46415b = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
