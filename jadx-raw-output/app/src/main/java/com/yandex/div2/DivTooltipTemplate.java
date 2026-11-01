package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivTooltipTemplate implements JSONSerializable, JsonTemplate<DivTooltip> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f49879l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<Boolean> f49880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<Long> f49881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final DivTooltipMode.b f49882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTooltipTemplate> f49883p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivAnimationTemplate> f49884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivAnimationTemplate> f49885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<String>> f49886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<DivTemplate> f49888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<Long>> f49889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<String> f49890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<DivTooltipModeTemplate> f49891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Field<DivPointTemplate> f49892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field<Expression<DivTooltip.Position>> f49893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49894k;

    /* JADX INFO: compiled from: DivTooltipTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivTooltipTemplate(Field<DivAnimationTemplate> field, Field<DivAnimationTemplate> field2, Field<Expression<String>> field3, Field<Expression<Boolean>> field4, Field<DivTemplate> field5, Field<Expression<Long>> field6, Field<String> field7, Field<DivTooltipModeTemplate> field8, Field<DivPointTemplate> field9, Field<Expression<DivTooltip.Position>> field10, Field<List<DivActionTemplate>> field11) {
        this.f49884a = field;
        this.f49885b = field2;
        this.f49886c = field3;
        this.f49887d = field4;
        this.f49888e = field5;
        this.f49889f = field6;
        this.f49890g = field7;
        this.f49891h = field8;
        this.f49892i = field9;
        this.f49893j = field10;
        this.f49894k = field11;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f49880m = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f49881n = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        f49882o = new DivTooltipMode.b(new DivTooltipModeModal());
        f49883p = new bk.p<ParsingEnvironment, JSONObject, DivTooltipTemplate>() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivTooltipTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivTooltipTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Q8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivTooltipTemplate(ParsingEnvironment parsingEnvironment, DivTooltipTemplate divTooltipTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTooltipTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTooltipTemplate(ParsingEnvironment parsingEnvironment, DivTooltipTemplate divTooltipTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
