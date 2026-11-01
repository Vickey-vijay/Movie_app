package com.yandex.div2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTimer.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionTimer implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46339d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionTimer> f46340e = new bk.p<ParsingEnvironment, JSONObject, DivActionTimer>() { // from class: com.yandex.div2.DivActionTimer$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionTimer mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivActionTimer.f46339d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression<Action> f46341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<String> f46342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f46343c;

    /* JADX INFO: compiled from: DivActionTimer.kt */
    public enum Action {
        START("start"),
        STOP("stop"),
        PAUSE(CampaignEx.JSON_NATIVE_VIDEO_PAUSE),
        RESUME(CampaignEx.JSON_NATIVE_VIDEO_RESUME),
        CANCEL("cancel"),
        RESET("reset");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Action, String> TO_STRING = new bk.l<Action, String>() { // from class: com.yandex.div2.DivActionTimer$Action$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivActionTimer.Action action) {
                return DivActionTimer.Action.Converter.b(action);
            }
        };
        public static final bk.l<String, Action> FROM_STRING = new bk.l<String, Action>() { // from class: com.yandex.div2.DivActionTimer$Action$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivActionTimer.Action invoke(String str) {
                return DivActionTimer.Action.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivActionTimer.kt */
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
                Action action2 = Action.STOP;
                if (ck.p.e(str, action2.value)) {
                    return action2;
                }
                Action action3 = Action.PAUSE;
                if (ck.p.e(str, action3.value)) {
                    return action3;
                }
                Action action4 = Action.RESUME;
                if (ck.p.e(str, action4.value)) {
                    return action4;
                }
                Action action5 = Action.CANCEL;
                if (ck.p.e(str, action5.value)) {
                    return action5;
                }
                Action action6 = Action.RESET;
                if (ck.p.e(str, action6.value)) {
                    return action6;
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

    public final boolean a(DivActionTimer divActionTimer, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionTimer != null && this.f46341a.evaluate(expressionResolver) == divActionTimer.f46341a.evaluate(expressionResolver2) && ck.p.e(this.f46342b.evaluate(expressionResolver), divActionTimer.f46342b.evaluate(expressionResolver2));
    }

    /* JADX INFO: compiled from: DivActionTimer.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivActionTimer a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().e1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f46343c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivActionTimer.class).hashCode() + this.f46341a.hashCode() + this.f46342b.hashCode();
        this.f46343c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    public DivActionTimer(Expression<Action> expression, Expression<String> expression2) {
        this.f46341a = expression;
        this.f46342b = expression2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
