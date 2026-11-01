package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDataTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivDataTemplate implements JSONSerializable, JsonTemplate<DivData> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f46956h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<DivTransitionSelector> f46957i = Expression.Companion.constant$default(Expression.Companion, DivTransitionSelector.NONE, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivDataTemplate> f46958j = new bk.p<ParsingEnvironment, JSONObject, DivDataTemplate>() { // from class: com.yandex.div2.DivDataTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDataTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivDataTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<List<DivFunctionTemplate>> f46959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<String> f46960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<List<StateTemplate>> f46961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivTimerTemplate>> f46962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivTransitionSelector>> f46963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<List<DivTriggerTemplate>> f46964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<List<DivVariableTemplate>> f46965g;

    /* JADX INFO: compiled from: DivDataTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivDataTemplate(Field<List<DivFunctionTemplate>> field, Field<String> field2, Field<List<StateTemplate>> field3, Field<List<DivTimerTemplate>> field4, Field<Expression<DivTransitionSelector>> field5, Field<List<DivTriggerTemplate>> field6, Field<List<DivVariableTemplate>> field7) {
        this.f46959a = field;
        this.f46960b = field2;
        this.f46961c = field3;
        this.f46962d = field4;
        this.f46963e = field5;
        this.f46964f = field6;
        this.f46965g = field7;
    }

    /* JADX INFO: compiled from: DivDataTemplate.kt */
    public static final class StateTemplate implements JSONSerializable, JsonTemplate<DivData.State> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f46966c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, StateTemplate> f46967d = new bk.p<ParsingEnvironment, JSONObject, StateTemplate>() { // from class: com.yandex.div2.DivDataTemplate$StateTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivDataTemplate.StateTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivDataTemplate.StateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<DivTemplate> f46968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Long> f46969b;

        /* JADX INFO: compiled from: DivDataTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public StateTemplate(Field<DivTemplate> field, Field<Long> field2) {
            this.f46968a = field;
            this.f46969b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().H2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : stateTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().F2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivDataTemplate(ParsingEnvironment parsingEnvironment, DivDataTemplate divDataTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divDataTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivDataTemplate(ParsingEnvironment parsingEnvironment, DivDataTemplate divDataTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
