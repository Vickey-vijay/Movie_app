package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivTooltipModeTemplate implements JSONSerializable, JsonTemplate<DivTooltipMode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49875a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTooltipModeTemplate> f49876b = new bk.p<ParsingEnvironment, JSONObject, DivTooltipModeTemplate>() { // from class: com.yandex.div2.DivTooltipModeTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTooltipModeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTooltipModeTemplate.a.b(DivTooltipModeTemplate.f49875a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTooltipModeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivTooltipModeTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivTooltipModeTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().T8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTooltipModeTemplate.kt */
    public static final class b extends DivTooltipModeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivTooltipModeModalTemplate f49877c;

        public b(DivTooltipModeModalTemplate divTooltipModeModalTemplate) {
            super(null);
            this.f49877c = divTooltipModeModalTemplate;
        }

        public final DivTooltipModeModalTemplate b() {
            return this.f49877c;
        }
    }

    /* JADX INFO: compiled from: DivTooltipModeTemplate.kt */
    public static final class c extends DivTooltipModeTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivTooltipModeNonModalTemplate f49878c;

        public c(DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate) {
            super(null);
            this.f49878c = divTooltipModeNonModalTemplate;
        }

        public final DivTooltipModeNonModalTemplate b() {
            return this.f49878c;
        }
    }

    public DivTooltipModeTemplate() {
    }

    public /* synthetic */ DivTooltipModeTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof c) {
            return "non_modal";
        }
        if (this instanceof b) {
            return "modal";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
